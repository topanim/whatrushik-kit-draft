package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.ClipboardSignature: ImageVector
    get() {
        if (_ClipboardSignature != null) {
            return _ClipboardSignature!!
        }
        _ClipboardSignature = ImageVector.Builder(
            name = "ClipboardSignature",
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
                moveTo(15f, 2f)
                horizontalLineTo(9f)
                curveTo(8.448f, 2f, 8f, 2.448f, 8f, 3f)
                verticalLineTo(5f)
                curveTo(8f, 5.552f, 8.448f, 6f, 9f, 6f)
                horizontalLineTo(15f)
                curveTo(15.552f, 6f, 16f, 5.552f, 16f, 5f)
                verticalLineTo(3f)
                curveTo(16f, 2.448f, 15.552f, 2f, 15f, 2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 4f)
                horizontalLineTo(6f)
                curveTo(5.47f, 4f, 4.961f, 4.211f, 4.586f, 4.586f)
                curveTo(4.211f, 4.961f, 4f, 5.47f, 4f, 6f)
                verticalLineTo(20f)
                curveTo(4f, 20.53f, 4.211f, 21.039f, 4.586f, 21.414f)
                curveTo(4.961f, 21.789f, 5.47f, 22f, 6f, 22f)
                horizontalLineTo(18f)
                curveTo(18.53f, 22f, 19.039f, 21.789f, 19.414f, 21.414f)
                curveTo(19.789f, 21.039f, 20f, 20.53f, 20f, 20f)
                verticalLineTo(19.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 4f)
                horizontalLineTo(18f)
                curveTo(18.351f, 4f, 18.695f, 4.093f, 18.999f, 4.268f)
                curveTo(19.302f, 4.444f, 19.555f, 4.696f, 19.73f, 5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.42f, 9.61f)
                curveTo(18.615f, 9.415f, 18.847f, 9.26f, 19.101f, 9.155f)
                curveTo(19.356f, 9.049f, 19.629f, 8.995f, 19.905f, 8.995f)
                curveTo(20.181f, 8.995f, 20.454f, 9.049f, 20.709f, 9.155f)
                curveTo(20.963f, 9.26f, 21.195f, 9.415f, 21.39f, 9.61f)
                curveTo(21.585f, 9.805f, 21.74f, 10.036f, 21.845f, 10.291f)
                curveTo(21.951f, 10.546f, 22.005f, 10.819f, 22.005f, 11.095f)
                curveTo(22.005f, 11.371f, 21.951f, 11.644f, 21.845f, 11.899f)
                curveTo(21.74f, 12.153f, 21.585f, 12.385f, 21.39f, 12.58f)
                lineTo(16.95f, 17f)
                lineTo(13f, 18f)
                lineTo(13.99f, 14.05f)
                lineTo(18.42f, 9.61f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 18f)
                horizontalLineTo(9f)
            }
        }.build()

        return _ClipboardSignature!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardSignature: ImageVector? = null
