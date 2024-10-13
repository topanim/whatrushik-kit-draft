package app.whatrushik.what_shadcn_ui.core.theme

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

val LocalSHUIShape =
    compositionLocalOf<SHUIShape> { SHUIShapes.Small }

typealias SHUIShape = Shape

object SHUIShapes {
    val None = RectangleShape
    val Circle = CircleShape
    val Small = RoundedCornerShape(6.dp)
    val Medium = RoundedCornerShape(12.dp)
    val Large = RoundedCornerShape(18.dp)
}