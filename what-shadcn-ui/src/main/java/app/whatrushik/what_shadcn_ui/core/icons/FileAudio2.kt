package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val SHUIIcons.FileAudio2: ImageVector
    get() {
        if (_FileAudio2 != null) {
            return _FileAudio2!!
        }
        _FileAudio2 = ImageVector.Builder(
            name = "FileAudio2",
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
                moveTo(4f, 22f)
                horizontalLineTo(18f)
                curveTo(18.53f, 22f, 19.039f, 21.789f, 19.414f, 21.414f)
                curveTo(19.789f, 21.039f, 20f, 20.53f, 20f, 20f)
                verticalLineTo(7.5f)
                lineTo(14.5f, 2f)
                horizontalLineTo(6f)
                curveTo(5.47f, 2f, 4.961f, 2.211f, 4.586f, 2.586f)
                curveTo(4.211f, 2.961f, 4f, 3.47f, 4f, 4f)
                verticalLineTo(6f)
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
                moveTo(2f, 17f)
                verticalLineTo(14f)
                curveTo(2f, 12.939f, 2.421f, 11.922f, 3.172f, 11.172f)
                curveTo(3.922f, 10.421f, 4.939f, 10f, 6f, 10f)
                curveTo(7.061f, 10f, 8.078f, 10.421f, 8.828f, 11.172f)
                curveTo(9.579f, 11.922f, 10f, 12.939f, 10f, 14f)
                verticalLineTo(17f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 18f)
                curveTo(9.552f, 18f, 10f, 17.552f, 10f, 17f)
                curveTo(10f, 16.448f, 9.552f, 16f, 9f, 16f)
                curveTo(8.448f, 16f, 8f, 16.448f, 8f, 17f)
                curveTo(8f, 17.552f, 8.448f, 18f, 9f, 18f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 18f)
                curveTo(3.552f, 18f, 4f, 17.552f, 4f, 17f)
                curveTo(4f, 16.448f, 3.552f, 16f, 3f, 16f)
                curveTo(2.448f, 16f, 2f, 16.448f, 2f, 17f)
                curveTo(2f, 17.552f, 2.448f, 18f, 3f, 18f)
                close()
            }
        }.build()

        return _FileAudio2!!
    }

@Suppress("ObjectPropertyName")
private var _FileAudio2: ImageVector? = null
