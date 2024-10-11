package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.UtensilsCrossed: ImageVector
    get() {
        if (_UtensilsCrossed != null) {
            return _UtensilsCrossed!!
        }
        _UtensilsCrossed = ImageVector.Builder(
            name = "UtensilsCrossed",
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
                moveTo(16f, 2f)
                lineTo(13.7f, 4.3f)
                curveTo(13.15f, 4.861f, 12.842f, 5.615f, 12.842f, 6.4f)
                curveTo(12.842f, 7.185f, 13.15f, 7.939f, 13.7f, 8.5f)
                lineTo(15.5f, 10.3f)
                curveTo(16.061f, 10.85f, 16.815f, 11.158f, 17.6f, 11.158f)
                curveTo(18.385f, 11.158f, 19.139f, 10.85f, 19.7f, 10.3f)
                lineTo(22f, 8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 15f)
                lineTo(3.3f, 3.3f)
                curveTo(2.901f, 3.691f, 2.584f, 4.158f, 2.367f, 4.673f)
                curveTo(2.151f, 5.188f, 2.039f, 5.741f, 2.039f, 6.3f)
                curveTo(2.039f, 6.859f, 2.151f, 7.412f, 2.367f, 7.927f)
                curveTo(2.584f, 8.442f, 2.901f, 8.909f, 3.3f, 9.3f)
                lineTo(10.6f, 16.6f)
                curveTo(11.3f, 17.3f, 12.6f, 17.3f, 13.4f, 16.6f)
                lineTo(15f, 15f)
                close()
                moveTo(15f, 15f)
                lineTo(22f, 22f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.1f, 21.8f)
                lineTo(8.5f, 15.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 5f)
                lineTo(12f, 12f)
            }
        }.build()

        return _UtensilsCrossed!!
    }

@Suppress("ObjectPropertyName")
private var _UtensilsCrossed: ImageVector? = null
