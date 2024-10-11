package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.StretchHorizontal: ImageVector
    get() {
        if (_StretchHorizontal != null) {
            return _StretchHorizontal!!
        }
        _StretchHorizontal = ImageVector.Builder(
            name = "StretchHorizontal",
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
                moveTo(20f, 4f)
                horizontalLineTo(4f)
                curveTo(2.895f, 4f, 2f, 4.895f, 2f, 6f)
                verticalLineTo(8f)
                curveTo(2f, 9.105f, 2.895f, 10f, 4f, 10f)
                horizontalLineTo(20f)
                curveTo(21.105f, 10f, 22f, 9.105f, 22f, 8f)
                verticalLineTo(6f)
                curveTo(22f, 4.895f, 21.105f, 4f, 20f, 4f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 14f)
                horizontalLineTo(4f)
                curveTo(2.895f, 14f, 2f, 14.895f, 2f, 16f)
                verticalLineTo(18f)
                curveTo(2f, 19.105f, 2.895f, 20f, 4f, 20f)
                horizontalLineTo(20f)
                curveTo(21.105f, 20f, 22f, 19.105f, 22f, 18f)
                verticalLineTo(16f)
                curveTo(22f, 14.895f, 21.105f, 14f, 20f, 14f)
                close()
            }
        }.build()

        return _StretchHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _StretchHorizontal: ImageVector? = null
