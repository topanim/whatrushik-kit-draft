package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.FileArchive: ImageVector
    get() {
        if (_FileArchive != null) {
            return _FileArchive!!
        }
        _FileArchive = ImageVector.Builder(
            name = "FileArchive",
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
                verticalLineTo(4f)
                curveTo(4f, 3.5f, 4.2f, 3f, 4.6f, 2.6f)
                curveTo(5f, 2.2f, 5.5f, 2f, 6f, 2f)
                horizontalLineTo(14.5f)
                lineTo(20f, 7.5f)
                verticalLineTo(20f)
                curveTo(20f, 20.5f, 19.8f, 21f, 19.4f, 21.4f)
                curveTo(19f, 21.8f, 18.5f, 22f, 18f, 22f)
                horizontalLineTo(16f)
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
                moveTo(10f, 22f)
                curveTo(11.105f, 22f, 12f, 21.105f, 12f, 20f)
                curveTo(12f, 18.895f, 11.105f, 18f, 10f, 18f)
                curveTo(8.895f, 18f, 8f, 18.895f, 8f, 20f)
                curveTo(8f, 21.105f, 8.895f, 22f, 10f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 7f)
                verticalLineTo(6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 12f)
                verticalLineTo(11f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 18f)
                verticalLineTo(16f)
            }
        }.build()

        return _FileArchive!!
    }

@Suppress("ObjectPropertyName")
private var _FileArchive: ImageVector? = null
