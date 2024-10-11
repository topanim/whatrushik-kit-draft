package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.PinOff: ImageVector
    get() {
        if (_PinOff != null) {
            return _PinOff!!
        }
        _PinOff = ImageVector.Builder(
            name = "PinOff",
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
                moveTo(2f, 2f)
                lineTo(22f, 22f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 17f)
                verticalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 9f)
                verticalLineTo(10.76f)
                curveTo(9f, 11.132f, 8.896f, 11.497f, 8.7f, 11.813f)
                curveTo(8.504f, 12.129f, 8.223f, 12.384f, 7.89f, 12.55f)
                lineTo(6.11f, 13.45f)
                curveTo(5.777f, 13.616f, 5.496f, 13.871f, 5.3f, 14.187f)
                curveTo(5.104f, 14.503f, 5f, 14.868f, 5f, 15.24f)
                verticalLineTo(17f)
                horizontalLineTo(17f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 9.34f)
                verticalLineTo(6f)
                horizontalLineTo(16f)
                curveTo(16.53f, 6f, 17.039f, 5.789f, 17.414f, 5.414f)
                curveTo(17.789f, 5.039f, 18f, 4.53f, 18f, 4f)
                curveTo(18f, 3.47f, 17.789f, 2.961f, 17.414f, 2.586f)
                curveTo(17.039f, 2.211f, 16.53f, 2f, 16f, 2f)
                horizontalLineTo(7.89f)
            }
        }.build()

        return _PinOff!!
    }

@Suppress("ObjectPropertyName")
private var _PinOff: ImageVector? = null
