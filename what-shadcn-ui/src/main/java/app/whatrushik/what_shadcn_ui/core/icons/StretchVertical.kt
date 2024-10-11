package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.StretchVertical: ImageVector
    get() {
        if (_StretchVertical != null) {
            return _StretchVertical!!
        }
        _StretchVertical = ImageVector.Builder(
            name = "StretchVertical",
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
                moveTo(8f, 2f)
                horizontalLineTo(6f)
                curveTo(4.895f, 2f, 4f, 2.895f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 21.105f, 4.895f, 22f, 6f, 22f)
                horizontalLineTo(8f)
                curveTo(9.105f, 22f, 10f, 21.105f, 10f, 20f)
                verticalLineTo(4f)
                curveTo(10f, 2.895f, 9.105f, 2f, 8f, 2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 2f)
                horizontalLineTo(16f)
                curveTo(14.895f, 2f, 14f, 2.895f, 14f, 4f)
                verticalLineTo(20f)
                curveTo(14f, 21.105f, 14.895f, 22f, 16f, 22f)
                horizontalLineTo(18f)
                curveTo(19.105f, 22f, 20f, 21.105f, 20f, 20f)
                verticalLineTo(4f)
                curveTo(20f, 2.895f, 19.105f, 2f, 18f, 2f)
                close()
            }
        }.build()

        return _StretchVertical!!
    }

@Suppress("ObjectPropertyName")
private var _StretchVertical: ImageVector? = null
