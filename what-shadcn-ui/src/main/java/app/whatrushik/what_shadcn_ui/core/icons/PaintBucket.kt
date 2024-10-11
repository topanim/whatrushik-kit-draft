package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.PaintBucket: ImageVector
    get() {
        if (_PaintBucket != null) {
            return _PaintBucket!!
        }
        _PaintBucket = ImageVector.Builder(
            name = "PaintBucket",
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
                moveTo(19f, 11f)
                lineTo(11f, 3f)
                lineTo(2.4f, 11.6f)
                curveTo(2.034f, 11.974f, 1.828f, 12.476f, 1.828f, 13f)
                curveTo(1.828f, 13.524f, 2.034f, 14.026f, 2.4f, 14.4f)
                lineTo(7.6f, 19.6f)
                curveTo(8.4f, 20.4f, 9.6f, 20.4f, 10.4f, 19.6f)
                lineTo(19f, 11f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 2f)
                lineTo(10f, 7f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 13f)
                horizontalLineTo(17f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 20f)
                curveTo(22f, 20.53f, 21.789f, 21.039f, 21.414f, 21.414f)
                curveTo(21.039f, 21.789f, 20.53f, 22f, 20f, 22f)
                curveTo(19.47f, 22f, 18.961f, 21.789f, 18.586f, 21.414f)
                curveTo(18.211f, 21.039f, 18f, 20.53f, 18f, 20f)
                curveTo(18f, 18.4f, 19.7f, 17.6f, 20f, 16f)
                curveTo(20.3f, 17.6f, 22f, 18.4f, 22f, 20f)
                close()
            }
        }.build()

        return _PaintBucket!!
    }

@Suppress("ObjectPropertyName")
private var _PaintBucket: ImageVector? = null
