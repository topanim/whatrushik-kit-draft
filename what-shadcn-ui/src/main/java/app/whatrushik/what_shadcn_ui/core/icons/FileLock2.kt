package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.FileLock2: ImageVector
    get() {
        if (_FileLock2 != null) {
            return _FileLock2!!
        }
        _FileLock2 = ImageVector.Builder(
            name = "FileLock2",
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
                moveTo(4f, 5f)
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
                moveTo(9f, 13f)
                horizontalLineTo(3f)
                curveTo(2.448f, 13f, 2f, 13.448f, 2f, 14f)
                verticalLineTo(17f)
                curveTo(2f, 17.552f, 2.448f, 18f, 3f, 18f)
                horizontalLineTo(9f)
                curveTo(9.552f, 18f, 10f, 17.552f, 10f, 17f)
                verticalLineTo(14f)
                curveTo(10f, 13.448f, 9.552f, 13f, 9f, 13f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 13f)
                verticalLineTo(11f)
                curveTo(8f, 10.47f, 7.789f, 9.961f, 7.414f, 9.586f)
                curveTo(7.039f, 9.211f, 6.53f, 9f, 6f, 9f)
                curveTo(5.47f, 9f, 4.961f, 9.211f, 4.586f, 9.586f)
                curveTo(4.211f, 9.961f, 4f, 10.47f, 4f, 11f)
                verticalLineTo(13f)
            }
        }.build()

        return _FileLock2!!
    }

@Suppress("ObjectPropertyName")
private var _FileLock2: ImageVector? = null
