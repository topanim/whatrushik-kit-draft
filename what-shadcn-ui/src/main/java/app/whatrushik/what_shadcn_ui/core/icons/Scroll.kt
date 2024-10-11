package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Scroll: ImageVector
    get() {
        if (_Scroll != null) {
            return _Scroll!!
        }
        _Scroll = ImageVector.Builder(
            name = "Scroll",
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
                moveTo(10f, 17f)
                verticalLineTo(19f)
                curveTo(10f, 19.53f, 9.789f, 20.039f, 9.414f, 20.414f)
                curveTo(9.039f, 20.789f, 8.53f, 21f, 8f, 21f)
                curveTo(7.47f, 21f, 6.961f, 20.789f, 6.586f, 20.414f)
                curveTo(6.211f, 20.039f, 6f, 19.53f, 6f, 19f)
                verticalLineTo(5f)
                curveTo(6f, 4.47f, 5.789f, 3.961f, 5.414f, 3.586f)
                curveTo(5.039f, 3.211f, 4.53f, 3f, 4f, 3f)
                curveTo(3.47f, 3f, 2.961f, 3.211f, 2.586f, 3.586f)
                curveTo(2.211f, 3.961f, 2f, 4.47f, 2f, 5f)
                verticalLineTo(8f)
                horizontalLineTo(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 17f)
                verticalLineTo(19f)
                curveTo(22f, 19.53f, 21.789f, 20.039f, 21.414f, 20.414f)
                curveTo(21.039f, 20.789f, 20.53f, 21f, 20f, 21f)
                horizontalLineTo(8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 17f)
                verticalLineTo(5f)
                curveTo(19f, 4.47f, 18.789f, 3.961f, 18.414f, 3.586f)
                curveTo(18.039f, 3.211f, 17.53f, 3f, 17f, 3f)
                horizontalLineTo(4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 17f)
                horizontalLineTo(10f)
            }
        }.build()

        return _Scroll!!
    }

@Suppress("ObjectPropertyName")
private var _Scroll: ImageVector? = null
