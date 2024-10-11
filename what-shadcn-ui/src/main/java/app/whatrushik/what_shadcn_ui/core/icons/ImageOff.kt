package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.ImageOff: ImageVector
    get() {
        if (_ImageOff != null) {
            return _ImageOff!!
        }
        _ImageOff = ImageVector.Builder(
            name = "ImageOff",
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
                moveTo(2f, 2f)
                lineTo(22f, 22f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.41f, 10.41f)
                curveTo(10.224f, 10.596f, 10.004f, 10.743f, 9.761f, 10.844f)
                curveTo(9.518f, 10.944f, 9.258f, 10.996f, 8.995f, 10.996f)
                curveTo(8.732f, 10.996f, 8.472f, 10.944f, 8.229f, 10.844f)
                curveTo(7.986f, 10.743f, 7.766f, 10.596f, 7.58f, 10.41f)
                curveTo(7.394f, 10.224f, 7.247f, 10.003f, 7.146f, 9.761f)
                curveTo(7.046f, 9.518f, 6.994f, 9.258f, 6.994f, 8.995f)
                curveTo(6.994f, 8.732f, 7.046f, 8.472f, 7.146f, 8.229f)
                curveTo(7.247f, 7.986f, 7.394f, 7.766f, 7.58f, 7.58f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.5f, 13.5f)
                lineTo(6f, 21f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 12f)
                lineTo(21f, 15f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.59f, 3.59f)
                curveTo(3.404f, 3.775f, 3.255f, 3.994f, 3.154f, 4.236f)
                curveTo(3.053f, 4.478f, 3.001f, 4.738f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 19.53f, 3.211f, 20.039f, 3.586f, 20.414f)
                curveTo(3.961f, 20.789f, 4.47f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(19.55f, 21f, 20.052f, 20.78f, 20.41f, 20.41f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 15f)
                verticalLineTo(5f)
                curveTo(21f, 4.47f, 20.789f, 3.961f, 20.414f, 3.586f)
                curveTo(20.039f, 3.211f, 19.53f, 3f, 19f, 3f)
                horizontalLineTo(9f)
            }
        }.build()

        return _ImageOff!!
    }

@Suppress("ObjectPropertyName")
private var _ImageOff: ImageVector? = null
