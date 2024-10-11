package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.FolderHeart: ImageVector
    get() {
        if (_FolderHeart != null) {
            return _FolderHeart!!
        }
        _FolderHeart = ImageVector.Builder(
            name = "FolderHeart",
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
                moveTo(11f, 20f)
                horizontalLineTo(4f)
                curveTo(3.47f, 20f, 2.961f, 19.789f, 2.586f, 19.414f)
                curveTo(2.211f, 19.039f, 2f, 18.53f, 2f, 18f)
                verticalLineTo(5f)
                curveTo(2f, 3.9f, 2.9f, 3f, 4f, 3f)
                horizontalLineTo(7.93f)
                curveTo(8.259f, 3.002f, 8.583f, 3.085f, 8.873f, 3.242f)
                curveTo(9.163f, 3.399f, 9.409f, 3.625f, 9.59f, 3.9f)
                lineTo(10.41f, 5.1f)
                curveTo(10.591f, 5.375f, 10.837f, 5.601f, 11.127f, 5.758f)
                curveTo(11.417f, 5.915f, 11.741f, 5.998f, 12.07f, 6f)
                horizontalLineTo(20f)
                curveTo(20.53f, 6f, 21.039f, 6.211f, 21.414f, 6.586f)
                curveTo(21.789f, 6.961f, 22f, 7.47f, 22f, 8f)
                verticalLineTo(9.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.29f, 13.7f)
                curveTo(20.949f, 13.361f, 20.516f, 13.131f, 20.044f, 13.038f)
                curveTo(19.572f, 12.946f, 19.084f, 12.995f, 18.64f, 13.18f)
                curveTo(18.34f, 13.3f, 18.07f, 13.48f, 17.84f, 13.71f)
                lineTo(17.5f, 14.05f)
                lineTo(17.15f, 13.71f)
                curveTo(16.81f, 13.369f, 16.377f, 13.137f, 15.906f, 13.043f)
                curveTo(15.434f, 12.948f, 14.945f, 12.996f, 14.5f, 13.18f)
                curveTo(14.2f, 13.3f, 13.94f, 13.48f, 13.71f, 13.71f)
                curveTo(12.76f, 14.65f, 12.71f, 16.24f, 13.91f, 17.45f)
                lineTo(17.5f, 21f)
                lineTo(21.1f, 17.45f)
                curveTo(22.3f, 16.24f, 22.24f, 14.65f, 21.29f, 13.71f)
                verticalLineTo(13.7f)
                close()
            }
        }.build()

        return _FolderHeart!!
    }

@Suppress("ObjectPropertyName")
private var _FolderHeart: ImageVector? = null
