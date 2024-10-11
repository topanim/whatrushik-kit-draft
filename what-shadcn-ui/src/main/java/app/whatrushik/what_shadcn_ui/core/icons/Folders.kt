package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Folders: ImageVector
    get() {
        if (_Folders != null) {
            return _Folders!!
        }
        _Folders = ImageVector.Builder(
            name = "Folders",
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
                moveTo(8f, 17f)
                horizontalLineTo(20f)
                curveTo(20.53f, 17f, 21.039f, 16.789f, 21.414f, 16.414f)
                curveTo(21.789f, 16.039f, 22f, 15.53f, 22f, 15f)
                verticalLineTo(9f)
                curveTo(22f, 8.47f, 21.789f, 7.961f, 21.414f, 7.586f)
                curveTo(21.039f, 7.211f, 20.53f, 7f, 20f, 7f)
                horizontalLineTo(16.07f)
                curveTo(15.741f, 6.998f, 15.417f, 6.915f, 15.127f, 6.758f)
                curveTo(14.837f, 6.601f, 14.591f, 6.375f, 14.41f, 6.1f)
                lineTo(13.59f, 4.9f)
                curveTo(13.409f, 4.625f, 13.163f, 4.399f, 12.873f, 4.242f)
                curveTo(12.583f, 4.085f, 12.259f, 4.002f, 11.93f, 4f)
                horizontalLineTo(8f)
                curveTo(7.47f, 4f, 6.961f, 4.211f, 6.586f, 4.586f)
                curveTo(6.211f, 4.961f, 6f, 5.47f, 6f, 6f)
                verticalLineTo(15f)
                curveTo(6f, 16.1f, 6.9f, 17f, 8f, 17f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 8f)
                verticalLineTo(19f)
                curveTo(2f, 20.1f, 2.9f, 21f, 4f, 21f)
                horizontalLineTo(18f)
            }
        }.build()

        return _Folders!!
    }

@Suppress("ObjectPropertyName")
private var _Folders: ImageVector? = null
