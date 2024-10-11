package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Gauge: ImageVector
    get() {
        if (_Gauge != null) {
            return _Gauge!!
        }
        _Gauge = ImageVector.Builder(
            name = "Gauge",
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
                moveTo(12f, 15f)
                lineTo(15.5f, 11.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.3f, 18f)
                curveTo(20.7f, 17f, 21f, 15.8f, 21f, 14.6f)
                curveTo(21f, 9.8f, 17f, 6f, 12f, 6f)
                curveTo(7f, 6f, 3f, 9.8f, 3f, 14.6f)
                curveTo(3f, 15.8f, 3.3f, 17f, 3.7f, 18f)
            }
        }.build()

        return _Gauge!!
    }

@Suppress("ObjectPropertyName")
private var _Gauge: ImageVector? = null
