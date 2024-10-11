package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val SHUIIcons.Subtitles: ImageVector
    get() {
        if (_Subtitles != null) {
            return _Subtitles!!
        }
        _Subtitles = ImageVector.Builder(
            name = "Subtitles",
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
                moveTo(7f, 13f)
                horizontalLineTo(11f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 13f)
                horizontalLineTo(17f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 9f)
                horizontalLineTo(9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 9f)
                horizontalLineTo(17f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 15f)
                curveTo(21f, 15.53f, 20.789f, 16.039f, 20.414f, 16.414f)
                curveTo(20.039f, 16.789f, 19.53f, 17f, 19f, 17f)
                horizontalLineTo(7f)
                lineTo(3f, 21f)
                verticalLineTo(5f)
                curveTo(3f, 4.47f, 3.211f, 3.961f, 3.586f, 3.586f)
                curveTo(3.961f, 3.211f, 4.47f, 3f, 5f, 3f)
                horizontalLineTo(19f)
                curveTo(19.53f, 3f, 20.039f, 3.211f, 20.414f, 3.586f)
                curveTo(20.789f, 3.961f, 21f, 4.47f, 21f, 5f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _Subtitles!!
    }

@Suppress("ObjectPropertyName")
private var _Subtitles: ImageVector? = null
