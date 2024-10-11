package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Highlighter: ImageVector
    get() {
        if (_Highlighter != null) {
            return _Highlighter!!
        }
        _Highlighter = ImageVector.Builder(
            name = "Highlighter",
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
                moveTo(9f, 11f)
                lineTo(3f, 17f)
                verticalLineTo(20f)
                horizontalLineTo(12f)
                lineTo(15f, 17f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 12f)
                lineTo(17.4f, 16.6f)
                curveTo(17.026f, 16.966f, 16.524f, 17.172f, 16f, 17.172f)
                curveTo(15.476f, 17.172f, 14.974f, 16.966f, 14.6f, 16.6f)
                lineTo(9.4f, 11.4f)
                curveTo(9.034f, 11.026f, 8.828f, 10.524f, 8.828f, 10f)
                curveTo(8.828f, 9.476f, 9.034f, 8.974f, 9.4f, 8.6f)
                lineTo(14f, 4f)
            }
        }.build()

        return _Highlighter!!
    }

@Suppress("ObjectPropertyName")
private var _Highlighter: ImageVector? = null
