package app.whatrushik.what_shadcn_ui.core.primetives.alert_dialog

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import app.whatrushik.what_shadcn_ui.core.primetives.styled_box.StyledBox

val LocalAlertDialogCloseTrigger =
    staticCompositionLocalOf<() -> Unit> { error("LocalAlertDialogTrigger not provided") }

@Composable
fun AlertDialog(
    cancelable: Boolean = true,
    trigger: @Composable () -> Unit,
    content: @Composable BoxScope.(Modifier) -> Unit
) {
    var showDialog by remember { mutableStateOf(false) }
    val closeDialog = remember {
        if (cancelable) {
            { showDialog = false }
        } else {
            {}
        }
    }

    CompositionLocalProvider(
        LocalAlertDialogCloseTrigger provides closeDialog
    ) {
        trigger()
    }

    if (showDialog) Dialog(
        onDismissRequest = closeDialog,
        properties = DialogProperties(
            dismissOnBackPress = cancelable,
            dismissOnClickOutside = cancelable
        ),
        content = { StyledBox(content = content) }
    )
}