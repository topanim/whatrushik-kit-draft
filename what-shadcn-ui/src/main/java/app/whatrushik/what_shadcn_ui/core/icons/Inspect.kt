package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Inspect: ImageVector
    get() {
        if (_Inspect != null) {
            return _Inspect!!
        }
        _Inspect = ImageVector.Builder(
            name = "Inspect",
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
                moveTo(21f, 11f)
                verticalLineTo(5f)
                curveTo(21f, 4.47f, 20.789f, 3.961f, 20.414f, 3.586f)
                curveTo(20.039f, 3.211f, 19.53f, 3f, 19f, 3f)
                horizontalLineTo(5f)
                curveTo(4.47f, 3f, 3.961f, 3.211f, 3.586f, 3.586f)
                curveTo(3.211f, 3.961f, 3f, 4.47f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 19.53f, 3.211f, 20.039f, 3.586f, 20.414f)
                curveTo(3.961f, 20.789f, 4.47f, 21f, 5f, 21f)
                horizontalLineTo(11f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                lineTo(16f, 22f)
                lineTo(17.7f, 17.7f)
                lineTo(22f, 16f)
                lineTo(12f, 12f)
                close()
            }
        }.build()

        return _Inspect!!
    }

@Suppress("ObjectPropertyName")
private var _Inspect: ImageVector? = null
