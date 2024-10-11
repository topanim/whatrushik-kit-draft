package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Lightbulb: ImageVector
    get() {
        if (_Lightbulb != null) {
            return _Lightbulb!!
        }
        _Lightbulb = ImageVector.Builder(
            name = "Lightbulb",
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
                moveTo(9f, 18f)
                horizontalLineTo(15f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 22f)
                horizontalLineTo(14f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.09f, 14f)
                curveTo(15.27f, 13.02f, 15.74f, 12.26f, 16.5f, 11.5f)
                curveTo(16.983f, 11.056f, 17.366f, 10.514f, 17.625f, 9.911f)
                curveTo(17.883f, 9.307f, 18.011f, 8.656f, 18f, 8f)
                curveTo(18f, 6.409f, 17.368f, 4.883f, 16.243f, 3.757f)
                curveTo(15.117f, 2.632f, 13.591f, 2f, 12f, 2f)
                curveTo(10.409f, 2f, 8.883f, 2.632f, 7.757f, 3.757f)
                curveTo(6.632f, 4.883f, 6f, 6.409f, 6f, 8f)
                curveTo(6f, 9f, 6.23f, 10.23f, 7.5f, 11.5f)
                curveTo(8.224f, 12.162f, 8.718f, 13.038f, 8.91f, 14f)
            }
        }.build()

        return _Lightbulb!!
    }

@Suppress("ObjectPropertyName")
private var _Lightbulb: ImageVector? = null
