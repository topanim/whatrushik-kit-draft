package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.FolderOpen: ImageVector
    get() {
        if (_FolderOpen != null) {
            return _FolderOpen!!
        }
        _FolderOpen = ImageVector.Builder(
            name = "FolderOpen",
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
                moveTo(6f, 14f)
                lineTo(7.45f, 11.1f)
                curveTo(7.617f, 10.769f, 7.873f, 10.49f, 8.189f, 10.296f)
                curveTo(8.505f, 10.102f, 8.869f, 9.999f, 9.24f, 10f)
                horizontalLineTo(20f)
                moveTo(20f, 10f)
                curveTo(20.306f, 9.999f, 20.607f, 10.069f, 20.882f, 10.203f)
                curveTo(21.156f, 10.337f, 21.396f, 10.533f, 21.584f, 10.774f)
                curveTo(21.771f, 11.015f, 21.9f, 11.296f, 21.962f, 11.596f)
                curveTo(22.024f, 11.895f, 22.016f, 12.204f, 21.94f, 12.5f)
                lineTo(20.39f, 18.5f)
                curveTo(20.279f, 18.93f, 20.028f, 19.311f, 19.677f, 19.582f)
                curveTo(19.326f, 19.854f, 18.894f, 20.001f, 18.45f, 20f)
                horizontalLineTo(4f)
                curveTo(3.47f, 20f, 2.961f, 19.789f, 2.586f, 19.414f)
                curveTo(2.211f, 19.039f, 2f, 18.53f, 2f, 18f)
                verticalLineTo(5f)
                curveTo(2f, 3.9f, 2.9f, 3f, 4f, 3f)
                horizontalLineTo(7.93f)
                curveTo(8.259f, 3.002f, 8.583f, 3.085f, 8.873f, 3.242f)
                curveTo(9.163f, 3.399f, 9.409f, 3.625f, 9.59f, 3.9f)
                lineTo(10.41f, 5.1f)
                curveTo(10.591f, 5.375f, 10.837f, 5.601f, 11.127f, 5.758f)
                curveTo(11.417f, 5.915f, 11.741f, 5.998f, 12.07f, 6f)
                horizontalLineTo(18f)
                curveTo(18.53f, 6f, 19.039f, 6.211f, 19.414f, 6.586f)
                curveTo(19.789f, 6.961f, 20f, 7.47f, 20f, 8f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _FolderOpen!!
    }

@Suppress("ObjectPropertyName")
private var _FolderOpen: ImageVector? = null
