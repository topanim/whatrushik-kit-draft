package com.example.creatingwhatrushkakit.foundation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import kotlin.reflect.KClass

val LocalNavController = compositionLocalOf<NavigationController?> { null }

val ProvidableCompositionLocal<NavigationController?>.currentOrThrow
    @Composable get() = current ?: error("Navigation controller not configured")


abstract class ScreenProvider

inline fun <reified P : ScreenProvider, S : Screen<P>> NavGraphBuilder.register(screen: KClass<S>) {
    composable<P> {
        screen.constructors.first().call(it.toRoute<P>()).content(Modifier)
    }
}

data class NavigationController(
    val parent: NavigationController?,
    val c: NavHostController
)

val NavigationController.parentOrThrow
    get() = parent ?: error("Navigation controller has no parent")

@Composable
fun rememberNavigator(): NavigationController {
    val parent = LocalNavController.current
    val navController = rememberNavController()
    return NavigationController(parent, navController)
}


@Composable
fun NavigationHost(
    modifier: Modifier = Modifier,
    navigator: NavigationController = rememberNavigator(),
    start: ScreenProvider,
    registry: NavGraphBuilder.() -> Unit
) = CompositionLocalProvider(
    LocalNavController provides navigator
) {
    NavHost(
        modifier = modifier,
        startDestination = start,
        navController = navigator.c,
        builder = registry
    )
}


val globalRegistry: NavGraphBuilder.() -> Unit = {
    register(ScreenMainDemo::class)
    register(ScreenDemo3::class)
}

@Composable
fun Main() {
    NavigationHost(
        start = ScreenMainDemo.Provider,
        registry = globalRegistry
    )
}
