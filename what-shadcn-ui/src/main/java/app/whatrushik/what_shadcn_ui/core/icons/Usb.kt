package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Usb: ImageVector
    get() {
        if (_Usb != null) {
            return _Usb!!
        }
        _Usb = ImageVector.Builder(
            name = "Usb",
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
                moveTo(4f, 21f)
                curveTo(4.552f, 21f, 5f, 20.552f, 5f, 20f)
                curveTo(5f, 19.448f, 4.552f, 19f, 4f, 19f)
                curveTo(3.448f, 19f, 3f, 19.448f, 3f, 20f)
                curveTo(3f, 20.552f, 3.448f, 21f, 4f, 21f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 8f)
                curveTo(10.552f, 8f, 11f, 7.552f, 11f, 7f)
                curveTo(11f, 6.448f, 10.552f, 6f, 10f, 6f)
                curveTo(9.448f, 6f, 9f, 6.448f, 9f, 7f)
                curveTo(9f, 7.552f, 9.448f, 8f, 10f, 8f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 20f)
                lineTo(19f, 5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 3f)
                lineTo(18f, 4f)
                lineTo(20f, 6f)
                lineTo(21f, 3f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 7f)
                lineTo(5f, 12f)
                lineTo(7f, 17f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 14f)
                lineTo(15f, 16f)
                lineTo(19f, 12f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 12f)
                lineTo(19f, 11f)
                lineTo(20f, 12f)
                lineTo(19f, 13f)
                lineTo(18f, 12f)
                close()
            }
        }.build()

        return _Usb!!
    }

@Suppress("ObjectPropertyName")
private var _Usb: ImageVector? = null
