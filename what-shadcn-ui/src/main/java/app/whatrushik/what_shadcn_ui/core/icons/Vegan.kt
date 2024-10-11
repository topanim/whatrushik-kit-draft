package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Vegan: ImageVector
    get() {
        if (_Vegan != null) {
            return _Vegan!!
        }
        _Vegan = ImageVector.Builder(
            name = "Vegan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 2f)
                curveTo(6.056f, 5.007f, 11.232f, 11.337f, 12f, 22f)
                curveTo(12.897f, 15.182f, 13.5f, 12.5f, 16f, 8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.375f, 6.533f)
                curveTo(21.438f, 8.158f, 22.003f, 10.058f, 22f, 12f)
                curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
                curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
                curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
                curveTo(14.003f, 2f, 15.869f, 2.589f, 17.433f, 3.603f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.104f, 4f)
                curveTo(16.102f, 5.274f, 15.958f, 6.586f, 16.004f, 8f)
                curveTo(17.904f, 7.9f, 19.007f, 7.799f, 20.304f, 6.6f)
                curveTo(21.71f, 5.3f, 21.904f, 4.3f, 22.004f, 2f)
                curveTo(19.304f, 2.1f, 18.381f, 2.375f, 17.104f, 4f)
                close()
            }
        }.build()

        return _Vegan!!
    }

@Suppress("ObjectPropertyName")
private var _Vegan: ImageVector? = null
