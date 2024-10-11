package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.TextCursorInput: ImageVector
    get() {
        if (_TextCursorInput != null) {
            return _TextCursorInput!!
        }
        _TextCursorInput = ImageVector.Builder(
            name = "TextCursorInput",
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
                moveTo(13f, 20f)
                horizontalLineTo(12f)
                curveTo(11.204f, 20f, 10.441f, 19.684f, 9.879f, 19.121f)
                curveTo(9.316f, 18.559f, 9f, 17.796f, 9f, 17f)
                verticalLineTo(7f)
                curveTo(9f, 6.204f, 9.316f, 5.441f, 9.879f, 4.879f)
                curveTo(10.441f, 4.316f, 11.204f, 4f, 12f, 4f)
                horizontalLineTo(13f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 4f)
                horizontalLineTo(6f)
                curveTo(6.796f, 4f, 7.559f, 4.316f, 8.121f, 4.879f)
                curveTo(8.684f, 5.441f, 9f, 6.204f, 9f, 7f)
                verticalLineTo(17f)
                curveTo(9f, 17.796f, 8.684f, 18.559f, 8.121f, 19.121f)
                curveTo(7.559f, 19.684f, 6.796f, 20f, 6f, 20f)
                horizontalLineTo(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.1f, 7.9f)
                horizontalLineTo(19.9f)
                curveTo(20.451f, 7.92f, 20.973f, 8.147f, 21.363f, 8.537f)
                curveTo(21.753f, 8.927f, 21.98f, 9.449f, 22f, 10f)
                verticalLineTo(14f)
                curveTo(21.997f, 14.556f, 21.775f, 15.089f, 21.382f, 15.482f)
                curveTo(20.989f, 15.875f, 20.456f, 16.097f, 19.9f, 16.1f)
                horizontalLineTo(13.1f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.8f, 16.1f)
                horizontalLineTo(4.1f)
                curveTo(3.549f, 16.08f, 3.027f, 15.852f, 2.637f, 15.463f)
                curveTo(2.247f, 15.073f, 2.02f, 14.55f, 2f, 14f)
                verticalLineTo(10f)
                curveTo(2.02f, 9.449f, 2.247f, 8.927f, 2.637f, 8.537f)
                curveTo(3.027f, 8.147f, 3.549f, 7.92f, 4.1f, 7.9f)
                horizontalLineTo(4.8f)
            }
        }.build()

        return _TextCursorInput!!
    }

@Suppress("ObjectPropertyName")
private var _TextCursorInput: ImageVector? = null
