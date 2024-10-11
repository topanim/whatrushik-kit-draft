package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.CloudSunRain: ImageVector
    get() {
        if (_CloudSunRain != null) {
            return _CloudSunRain!!
        }
        _CloudSunRain = ImageVector.Builder(
            name = "CloudSunRain",
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
                moveTo(3f, 20f)
                curveTo(2.55f, 19.4f, 2.242f, 18.707f, 2.096f, 17.972f)
                curveTo(1.951f, 17.236f, 1.973f, 16.478f, 2.16f, 15.752f)
                curveTo(2.348f, 15.026f, 2.696f, 14.352f, 3.179f, 13.779f)
                curveTo(3.662f, 13.206f, 4.268f, 12.749f, 4.952f, 12.441f)
                curveTo(5.635f, 12.134f, 6.379f, 11.984f, 7.129f, 12.003f)
                curveTo(7.878f, 12.023f, 8.613f, 12.21f, 9.281f, 12.552f)
                curveTo(9.948f, 12.893f, 10.53f, 13.381f, 10.983f, 13.977f)
                curveTo(11.436f, 14.575f, 11.75f, 15.266f, 11.9f, 16f)
                horizontalLineTo(13f)
                curveTo(13.608f, 15.999f, 14.203f, 16.183f, 14.704f, 16.528f)
                curveTo(15.205f, 16.873f, 15.59f, 17.362f, 15.807f, 17.93f)
                curveTo(16.024f, 18.499f, 16.063f, 19.12f, 15.919f, 19.711f)
                curveTo(15.775f, 20.302f, 15.454f, 20.835f, 15f, 21.24f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 20f)
                verticalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 19f)
                verticalLineTo(21f)
            }
        }.build()

        return _CloudSunRain!!
    }

@Suppress("ObjectPropertyName")
private var _CloudSunRain: ImageVector? = null
