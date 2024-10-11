package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.RotateCcw: ImageVector
    get() {
        if (_RotateCcw != null) {
            return _RotateCcw!!
        }
        _RotateCcw = ImageVector.Builder(
            name = "RotateCcw",
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
                moveTo(3f, 2f)
                verticalLineTo(8f)
                horizontalLineTo(9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 13f)
                curveTo(3.212f, 15.006f, 4.092f, 16.882f, 5.499f, 18.328f)
                curveTo(6.905f, 19.774f, 8.757f, 20.705f, 10.756f, 20.973f)
                curveTo(12.756f, 21.24f, 14.787f, 20.829f, 16.524f, 19.803f)
                curveTo(18.261f, 18.778f, 19.604f, 17.199f, 20.336f, 15.32f)
                curveTo(21.068f, 13.44f, 21.148f, 11.369f, 20.562f, 9.439f)
                curveTo(19.976f, 7.509f, 18.759f, 5.831f, 17.106f, 4.676f)
                curveTo(15.453f, 3.52f, 13.459f, 2.953f, 11.445f, 3.067f)
                curveTo(9.431f, 3.18f, 7.513f, 3.966f, 6f, 5.3f)
                lineTo(3f, 8f)
            }
        }.build()

        return _RotateCcw!!
    }

@Suppress("ObjectPropertyName")
private var _RotateCcw: ImageVector? = null
