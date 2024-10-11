package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Infinity: ImageVector
    get() {
        if (_Infinity != null) {
            return _Infinity!!
        }
        _Infinity = ImageVector.Builder(
            name = "Infinity",
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
                moveTo(18.178f, 8f)
                curveTo(23.274f, 8f, 23.274f, 16f, 18.178f, 16f)
                curveTo(13.083f, 16f, 11.045f, 8f, 5.439f, 8f)
                curveTo(0.854f, 8f, 0.854f, 16f, 5.439f, 16f)
                curveTo(11.045f, 16f, 13.083f, 8f, 18.179f, 8f)
                horizontalLineTo(18.178f)
                close()
            }
        }.build()

        return _Infinity!!
    }

@Suppress("ObjectPropertyName")
private var _Infinity: ImageVector? = null
