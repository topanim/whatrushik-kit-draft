package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.MicOff: ImageVector
    get() {
        if (_MicOff != null) {
            return _MicOff!!
        }
        _MicOff = ImageVector.Builder(
            name = "MicOff",
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
                moveTo(18.89f, 13.23f)
                curveTo(18.962f, 12.824f, 18.999f, 12.412f, 19f, 12f)
                verticalLineTo(10f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 10f)
                verticalLineTo(12f)
                curveTo(4.98f, 13.399f, 5.379f, 14.772f, 6.147f, 15.942f)
                curveTo(6.915f, 17.112f, 8.015f, 18.025f, 9.307f, 18.563f)
                curveTo(10.599f, 19.101f, 12.022f, 19.24f, 13.393f, 18.962f)
                curveTo(14.764f, 18.683f, 16.021f, 18f, 17f, 17f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 9.34f)
                verticalLineTo(5f)
                curveTo(14.996f, 4.326f, 14.765f, 3.674f, 14.345f, 3.147f)
                curveTo(13.925f, 2.621f, 13.34f, 2.251f, 12.684f, 2.097f)
                curveTo(12.028f, 1.943f, 11.34f, 2.015f, 10.729f, 2.3f)
                curveTo(10.119f, 2.586f, 9.623f, 3.068f, 9.32f, 3.67f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 9f)
                verticalLineTo(12f)
                curveTo(9.001f, 12.593f, 9.177f, 13.172f, 9.506f, 13.665f)
                curveTo(9.836f, 14.158f, 10.304f, 14.542f, 10.852f, 14.769f)
                curveTo(11.4f, 14.996f, 12.003f, 15.055f, 12.585f, 14.94f)
                curveTo(13.166f, 14.824f, 13.7f, 14.539f, 14.12f, 14.12f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 19f)
                verticalLineTo(22f)
            }
        }.build()

        return _MicOff!!
    }

@Suppress("ObjectPropertyName")
private var _MicOff: ImageVector? = null
