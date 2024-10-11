package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.BaggageClaim: ImageVector
    get() {
        if (_BaggageClaim != null) {
            return _BaggageClaim!!
        }
        _BaggageClaim = ImageVector.Builder(
            name = "BaggageClaim",
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
                moveTo(22f, 18f)
                horizontalLineTo(6f)
                curveTo(5.47f, 18f, 4.961f, 17.789f, 4.586f, 17.414f)
                curveTo(4.211f, 17.039f, 4f, 16.53f, 4f, 16f)
                verticalLineTo(7f)
                curveTo(4f, 6.47f, 3.789f, 5.961f, 3.414f, 5.586f)
                curveTo(3.039f, 5.211f, 2.53f, 5f, 2f, 5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 14f)
                verticalLineTo(4f)
                curveTo(17f, 3.47f, 16.789f, 2.961f, 16.414f, 2.586f)
                curveTo(16.039f, 2.211f, 15.53f, 2f, 15f, 2f)
                horizontalLineTo(14f)
                curveTo(13.47f, 2f, 12.961f, 2.211f, 12.586f, 2.586f)
                curveTo(12.211f, 2.961f, 12f, 3.47f, 12f, 4f)
                verticalLineTo(14f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 6f)
                horizontalLineTo(9f)
                curveTo(8.448f, 6f, 8f, 6.448f, 8f, 7f)
                verticalLineTo(13f)
                curveTo(8f, 13.552f, 8.448f, 14f, 9f, 14f)
                horizontalLineTo(20f)
                curveTo(20.552f, 14f, 21f, 13.552f, 21f, 13f)
                verticalLineTo(7f)
                curveTo(21f, 6.448f, 20.552f, 6f, 20f, 6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 22f)
                curveTo(19.105f, 22f, 20f, 21.105f, 20f, 20f)
                curveTo(20f, 18.895f, 19.105f, 18f, 18f, 18f)
                curveTo(16.895f, 18f, 16f, 18.895f, 16f, 20f)
                curveTo(16f, 21.105f, 16.895f, 22f, 18f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 22f)
                curveTo(10.105f, 22f, 11f, 21.105f, 11f, 20f)
                curveTo(11f, 18.895f, 10.105f, 18f, 9f, 18f)
                curveTo(7.895f, 18f, 7f, 18.895f, 7f, 20f)
                curveTo(7f, 21.105f, 7.895f, 22f, 9f, 22f)
                close()
            }
        }.build()

        return _BaggageClaim!!
    }

@Suppress("ObjectPropertyName")
private var _BaggageClaim: ImageVector? = null
