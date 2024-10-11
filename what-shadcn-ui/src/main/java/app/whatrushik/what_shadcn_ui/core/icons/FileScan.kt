package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.FileScan: ImageVector
    get() {
        if (_FileScan != null) {
            return _FileScan!!
        }
        _FileScan = ImageVector.Builder(
            name = "FileScan",
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
                moveTo(20f, 10f)
                verticalLineTo(7.5f)
                lineTo(14.5f, 2f)
                horizontalLineTo(6f)
                curveTo(5.47f, 2f, 4.961f, 2.211f, 4.586f, 2.586f)
                curveTo(4.211f, 2.961f, 4f, 3.47f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 21.1f, 4.9f, 22f, 6f, 22f)
                horizontalLineTo(10.5f)
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
                moveTo(16f, 22f)
                curveTo(15.47f, 22f, 14.961f, 21.789f, 14.586f, 21.414f)
                curveTo(14.211f, 21.039f, 14f, 20.53f, 14f, 20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 22f)
                curveTo(20.53f, 22f, 21.039f, 21.789f, 21.414f, 21.414f)
                curveTo(21.789f, 21.039f, 22f, 20.53f, 22f, 20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 14f)
                curveTo(20.53f, 14f, 21.039f, 14.211f, 21.414f, 14.586f)
                curveTo(21.789f, 14.961f, 22f, 15.47f, 22f, 16f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 14f)
                curveTo(15.47f, 14f, 14.961f, 14.211f, 14.586f, 14.586f)
                curveTo(14.211f, 14.961f, 14f, 15.47f, 14f, 16f)
            }
        }.build()

        return _FileScan!!
    }

@Suppress("ObjectPropertyName")
private var _FileScan: ImageVector? = null
