package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Newspaper: ImageVector
    get() {
        if (_Newspaper != null) {
            return _Newspaper!!
        }
        _Newspaper = ImageVector.Builder(
            name = "Newspaper",
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
                moveTo(4f, 22f)
                horizontalLineTo(20f)
                curveTo(20.53f, 22f, 21.039f, 21.789f, 21.414f, 21.414f)
                curveTo(21.789f, 21.039f, 22f, 20.53f, 22f, 20f)
                verticalLineTo(4f)
                curveTo(22f, 3.47f, 21.789f, 2.961f, 21.414f, 2.586f)
                curveTo(21.039f, 2.211f, 20.53f, 2f, 20f, 2f)
                horizontalLineTo(8f)
                curveTo(7.47f, 2f, 6.961f, 2.211f, 6.586f, 2.586f)
                curveTo(6.211f, 2.961f, 6f, 3.47f, 6f, 4f)
                verticalLineTo(20f)
                curveTo(6f, 20.53f, 5.789f, 21.039f, 5.414f, 21.414f)
                curveTo(5.039f, 21.789f, 4.53f, 22f, 4f, 22f)
                close()
                moveTo(4f, 22f)
                curveTo(3.47f, 22f, 2.961f, 21.789f, 2.586f, 21.414f)
                curveTo(2.211f, 21.039f, 2f, 20.53f, 2f, 20f)
                verticalLineTo(11f)
                curveTo(2f, 9.9f, 2.9f, 9f, 4f, 9f)
                horizontalLineTo(6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 14f)
                horizontalLineTo(10f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 18f)
                horizontalLineTo(10f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 6f)
                horizontalLineTo(18f)
                verticalLineTo(10f)
                horizontalLineTo(10f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _Newspaper!!
    }

@Suppress("ObjectPropertyName")
private var _Newspaper: ImageVector? = null
