package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.FileEdit: ImageVector
    get() {
        if (_FileEdit != null) {
            return _FileEdit!!
        }
        _FileEdit = ImageVector.Builder(
            name = "FileEdit",
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
                moveTo(4f, 13.5f)
                verticalLineTo(4f)
                curveTo(4f, 3.47f, 4.211f, 2.961f, 4.586f, 2.586f)
                curveTo(4.961f, 2.211f, 5.47f, 2f, 6f, 2f)
                horizontalLineTo(14.5f)
                lineTo(20f, 7.5f)
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
                moveTo(14f, 2f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
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
        }.build()

        return _FileEdit!!
    }

@Suppress("ObjectPropertyName")
private var _FileEdit: ImageVector? = null
