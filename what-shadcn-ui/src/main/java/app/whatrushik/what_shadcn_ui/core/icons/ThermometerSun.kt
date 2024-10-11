package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.ThermometerSun: ImageVector
    get() {
        if (_ThermometerSun != null) {
            return _ThermometerSun!!
        }
        _ThermometerSun = ImageVector.Builder(
            name = "ThermometerSun",
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
                moveTo(12f, 9f)
                curveTo(11.108f, 8.986f, 10.236f, 9.27f, 9.524f, 9.808f)
                curveTo(8.812f, 10.346f, 8.301f, 11.107f, 8.071f, 11.969f)
                curveTo(7.841f, 12.831f, 7.906f, 13.745f, 8.255f, 14.567f)
                curveTo(8.605f, 15.388f, 9.219f, 16.068f, 10f, 16.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 3f)
                verticalLineTo(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.6f, 18.4f)
                lineTo(5.2f, 19.8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 4f)
                verticalLineTo(14.54f)
                curveTo(20.763f, 14.98f, 21.359f, 15.66f, 21.695f, 16.473f)
                curveTo(22.032f, 17.287f, 22.092f, 18.189f, 21.864f, 19.039f)
                curveTo(21.636f, 19.89f, 21.134f, 20.642f, 20.435f, 21.177f)
                curveTo(19.736f, 21.714f, 18.881f, 22.004f, 18f, 22.004f)
                curveTo(17.119f, 22.004f, 16.264f, 21.714f, 15.565f, 21.177f)
                curveTo(14.866f, 20.642f, 14.364f, 19.89f, 14.136f, 19.039f)
                curveTo(13.908f, 18.189f, 13.967f, 17.287f, 14.304f, 16.473f)
                curveTo(14.642f, 15.66f, 15.237f, 14.98f, 16f, 14.54f)
                verticalLineTo(4f)
                curveTo(16f, 3.47f, 16.211f, 2.961f, 16.586f, 2.586f)
                curveTo(16.961f, 2.211f, 17.47f, 2f, 18f, 2f)
                curveTo(18.53f, 2f, 19.039f, 2.211f, 19.414f, 2.586f)
                curveTo(19.789f, 2.961f, 20f, 3.47f, 20f, 4f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 13f)
                horizontalLineTo(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.34f, 7.34f)
                lineTo(4.93f, 5.93f)
            }
        }.build()

        return _ThermometerSun!!
    }

@Suppress("ObjectPropertyName")
private var _ThermometerSun: ImageVector? = null
