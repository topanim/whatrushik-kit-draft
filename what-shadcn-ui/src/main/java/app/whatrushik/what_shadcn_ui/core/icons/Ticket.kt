package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Ticket: ImageVector
    get() {
        if (_Ticket != null) {
            return _Ticket!!
        }
        _Ticket = ImageVector.Builder(
            name = "Ticket",
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
                moveTo(3f, 7f)
                verticalLineTo(9f)
                curveTo(3.796f, 9f, 4.559f, 9.316f, 5.121f, 9.879f)
                curveTo(5.684f, 10.441f, 6f, 11.204f, 6f, 12f)
                curveTo(6f, 12.796f, 5.684f, 13.559f, 5.121f, 14.121f)
                curveTo(4.559f, 14.684f, 3.796f, 15f, 3f, 15f)
                verticalLineTo(17f)
                curveTo(3f, 18.1f, 3.9f, 19f, 5f, 19f)
                horizontalLineTo(19f)
                curveTo(19.53f, 19f, 20.039f, 18.789f, 20.414f, 18.414f)
                curveTo(20.789f, 18.039f, 21f, 17.53f, 21f, 17f)
                verticalLineTo(15f)
                curveTo(20.204f, 15f, 19.441f, 14.684f, 18.879f, 14.121f)
                curveTo(18.316f, 13.559f, 18f, 12.796f, 18f, 12f)
                curveTo(18f, 11.204f, 18.316f, 10.441f, 18.879f, 9.879f)
                curveTo(19.441f, 9.316f, 20.204f, 9f, 21f, 9f)
                verticalLineTo(7f)
                curveTo(21f, 6.47f, 20.789f, 5.961f, 20.414f, 5.586f)
                curveTo(20.039f, 5.211f, 19.53f, 5f, 19f, 5f)
                horizontalLineTo(5f)
                curveTo(4.47f, 5f, 3.961f, 5.211f, 3.586f, 5.586f)
                curveTo(3.211f, 5.961f, 3f, 6.47f, 3f, 7f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 5f)
                verticalLineTo(7f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 17f)
                verticalLineTo(19f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 11f)
                verticalLineTo(13f)
            }
        }.build()

        return _Ticket!!
    }

@Suppress("ObjectPropertyName")
private var _Ticket: ImageVector? = null
