package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.CloudMoonRain: ImageVector
    get() {
        if (_CloudMoonRain != null) {
            return _CloudMoonRain!!
        }
        _CloudMoonRain = ImageVector.Builder(
            name = "CloudMoonRain",
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
                moveTo(10.083f, 9f)
                curveTo(10.32f, 7.602f, 11.044f, 6.333f, 12.127f, 5.418f)
                curveTo(13.21f, 4.502f, 14.582f, 4f, 16f, 4f)
                curveTo(15.221f, 4.799f, 14.789f, 5.873f, 14.796f, 6.989f)
                curveTo(14.803f, 8.104f, 15.25f, 9.172f, 16.039f, 9.961f)
                curveTo(16.828f, 10.75f, 17.896f, 11.197f, 19.011f, 11.204f)
                curveTo(20.127f, 11.211f, 21.201f, 10.779f, 22f, 10f)
                curveTo(22f, 12.22f, 20.794f, 14.16f, 19f, 15.197f)
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

        return _CloudMoonRain!!
    }

@Suppress("ObjectPropertyName")
private var _CloudMoonRain: ImageVector? = null
