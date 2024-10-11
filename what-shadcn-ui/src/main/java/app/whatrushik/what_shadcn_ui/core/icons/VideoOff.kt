package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.VideoOff: ImageVector
    get() {
        if (_VideoOff != null) {
            return _VideoOff!!
        }
        _VideoOff = ImageVector.Builder(
            name = "VideoOff",
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
                moveTo(10.66f, 6f)
                horizontalLineTo(14f)
                curveTo(14.531f, 6f, 15.039f, 6.211f, 15.414f, 6.586f)
                curveTo(15.789f, 6.961f, 16f, 7.47f, 16f, 8f)
                verticalLineTo(10.34f)
                lineTo(17f, 11.34f)
                lineTo(22f, 8f)
                verticalLineTo(16f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 16f)
                curveTo(16f, 16.53f, 15.789f, 17.039f, 15.414f, 17.414f)
                curveTo(15.039f, 17.789f, 14.53f, 18f, 14f, 18f)
                horizontalLineTo(4f)
                curveTo(3.47f, 18f, 2.961f, 17.789f, 2.586f, 17.414f)
                curveTo(2.211f, 17.039f, 2f, 16.53f, 2f, 16f)
                verticalLineTo(8f)
                curveTo(2f, 7.47f, 2.211f, 6.961f, 2.586f, 6.586f)
                curveTo(2.961f, 6.211f, 3.47f, 6f, 4f, 6f)
                horizontalLineTo(6f)
                lineTo(16f, 16f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 2f)
                lineTo(22f, 22f)
            }
        }.build()

        return _VideoOff!!
    }

@Suppress("ObjectPropertyName")
private var _VideoOff: ImageVector? = null
