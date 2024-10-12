package app.whatrushik.what_shadcn_ui.core.theme

import androidx.compose.runtime.compositionLocalOf

val LocalSHUIRounding = compositionLocalOf { SHUIRounding.Medium }

enum class SHUIRounding(
    val value: Float
) {
    None(0f),
    Small(0.3f),
    Medium(0.55f),
    Large(0.75f),
    Circle(1f);
}