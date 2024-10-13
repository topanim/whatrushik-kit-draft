package app.whatrushik.what_shadcn_ui.core.primitives.alert_dialog

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import app.whatrushik.what_shadcn_ui.core.primitives.styled_box.StyledBox
import app.whatrushik.what_shadcn_ui.core.react.useState

val setAlertDialogState
    @Composable
    get() = LocalAlertDialogSetState.current

private val LocalAlertDialogSetState =
    staticCompositionLocalOf<(Boolean) -> Unit> { error("LocalAlertDialogTrigger not provided") }

@Composable
fun AlertDialog(
    cancelable: Boolean = true,
    trigger: @Composable () -> Unit,
    content: @Composable BoxScope.() -> Unit
) {
    val (showDialog, setShowDialog) = useState(false)

    CompositionLocalProvider(
        LocalAlertDialogSetState provides setShowDialog
    ) {
        trigger()

        if (showDialog) Dialog(
            onDismissRequest = { setShowDialog(false) },
            content = { StyledBox(content = content) },
            properties = DialogProperties(
                dismissOnBackPress = cancelable,
                dismissOnClickOutside = cancelable
            )
        )
    }
}