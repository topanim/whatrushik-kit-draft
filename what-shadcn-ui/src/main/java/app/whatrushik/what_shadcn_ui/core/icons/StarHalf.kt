package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.StarHalf: ImageVector
    get() {
        if (_StarHalf != null) {
            return _StarHalf!!
        }
        _StarHalf = ImageVector.Builder(
            name = "StarHalf",
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
                moveTo(12f, 17.8f)
                lineTo(5.8f, 21f)
                lineTo(7f, 14.1f)
                lineTo(2f, 9.3f)
                lineTo(9f, 8.3f)
                lineTo(12f, 2f)
            }
        }.build()

        return _StarHalf!!
    }

@Suppress("ObjectPropertyName")
private var _StarHalf: ImageVector? = null
