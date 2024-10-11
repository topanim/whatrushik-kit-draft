package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.FileCog2: ImageVector
    get() {
        if (_FileCog2 != null) {
            return _FileCog2!!
        }
        _FileCog2 = ImageVector.Builder(
            name = "FileCog2",
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
                moveTo(12f, 17f)
                curveTo(13.105f, 17f, 14f, 16.105f, 14f, 15f)
                curveTo(14f, 13.895f, 13.105f, 13f, 12f, 13f)
                curveTo(10.895f, 13f, 10f, 13.895f, 10f, 15f)
                curveTo(10f, 16.105f, 10.895f, 17f, 12f, 17f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                verticalLineTo(13f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 17f)
                verticalLineTo(18f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.6f, 13.5f)
                lineTo(13.73f, 14f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.27f, 16f)
                lineTo(9.4f, 16.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.6f, 16.5f)
                lineTo(13.73f, 16f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.27f, 14f)
                lineTo(9.4f, 13.5f)
            }
        }.build()

        return _FileCog2!!
    }

@Suppress("ObjectPropertyName")
private var _FileCog2: ImageVector? = null
