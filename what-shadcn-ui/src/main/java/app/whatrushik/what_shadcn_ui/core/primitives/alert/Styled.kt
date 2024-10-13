package app.whatrushik.what_shadcn_ui.core.primitives.alert

import androidx.compose.foundation.background
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import app.whatrushik.what_shadcn_ui.core.theme.SHUITheme.palettes
import app.whatrushik.what_shadcn_ui.core.theme.SHUITheme.typography

@Composable
fun Alert(
    modifier: Modifier = Modifier,
    icon: ImageVector? = null,
    title: String,
    description: String
) = Alert(
    modifier = modifier.background(palettes.popover),
    leading = {
        if (icon != null) Icon(
            modifier = it,
            imageVector = icon,
            tint = palettes.foreground,
            contentDescription = "Alert icon"
        )
    },
    title = { Text(text = title, style = typography.pUiMedium, color = palettes.foreground) },
    description = {
        Text(
            text = description,
            style = typography.subtle,
            color = palettes.foreground
        )
    }
)