package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.CalendarHeart: ImageVector
    get() {
        if (_CalendarHeart != null) {
            return _CalendarHeart!!
        }
        _CalendarHeart = ImageVector.Builder(
            name = "CalendarHeart",
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
                moveTo(21f, 10f)
                verticalLineTo(6f)
                curveTo(21f, 5.47f, 20.789f, 4.961f, 20.414f, 4.586f)
                curveTo(20.039f, 4.211f, 19.53f, 4f, 19f, 4f)
                horizontalLineTo(5f)
                curveTo(4.47f, 4f, 3.961f, 4.211f, 3.586f, 4.586f)
                curveTo(3.211f, 4.961f, 3f, 5.47f, 3f, 6f)
                verticalLineTo(20f)
                curveTo(3f, 21.1f, 3.9f, 22f, 5f, 22f)
                horizontalLineTo(12f)
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
                moveTo(21.29f, 14.7f)
                curveTo(20.949f, 14.361f, 20.516f, 14.13f, 20.044f, 14.038f)
                curveTo(19.572f, 13.945f, 19.084f, 13.995f, 18.64f, 14.18f)
                curveTo(18.34f, 14.3f, 18.07f, 14.48f, 17.84f, 14.71f)
                lineTo(17.5f, 15.05f)
                lineTo(17.15f, 14.71f)
                curveTo(16.81f, 14.369f, 16.377f, 14.137f, 15.906f, 14.043f)
                curveTo(15.434f, 13.948f, 14.945f, 13.996f, 14.5f, 14.18f)
                curveTo(14.2f, 14.3f, 13.94f, 14.48f, 13.71f, 14.71f)
                curveTo(12.76f, 15.65f, 12.71f, 17.24f, 13.91f, 18.45f)
                lineTo(17.5f, 22f)
                lineTo(21.1f, 18.45f)
                curveTo(22.3f, 17.24f, 22.24f, 15.65f, 21.29f, 14.71f)
                verticalLineTo(14.7f)
                close()
            }
        }.build()

        return _CalendarHeart!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarHeart: ImageVector? = null
