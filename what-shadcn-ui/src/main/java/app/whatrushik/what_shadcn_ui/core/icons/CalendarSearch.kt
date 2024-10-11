package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val SHUIIcons.CalendarSearch: ImageVector
    get() {
        if (_CalendarSearch != null) {
            return _CalendarSearch!!
        }
        _CalendarSearch = ImageVector.Builder(
            name = "CalendarSearch",
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
                moveTo(21f, 12f)
                verticalLineTo(6f)
                curveTo(21f, 5.47f, 20.789f, 4.961f, 20.414f, 4.586f)
                curveTo(20.039f, 4.211f, 19.53f, 4f, 19f, 4f)
                horizontalLineTo(5f)
                curveTo(4.47f, 4f, 3.961f, 4.211f, 3.586f, 4.586f)
                curveTo(3.211f, 4.961f, 3f, 5.47f, 3f, 6f)
                verticalLineTo(20f)
                curveTo(3f, 21.1f, 3.9f, 22f, 5f, 22f)
                horizontalLineTo(12.5f)
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
                moveTo(18f, 21f)
                curveTo(18.796f, 21f, 19.559f, 20.684f, 20.121f, 20.121f)
                curveTo(20.684f, 19.559f, 21f, 18.796f, 21f, 18f)
                curveTo(21f, 17.204f, 20.684f, 16.441f, 20.121f, 15.879f)
                curveTo(19.559f, 15.316f, 18.796f, 15f, 18f, 15f)
                curveTo(17.204f, 15f, 16.441f, 15.316f, 15.879f, 15.879f)
                curveTo(15.316f, 16.441f, 15f, 17.204f, 15f, 18f)
                curveTo(15f, 18.796f, 15.316f, 19.559f, 15.879f, 20.121f)
                curveTo(16.441f, 20.684f, 17.204f, 21f, 18f, 21f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 22f)
                lineTo(20.5f, 20.5f)
            }
        }.build()

        return _CalendarSearch!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarSearch: ImageVector? = null
