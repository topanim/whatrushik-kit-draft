package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.MousePointer2: ImageVector
    get() {
        if (_MousePointer2 != null) {
            return _MousePointer2!!
        }
        _MousePointer2 = ImageVector.Builder(
            name = "MousePointer2",
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
                moveTo(4f, 4f)
                lineTo(11.07f, 21f)
                lineTo(13.58f, 13.61f)
                lineTo(21f, 11.07f)
                lineTo(4f, 4f)
                close()
            }
        }.build()

        return _MousePointer2!!
    }

@Suppress("ObjectPropertyName")
private var _MousePointer2: ImageVector? = null
