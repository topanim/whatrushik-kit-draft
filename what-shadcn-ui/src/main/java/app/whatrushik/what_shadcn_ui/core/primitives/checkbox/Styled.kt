package app.whatrushik.what_shadcn_ui.core.primitives.checkbox

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import app.whatrushik.what_shadcn_ui.core.primitives.spacer.Space
import app.whatrushik.what_shadcn_ui.core.theme.SHUITheme.palettes
import app.whatrushik.what_shadcn_ui.core.theme.SHUITheme.spacing
import app.whatrushik.what_shadcn_ui.core.theme.SHUITheme.typography

@Composable
fun CheckboxWithText(
    modifier: Modifier = Modifier,
    title: String,
    description: String? = null,
    checked: Boolean,
    enabled: Boolean = true,
    onChange: (Boolean) -> Unit
) = Row(
    modifier = modifier,
    verticalAlignment = Alignment.CenterVertically
) {
    Checkbox(
        checked = checked,
        enabled = enabled,
        onChange = onChange
    )

    Space(spacing.sm)

    Column {
        Text(
            text = title,
            style = typography.pUiMedium,
            color = if (enabled) palettes.foreground else palettes.mutedForeground
        )

        Space(spacing.sm)

        if (description != null) Text(
            text = description,
            style = typography.subtle,
            color = if (enabled) palettes.foreground else palettes.mutedForeground
        )
    }
}