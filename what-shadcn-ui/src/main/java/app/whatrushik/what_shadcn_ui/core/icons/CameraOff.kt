package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.CameraOff: ImageVector
    get() {
        if (_CameraOff != null) {
            return _CameraOff!!
        }
        _CameraOff = ImageVector.Builder(
            name = "CameraOff",
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
                moveTo(7f, 7f)
                horizontalLineTo(4f)
                curveTo(3.47f, 7f, 2.961f, 7.211f, 2.586f, 7.586f)
                curveTo(2.211f, 7.961f, 2f, 8.47f, 2f, 9f)
                verticalLineTo(18f)
                curveTo(2f, 18.53f, 2.211f, 19.039f, 2.586f, 19.414f)
                curveTo(2.961f, 19.789f, 3.47f, 20f, 4f, 20f)
                horizontalLineTo(20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.5f, 4f)
                horizontalLineTo(14.5f)
                lineTo(17f, 7f)
                horizontalLineTo(20f)
                curveTo(20.53f, 7f, 21.039f, 7.211f, 21.414f, 7.586f)
                curveTo(21.789f, 7.961f, 22f, 8.47f, 22f, 9f)
                verticalLineTo(16.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.121f, 15.121f)
                curveTo(13.845f, 15.412f, 13.514f, 15.645f, 13.147f, 15.807f)
                curveTo(12.78f, 15.968f, 12.384f, 16.054f, 11.983f, 16.059f)
                curveTo(11.582f, 16.065f, 11.184f, 15.99f, 10.813f, 15.839f)
                curveTo(10.441f, 15.688f, 10.104f, 15.464f, 9.82f, 15.181f)
                curveTo(9.537f, 14.897f, 9.313f, 14.56f, 9.162f, 14.188f)
                curveTo(9.011f, 13.817f, 8.936f, 13.419f, 8.942f, 13.018f)
                curveTo(8.947f, 12.617f, 9.033f, 12.221f, 9.194f, 11.854f)
                curveTo(9.356f, 11.487f, 9.589f, 11.156f, 9.88f, 10.88f)
            }
        }.build()

        return _CameraOff!!
    }

@Suppress("ObjectPropertyName")
private var _CameraOff: ImageVector? = null
