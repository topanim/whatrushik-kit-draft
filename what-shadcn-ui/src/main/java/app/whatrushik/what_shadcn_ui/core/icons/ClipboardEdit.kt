package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.ClipboardEdit: ImageVector
    get() {
        if (_ClipboardEdit != null) {
            return _ClipboardEdit!!
        }
        _ClipboardEdit = ImageVector.Builder(
            name = "ClipboardEdit",
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
                moveTo(10.42f, 12.61f)
                curveTo(10.615f, 12.415f, 10.847f, 12.26f, 11.101f, 12.155f)
                curveTo(11.356f, 12.049f, 11.629f, 11.995f, 11.905f, 11.995f)
                curveTo(12.181f, 11.995f, 12.454f, 12.049f, 12.709f, 12.155f)
                curveTo(12.964f, 12.26f, 13.195f, 12.415f, 13.39f, 12.61f)
                curveTo(13.585f, 12.805f, 13.74f, 13.036f, 13.845f, 13.291f)
                curveTo(13.951f, 13.546f, 14.005f, 13.819f, 14.005f, 14.095f)
                curveTo(14.005f, 14.371f, 13.951f, 14.644f, 13.845f, 14.899f)
                curveTo(13.74f, 15.153f, 13.585f, 15.385f, 13.39f, 15.58f)
                lineTo(7.95f, 21f)
                lineTo(4f, 22f)
                lineTo(4.99f, 18.05f)
                lineTo(10.42f, 12.61f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 4f)
                horizontalLineTo(18f)
                curveTo(18.53f, 4f, 19.039f, 4.211f, 19.414f, 4.586f)
                curveTo(19.789f, 4.961f, 20f, 5.47f, 20f, 6f)
                verticalLineTo(20f)
                curveTo(20f, 20.53f, 19.789f, 21.039f, 19.414f, 21.414f)
                curveTo(19.039f, 21.789f, 18.53f, 22f, 18f, 22f)
                horizontalLineTo(12.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 13.5f)
                verticalLineTo(6f)
                curveTo(4f, 5.47f, 4.211f, 4.961f, 4.586f, 4.586f)
                curveTo(4.961f, 4.211f, 5.47f, 4f, 6f, 4f)
                horizontalLineTo(8f)
            }
        }.build()

        return _ClipboardEdit!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardEdit: ImageVector? = null
