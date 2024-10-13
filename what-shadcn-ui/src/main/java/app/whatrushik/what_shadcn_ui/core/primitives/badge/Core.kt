package app.whatrushik.what_shadcn_ui.core.primitives.badge

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import app.whatrushik.what_shadcn_ui.core.theme.SHUIShapes
import app.whatrushik.what_shadcn_ui.core.theme.SHUITheme.palettes
import app.whatrushik.what_shadcn_ui.core.utils.applyComposableIf

enum class BadgeMode {
    Default,
    Secondary,
    Outline,
    Destructive;

    val foreground: Color
        @Composable get() = when (this) {
            Default -> palettes.primaryForeground
            Secondary -> palettes.secondaryForeground
            Outline -> palettes.foreground
            Destructive -> palettes.destructiveForeground
        }

    val background: Color
        @Composable get() = when (this) {
            Default -> palettes.primary
            Secondary -> palettes.secondary
            Outline -> Color.Transparent
            Destructive -> palettes.destructive
        }

}

@Composable
fun Badge(
    modifier: Modifier = Modifier,
    mode: BadgeMode = BadgeMode.Default,
    content: @Composable BoxScope.() -> Unit
) {
    Box(
        content = content,
        modifier = Modifier
            .clip(SHUIShapes.Circle)
            .background(mode.background)
            .applyComposableIf(mode == BadgeMode.Outline) {
                border(1.dp, palettes.border, SHUIShapes.Circle)
            }
            .then(modifier)
    )
}
