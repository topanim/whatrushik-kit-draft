package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.CloudMoon: ImageVector
    get() {
        if (_CloudMoon != null) {
            return _CloudMoon!!
        }
        _CloudMoon = ImageVector.Builder(
            name = "CloudMoon",
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
                moveTo(13f, 22f)
                horizontalLineTo(7f)
                curveTo(6.054f, 22f, 5.127f, 21.731f, 4.328f, 21.226f)
                curveTo(3.528f, 20.72f, 2.889f, 19.997f, 2.483f, 19.143f)
                curveTo(2.078f, 18.288f, 1.923f, 17.336f, 2.038f, 16.397f)
                curveTo(2.152f, 15.458f, 2.53f, 14.57f, 3.128f, 13.837f)
                curveTo(3.727f, 13.105f, 4.521f, 12.557f, 5.418f, 12.257f)
                curveTo(6.315f, 11.958f, 7.279f, 11.919f, 8.198f, 12.145f)
                curveTo(9.116f, 12.372f, 9.952f, 12.854f, 10.607f, 13.537f)
                curveTo(11.262f, 14.219f, 11.711f, 15.073f, 11.9f, 16f)
                horizontalLineTo(13f)
                curveTo(13.796f, 16f, 14.559f, 16.316f, 15.121f, 16.879f)
                curveTo(15.684f, 17.441f, 16f, 18.204f, 16f, 19f)
                curveTo(16f, 19.796f, 15.684f, 20.559f, 15.121f, 21.121f)
                curveTo(14.559f, 21.684f, 13.796f, 22f, 13f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.083f, 9f)
                curveTo(10.32f, 7.602f, 11.044f, 6.333f, 12.127f, 5.418f)
                curveTo(13.21f, 4.502f, 14.582f, 4f, 16f, 4f)
                curveTo(15.221f, 4.799f, 14.789f, 5.873f, 14.796f, 6.989f)
                curveTo(14.803f, 8.104f, 15.25f, 9.172f, 16.039f, 9.961f)
                curveTo(16.828f, 10.75f, 17.896f, 11.197f, 19.011f, 11.204f)
                curveTo(20.127f, 11.211f, 21.201f, 10.779f, 22f, 10f)
                curveTo(22f, 12.22f, 20.794f, 14.16f, 19f, 15.197f)
            }
        }.build()

        return _CloudMoon!!
    }

@Suppress("ObjectPropertyName")
private var _CloudMoon: ImageVector? = null
