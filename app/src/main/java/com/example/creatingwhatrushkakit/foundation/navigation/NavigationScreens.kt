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
import kotlinx.serialization.Serializable


open class NavItem(
    val name: String,
    val icon: ImageVector,
    val provider: ScreenProvider
) {
    open fun selected(destination: NavDestination) = false
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

class ScreenMainDemo(data: Provider) : Screen<ScreenMainDemo.Provider>(data) {
    @Serializable
    object Provider : ScreenProvider()

    private companion object {
        val mainRegistry: NavGraphBuilder.() -> Unit = {
            register(ScreenDemo1::class)
            register(ScreenDemo2::class)
        }

        val mainScreens = setOf(
            object : NavItem(
                name = "Home",
                icon = Icons.Default.Favorite,
                provider = ScreenDemo1.Provider
            ) {
                override fun selected(destination: NavDestination): Boolean =
                    destination.hasRoute<ScreenDemo1.Provider>()
            },
            object : NavItem(
                name = "Details",
                icon = Icons.Default.CheckCircle,
                provider = ScreenDemo2.Provider
            ) {
                override fun selected(destination: NavDestination): Boolean =
                    destination.hasRoute<ScreenDemo2.Provider>()
            }
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

class ScreenDemo3(data: Provider) : Screen<ScreenDemo3.Provider>(data) {
    @Serializable
    object Provider : ScreenProvider()

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

class ScreenDemo1(data: Provider) : Screen<ScreenDemo1.Provider>(data) {
    @Serializable
    object Provider : ScreenProvider()

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

class ScreenDemo2(data: Provider) : Screen<ScreenDemo2.Provider>(data) {
    @Serializable
    object Provider : ScreenProvider()

    @Composable
    override fun content(modifier: Modifier) = Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ) {
        val navigator = rememberNavigator(1)

        Text(text = "Details")

        Button(onClick = {
            navigator.c.navigate(ScreenDemo3.Provider)
        }) {
            Text(text = "to UpperScreen")
        }
    }
}