package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.BedSingle: ImageVector
    get() {
        if (_BedSingle != null) {
            return _BedSingle!!
        }
        _BedSingle = ImageVector.Builder(
            name = "BedSingle",
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
                moveTo(3f, 20f)
                verticalLineTo(12f)
                curveTo(3f, 11.47f, 3.211f, 10.961f, 3.586f, 10.586f)
                curveTo(3.961f, 10.211f, 4.47f, 10f, 5f, 10f)
                horizontalLineTo(19f)
                curveTo(19.53f, 10f, 20.039f, 10.211f, 20.414f, 10.586f)
                curveTo(20.789f, 10.961f, 21f, 11.47f, 21f, 12f)
                verticalLineTo(20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 10f)
                verticalLineTo(6f)
                curveTo(5f, 5.47f, 5.211f, 4.961f, 5.586f, 4.586f)
                curveTo(5.961f, 4.211f, 6.47f, 4f, 7f, 4f)
                horizontalLineTo(17f)
                curveTo(17.53f, 4f, 18.039f, 4.211f, 18.414f, 4.586f)
                curveTo(18.789f, 4.961f, 19f, 5.47f, 19f, 6f)
                verticalLineTo(10f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 18f)
                horizontalLineTo(21f)
            }
        }.build()

        return _BedSingle!!
    }

@Suppress("ObjectPropertyName")
private var _BedSingle: ImageVector? = null
