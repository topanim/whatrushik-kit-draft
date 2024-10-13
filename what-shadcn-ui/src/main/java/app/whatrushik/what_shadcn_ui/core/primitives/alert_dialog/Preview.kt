package app.whatrushik.what_shadcn_ui.core.primitives.alert_dialog

import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import app.whatrushik.what_shadcn_ui.core.icons.AlertOctagon
import app.whatrushik.what_shadcn_ui.core.primitives.alert.Alert
import app.whatrushik.what_shadcn_ui.core.primitives.button.Button
import app.whatrushik.what_shadcn_ui.core.primitives.button.ButtonMode
import app.whatrushik.what_shadcn_ui.core.primitives.preview.PreviewBox
import app.whatrushik.what_shadcn_ui.core.theme.SHUITheme.icons
import app.whatrushik.what_shadcn_ui.core.theme.SHUITheme.palettes

@Composable
fun AlertDialogPreview() = PreviewBox(
    title = "Alert Dialog",
    description = "A modal dialog that interrupts the user with important content and expects a response."
) {
    AlertDialog(
        trigger = {
            val setState = setAlertDialogState
            Button(
                mode = ButtonMode.Outline,
                label = "Open dialog",
                onClick = { setState(true) },
            )
        },
        content = {
            Alert(
                icon = icons.AlertOctagon,
                title = "Heads up!",
                description = "You can add components to your app using the cli.",
                modifier = Modifier.background(palettes.popover)
            )
        }
    )
}