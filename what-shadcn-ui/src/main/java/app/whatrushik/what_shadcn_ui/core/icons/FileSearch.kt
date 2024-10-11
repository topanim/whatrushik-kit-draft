package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.FileSearch: ImageVector
    get() {
        if (_FileSearch != null) {
            return _FileSearch!!
        }
        _FileSearch = ImageVector.Builder(
            name = "FileSearch",
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
                moveTo(4f, 22f)
                horizontalLineTo(18f)
                curveTo(18.53f, 22f, 19.039f, 21.789f, 19.414f, 21.414f)
                curveTo(19.789f, 21.039f, 20f, 20.53f, 20f, 20f)
                verticalLineTo(7.5f)
                lineTo(14.5f, 2f)
                horizontalLineTo(6f)
                curveTo(5.47f, 2f, 4.961f, 2.211f, 4.586f, 2.586f)
                curveTo(4.211f, 2.961f, 4f, 3.47f, 4f, 4f)
                verticalLineTo(7f)
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
                moveTo(5f, 17f)
                curveTo(5.394f, 17f, 5.784f, 16.922f, 6.148f, 16.772f)
                curveTo(6.512f, 16.621f, 6.843f, 16.4f, 7.121f, 16.121f)
                curveTo(7.4f, 15.843f, 7.621f, 15.512f, 7.772f, 15.148f)
                curveTo(7.922f, 14.784f, 8f, 14.394f, 8f, 14f)
                curveTo(8f, 13.606f, 7.922f, 13.216f, 7.772f, 12.852f)
                curveTo(7.621f, 12.488f, 7.4f, 12.157f, 7.121f, 11.879f)
                curveTo(6.843f, 11.6f, 6.512f, 11.379f, 6.148f, 11.228f)
                curveTo(5.784f, 11.078f, 5.394f, 11f, 5f, 11f)
                curveTo(4.204f, 11f, 3.441f, 11.316f, 2.879f, 11.879f)
                curveTo(2.316f, 12.441f, 2f, 13.204f, 2f, 14f)
                curveTo(2f, 14.796f, 2.316f, 15.559f, 2.879f, 16.121f)
                curveTo(3.441f, 16.684f, 4.204f, 17f, 5f, 17f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 18f)
                lineTo(7.5f, 16.5f)
            }
        }.build()

        return _FileSearch!!
    }

@Suppress("ObjectPropertyName")
private var _FileSearch: ImageVector? = null
