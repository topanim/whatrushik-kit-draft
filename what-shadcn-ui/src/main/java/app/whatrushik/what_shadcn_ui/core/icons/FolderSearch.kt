package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.FolderSearch: ImageVector
    get() {
        if (_FolderSearch != null) {
            return _FolderSearch!!
        }
        _FolderSearch = ImageVector.Builder(
            name = "FolderSearch",
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
                verticalLineTo(12f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 20f)
                curveTo(18.657f, 20f, 20f, 18.657f, 20f, 17f)
                curveTo(20f, 15.343f, 18.657f, 14f, 17f, 14f)
                curveTo(15.343f, 14f, 14f, 15.343f, 14f, 17f)
                curveTo(14f, 18.657f, 15.343f, 20f, 17f, 20f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 21f)
                lineTo(19.5f, 19.5f)
            }
        }.build()

        return _FolderSearch!!
    }

@Suppress("ObjectPropertyName")
private var _FolderSearch: ImageVector? = null
