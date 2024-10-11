package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.ToggleLeft: ImageVector
    get() {
        if (_ToggleLeft != null) {
            return _ToggleLeft!!
        }
        _ToggleLeft = ImageVector.Builder(
            name = "ToggleLeft",
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
                moveTo(16f, 6f)
                horizontalLineTo(8f)
                curveTo(4.686f, 6f, 2f, 8.686f, 2f, 12f)
                curveTo(2f, 15.314f, 4.686f, 18f, 8f, 18f)
                horizontalLineTo(16f)
                curveTo(19.314f, 18f, 22f, 15.314f, 22f, 12f)
                curveTo(22f, 8.686f, 19.314f, 6f, 16f, 6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 14f)
                curveTo(9.105f, 14f, 10f, 13.105f, 10f, 12f)
                curveTo(10f, 10.895f, 9.105f, 10f, 8f, 10f)
                curveTo(6.895f, 10f, 6f, 10.895f, 6f, 12f)
                curveTo(6f, 13.105f, 6.895f, 14f, 8f, 14f)
                close()
            }
        }.build()

        return _ToggleLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ToggleLeft: ImageVector? = null
