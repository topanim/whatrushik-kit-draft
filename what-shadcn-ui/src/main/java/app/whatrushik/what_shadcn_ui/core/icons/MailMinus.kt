package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.MailMinus: ImageVector
    get() {
        if (_MailMinus != null) {
            return _MailMinus!!
        }
        _MailMinus = ImageVector.Builder(
            name = "MailMinus",
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
                moveTo(22f, 15f)
                verticalLineTo(6f)
                curveTo(22f, 5.47f, 21.789f, 4.961f, 21.414f, 4.586f)
                curveTo(21.039f, 4.211f, 20.53f, 4f, 20f, 4f)
                horizontalLineTo(4f)
                curveTo(3.47f, 4f, 2.961f, 4.211f, 2.586f, 4.586f)
                curveTo(2.211f, 4.961f, 2f, 5.47f, 2f, 6f)
                verticalLineTo(18f)
                curveTo(2f, 19.1f, 2.9f, 20f, 4f, 20f)
                horizontalLineTo(12f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 7f)
                lineTo(13.03f, 12.7f)
                curveTo(12.721f, 12.893f, 12.364f, 12.996f, 12f, 12.996f)
                curveTo(11.636f, 12.996f, 11.279f, 12.893f, 10.97f, 12.7f)
                lineTo(2f, 7f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 19f)
                horizontalLineTo(22f)
            }
        }.build()

        return _MailMinus!!
    }

@Suppress("ObjectPropertyName")
private var _MailMinus: ImageVector? = null
