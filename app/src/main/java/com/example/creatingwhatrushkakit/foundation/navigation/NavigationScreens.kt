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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavGraphBuilder
import kotlinx.serialization.Serializable


data class NavItem(
    val name: String,
    val icon: ImageVector,
    val provider: ScreenProvider
)

@Composable
fun RowScope.NavigationItem(
    item: NavItem,
    selected: Boolean,
    onClick: () -> Unit
) = NavigationBarItem(
    selected = selected,
    onClick = onClick,
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
            NavItem(
                name = "Home",
                icon = Icons.Default.Favorite,
                provider = ScreenDemo1.Provider
            ),
            NavItem(
                name = "Details",
                icon = Icons.Default.CheckCircle,
                provider = ScreenDemo2.Provider
            )
        )
    }

    @Composable
    override fun content(modifier: Modifier) {
        var selected by remember { mutableIntStateOf(0) }
        val navigator = rememberNavigator()

        Log.d("d", "main navigator: $navigator")
        Log.d("d", "main navigator parent: ${navigator.parentOrThrow}")

        Scaffold(
            bottomBar = {
                NavigationBar {
                    mainScreens.forEachIndexed { index, item ->
                        NavigationItem(
                            item = item,
                            selected = index == selected,
                            onClick = {
                                selected = index
                                navigator.c.navigate(item.provider) {
                                    launchSingleTop = true
                                }
                            }
                        )
                    }
                }
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
        val navigator = LocalNavController.currentOrThrow

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
        val navigator = LocalNavController.currentOrThrow

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
        val navigator = LocalNavController.currentOrThrow

        Text(text = "Details")

        Button(onClick = {
            navigator.parentOrThrow.c.navigate(ScreenDemo3.Provider)
        }) {
            Text(text = "to UpperScreen")
        }
    }
}