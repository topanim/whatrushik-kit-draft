package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.BellRing: ImageVector
    get() {
        if (_BellRing != null) {
            return _BellRing!!
        }
        _BellRing = ImageVector.Builder(
            name = "BellRing",
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
                moveTo(18f, 8f)
                curveTo(18f, 6.409f, 17.368f, 4.883f, 16.243f, 3.757f)
                curveTo(15.117f, 2.632f, 13.591f, 2f, 12f, 2f)
                curveTo(10.409f, 2f, 8.883f, 2.632f, 7.757f, 3.757f)
                curveTo(6.632f, 4.883f, 6f, 6.409f, 6f, 8f)
                curveTo(6f, 15f, 3f, 17f, 3f, 17f)
                horizontalLineTo(21f)
                curveTo(21f, 17f, 18f, 15f, 18f, 8f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.73f, 21f)
                curveTo(13.554f, 21.303f, 13.302f, 21.555f, 12.998f, 21.729f)
                curveTo(12.695f, 21.904f, 12.35f, 21.997f, 12f, 21.997f)
                curveTo(11.65f, 21.997f, 11.305f, 21.904f, 11.002f, 21.729f)
                curveTo(10.698f, 21.555f, 10.446f, 21.303f, 10.27f, 21f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 8f)
                curveTo(2f, 5.8f, 2.7f, 3.7f, 4f, 2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 8f)
                curveTo(22f, 5.836f, 21.298f, 3.731f, 20f, 2f)
            }
        }.build()

        return _BellRing!!
    }

@Suppress("ObjectPropertyName")
private var _BellRing: ImageVector? = null
