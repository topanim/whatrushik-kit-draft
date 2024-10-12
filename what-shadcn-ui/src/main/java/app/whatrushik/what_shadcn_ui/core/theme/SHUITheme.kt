package app.whatrushik.what_shadcn_ui.core.theme

import androidx.compose.runtime.Composable
import app.whatrsuhik.what_shadcn_ui.core.theme.LocalSHUIColor
import app.whatrsuhik.what_shadcn_ui.core.theme.LocalSHUITypography

object SHUITheme {
    val pallets
        @Composable get() = LocalSHUIPalette.current

    val colors
        @Composable get() = LocalSHUIColor.current

    val spacing
        @Composable get() = LocalSHUISpacing.current

    val typography
        @Composable get() = LocalSHUITypography.current

    val rounding
        @Composable get() = LocalSHUIRounding.current
}