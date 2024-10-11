package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Luggage: ImageVector
    get() {
        if (_Luggage != null) {
            return _Luggage!!
        }
        _Luggage = ImageVector.Builder(
            name = "Luggage",
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
                moveTo(6f, 20f)
                curveTo(5.47f, 20f, 4.961f, 19.789f, 4.586f, 19.414f)
                curveTo(4.211f, 19.039f, 4f, 18.53f, 4f, 18f)
                verticalLineTo(8f)
                curveTo(4f, 7.47f, 4.211f, 6.961f, 4.586f, 6.586f)
                curveTo(4.961f, 6.211f, 5.47f, 6f, 6f, 6f)
                horizontalLineTo(18f)
                curveTo(18.53f, 6f, 19.039f, 6.211f, 19.414f, 6.586f)
                curveTo(19.789f, 6.961f, 20f, 7.47f, 20f, 8f)
                verticalLineTo(18f)
                curveTo(20f, 18.53f, 19.789f, 19.039f, 19.414f, 19.414f)
                curveTo(19.039f, 19.789f, 18.53f, 20f, 18f, 20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 18f)
                verticalLineTo(4f)
                curveTo(8f, 3.47f, 8.211f, 2.961f, 8.586f, 2.586f)
                curveTo(8.961f, 2.211f, 9.47f, 2f, 10f, 2f)
                horizontalLineTo(14f)
                curveTo(14.53f, 2f, 15.039f, 2.211f, 15.414f, 2.586f)
                curveTo(15.789f, 2.961f, 16f, 3.47f, 16f, 4f)
                verticalLineTo(18f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 20f)
                horizontalLineTo(14f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 22f)
                curveTo(17.105f, 22f, 18f, 21.105f, 18f, 20f)
                curveTo(18f, 18.895f, 17.105f, 18f, 16f, 18f)
                curveTo(14.895f, 18f, 14f, 18.895f, 14f, 20f)
                curveTo(14f, 21.105f, 14.895f, 22f, 16f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 22f)
                curveTo(9.105f, 22f, 10f, 21.105f, 10f, 20f)
                curveTo(10f, 18.895f, 9.105f, 18f, 8f, 18f)
                curveTo(6.895f, 18f, 6f, 18.895f, 6f, 20f)
                curveTo(6f, 21.105f, 6.895f, 22f, 8f, 22f)
                close()
            }
        }.build()

        return _Luggage!!
    }

@Suppress("ObjectPropertyName")
private var _Luggage: ImageVector? = null
