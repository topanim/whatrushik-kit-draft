package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Trees: ImageVector
    get() {
        if (_Trees != null) {
            return _Trees!!
        }
        _Trees = ImageVector.Builder(
            name = "Trees",
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
                moveTo(10f, 10f)
                verticalLineTo(10.2f)
                curveTo(10.656f, 10.452f, 11.202f, 10.927f, 11.544f, 11.54f)
                curveTo(11.886f, 12.154f, 12.002f, 12.869f, 11.871f, 13.559f)
                curveTo(11.74f, 14.249f, 11.371f, 14.872f, 10.828f, 15.318f)
                curveTo(10.285f, 15.764f, 9.603f, 16.005f, 8.9f, 16f)
                horizontalLineTo(5f)
                curveTo(4.306f, 15.983f, 3.639f, 15.725f, 3.113f, 15.271f)
                curveTo(2.588f, 14.817f, 2.236f, 14.195f, 2.118f, 13.511f)
                curveTo(2f, 12.826f, 2.123f, 12.122f, 2.466f, 11.519f)
                curveTo(2.81f, 10.915f, 3.352f, 10.449f, 4f, 10.2f)
                verticalLineTo(10f)
                curveTo(4f, 9.204f, 4.316f, 8.441f, 4.879f, 7.879f)
                curveTo(5.441f, 7.316f, 6.204f, 7f, 7f, 7f)
                curveTo(7.796f, 7f, 8.559f, 7.316f, 9.121f, 7.879f)
                curveTo(9.684f, 8.441f, 10f, 9.204f, 10f, 10f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 16f)
                verticalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 19f)
                verticalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 19f)
                horizontalLineTo(20.3f)
                curveTo(20.496f, 18.997f, 20.686f, 18.937f, 20.848f, 18.827f)
                curveTo(21.01f, 18.717f, 21.136f, 18.562f, 21.211f, 18.381f)
                curveTo(21.285f, 18.2f, 21.305f, 18.001f, 21.267f, 17.809f)
                curveTo(21.23f, 17.617f, 21.137f, 17.44f, 21f, 17.3f)
                lineTo(18f, 14f)
                horizontalLineTo(18.3f)
                curveTo(18.496f, 13.997f, 18.686f, 13.937f, 18.848f, 13.827f)
                curveTo(19.01f, 13.717f, 19.136f, 13.562f, 19.211f, 13.381f)
                curveTo(19.285f, 13.2f, 19.305f, 13.001f, 19.267f, 12.809f)
                curveTo(19.23f, 12.617f, 19.137f, 12.44f, 19f, 12.3f)
                lineTo(16f, 9f)
                horizontalLineTo(16.2f)
                curveTo(16.404f, 9.018f, 16.609f, 8.974f, 16.787f, 8.872f)
                curveTo(16.965f, 8.77f, 17.107f, 8.615f, 17.195f, 8.43f)
                curveTo(17.282f, 8.244f, 17.31f, 8.036f, 17.275f, 7.834f)
                curveTo(17.24f, 7.632f, 17.144f, 7.446f, 17f, 7.3f)
                lineTo(13f, 3f)
                lineTo(11.6f, 4.5f)
            }
        }.build()

        return _Trees!!
    }

@Suppress("ObjectPropertyName")
private var _Trees: ImageVector? = null
