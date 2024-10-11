package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Tags: ImageVector
    get() {
        if (_Tags != null) {
            return _Tags!!
        }
        _Tags = ImageVector.Builder(
            name = "Tags",
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
                moveTo(9f, 5f)
                horizontalLineTo(2f)
                verticalLineTo(12f)
                lineTo(8.29f, 18.29f)
                curveTo(9.23f, 19.23f, 10.77f, 19.23f, 11.71f, 18.29f)
                lineTo(15.29f, 14.71f)
                curveTo(16.23f, 13.77f, 16.23f, 12.23f, 15.29f, 11.29f)
                lineTo(9f, 5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 9.01f)
                verticalLineTo(9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 5f)
                lineTo(21.3f, 11.3f)
                curveTo(21.524f, 11.523f, 21.701f, 11.788f, 21.822f, 12.08f)
                curveTo(21.944f, 12.371f, 22.006f, 12.684f, 22.006f, 13f)
                curveTo(22.006f, 13.316f, 21.944f, 13.629f, 21.822f, 13.92f)
                curveTo(21.701f, 14.212f, 21.524f, 14.477f, 21.3f, 14.7f)
                lineTo(17f, 19f)
            }
        }.build()

        return _Tags!!
    }

@Suppress("ObjectPropertyName")
private var _Tags: ImageVector? = null
