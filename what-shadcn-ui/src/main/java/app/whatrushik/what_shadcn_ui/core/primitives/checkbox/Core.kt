package app.whatrushik.what_shadcn_ui.core.primitives.checkbox

import androidx.compose.material3.CheckboxDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import app.whatrushik.what_shadcn_ui.core.theme.SHUITheme.palettes

@Composable
fun Checkbox(
    modifier: Modifier = Modifier,
    checked: Boolean,
    enabled: Boolean = true,
    onChange: (Boolean) -> Unit
) = androidx.compose.material3.Checkbox(
    enabled = enabled,
    checked = checked,
    modifier = modifier,
    onCheckedChange = onChange,
    colors = CheckboxDefaults.colors(
        checkedColor = palettes.primary,
        uncheckedColor = palettes.secondary,
        checkmarkColor = palettes.primaryForeground,
        disabledCheckedColor = palettes.muted,
        disabledUncheckedColor = palettes.muted,
        disabledIndeterminateColor = palettes.muted
    )
)