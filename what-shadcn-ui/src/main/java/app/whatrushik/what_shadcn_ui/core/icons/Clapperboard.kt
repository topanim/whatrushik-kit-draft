package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Clapperboard: ImageVector
    get() {
        if (_Clapperboard != null) {
            return _Clapperboard!!
        }
        _Clapperboard = ImageVector.Builder(
            name = "Clapperboard",
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
                moveTo(4f, 11f)
                verticalLineTo(19f)
                curveTo(4f, 19.53f, 4.211f, 20.039f, 4.586f, 20.414f)
                curveTo(4.961f, 20.789f, 5.47f, 21f, 6f, 21f)
                horizontalLineTo(18f)
                curveTo(18.53f, 21f, 19.039f, 20.789f, 19.414f, 20.414f)
                curveTo(19.789f, 20.039f, 20f, 19.53f, 20f, 19f)
                verticalLineTo(11f)
                horizontalLineTo(4f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 11f)
                lineTo(3.12f, 8.13f)
                curveTo(3.043f, 7.879f, 3.016f, 7.614f, 3.041f, 7.352f)
                curveTo(3.066f, 7.091f, 3.143f, 6.836f, 3.266f, 6.604f)
                curveTo(3.39f, 6.372f, 3.558f, 6.166f, 3.761f, 5.999f)
                curveTo(3.964f, 5.832f, 4.198f, 5.707f, 4.45f, 5.63f)
                lineTo(15.93f, 2.13f)
                curveTo(16.437f, 1.974f, 16.985f, 2.025f, 17.453f, 2.273f)
                curveTo(17.922f, 2.52f, 18.273f, 2.944f, 18.43f, 3.45f)
                lineTo(19.3f, 6.32f)
                lineTo(4f, 11.01f)
                verticalLineTo(11f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.6f, 4.99f)
                lineTo(9.98f, 9.19f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.86f, 3.38f)
                lineTo(15.24f, 7.58f)
            }
        }.build()

        return _Clapperboard!!
    }

@Suppress("ObjectPropertyName")
private var _Clapperboard: ImageVector? = null
