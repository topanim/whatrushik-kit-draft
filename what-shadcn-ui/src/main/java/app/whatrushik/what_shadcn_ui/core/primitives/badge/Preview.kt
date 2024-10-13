package app.whatrushik.what_shadcn_ui.core.primitives.badge

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import app.whatrushik.what_shadcn_ui.core.primitives.preview.PreviewBox
import app.whatrushik.what_shadcn_ui.core.theme.SHUITheme.spacing

@Composable
fun BadgePreview() = PreviewBox(
    title = "Badge",
    description = "Displays a badge or a component that looks like a badge."
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(spacing.md.dp)
    ) {
        Badge(text = "Badge", mode = BadgeMode.Default)
        Badge(text = "Secondary", mode = BadgeMode.Secondary)
        Badge(text = "Outline", mode = BadgeMode.Outline)
        Badge(text = "Destructive", mode = BadgeMode.Destructive)
    }
}