package com.example.creatingwhatrushkakit.foundation.navigation

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hasRoute
import androidx.navigation.NavGraphBuilder
import app.whatrsuhik.what_navigation.core.NavComponent
import app.whatrsuhik.what_navigation.core.NavProvider
import app.whatrsuhik.what_navigation.core.NavigationHost
import app.whatrsuhik.what_navigation.core.Navigator
import app.whatrsuhik.what_navigation.core.register
import app.whatrsuhik.what_navigation.core.rememberHostNavigator
import app.whatrsuhik.what_navigation.core.rememberNavigator
import app.whatrsuhik.what_navigation.utils.orThrow
import com.example.creatingwhatrushkakit.foundation.navigation.ScreenDemo3.Provider
import kotlinx.serialization.Serializable


abstract class NavItem(
    val name: String,
    val icon: ImageVector,
    val provider: NavProvider
) {
    abstract fun selected(destination: NavDestination): Boolean
}

@Composable
fun DefaultBottomNavBar(
    navigator: Navigator = rememberNavigator(),
    screens: Iterable<NavItem>
) = NavigationBar {
    var currentDestination by remember { mutableStateOf(navigator.c.currentDestination) }

    LaunchedEffect(Unit) {
        navigator.c.addOnDestinationChangedListener { _, destination, _ ->
            currentDestination = destination
        }
    }

    screens.forEach { item ->
        NavigationItem(
            item = item,
            selected = currentDestination != null && item.selected(currentDestination!!),
            onClick = {
                navigator.c.navigate(item.provider) {
                    launchSingleTop = true
                }
            }
        )
    }
}

@Composable
fun RowScope.NavigationItem(
    item: NavItem,
    selected: Boolean,
    onClick: () -> Unit
) = NavigationBarItem(
    selected = selected,
    onClick = { if (!selected) onClick() },
    label = { Text(text = item.name) },
    icon = { Icon(item.icon, contentDescription = null) }
)

inline fun <reified P : NavProvider> navItem(
    name: String,
    icon: ImageVector,
    provider: P
) = object : NavItem(name, icon, provider) {
    override fun selected(destination: NavDestination) = destination.hasRoute<P>()
}


class ScreenMainDemo(override val data: Provider) : NavComponent<ScreenMainDemo.Provider> {
    @Serializable
    object Provider : NavProvider()

    private companion object {
        val mainRegistry: NavGraphBuilder.() -> Unit = {
            register(ScreenDemo1::class)
            register(ScreenDemo2::class)
        }

        val mainScreens = setOf(
            navItem(
                name = "Home",
                icon = Icons.Default.Favorite,
                provider = ScreenDemo1.Provider
            ),
            navItem(
                name = "Details",
                icon = Icons.Default.CheckCircle,
                provider = ScreenDemo2.Provider
            )
        )
    }

    @Composable
    override fun content(modifier: Modifier) {
        val navigator = rememberHostNavigator()

        Log.d("d", "main navigator: $navigator")
        Log.d("d", "main navigator parent: ${navigator.parent.orThrow}")

        Scaffold(
            bottomBar = {
                DefaultBottomNavBar(
                    screens = mainScreens,
                    navigator = navigator
                )
            }
        ) {
            NavigationHost(
                navigator = navigator,
                modifier = Modifier.padding(it),
                start = ScreenDemo1.Provider,
                registry = mainRegistry
            )
        }
    }
}

class ScreenDemo3(override val data: Provider) : NavComponent<ScreenDemo3.Provider> {
    @Serializable
    object Provider : NavProvider()

    @Composable
    override fun content(modifier: Modifier) = Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ) {
        val navigator = rememberNavigator()

        Text(text = "UpperScreen")

        Button(onClick = {
            navigator.c.navigateUp()
        }) {
            Text(text = "back")
        }
    }
}

class ScreenDemo1(override val data: Provider) : NavComponent<ScreenDemo1.Provider> {
    @Serializable
    object Provider : NavProvider()

    @Composable
    override fun content(modifier: Modifier) = Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ) {
        val navigator = rememberNavigator()

        Text(text = "Home")

        Button(onClick = {
            navigator.c.navigate(ScreenDemo2.Provider) {
                launchSingleTop = true
            }
        }) {
            Text(text = "to Details")
        }
    }
}

class ScreenDemo2(override val data: Provider) : NavComponent<ScreenDemo2.Provider> {
    @Serializable
    object Provider : NavProvider()

    @Composable
    override fun content(modifier: Modifier) = Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ) {
        val parentNavigator = rememberNavigator(1)
        val navigator = rememberNavigator()

        Text(text = "Details")

        Button(onClick = {
            parentNavigator.c.navigate(ScreenDemo3.Provider)
        }) {
            Text(text = "to UpperScreen")
        }

        Button(onClick = {
            navigator.c.navigateUp()
        }) {
            Text(text = "back")
        }
    }
}