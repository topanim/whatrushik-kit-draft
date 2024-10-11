package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val SHUIIcons.PowerOff: ImageVector
    get() {
        if (_PowerOff != null) {
            return _PowerOff!!
        }
        _PowerOff = ImageVector.Builder(
            name = "PowerOff",
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
                moveTo(18.36f, 6.64f)
                curveTo(19.436f, 7.716f, 20.221f, 9.047f, 20.642f, 10.509f)
                curveTo(21.064f, 11.971f, 21.108f, 13.516f, 20.77f, 15f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.16f, 6.16f)
                curveTo(5.205f, 6.962f, 4.426f, 7.955f, 3.875f, 9.074f)
                curveTo(3.324f, 10.193f, 3.011f, 11.415f, 2.957f, 12.661f)
                curveTo(2.903f, 13.908f, 3.108f, 15.152f, 3.561f, 16.315f)
                curveTo(4.013f, 17.477f, 4.702f, 18.533f, 5.584f, 19.416f)
                curveTo(6.467f, 20.298f, 7.523f, 20.987f, 8.685f, 21.439f)
                curveTo(9.848f, 21.892f, 11.092f, 22.097f, 12.339f, 22.043f)
                curveTo(13.585f, 21.989f, 14.807f, 21.676f, 15.926f, 21.125f)
                curveTo(17.045f, 20.573f, 18.038f, 19.795f, 18.84f, 18.84f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 2f)
                verticalLineTo(6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 2f)
                lineTo(22f, 22f)
            }
        }.build()

        return _PowerOff!!
    }

@Suppress("ObjectPropertyName")
private var _PowerOff: ImageVector? = null
