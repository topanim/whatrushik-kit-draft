package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.View: ImageVector
    get() {
        if (_View != null) {
            return _View!!
        }
        _View = ImageVector.Builder(
            name = "View",
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
                moveTo(5f, 12f)
                curveTo(5f, 12f, 7.545f, 7f, 12f, 7f)
                curveTo(16.454f, 7f, 19f, 12f, 19f, 12f)
                curveTo(19f, 12f, 16.454f, 17f, 12f, 17f)
                curveTo(7.545f, 17f, 5f, 12f, 5f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 13f)
                curveTo(12.265f, 13f, 12.52f, 12.895f, 12.707f, 12.707f)
                curveTo(12.895f, 12.52f, 13f, 12.265f, 13f, 12f)
                curveTo(13f, 11.735f, 12.895f, 11.48f, 12.707f, 11.293f)
                curveTo(12.52f, 11.105f, 12.265f, 11f, 12f, 11f)
                curveTo(11.735f, 11f, 11.48f, 11.105f, 11.293f, 11.293f)
                curveTo(11.105f, 11.48f, 11f, 11.735f, 11f, 12f)
                curveTo(11f, 12.265f, 11.105f, 12.52f, 11.293f, 12.707f)
                curveTo(11.48f, 12.895f, 11.735f, 13f, 12f, 13f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 17f)
                verticalLineTo(19f)
                curveTo(21f, 19.53f, 20.789f, 20.039f, 20.414f, 20.414f)
                curveTo(20.039f, 20.789f, 19.53f, 21f, 19f, 21f)
                horizontalLineTo(5f)
                curveTo(4.47f, 21f, 3.961f, 20.789f, 3.586f, 20.414f)
                curveTo(3.211f, 20.039f, 3f, 19.53f, 3f, 19f)
                verticalLineTo(17f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 7f)
                verticalLineTo(5f)
                curveTo(21f, 4.47f, 20.789f, 3.961f, 20.414f, 3.586f)
                curveTo(20.039f, 3.211f, 19.53f, 3f, 19f, 3f)
                horizontalLineTo(5f)
                curveTo(4.47f, 3f, 3.961f, 3.211f, 3.586f, 3.586f)
                curveTo(3.211f, 3.961f, 3f, 4.47f, 3f, 5f)
                verticalLineTo(7f)
            }
        }.build()

        return _View!!
    }

@Suppress("ObjectPropertyName")
private var _View: ImageVector? = null
