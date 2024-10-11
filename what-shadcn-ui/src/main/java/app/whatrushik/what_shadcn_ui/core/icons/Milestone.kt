package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Milestone: ImageVector
    get() {
        if (_Milestone != null) {
            return _Milestone!!
        }
        _Milestone = ImageVector.Builder(
            name = "Milestone",
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
                moveTo(18f, 6f)
                horizontalLineTo(5f)
                curveTo(4.47f, 6f, 3.961f, 6.211f, 3.586f, 6.586f)
                curveTo(3.211f, 6.961f, 3f, 7.47f, 3f, 8f)
                verticalLineTo(11f)
                curveTo(3f, 11.53f, 3.211f, 12.039f, 3.586f, 12.414f)
                curveTo(3.961f, 12.789f, 4.47f, 13f, 5f, 13f)
                horizontalLineTo(18f)
                lineTo(22f, 9.5f)
                lineTo(18f, 6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 13f)
                verticalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 2f)
                verticalLineTo(6f)
            }
        }.build()

        return _Milestone!!
    }

@Suppress("ObjectPropertyName")
private var _Milestone: ImageVector? = null
