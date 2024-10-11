package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.LassoSelect: ImageVector
    get() {
        if (_LassoSelect != null) {
            return _LassoSelect!!
        }
        _LassoSelect = ImageVector.Builder(
            name = "LassoSelect",
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
                moveTo(7f, 22f)
                curveTo(6.379f, 21.534f, 5.875f, 20.93f, 5.528f, 20.236f)
                curveTo(5.181f, 19.542f, 5f, 18.776f, 5f, 18f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 16.93f)
                curveTo(7.96f, 17.36f, 8.96f, 17.67f, 9.99f, 17.84f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.34f, 14f)
                curveTo(2.481f, 12.842f, 2.011f, 11.442f, 2f, 10f)
                curveTo(2f, 5.58f, 6.48f, 2f, 12f, 2f)
                curveTo(17.52f, 2f, 22f, 5.58f, 22f, 10f)
                curveTo(21.985f, 10.679f, 21.874f, 11.352f, 21.67f, 12f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 18f)
                curveTo(5.53f, 18f, 6.039f, 17.789f, 6.414f, 17.414f)
                curveTo(6.789f, 17.039f, 7f, 16.53f, 7f, 16f)
                curveTo(7f, 15.47f, 6.789f, 14.961f, 6.414f, 14.586f)
                curveTo(6.039f, 14.211f, 5.53f, 14f, 5f, 14f)
                curveTo(4.47f, 14f, 3.961f, 14.211f, 3.586f, 14.586f)
                curveTo(3.211f, 14.961f, 3f, 15.47f, 3f, 16f)
                curveTo(3f, 16.53f, 3.211f, 17.039f, 3.586f, 17.414f)
                curveTo(3.961f, 17.789f, 4.47f, 18f, 5f, 18f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.33f, 22f)
                horizontalLineTo(14.24f)
                curveTo(14.172f, 21.978f, 14.113f, 21.935f, 14.07f, 21.878f)
                curveTo(14.027f, 21.82f, 14.002f, 21.751f, 14f, 21.68f)
                verticalLineTo(11.68f)
                curveTo(14f, 11.592f, 14.034f, 11.507f, 14.096f, 11.443f)
                curveTo(14.158f, 11.38f, 14.242f, 11.343f, 14.33f, 11.34f)
                curveTo(14.41f, 11.34f, 14.48f, 11.37f, 14.54f, 11.42f)
                lineTo(21.88f, 17.42f)
                curveTo(21.935f, 17.463f, 21.974f, 17.521f, 21.994f, 17.588f)
                curveTo(22.013f, 17.654f, 22.011f, 17.725f, 21.988f, 17.791f)
                curveTo(21.965f, 17.856f, 21.921f, 17.912f, 21.864f, 17.952f)
                curveTo(21.807f, 17.991f, 21.739f, 18.011f, 21.67f, 18.01f)
                horizontalLineTo(17.18f)
                lineTo(14.61f, 21.86f)
                curveTo(14.577f, 21.903f, 14.535f, 21.939f, 14.486f, 21.963f)
                curveTo(14.438f, 21.987f, 14.384f, 22f, 14.33f, 22f)
                close()
            }
        }.build()

        return _LassoSelect!!
    }

@Suppress("ObjectPropertyName")
private var _LassoSelect: ImageVector? = null
