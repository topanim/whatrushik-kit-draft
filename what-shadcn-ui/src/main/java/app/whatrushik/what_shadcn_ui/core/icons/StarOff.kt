package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.StarOff: ImageVector
    get() {
        if (_StarOff != null) {
            return _StarOff!!
        }
        _StarOff = ImageVector.Builder(
            name = "StarOff",
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
                moveTo(8.34f, 8.34f)
                lineTo(2f, 9.27f)
                lineTo(7f, 14.14f)
                lineTo(5.82f, 21f)
                lineTo(12f, 17.77f)
                lineTo(18.18f, 21f)
                lineTo(17.59f, 17.57f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.42f, 12.76f)
                lineTo(22f, 9.27f)
                lineTo(15.09f, 8.27f)
                lineTo(12f, 2f)
                lineTo(10.56f, 4.91f)
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

        return _StarOff!!
    }

@Suppress("ObjectPropertyName")
private var _StarOff: ImageVector? = null
