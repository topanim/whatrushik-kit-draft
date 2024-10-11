package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.AlarmClockOff: ImageVector
    get() {
        if (_AlarmClockOff != null) {
            return _AlarmClockOff!!
        }
        _AlarmClockOff = ImageVector.Builder(
            name = "AlarmClockOff",
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
                moveTo(6.87f, 6.87f)
                curveTo(6.008f, 7.579f, 5.303f, 8.46f, 4.802f, 9.457f)
                curveTo(4.3f, 10.455f, 4.013f, 11.546f, 3.959f, 12.661f)
                curveTo(3.905f, 13.776f, 4.084f, 14.89f, 4.486f, 15.931f)
                curveTo(4.888f, 16.972f, 5.503f, 17.918f, 6.293f, 18.707f)
                curveTo(7.082f, 19.497f, 8.028f, 20.112f, 9.069f, 20.514f)
                curveTo(10.11f, 20.916f, 11.224f, 21.095f, 12.339f, 21.041f)
                curveTo(13.454f, 20.987f, 14.545f, 20.7f, 15.543f, 20.198f)
                curveTo(16.54f, 19.697f, 17.421f, 18.992f, 18.13f, 18.13f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.9f, 14.25f)
                curveTo(19.969f, 13.837f, 20.002f, 13.419f, 20f, 13f)
                curveTo(20f, 10.878f, 19.157f, 8.843f, 17.657f, 7.343f)
                curveTo(16.157f, 5.843f, 14.122f, 5f, 12f, 5f)
                curveTo(11.581f, 4.998f, 11.163f, 5.032f, 10.75f, 5.1f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 6f)
                lineTo(19f, 3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 19f)
                lineTo(4f, 21f)
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
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 4f)
                lineTo(2f, 6f)
            }
        }.build()

        return _AlarmClockOff!!
    }

@Suppress("ObjectPropertyName")
private var _AlarmClockOff: ImageVector? = null
