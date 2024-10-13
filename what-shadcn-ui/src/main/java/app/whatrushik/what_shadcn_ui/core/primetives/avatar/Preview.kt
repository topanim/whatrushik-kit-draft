package app.whatrushik.what_shadcn_ui.core.primetives.avatar

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import app.whatrushik.what_shadcn_ui.core.primetives.preview.PreviewBox
import app.whatrushik.what_shadcn_ui.core.primetives.spacer.Space
import app.whatrushik.what_shadcn_ui.core.theme.SHUITheme.spacing

@Composable
fun AvatarPreview() = PreviewBox(
    title = "Avatar",
    description = "An image element with a fallback for representing the user."
) {
    Row {
        Avatar(
            icon = "https://github.com/shadcn.png",
            fallback = "cn",
        )

        Space(spacing.md)

        Avatar(icon = "", fallback = "cn")
    }
}