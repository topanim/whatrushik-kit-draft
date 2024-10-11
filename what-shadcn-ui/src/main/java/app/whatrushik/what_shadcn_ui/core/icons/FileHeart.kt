package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.FileHeart: ImageVector
    get() {
        if (_FileHeart != null) {
            return _FileHeart!!
        }
        _FileHeart = ImageVector.Builder(
            name = "FileHeart",
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
                moveTo(4f, 6f)
                verticalLineTo(4f)
                curveTo(4f, 3.47f, 4.211f, 2.961f, 4.586f, 2.586f)
                curveTo(4.961f, 2.211f, 5.47f, 2f, 6f, 2f)
                horizontalLineTo(14.5f)
                lineTo(20f, 7.5f)
                verticalLineTo(20f)
                curveTo(20f, 20.53f, 19.789f, 21.039f, 19.414f, 21.414f)
                curveTo(19.039f, 21.789f, 18.53f, 22f, 18f, 22f)
                horizontalLineTo(4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 2f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.29f, 10.7f)
                curveTo(9.948f, 10.359f, 9.513f, 10.127f, 9.039f, 10.035f)
                curveTo(8.566f, 9.942f, 8.075f, 9.993f, 7.63f, 10.18f)
                curveTo(7.34f, 10.3f, 7.07f, 10.48f, 6.85f, 10.71f)
                lineTo(6.5f, 11.05f)
                lineTo(6.15f, 10.71f)
                curveTo(5.81f, 10.369f, 5.377f, 10.137f, 4.906f, 10.043f)
                curveTo(4.434f, 9.948f, 3.945f, 9.996f, 3.5f, 10.18f)
                curveTo(3.2f, 10.3f, 2.94f, 10.48f, 2.71f, 10.71f)
                curveTo(1.76f, 11.65f, 1.71f, 13.24f, 2.91f, 14.45f)
                lineTo(6.5f, 18f)
                lineTo(10.1f, 14.45f)
                curveTo(11.3f, 13.24f, 11.24f, 11.65f, 10.29f, 10.71f)
                verticalLineTo(10.7f)
                close()
            }
        }.build()

        return _FileHeart!!
    }

@Suppress("ObjectPropertyName")
private var _FileHeart: ImageVector? = null
