package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.CloudSun: ImageVector
    get() {
        if (_CloudSun != null) {
            return _CloudSun!!
        }
        _CloudSun = ImageVector.Builder(
            name = "CloudSun",
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
                moveTo(12f, 2f)
                verticalLineTo(4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.93f, 4.93f)
                lineTo(6.34f, 6.34f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 12f)
                horizontalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.07f, 4.93f)
                lineTo(17.66f, 6.34f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.947f, 12.65f)
                curveTo(16.07f, 11.905f, 15.979f, 11.139f, 15.686f, 10.443f)
                curveTo(15.392f, 9.747f, 14.907f, 9.148f, 14.287f, 8.716f)
                curveTo(13.667f, 8.285f, 12.937f, 8.037f, 12.183f, 8.003f)
                curveTo(11.428f, 7.968f, 10.679f, 8.148f, 10.022f, 8.522f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 22f)
                horizontalLineTo(7f)
                curveTo(6.054f, 22f, 5.127f, 21.731f, 4.328f, 21.226f)
                curveTo(3.528f, 20.72f, 2.889f, 19.997f, 2.483f, 19.143f)
                curveTo(2.078f, 18.288f, 1.923f, 17.336f, 2.038f, 16.397f)
                curveTo(2.152f, 15.458f, 2.53f, 14.57f, 3.128f, 13.837f)
                curveTo(3.727f, 13.105f, 4.521f, 12.557f, 5.418f, 12.257f)
                curveTo(6.315f, 11.958f, 7.279f, 11.919f, 8.198f, 12.145f)
                curveTo(9.116f, 12.372f, 9.952f, 12.854f, 10.607f, 13.537f)
                curveTo(11.262f, 14.219f, 11.711f, 15.073f, 11.9f, 16f)
                horizontalLineTo(13f)
                curveTo(13.796f, 16f, 14.559f, 16.316f, 15.121f, 16.879f)
                curveTo(15.684f, 17.441f, 16f, 18.204f, 16f, 19f)
                curveTo(16f, 19.796f, 15.684f, 20.559f, 15.121f, 21.121f)
                curveTo(14.559f, 21.684f, 13.796f, 22f, 13f, 22f)
                close()
            }
        }.build()

        return _CloudSun!!
    }

@Suppress("ObjectPropertyName")
private var _CloudSun: ImageVector? = null
