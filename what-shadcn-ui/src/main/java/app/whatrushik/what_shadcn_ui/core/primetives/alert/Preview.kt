package app.whatrushik.what_shadcn_ui.core.primetives.alert

import androidx.compose.runtime.Composable
import app.whatrushik.what_shadcn_ui.core.icons.AlertOctagon
import app.whatrushik.what_shadcn_ui.core.primetives.preview.PreviewBox
import app.whatrushik.what_shadcn_ui.core.theme.SHUITheme.icons

@Composable
fun AlertPreview() = PreviewBox(
    title = "Alert",
    description = "Displays a callout for user attention."
) {
    Alert(
        icon = icons.AlertOctagon,
        title = "Heads up!",
        description = "You can add components to your app using the cli."
    )
}