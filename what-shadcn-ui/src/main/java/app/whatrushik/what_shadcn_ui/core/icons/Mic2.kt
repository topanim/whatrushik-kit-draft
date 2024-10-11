package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Mic2: ImageVector
    get() {
        if (_Mic2 != null) {
            return _Mic2!!
        }
        _Mic2 = ImageVector.Builder(
            name = "Mic2",
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
                moveTo(12f, 8f)
                lineTo(2.96f, 17.06f)
                curveTo(2.671f, 17.315f, 2.437f, 17.626f, 2.272f, 17.975f)
                curveTo(2.108f, 18.323f, 2.017f, 18.702f, 2.005f, 19.087f)
                curveTo(1.992f, 19.472f, 2.059f, 19.856f, 2.201f, 20.214f)
                curveTo(2.343f, 20.573f, 2.557f, 20.898f, 2.829f, 21.171f)
                curveTo(3.102f, 21.444f, 3.427f, 21.657f, 3.786f, 21.799f)
                curveTo(4.144f, 21.941f, 4.528f, 22.008f, 4.913f, 21.996f)
                curveTo(5.298f, 21.983f, 5.677f, 21.892f, 6.025f, 21.728f)
                curveTo(6.374f, 21.563f, 6.685f, 21.329f, 6.94f, 21.04f)
                lineTo(16f, 12f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 12f)
                curveTo(19.761f, 12f, 22f, 9.761f, 22f, 7f)
                curveTo(22f, 4.239f, 19.761f, 2f, 17f, 2f)
                curveTo(14.239f, 2f, 12f, 4.239f, 12f, 7f)
                curveTo(12f, 9.761f, 14.239f, 12f, 17f, 12f)
                close()
            }
        }.build()

        return _Mic2!!
    }

@Suppress("ObjectPropertyName")
private var _Mic2: ImageVector? = null
