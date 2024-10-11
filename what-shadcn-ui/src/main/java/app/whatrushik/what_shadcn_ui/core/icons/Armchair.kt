package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Armchair: ImageVector
    get() {
        if (_Armchair != null) {
            return _Armchair!!
        }
        _Armchair = ImageVector.Builder(
            name = "Armchair",
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
                moveTo(19f, 9f)
                verticalLineTo(6f)
                curveTo(19f, 5.47f, 18.789f, 4.961f, 18.414f, 4.586f)
                curveTo(18.039f, 4.211f, 17.53f, 4f, 17f, 4f)
                horizontalLineTo(7f)
                curveTo(6.47f, 4f, 5.961f, 4.211f, 5.586f, 4.586f)
                curveTo(5.211f, 4.961f, 5f, 5.47f, 5f, 6f)
                verticalLineTo(9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 11f)
                verticalLineTo(16f)
                curveTo(3f, 16.53f, 3.211f, 17.039f, 3.586f, 17.414f)
                curveTo(3.961f, 17.789f, 4.47f, 18f, 5f, 18f)
                horizontalLineTo(19f)
                curveTo(19.53f, 18f, 20.039f, 17.789f, 20.414f, 17.414f)
                curveTo(20.789f, 17.039f, 21f, 16.53f, 21f, 16f)
                verticalLineTo(11f)
                curveTo(21f, 10.47f, 20.789f, 9.961f, 20.414f, 9.586f)
                curveTo(20.039f, 9.211f, 19.53f, 9f, 19f, 9f)
                curveTo(18.47f, 9f, 17.961f, 9.211f, 17.586f, 9.586f)
                curveTo(17.211f, 9.961f, 17f, 10.47f, 17f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                curveTo(7f, 10.47f, 6.789f, 9.961f, 6.414f, 9.586f)
                curveTo(6.039f, 9.211f, 5.53f, 9f, 5f, 9f)
                curveTo(4.47f, 9f, 3.961f, 9.211f, 3.586f, 9.586f)
                curveTo(3.211f, 9.961f, 3f, 10.47f, 3f, 11f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 18f)
                verticalLineTo(20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 18f)
                verticalLineTo(20f)
            }
        }.build()

        return _Armchair!!
    }

@Suppress("ObjectPropertyName")
private var _Armchair: ImageVector? = null
