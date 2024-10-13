package app.whatrushik.what_shadcn_ui.core.theme

import androidx.compose.runtime.Composable
import app.whatrsuhik.what_shadcn_ui.core.theme.LocalSHUIColor
import app.whatrsuhik.what_shadcn_ui.core.theme.LocalSHUITypography
import app.whatrushik.what_shadcn_ui.core.icons.SHUIIcons

object SHUITheme {
    val icons
        @Composable get() = SHUIIcons

    val palettes
        @Composable get() = LocalSHUIPalette.current

    val colors
        @Composable get() = LocalSHUIColor.current

    val spacing
        @Composable get() = LocalSHUISpacing.current

    val typography
        @Composable get() = LocalSHUITypography.current

    val shapes: SHUIShape
        @Composable get() = LocalSHUIShape.current
}