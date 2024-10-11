package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.FilePieChart: ImageVector
    get() {
        if (_FilePieChart != null) {
            return _FilePieChart!!
        }
        _FilePieChart = ImageVector.Builder(
            name = "FilePieChart",
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
                moveTo(16f, 22f)
                horizontalLineTo(18f)
                curveTo(18.53f, 22f, 19.039f, 21.789f, 19.414f, 21.414f)
                curveTo(19.789f, 21.039f, 20f, 20.53f, 20f, 20f)
                verticalLineTo(7.5f)
                lineTo(14.5f, 2f)
                horizontalLineTo(6f)
                curveTo(5.47f, 2f, 4.961f, 2.211f, 4.586f, 2.586f)
                curveTo(4.211f, 2.961f, 4f, 3.47f, 4f, 4f)
                verticalLineTo(7f)
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
                moveTo(4.04f, 11.71f)
                curveTo(3.443f, 12.236f, 2.96f, 12.878f, 2.62f, 13.597f)
                curveTo(2.28f, 14.316f, 2.09f, 15.097f, 2.063f, 15.892f)
                curveTo(2.035f, 16.687f, 2.171f, 17.479f, 2.46f, 18.22f)
                curveTo(2.75f, 18.961f, 3.188f, 19.634f, 3.747f, 20.2f)
                curveTo(4.307f, 20.765f, 4.976f, 21.211f, 5.713f, 21.508f)
                curveTo(6.451f, 21.806f, 7.242f, 21.95f, 8.037f, 21.931f)
                curveTo(8.832f, 21.913f, 9.615f, 21.732f, 10.338f, 21.4f)
                curveTo(11.061f, 21.067f, 11.708f, 20.591f, 12.24f, 20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.83f, 16f)
                curveTo(13.83f, 14.454f, 13.216f, 12.971f, 12.122f, 11.878f)
                curveTo(11.029f, 10.784f, 9.546f, 10.17f, 8f, 10.17f)
                verticalLineTo(16f)
                horizontalLineTo(13.83f)
                close()
            }
        }.build()

        return _FilePieChart!!
    }

@Suppress("ObjectPropertyName")
private var _FilePieChart: ImageVector? = null
