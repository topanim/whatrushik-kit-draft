package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.TextCursor: ImageVector
    get() {
        if (_TextCursor != null) {
            return _TextCursor!!
        }
        _TextCursor = ImageVector.Builder(
            name = "TextCursor",
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
                moveTo(17f, 22f)
                horizontalLineTo(16f)
                curveTo(14.939f, 22f, 13.922f, 21.579f, 13.172f, 20.828f)
                curveTo(12.421f, 20.078f, 12f, 19.061f, 12f, 18f)
                verticalLineTo(6f)
                curveTo(12f, 4.939f, 12.421f, 3.922f, 13.172f, 3.172f)
                curveTo(13.922f, 2.421f, 14.939f, 2f, 16f, 2f)
                horizontalLineTo(17f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 22f)
                horizontalLineTo(8f)
                curveTo(9.061f, 22f, 10.078f, 21.579f, 10.828f, 20.828f)
                curveTo(11.579f, 20.078f, 12f, 19.061f, 12f, 18f)
                verticalLineTo(17f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 2f)
                horizontalLineTo(8f)
                curveTo(9.061f, 2f, 10.078f, 2.421f, 10.828f, 3.172f)
                curveTo(11.579f, 3.922f, 12f, 4.939f, 12f, 6f)
                verticalLineTo(7f)
            }
        }.build()

        return _TextCursor!!
    }

@Suppress("ObjectPropertyName")
private var _TextCursor: ImageVector? = null
