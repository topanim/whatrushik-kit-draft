package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val SHUIIcons.Folder: ImageVector
    get() {
        if (_Folder != null) {
            return _Folder!!
        }
        _Folder = ImageVector.Builder(
            name = "Folder",
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
                moveTo(4f, 20f)
                horizontalLineTo(20f)
                curveTo(20.53f, 20f, 21.039f, 19.789f, 21.414f, 19.414f)
                curveTo(21.789f, 19.039f, 22f, 18.53f, 22f, 18f)
                verticalLineTo(8f)
                curveTo(22f, 7.47f, 21.789f, 6.961f, 21.414f, 6.586f)
                curveTo(21.039f, 6.211f, 20.53f, 6f, 20f, 6f)
                horizontalLineTo(12.07f)
                curveTo(11.741f, 5.998f, 11.417f, 5.915f, 11.127f, 5.758f)
                curveTo(10.837f, 5.601f, 10.591f, 5.375f, 10.41f, 5.1f)
                lineTo(9.59f, 3.9f)
                curveTo(9.409f, 3.625f, 9.163f, 3.399f, 8.873f, 3.242f)
                curveTo(8.583f, 3.085f, 8.259f, 3.002f, 7.93f, 3f)
                horizontalLineTo(4f)
                curveTo(3.47f, 3f, 2.961f, 3.211f, 2.586f, 3.586f)
                curveTo(2.211f, 3.961f, 2f, 4.47f, 2f, 5f)
                verticalLineTo(18f)
                curveTo(2f, 19.1f, 2.9f, 20f, 4f, 20f)
                close()
            }
        }.build()

        return _Folder!!
    }

@Suppress("ObjectPropertyName")
private var _Folder: ImageVector? = null
