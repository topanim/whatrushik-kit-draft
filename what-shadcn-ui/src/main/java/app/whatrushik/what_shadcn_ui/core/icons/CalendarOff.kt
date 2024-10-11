package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.CalendarOff: ImageVector
    get() {
        if (_CalendarOff != null) {
            return _CalendarOff!!
        }
        _CalendarOff = ImageVector.Builder(
            name = "CalendarOff",
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
                moveTo(4.18f, 4.18f)
                curveTo(3.829f, 4.338f, 3.531f, 4.593f, 3.322f, 4.916f)
                curveTo(3.113f, 5.239f, 3.001f, 5.615f, 3f, 6f)
                verticalLineTo(20f)
                curveTo(3f, 20.53f, 3.211f, 21.039f, 3.586f, 21.414f)
                curveTo(3.961f, 21.789f, 4.47f, 22f, 5f, 22f)
                horizontalLineTo(19f)
                curveTo(19.385f, 21.999f, 19.761f, 21.887f, 20.084f, 21.678f)
                curveTo(20.407f, 21.469f, 20.662f, 21.171f, 20.82f, 20.82f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 15.5f)
                verticalLineTo(6f)
                curveTo(21f, 5.47f, 20.789f, 4.961f, 20.414f, 4.586f)
                curveTo(20.039f, 4.211f, 19.53f, 4f, 19f, 4f)
                horizontalLineTo(9.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 2f)
                verticalLineTo(6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 10f)
                horizontalLineTo(10f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 10f)
                horizontalLineTo(15.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 2f)
                lineTo(22f, 22f)
            }
        }.build()

        return _CalendarOff!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarOff: ImageVector? = null
