package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.FileAudio: ImageVector
    get() {
        if (_FileAudio != null) {
            return _FileAudio!!
        }
        _FileAudio = ImageVector.Builder(
            name = "FileAudio",
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
                moveTo(17.5f, 22f)
                horizontalLineTo(18f)
                curveTo(18.5f, 22f, 19f, 21.8f, 19.4f, 21.4f)
                curveTo(19.8f, 21f, 20f, 20.5f, 20f, 20f)
                verticalLineTo(7.5f)
                lineTo(14.5f, 2f)
                horizontalLineTo(6f)
                curveTo(5.5f, 2f, 5f, 2.2f, 4.6f, 2.6f)
                curveTo(4.2f, 3f, 4f, 3.5f, 4f, 4f)
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
                moveTo(10f, 20f)
                verticalLineTo(19f)
                curveTo(10f, 18.47f, 10.211f, 17.961f, 10.586f, 17.586f)
                curveTo(10.961f, 17.211f, 11.47f, 17f, 12f, 17f)
                curveTo(12.53f, 17f, 13.039f, 17.211f, 13.414f, 17.586f)
                curveTo(13.789f, 17.961f, 14f, 18.47f, 14f, 19f)
                verticalLineTo(20f)
                curveTo(14f, 20.53f, 13.789f, 21.039f, 13.414f, 21.414f)
                curveTo(13.039f, 21.789f, 12.53f, 22f, 12f, 22f)
                curveTo(11.47f, 22f, 10.961f, 21.789f, 10.586f, 21.414f)
                curveTo(10.211f, 21.039f, 10f, 20.53f, 10f, 20f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 20f)
                verticalLineTo(19f)
                curveTo(6f, 18.47f, 5.789f, 17.961f, 5.414f, 17.586f)
                curveTo(5.039f, 17.211f, 4.53f, 17f, 4f, 17f)
                curveTo(3.47f, 17f, 2.961f, 17.211f, 2.586f, 17.586f)
                curveTo(2.211f, 17.961f, 2f, 18.47f, 2f, 19f)
                verticalLineTo(20f)
                curveTo(2f, 20.53f, 2.211f, 21.039f, 2.586f, 21.414f)
                curveTo(2.961f, 21.789f, 3.47f, 22f, 4f, 22f)
                curveTo(4.53f, 22f, 5.039f, 21.789f, 5.414f, 21.414f)
                curveTo(5.789f, 21.039f, 6f, 20.53f, 6f, 20f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 19f)
                verticalLineTo(16f)
                curveTo(2f, 14.409f, 2.632f, 12.883f, 3.757f, 11.757f)
                curveTo(4.883f, 10.632f, 6.409f, 10f, 8f, 10f)
                curveTo(9.591f, 10f, 11.117f, 10.632f, 12.243f, 11.757f)
                curveTo(13.368f, 12.883f, 14f, 14.409f, 14f, 16f)
                verticalLineTo(19f)
            }
        }.build()

        return _FileAudio!!
    }

@Suppress("ObjectPropertyName")
private var _FileAudio: ImageVector? = null
