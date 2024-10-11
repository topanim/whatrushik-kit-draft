package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val SHUIIcons.EyeOff: ImageVector
    get() {
        if (_EyeOff != null) {
            return _EyeOff!!
        }
        _EyeOff = ImageVector.Builder(
            name = "EyeOff",
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
                moveTo(9.88f, 9.88f)
                curveTo(9.585f, 10.155f, 9.349f, 10.486f, 9.185f, 10.854f)
                curveTo(9.021f, 11.222f, 8.933f, 11.619f, 8.926f, 12.022f)
                curveTo(8.919f, 12.425f, 8.993f, 12.825f, 9.144f, 13.198f)
                curveTo(9.294f, 13.572f, 9.519f, 13.911f, 9.804f, 14.196f)
                curveTo(10.089f, 14.481f, 10.428f, 14.706f, 10.802f, 14.856f)
                curveTo(11.175f, 15.007f, 11.575f, 15.082f, 11.978f, 15.074f)
                curveTo(12.381f, 15.067f, 12.778f, 14.979f, 13.146f, 14.815f)
                curveTo(13.514f, 14.651f, 13.845f, 14.415f, 14.12f, 14.12f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.73f, 5.08f)
                curveTo(11.151f, 5.028f, 11.575f, 5.001f, 12f, 5f)
                curveTo(19f, 5f, 22f, 12f, 22f, 12f)
                curveTo(21.553f, 12.957f, 20.992f, 13.857f, 20.33f, 14.68f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.61f, 6.61f)
                curveTo(4.621f, 7.965f, 3.03f, 9.825f, 2f, 12f)
                curveTo(2f, 12f, 5f, 19f, 12f, 19f)
                curveTo(13.916f, 19.005f, 15.791f, 18.445f, 17.39f, 17.39f)
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

        return _EyeOff!!
    }

@Suppress("ObjectPropertyName")
private var _EyeOff: ImageVector? = null
