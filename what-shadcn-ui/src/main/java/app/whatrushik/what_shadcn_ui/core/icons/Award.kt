package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Award: ImageVector
    get() {
        if (_Award != null) {
            return _Award!!
        }
        _Award = ImageVector.Builder(
            name = "Award",
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
                moveTo(12f, 14f)
                curveTo(15.314f, 14f, 18f, 11.314f, 18f, 8f)
                curveTo(18f, 4.686f, 15.314f, 2f, 12f, 2f)
                curveTo(8.686f, 2f, 6f, 4.686f, 6f, 8f)
                curveTo(6f, 11.314f, 8.686f, 14f, 12f, 14f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.477f, 12.89f)
                lineTo(17f, 22f)
                lineTo(12f, 19f)
                lineTo(7f, 22f)
                lineTo(8.523f, 12.89f)
            }
        }.build()

        return _Award!!
    }

@Suppress("ObjectPropertyName")
private var _Award: ImageVector? = null
