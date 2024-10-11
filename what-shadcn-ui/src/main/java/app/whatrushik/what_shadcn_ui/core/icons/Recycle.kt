package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Recycle: ImageVector
    get() {
        if (_Recycle != null) {
            return _Recycle!!
        }
        _Recycle = ImageVector.Builder(
            name = "Recycle",
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
                moveTo(7f, 19f)
                horizontalLineTo(4.815f)
                curveTo(4.5f, 19.001f, 4.189f, 18.92f, 3.914f, 18.766f)
                curveTo(3.639f, 18.612f, 3.409f, 18.389f, 3.245f, 18.119f)
                curveTo(3.088f, 17.848f, 3.005f, 17.541f, 3.004f, 17.228f)
                curveTo(3.003f, 16.914f, 3.085f, 16.607f, 3.241f, 16.335f)
                lineTo(7.196f, 9.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 19f)
                horizontalLineTo(19.203f)
                curveTo(19.517f, 18.998f, 19.825f, 18.914f, 20.097f, 18.759f)
                curveTo(20.37f, 18.603f, 20.598f, 18.379f, 20.759f, 18.11f)
                curveTo(20.914f, 17.84f, 20.995f, 17.534f, 20.995f, 17.223f)
                curveTo(20.995f, 16.911f, 20.914f, 16.605f, 20.759f, 16.335f)
                lineTo(19.533f, 14.215f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 16f)
                lineTo(11f, 19f)
                lineTo(14f, 22f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.293f, 13.596f)
                lineTo(7.196f, 9.5f)
                lineTo(3.1f, 10.598f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.344f, 5.811f)
                lineTo(10.437f, 3.919f)
                curveTo(10.594f, 3.645f, 10.819f, 3.417f, 11.09f, 3.256f)
                curveTo(11.361f, 3.095f, 11.67f, 3.007f, 11.985f, 3f)
                curveTo(12.298f, 2.999f, 12.606f, 3.081f, 12.877f, 3.237f)
                curveTo(13.148f, 3.393f, 13.374f, 3.617f, 13.531f, 3.888f)
                lineTo(17.474f, 10.731f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.378f, 9.633f)
                lineTo(17.474f, 10.731f)
                lineTo(18.571f, 6.635f)
            }
        }.build()

        return _Recycle!!
    }

@Suppress("ObjectPropertyName")
private var _Recycle: ImageVector? = null
