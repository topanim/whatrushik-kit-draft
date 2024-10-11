package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.TreePine: ImageVector
    get() {
        if (_TreePine != null) {
            return _TreePine!!
        }
        _TreePine = ImageVector.Builder(
            name = "TreePine",
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
                moveTo(17f, 14f)
                lineTo(20f, 17.3f)
                curveTo(20.137f, 17.44f, 20.23f, 17.617f, 20.267f, 17.809f)
                curveTo(20.305f, 18.001f, 20.285f, 18.2f, 20.211f, 18.381f)
                curveTo(20.136f, 18.562f, 20.01f, 18.717f, 19.848f, 18.827f)
                curveTo(19.686f, 18.937f, 19.496f, 18.997f, 19.3f, 19f)
                horizontalLineTo(4.7f)
                curveTo(4.504f, 18.997f, 4.314f, 18.937f, 4.152f, 18.827f)
                curveTo(3.99f, 18.717f, 3.864f, 18.562f, 3.789f, 18.381f)
                curveTo(3.715f, 18.2f, 3.695f, 18.001f, 3.732f, 17.809f)
                curveTo(3.77f, 17.617f, 3.863f, 17.44f, 4f, 17.3f)
                lineTo(7f, 14f)
                horizontalLineTo(6.7f)
                curveTo(6.504f, 13.997f, 6.314f, 13.937f, 6.152f, 13.827f)
                curveTo(5.99f, 13.717f, 5.864f, 13.562f, 5.789f, 13.381f)
                curveTo(5.715f, 13.2f, 5.695f, 13.001f, 5.732f, 12.809f)
                curveTo(5.77f, 12.617f, 5.863f, 12.44f, 6f, 12.3f)
                lineTo(9f, 9f)
                horizontalLineTo(8.8f)
                curveTo(8.596f, 9.018f, 8.391f, 8.974f, 8.213f, 8.872f)
                curveTo(8.035f, 8.77f, 7.893f, 8.615f, 7.805f, 8.43f)
                curveTo(7.718f, 8.244f, 7.69f, 8.036f, 7.725f, 7.834f)
                curveTo(7.759f, 7.632f, 7.856f, 7.446f, 8f, 7.3f)
                lineTo(12f, 3f)
                lineTo(16f, 7.3f)
                curveTo(16.144f, 7.446f, 16.24f, 7.632f, 16.275f, 7.834f)
                curveTo(16.31f, 8.036f, 16.282f, 8.244f, 16.195f, 8.43f)
                curveTo(16.107f, 8.615f, 15.965f, 8.77f, 15.787f, 8.872f)
                curveTo(15.609f, 8.974f, 15.404f, 9.018f, 15.2f, 9f)
                horizontalLineTo(15f)
                lineTo(18f, 12.3f)
                curveTo(18.137f, 12.44f, 18.23f, 12.617f, 18.267f, 12.809f)
                curveTo(18.305f, 13.001f, 18.285f, 13.2f, 18.211f, 13.381f)
                curveTo(18.136f, 13.562f, 18.01f, 13.717f, 17.848f, 13.827f)
                curveTo(17.686f, 13.937f, 17.496f, 13.997f, 17.3f, 14f)
                horizontalLineTo(17f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 22f)
                verticalLineTo(19f)
            }
        }.build()

        return _TreePine!!
    }

@Suppress("ObjectPropertyName")
private var _TreePine: ImageVector? = null
