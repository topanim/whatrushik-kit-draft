package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Regex: ImageVector
    get() {
        if (_Regex != null) {
            return _Regex!!
        }
        _Regex = ImageVector.Builder(
            name = "Regex",
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
                moveTo(17f, 3f)
                verticalLineTo(13f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.67f, 5.5f)
                lineTo(21.33f, 10.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.67f, 10.5f)
                lineTo(21.33f, 5.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 17f)
                curveTo(9f, 16.47f, 8.789f, 15.961f, 8.414f, 15.586f)
                curveTo(8.039f, 15.211f, 7.53f, 15f, 7f, 15f)
                horizontalLineTo(5f)
                curveTo(4.47f, 15f, 3.961f, 15.211f, 3.586f, 15.586f)
                curveTo(3.211f, 15.961f, 3f, 16.47f, 3f, 17f)
                verticalLineTo(19f)
                curveTo(3f, 19.53f, 3.211f, 20.039f, 3.586f, 20.414f)
                curveTo(3.961f, 20.789f, 4.47f, 21f, 5f, 21f)
                horizontalLineTo(7f)
                curveTo(7.53f, 21f, 8.039f, 20.789f, 8.414f, 20.414f)
                curveTo(8.789f, 20.039f, 9f, 19.53f, 9f, 19f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _Regex!!
    }

@Suppress("ObjectPropertyName")
private var _Regex: ImageVector? = null
