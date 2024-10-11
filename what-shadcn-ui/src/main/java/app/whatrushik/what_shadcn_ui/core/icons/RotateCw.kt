package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val SHUIIcons.RotateCw: ImageVector
    get() {
        if (_RotateCw != null) {
            return _RotateCw!!
        }
        _RotateCw = ImageVector.Builder(
            name = "RotateCw",
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
                moveTo(21f, 2f)
                verticalLineTo(8f)
                horizontalLineTo(15f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 13f)
                curveTo(20.788f, 15.006f, 19.908f, 16.882f, 18.501f, 18.328f)
                curveTo(17.095f, 19.774f, 15.243f, 20.705f, 13.244f, 20.973f)
                curveTo(11.245f, 21.24f, 9.213f, 20.829f, 7.476f, 19.803f)
                curveTo(5.739f, 18.778f, 4.396f, 17.199f, 3.664f, 15.32f)
                curveTo(2.932f, 13.44f, 2.852f, 11.369f, 3.438f, 9.439f)
                curveTo(4.024f, 7.509f, 5.241f, 5.831f, 6.894f, 4.676f)
                curveTo(8.548f, 3.52f, 10.541f, 2.953f, 12.555f, 3.067f)
                curveTo(14.569f, 3.18f, 16.487f, 3.966f, 18f, 5.3f)
                lineTo(21f, 8f)
            }
        }.build()

        return _RotateCw!!
    }

@Suppress("ObjectPropertyName")
private var _RotateCw: ImageVector? = null
