package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.RectangleVertical: ImageVector
    get() {
        if (_RectangleVertical != null) {
            return _RectangleVertical!!
        }
        _RectangleVertical = ImageVector.Builder(
            name = "RectangleVertical",
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
                moveTo(16f, 2f)
                horizontalLineTo(8f)
                curveTo(6.895f, 2f, 6f, 2.895f, 6f, 4f)
                verticalLineTo(20f)
                curveTo(6f, 21.105f, 6.895f, 22f, 8f, 22f)
                horizontalLineTo(16f)
                curveTo(17.105f, 22f, 18f, 21.105f, 18f, 20f)
                verticalLineTo(4f)
                curveTo(18f, 2.895f, 17.105f, 2f, 16f, 2f)
                close()
            }
        }.build()

        return _RectangleVertical!!
    }

@Suppress("ObjectPropertyName")
private var _RectangleVertical: ImageVector? = null
