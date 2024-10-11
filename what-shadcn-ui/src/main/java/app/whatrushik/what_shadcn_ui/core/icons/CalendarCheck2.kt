package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val SHUIIcons.CalendarCheck2: ImageVector
    get() {
        if (_CalendarCheck2 != null) {
            return _CalendarCheck2!!
        }
        _CalendarCheck2 = ImageVector.Builder(
            name = "CalendarCheck2",
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
                moveTo(21f, 14f)
                verticalLineTo(6f)
                curveTo(21f, 5.47f, 20.789f, 4.961f, 20.414f, 4.586f)
                curveTo(20.039f, 4.211f, 19.53f, 4f, 19f, 4f)
                horizontalLineTo(5f)
                curveTo(4.47f, 4f, 3.961f, 4.211f, 3.586f, 4.586f)
                curveTo(3.211f, 4.961f, 3f, 5.47f, 3f, 6f)
                verticalLineTo(20f)
                curveTo(3f, 20.53f, 3.211f, 21.039f, 3.586f, 21.414f)
                curveTo(3.961f, 21.789f, 4.47f, 22f, 5f, 22f)
                horizontalLineTo(13f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 2f)
                verticalLineTo(6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 2f)
                verticalLineTo(6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 10f)
                horizontalLineTo(21f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 20f)
                lineTo(18f, 22f)
                lineTo(22f, 18f)
            }
        }.build()

        return _CalendarCheck2!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarCheck2: ImageVector? = null
