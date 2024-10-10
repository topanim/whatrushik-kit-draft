package app.whatrsuhik.what_navigation.core

import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import app.whatrsuhik.what_navigation.utils.orThrow

val LocalNavController = compositionLocalOf<Navigator?> { null }

data class Navigator(
    val parent: Navigator?,
    val c: NavHostController
)

@Composable
fun rememberHostNavigator(
    parent: Navigator? = LocalNavController.current
): Navigator = Navigator(parent, rememberNavController())

@Composable
fun rememberNavigator(): Navigator =
    LocalNavController.current.orThrow


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
