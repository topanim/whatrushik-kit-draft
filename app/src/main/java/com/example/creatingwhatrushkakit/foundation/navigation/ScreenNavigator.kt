package com.example.creatingwhatrushkakit.foundation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import kotlin.reflect.KClass

val LocalNavController = compositionLocalOf<Navigator?> { null }

val ProvidableCompositionLocal<Navigator?>.currentOrThrow
    @Composable get() = current ?: error("Navigation controller not configured")


abstract class ScreenProvider

inline fun <reified P : ScreenProvider, S : Screen<P>> NavGraphBuilder.register(screen: KClass<S>) {
    composable<P> {
        screen.constructors.first().call(it.toRoute<P>()).content(Modifier)
    }
}

data class Navigator(
    val parent: Navigator?,
    val c: NavHostController
)

inline val <reified T : Any?> T.orThrow
    get() = this ?: throw NullPointerException("${T::class} is null")

@Composable
fun rememberNavigator(level: Int): Navigator {
    val current = LocalNavController.current
    var parentNavigator by remember { mutableStateOf(current) }

    for (i in 0 until level) {
        parentNavigator ?: break
        parentNavigator = parentNavigator!!.parent
    }

    return parentNavigator.orThrow
}

@Composable
fun rememberNavigator(): Navigator =
    LocalNavController.current ?: rememberHostNavigator(null)

@Composable
fun rememberHostNavigator(
    parent: Navigator? = LocalNavController.current
): Navigator = Navigator(parent, rememberNavController())

@Composable
fun NavigationHost(
    modifier: Modifier = Modifier,
    start: ScreenProvider,
    registry: NavGraphBuilder.() -> Unit,
    navigator: Navigator = rememberHostNavigator()
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
