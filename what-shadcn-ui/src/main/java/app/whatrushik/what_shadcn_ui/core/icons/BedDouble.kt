package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.BedDouble: ImageVector
    get() {
        if (_BedDouble != null) {
            return _BedDouble!!
        }
        _BedDouble = ImageVector.Builder(
            name = "BedDouble",
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
                moveTo(2f, 20f)
                verticalLineTo(12f)
                curveTo(2f, 11.47f, 2.211f, 10.961f, 2.586f, 10.586f)
                curveTo(2.961f, 10.211f, 3.47f, 10f, 4f, 10f)
                horizontalLineTo(20f)
                curveTo(20.53f, 10f, 21.039f, 10.211f, 21.414f, 10.586f)
                curveTo(21.789f, 10.961f, 22f, 11.47f, 22f, 12f)
                verticalLineTo(20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 10f)
                verticalLineTo(6f)
                curveTo(4f, 5.47f, 4.211f, 4.961f, 4.586f, 4.586f)
                curveTo(4.961f, 4.211f, 5.47f, 4f, 6f, 4f)
                horizontalLineTo(18f)
                curveTo(18.53f, 4f, 19.039f, 4.211f, 19.414f, 4.586f)
                curveTo(19.789f, 4.961f, 20f, 5.47f, 20f, 6f)
                verticalLineTo(10f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 4f)
                verticalLineTo(10f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 18f)
                horizontalLineTo(22f)
            }
        }.build()

        return _BedDouble!!
    }

@Suppress("ObjectPropertyName")
private var _BedDouble: ImageVector? = null
