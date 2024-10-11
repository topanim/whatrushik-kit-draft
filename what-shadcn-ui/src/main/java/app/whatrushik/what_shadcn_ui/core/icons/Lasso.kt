package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Lasso: ImageVector
    get() {
        if (_Lasso != null) {
            return _Lasso!!
        }
        _Lasso = ImageVector.Builder(
            name = "Lasso",
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
                moveTo(3.3f, 14f)
                curveTo(2.455f, 12.838f, 2f, 11.437f, 2f, 10f)
                curveTo(2f, 5.6f, 6.5f, 2f, 12f, 2f)
                curveTo(17.5f, 2f, 22f, 5.6f, 22f, 10f)
                curveTo(22f, 14.4f, 17.5f, 18f, 12f, 18f)
                curveTo(10.281f, 18.029f, 8.576f, 17.688f, 7f, 17f)
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
        }.build()

        return _Lasso!!
    }

@Suppress("ObjectPropertyName")
private var _Lasso: ImageVector? = null
