package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Mic: ImageVector
    get() {
        if (_Mic != null) {
            return _Mic!!
        }
        _Mic = ImageVector.Builder(
            name = "Mic",
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
                moveTo(12f, 2f)
                curveTo(11.204f, 2f, 10.441f, 2.316f, 9.879f, 2.879f)
                curveTo(9.316f, 3.441f, 9f, 4.204f, 9f, 5f)
                verticalLineTo(12f)
                curveTo(9f, 12.796f, 9.316f, 13.559f, 9.879f, 14.121f)
                curveTo(10.441f, 14.684f, 11.204f, 15f, 12f, 15f)
                curveTo(12.796f, 15f, 13.559f, 14.684f, 14.121f, 14.121f)
                curveTo(14.684f, 13.559f, 15f, 12.796f, 15f, 12f)
                verticalLineTo(5f)
                curveTo(15f, 4.204f, 14.684f, 3.441f, 14.121f, 2.879f)
                curveTo(13.559f, 2.316f, 12.796f, 2f, 12f, 2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 10f)
                verticalLineTo(12f)
                curveTo(19f, 13.856f, 18.263f, 15.637f, 16.95f, 16.95f)
                curveTo(15.637f, 18.263f, 13.856f, 19f, 12f, 19f)
                curveTo(10.144f, 19f, 8.363f, 18.263f, 7.05f, 16.95f)
                curveTo(5.738f, 15.637f, 5f, 13.856f, 5f, 12f)
                verticalLineTo(10f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 19f)
                verticalLineTo(22f)
            }
        }.build()

        return _Mic!!
    }

@Suppress("ObjectPropertyName")
private var _Mic: ImageVector? = null
