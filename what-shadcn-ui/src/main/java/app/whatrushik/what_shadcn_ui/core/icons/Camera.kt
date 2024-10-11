package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Camera: ImageVector
    get() {
        if (_Camera != null) {
            return _Camera!!
        }
        _Camera = ImageVector.Builder(
            name = "Camera",
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
                moveTo(14.5f, 4f)
                horizontalLineTo(9.5f)
                lineTo(7f, 7f)
                horizontalLineTo(4f)
                curveTo(3.47f, 7f, 2.961f, 7.211f, 2.586f, 7.586f)
                curveTo(2.211f, 7.961f, 2f, 8.47f, 2f, 9f)
                verticalLineTo(18f)
                curveTo(2f, 18.53f, 2.211f, 19.039f, 2.586f, 19.414f)
                curveTo(2.961f, 19.789f, 3.47f, 20f, 4f, 20f)
                horizontalLineTo(20f)
                curveTo(20.53f, 20f, 21.039f, 19.789f, 21.414f, 19.414f)
                curveTo(21.789f, 19.039f, 22f, 18.53f, 22f, 18f)
                verticalLineTo(9f)
                curveTo(22f, 8.47f, 21.789f, 7.961f, 21.414f, 7.586f)
                curveTo(21.039f, 7.211f, 20.53f, 7f, 20f, 7f)
                horizontalLineTo(17f)
                lineTo(14.5f, 4f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 16f)
                curveTo(13.657f, 16f, 15f, 14.657f, 15f, 13f)
                curveTo(15f, 11.343f, 13.657f, 10f, 12f, 10f)
                curveTo(10.343f, 10f, 9f, 11.343f, 9f, 13f)
                curveTo(9f, 14.657f, 10.343f, 16f, 12f, 16f)
                close()
            }
        }.build()

        return _Camera!!
    }

@Suppress("ObjectPropertyName")
private var _Camera: ImageVector? = null
