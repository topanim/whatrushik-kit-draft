package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Cross: ImageVector
    get() {
        if (_Cross != null) {
            return _Cross!!
        }
        _Cross = ImageVector.Builder(
            name = "Cross",
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
                moveTo(11f, 2f)
                curveTo(10.47f, 2f, 9.961f, 2.211f, 9.586f, 2.586f)
                curveTo(9.211f, 2.961f, 9f, 3.47f, 9f, 4f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                curveTo(3.47f, 9f, 2.961f, 9.211f, 2.586f, 9.586f)
                curveTo(2.211f, 9.961f, 2f, 10.47f, 2f, 11f)
                verticalLineTo(13f)
                curveTo(2f, 14.1f, 2.9f, 15f, 4f, 15f)
                horizontalLineTo(9f)
                verticalLineTo(20f)
                curveTo(9f, 21.1f, 9.9f, 22f, 11f, 22f)
                horizontalLineTo(13f)
                curveTo(13.53f, 22f, 14.039f, 21.789f, 14.414f, 21.414f)
                curveTo(14.789f, 21.039f, 15f, 20.53f, 15f, 20f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                curveTo(20.53f, 15f, 21.039f, 14.789f, 21.414f, 14.414f)
                curveTo(21.789f, 14.039f, 22f, 13.53f, 22f, 13f)
                verticalLineTo(11f)
                curveTo(22f, 10.47f, 21.789f, 9.961f, 21.414f, 9.586f)
                curveTo(21.039f, 9.211f, 20.53f, 9f, 20f, 9f)
                horizontalLineTo(15f)
                verticalLineTo(4f)
                curveTo(15f, 3.47f, 14.789f, 2.961f, 14.414f, 2.586f)
                curveTo(14.039f, 2.211f, 13.53f, 2f, 13f, 2f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _Cross!!
    }

@Suppress("ObjectPropertyName")
private var _Cross: ImageVector? = null
