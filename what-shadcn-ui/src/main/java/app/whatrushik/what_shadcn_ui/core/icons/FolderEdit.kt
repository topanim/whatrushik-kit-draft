package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.FolderEdit: ImageVector
    get() {
        if (_FolderEdit != null) {
            return _FolderEdit!!
        }
        _FolderEdit = ImageVector.Builder(
            name = "FolderEdit",
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
                moveTo(8.42f, 10.61f)
                curveTo(8.615f, 10.415f, 8.847f, 10.26f, 9.101f, 10.155f)
                curveTo(9.356f, 10.049f, 9.629f, 9.995f, 9.905f, 9.995f)
                curveTo(10.181f, 9.995f, 10.454f, 10.049f, 10.709f, 10.155f)
                curveTo(10.964f, 10.26f, 11.195f, 10.415f, 11.39f, 10.61f)
                curveTo(11.585f, 10.805f, 11.74f, 11.036f, 11.845f, 11.291f)
                curveTo(11.951f, 11.546f, 12.005f, 11.819f, 12.005f, 12.095f)
                curveTo(12.005f, 12.371f, 11.951f, 12.644f, 11.845f, 12.899f)
                curveTo(11.74f, 13.153f, 11.585f, 13.385f, 11.39f, 13.58f)
                lineTo(5.95f, 19f)
                lineTo(2f, 20f)
                lineTo(2.99f, 16.05f)
                lineTo(8.42f, 10.61f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 11.5f)
                verticalLineTo(5f)
                curveTo(2f, 3.9f, 2.9f, 3f, 4f, 3f)
                horizontalLineTo(7.93f)
                curveTo(8.259f, 3.002f, 8.583f, 3.085f, 8.873f, 3.242f)
                curveTo(9.163f, 3.399f, 9.409f, 3.625f, 9.59f, 3.9f)
                lineTo(10.41f, 5.1f)
                curveTo(10.591f, 5.375f, 10.837f, 5.601f, 11.127f, 5.758f)
                curveTo(11.417f, 5.915f, 11.741f, 5.998f, 12.07f, 6f)
                horizontalLineTo(20f)
                curveTo(20.53f, 6f, 21.039f, 6.211f, 21.414f, 6.586f)
                curveTo(21.789f, 6.961f, 22f, 7.47f, 22f, 8f)
                verticalLineTo(18f)
                curveTo(22f, 18.53f, 21.789f, 19.039f, 21.414f, 19.414f)
                curveTo(21.039f, 19.789f, 20.53f, 20f, 20f, 20f)
                horizontalLineTo(10.5f)
            }
        }.build()

        return _FolderEdit!!
    }

@Suppress("ObjectPropertyName")
private var _FolderEdit: ImageVector? = null
