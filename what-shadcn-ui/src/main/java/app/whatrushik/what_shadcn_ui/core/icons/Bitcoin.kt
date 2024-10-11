package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Bitcoin: ImageVector
    get() {
        if (_Bitcoin != null) {
            return _Bitcoin!!
        }
        _Bitcoin = ImageVector.Builder(
            name = "Bitcoin",
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
                moveTo(11.767f, 19.089f)
                curveTo(16.691f, 19.957f, 17.907f, 13.064f, 12.983f, 12.195f)
                moveTo(11.767f, 19.089f)
                lineTo(5.86f, 18.047f)
                moveTo(11.767f, 19.089f)
                lineTo(11.421f, 21.059f)
                moveTo(9.044f, 11.501f)
                lineTo(12.984f, 12.195f)
                curveTo(17.908f, 13.064f, 19.124f, 6.17f, 14.199f, 5.302f)
                lineTo(8.29f, 4.26f)
                moveTo(14.198f, 5.302f)
                lineTo(14.546f, 3.332f)
                moveTo(7.48f, 20.364f)
                lineTo(10.606f, 2.637f)
            }
        }.build()

        return _Bitcoin!!
    }

@Suppress("ObjectPropertyName")
private var _Bitcoin: ImageVector? = null
