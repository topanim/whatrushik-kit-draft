package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.MailSearch: ImageVector
    get() {
        if (_MailSearch != null) {
            return _MailSearch!!
        }
        _MailSearch = ImageVector.Builder(
            name = "MailSearch",
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
                moveTo(22f, 12.5f)
                verticalLineTo(6f)
                curveTo(22f, 5.47f, 21.789f, 4.961f, 21.414f, 4.586f)
                curveTo(21.039f, 4.211f, 20.53f, 4f, 20f, 4f)
                horizontalLineTo(4f)
                curveTo(3.47f, 4f, 2.961f, 4.211f, 2.586f, 4.586f)
                curveTo(2.211f, 4.961f, 2f, 5.47f, 2f, 6f)
                verticalLineTo(18f)
                curveTo(2f, 19.1f, 2.9f, 20f, 4f, 20f)
                horizontalLineTo(11.5f)
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
                moveTo(18f, 21f)
                curveTo(18.796f, 21f, 19.559f, 20.684f, 20.121f, 20.121f)
                curveTo(20.684f, 19.559f, 21f, 18.796f, 21f, 18f)
                curveTo(21f, 17.204f, 20.684f, 16.441f, 20.121f, 15.879f)
                curveTo(19.559f, 15.316f, 18.796f, 15f, 18f, 15f)
                curveTo(17.204f, 15f, 16.441f, 15.316f, 15.879f, 15.879f)
                curveTo(15.316f, 16.441f, 15f, 17.204f, 15f, 18f)
                curveTo(15f, 18.796f, 15.316f, 19.559f, 15.879f, 20.121f)
                curveTo(16.441f, 20.684f, 17.204f, 21f, 18f, 21f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 21f)
                curveTo(19.657f, 21f, 21f, 19.657f, 21f, 18f)
                curveTo(21f, 16.343f, 19.657f, 15f, 18f, 15f)
                curveTo(16.343f, 15f, 15f, 16.343f, 15f, 18f)
                curveTo(15f, 19.657f, 16.343f, 21f, 18f, 21f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 22f)
                lineTo(20.5f, 20.5f)
            }
        }.build()

        return _MailSearch!!
    }

@Suppress("ObjectPropertyName")
private var _MailSearch: ImageVector? = null
