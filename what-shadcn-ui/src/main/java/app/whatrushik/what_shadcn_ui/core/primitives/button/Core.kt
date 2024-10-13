package app.whatrushik.what_shadcn_ui.core.primitives.button

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import app.whatrushik.what_shadcn_ui.core.theme.SHUITheme.palettes
import app.whatrushik.what_shadcn_ui.core.theme.SHUITheme.shapes
import app.whatrushik.what_shadcn_ui.core.utils.applyComposableIf

enum class ButtonMode {
    Default,
    Icon,
    Secondary,
    Outline,
    Ghost,
    Loading,
    Destructive;

    val foreground: Color
        @Composable
        get() = when (this) {
            Default -> palettes.primaryForeground
            Icon -> palettes.foreground
            Secondary -> palettes.secondaryForeground
            Outline -> palettes.foreground
            Ghost -> palettes.foreground
            Loading -> palettes.mutedForeground
            Destructive -> palettes.destructiveForeground
        }

    val background: Color
        @Composable
        get() = when (this) {
            Default -> palettes.primary
            Icon -> Color.Transparent
            Secondary -> palettes.secondary
            Outline -> Color.Transparent
            Ghost -> Color.Transparent
            Loading -> palettes.muted
            Destructive -> palettes.destructive
        }
}

@Composable
fun Button(
    modifier: Modifier = Modifier,
    mode: ButtonMode = ButtonMode.Default,
    enabled: Boolean = true,
    onClick: () -> Unit,
    content: @Composable BoxScope.() -> Unit,
) = Box(
    contentAlignment = Alignment.Center,
    content = content,
    modifier = Modifier
        .clip(shapes)
        .background(mode.background)
        .clickable(enabled = enabled, onClick = onClick)
        .applyComposableIf(
            mode == ButtonMode.Outline || mode == ButtonMode.Icon,
        ) {
            border(1.dp, palettes.border, shapes)
        }
        .then(modifier)
)
