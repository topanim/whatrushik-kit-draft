package com.example.creatingwhatrushkakit.foundation.base

import android.util.Log
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.creatingwhatrushkakit.foundation.navigation.Screen
import kotlinx.coroutines.delay
import kotlinx.serialization.Serializable


sealed interface Screens {
    @Serializable
    data object Home : Screens

    @Serializable
    data object Details : Screens
}

sealed interface DrawerScreens {
    @Serializable
    data object HomeDrawer : Screens

    @Serializable
    data object DetailsDrawer : Screens

    @Serializable
    data object EmptyDrawer : Screens
}

val notifier = Notifier<EventSome>(
    config = Notifier.NORMAL.copy(
        deleteAfter = 10000L,
        removeFor = 1000L,
        reverseLayout = true
    ),
    key = EventSome.key
)

object Shapes {
    val NONE = RectangleShape
    val EXTRA_SMALL = RoundedCornerShape(2.dp)
    val SMALL = RoundedCornerShape(4.dp)
    val NORMAL = RoundedCornerShape(8.dp)
    val MEDIUM = RoundedCornerShape(12.dp)
    val EXTRA_MEDIUM = RoundedCornerShape(16.dp)
    val LARGE = RoundedCornerShape(20.dp)
    val EXTRA_LARGE = RoundedCornerShape(24.dp)
    val ABSOLUTE = CircleShape
}

data class EventSome(
    val id: Int,
    val title: String,
    val description: String,
    val icon: ImageVector
) : Event {
    companion object {
        val key: (EventSome) -> Int = { it.id }
    }

    private var removed = MutableTransitionState(false)
        .apply { targetState = true }

    override fun onRemove() {
        removed.targetState = false
    }

    @Composable
    override fun view(modifier: Modifier) = Box(
        modifier = modifier
            .padding(8.dp)
            .clip(Shapes.MEDIUM)
            .border(3.dp, MaterialTheme.colorScheme.primary, Shapes.MEDIUM)
            .background(MaterialTheme.colorScheme.primaryContainer)
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp, 16.dp)
        ) {
            Box(
                Modifier
                    .clip(Shapes.ABSOLUTE)
                    .background(MaterialTheme.colorScheme.onPrimaryContainer)
            ) {
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    modifier = Modifier
                        .size(24.dp)
                        .align(Alignment.Center)
                        .padding(4.dp),
                    tint = MaterialTheme.colorScheme.onPrimary
                )
            }

            Gap(8)

            Column(Modifier.fillMaxWidth()) {
                Text(
                    text = title,
                    style = MaterialTheme.typography.titleMedium
                )

                Text(
                    text = description,
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
    }
}


val LocalScreenNavigator = compositionLocalOf<NavController> { error("Not Configured") }
val LocalDrawerNavigator = compositionLocalOf<NavController> { error("Not Configured") }
val LocalSheetNavigator = compositionLocalOf<NavController> { error("Not Configured") }

object Navigators {
    val screenNavigator: NavController
        @Composable get() = LocalScreenNavigator.current

    val drawerNavigator: NavController
        @Composable get() = LocalDrawerNavigator.current

    val sheetNavigator: NavController
        @Composable get() = LocalSheetNavigator.current
}

class HomeScreen : Screen<Unit>(Unit) {
    @Composable
    override fun content(modifier: Modifier) = Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        val screenNavigator = Navigators.screenNavigator
        val drawerNavigator = Navigators.drawerNavigator

        Text(text = "Home")

        Button(onClick = {
            screenNavigator.navigate(Screens.Details)
        }) {
            Text(text = "To Detail")
        }

        Button(onClick = {
            drawerNavigator.navigate(DrawerScreens.DetailsDrawer)
        }) {
            Text(text = "Open DetailsDrawer")
        }

        Button(onClick = {
            drawerNavigator.navigate(DrawerScreens.HomeDrawer)
        }) {
            Text(text = "Open HomeDrawer")
        }

        notifier.content(Modifier.fillMaxSize())

        LaunchedEffect(Unit) {
            while (true) {
                (1..8).forEach {
                    notifier.notify(
                        EventSome(
                            id = it,
                            icon = Icons.Default.Favorite,
                            title = "Review #$it",
                            description = """
                            Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt.
                            """.trim()
                        )
                    )
                    delay(1000L)
                }

                delay(10000L)
            }
        }
    }
}

class DetailsScreen : Screen<Unit>(Unit) {
    @Composable
    override fun content(modifier: Modifier) = Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        val screenNavigator = Navigators.screenNavigator
        Text(text = "Details Screen")
        Button(onClick = {
            screenNavigator.navigateUp()
        }) {
            Text(text = "Go back, i want to be Monkey")
        }
    }
}

class DetailsDrawerScreen(private val name: String) : Screen<Unit>(Unit) {
    @Composable
    override fun content(modifier: Modifier) = Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        val drawerNavigator = Navigators.drawerNavigator
        Text(text = "$name Screen")
        Button(onClick = {
            drawerNavigator.navigateUp()
        }) {
            Text(text = "Go back, i want to be Monkey")
        }
    }
}

@Composable
fun App() {
    val screenNavigator = rememberNavController()
    val drawerNavigator = rememberNavController()
    val sheetNavigator = rememberNavController()
    val drawerState = rememberDrawerState(DrawerValue.Closed)

    LaunchedEffect(drawerNavigator.currentDestination) {
        Log.d("d", drawerNavigator.currentDestination.toString())

        drawerNavigator.currentDestination
            ?.let { drawerState.open() }
            ?: drawerState.close()
    }

    CompositionLocalProvider(
        LocalScreenNavigator provides screenNavigator,
        LocalDrawerNavigator provides drawerNavigator,
        LocalSheetNavigator provides sheetNavigator
    ) {
        Scaffold {
            ModalNavigationDrawer(
                drawerState = drawerState,
                gesturesEnabled = drawerState.isOpen,
                drawerContent = {
                    NavHost(
                        modifier = Modifier.fillMaxSize(), //.padding(it),
                        navController = drawerNavigator,
                        startDestination = DrawerScreens.EmptyDrawer
                    ) {
                        composable<DrawerScreens.EmptyDrawer> {}

                        composable<DrawerScreens.HomeDrawer> {
                            DetailsDrawerScreen("HomeDrawer").content(Modifier)
                        }

                        composable<DrawerScreens.DetailsDrawer> {
                            DetailsDrawerScreen("DetailsDrawer").content(Modifier)
                        }
                    }
                }
            ) {
                NavHost(
                    modifier = Modifier.padding(it),
                    navController = screenNavigator,
                    startDestination = Screens.Home
                ) {
                    composable<Screens.Home> { HomeScreen().content(Modifier) }
                    composable<Screens.Details> { DetailsScreen().content(Modifier) }
                }
            }
        }
    }
}

@Composable
fun AppWrapper(
    content: @Composable () -> Unit,
    drawerContent: (@Composable () -> Unit)? = null,
    sheetContent: (@Composable () -> Unit)? = null,
) {
    if (drawerContent != null) {

    }
}