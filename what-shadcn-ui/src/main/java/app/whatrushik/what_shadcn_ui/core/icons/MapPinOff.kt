package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.MapPinOff: ImageVector
    get() {
        if (_MapPinOff != null) {
            return _MapPinOff!!
        }
        _MapPinOff = ImageVector.Builder(
            name = "MapPinOff",
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
                moveTo(5.43f, 5.43f)
                curveTo(4.501f, 6.773f, 4.003f, 8.367f, 4f, 10f)
                curveTo(4f, 16f, 12f, 22f, 12f, 22f)
                curveTo(13.858f, 20.537f, 15.537f, 18.858f, 17f, 17f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.18f, 13.52f)
                curveTo(19.698f, 12.417f, 19.977f, 11.218f, 20f, 10f)
                curveTo(20f, 7.878f, 19.157f, 5.843f, 17.657f, 4.343f)
                curveTo(16.156f, 2.843f, 14.122f, 2f, 12f, 2f)
                curveTo(10.779f, 1.997f, 9.574f, 2.278f, 8.48f, 2.82f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.13f, 9.13f)
                curveTo(9.041f, 9.411f, 8.997f, 9.705f, 9f, 10f)
                curveTo(9f, 10.796f, 9.316f, 11.559f, 9.879f, 12.121f)
                curveTo(10.441f, 12.684f, 11.204f, 13f, 12f, 13f)
                curveTo(12.295f, 13.003f, 12.589f, 12.959f, 12.87f, 12.87f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.9f, 9.25f)
                curveTo(14.767f, 8.731f, 14.498f, 8.256f, 14.12f, 7.877f)
                curveTo(13.742f, 7.497f, 13.269f, 7.225f, 12.75f, 7.09f)
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

        return _MapPinOff!!
    }

@Suppress("ObjectPropertyName")
private var _MapPinOff: ImageVector? = null
