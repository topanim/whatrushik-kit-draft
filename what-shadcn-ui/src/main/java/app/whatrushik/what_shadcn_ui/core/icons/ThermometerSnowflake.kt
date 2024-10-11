package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.ThermometerSnowflake: ImageVector
    get() {
        if (_ThermometerSnowflake != null) {
            return _ThermometerSnowflake!!
        }
        _ThermometerSnowflake = ImageVector.Builder(
            name = "ThermometerSnowflake",
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
                moveTo(2f, 12f)
                horizontalLineTo(12f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 4f)
                verticalLineTo(20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 9f)
                lineTo(6f, 12f)
                lineTo(3f, 15f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 6f)
                lineTo(9f, 9f)
                lineTo(6f, 6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 18f)
                lineTo(9f, 15f)
                lineTo(10.5f, 16.5f)
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
        }.build()

        return _ThermometerSnowflake!!
    }

@Suppress("ObjectPropertyName")
private var _ThermometerSnowflake: ImageVector? = null
