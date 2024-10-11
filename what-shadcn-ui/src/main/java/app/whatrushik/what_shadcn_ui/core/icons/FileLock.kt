package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.FileLock: ImageVector
    get() {
        if (_FileLock != null) {
            return _FileLock!!
        }
        _FileLock = ImageVector.Builder(
            name = "FileLock",
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
                moveTo(14.5f, 2f)
                horizontalLineTo(6f)
                curveTo(5.47f, 2f, 4.961f, 2.211f, 4.586f, 2.586f)
                curveTo(4.211f, 2.961f, 4f, 3.47f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 20.53f, 4.211f, 21.039f, 4.586f, 21.414f)
                curveTo(4.961f, 21.789f, 5.47f, 22f, 6f, 22f)
                horizontalLineTo(18f)
                curveTo(18.53f, 22f, 19.039f, 21.789f, 19.414f, 21.414f)
                curveTo(19.789f, 21.039f, 20f, 20.53f, 20f, 20f)
                verticalLineTo(7.5f)
                lineTo(14.5f, 2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 12f)
                horizontalLineTo(9f)
                curveTo(8.448f, 12f, 8f, 12.448f, 8f, 13f)
                verticalLineTo(17f)
                curveTo(8f, 17.552f, 8.448f, 18f, 9f, 18f)
                horizontalLineTo(15f)
                curveTo(15.552f, 18f, 16f, 17.552f, 16f, 17f)
                verticalLineTo(13f)
                curveTo(16f, 12.448f, 15.552f, 12f, 15f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 12f)
                verticalLineTo(10f)
                curveTo(15f, 9.204f, 14.684f, 8.441f, 14.121f, 7.879f)
                curveTo(13.559f, 7.316f, 12.796f, 7f, 12f, 7f)
                curveTo(11.204f, 7f, 10.441f, 7.316f, 9.879f, 7.879f)
                curveTo(9.316f, 8.441f, 9f, 9.204f, 9f, 10f)
                verticalLineTo(12f)
            }
        }.build()

        return _FileLock!!
    }

@Suppress("ObjectPropertyName")
private var _FileLock: ImageVector? = null
