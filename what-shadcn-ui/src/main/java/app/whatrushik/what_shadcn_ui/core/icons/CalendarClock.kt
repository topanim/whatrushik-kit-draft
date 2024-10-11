package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.CalendarClock: ImageVector
    get() {
        if (_CalendarClock != null) {
            return _CalendarClock!!
        }
        _CalendarClock = ImageVector.Builder(
            name = "CalendarClock",
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
                moveTo(21f, 7.5f)
                verticalLineTo(6f)
                curveTo(21f, 5.47f, 20.789f, 4.961f, 20.414f, 4.586f)
                curveTo(20.039f, 4.211f, 19.53f, 4f, 19f, 4f)
                horizontalLineTo(5f)
                curveTo(4.47f, 4f, 3.961f, 4.211f, 3.586f, 4.586f)
                curveTo(3.211f, 4.961f, 3f, 5.47f, 3f, 6f)
                verticalLineTo(20f)
                curveTo(3f, 20.53f, 3.211f, 21.039f, 3.586f, 21.414f)
                curveTo(3.961f, 21.789f, 4.47f, 22f, 5f, 22f)
                horizontalLineTo(8.5f)
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
                moveTo(8f, 2f)
                verticalLineTo(6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 10f)
                horizontalLineTo(8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.5f, 17.5f)
                lineTo(16f, 16.25f)
                verticalLineTo(14f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 16f)
                curveTo(22f, 17.591f, 21.368f, 19.117f, 20.243f, 20.243f)
                curveTo(19.117f, 21.368f, 17.591f, 22f, 16f, 22f)
                curveTo(14.409f, 22f, 12.883f, 21.368f, 11.757f, 20.243f)
                curveTo(10.632f, 19.117f, 10f, 17.591f, 10f, 16f)
                curveTo(10f, 14.409f, 10.632f, 12.883f, 11.757f, 11.757f)
                curveTo(12.883f, 10.632f, 14.409f, 10f, 16f, 10f)
                curveTo(17.591f, 10f, 19.117f, 10.632f, 20.243f, 11.757f)
                curveTo(21.368f, 12.883f, 22f, 14.409f, 22f, 16f)
                close()
            }
        }.build()

        return _CalendarClock!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarClock: ImageVector? = null
