package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Moon: ImageVector
    get() {
        if (_Moon != null) {
            return _Moon!!
        }
        _Moon = ImageVector.Builder(
            name = "Moon",
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
                moveTo(12f, 3f)
                curveTo(10.813f, 4.195f, 10.149f, 5.811f, 10.152f, 7.495f)
                curveTo(10.155f, 9.179f, 10.825f, 10.793f, 12.016f, 11.984f)
                curveTo(13.207f, 13.175f, 14.821f, 13.845f, 16.505f, 13.848f)
                curveTo(18.189f, 13.851f, 19.805f, 13.187f, 21f, 12f)
                curveTo(21f, 13.78f, 20.472f, 15.52f, 19.483f, 17f)
                curveTo(18.494f, 18.48f, 17.089f, 19.634f, 15.444f, 20.315f)
                curveTo(13.8f, 20.996f, 11.99f, 21.174f, 10.244f, 20.827f)
                curveTo(8.498f, 20.48f, 6.895f, 19.623f, 5.636f, 18.364f)
                curveTo(4.377f, 17.105f, 3.52f, 15.502f, 3.173f, 13.756f)
                curveTo(2.826f, 12.01f, 3.004f, 10.2f, 3.685f, 8.556f)
                curveTo(4.366f, 6.911f, 5.52f, 5.506f, 7f, 4.517f)
                curveTo(8.48f, 3.528f, 10.22f, 3f, 12f, 3f)
                close()
            }
        }.build()

        return _Moon!!
    }

@Suppress("ObjectPropertyName")
private var _Moon: ImageVector? = null
