package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.AlignEndHorizontal: ImageVector
    get() {
        if (_AlignEndHorizontal != null) {
            return _AlignEndHorizontal!!
        }
        _AlignEndHorizontal = ImageVector.Builder(
            name = "AlignEndHorizontal",
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
                verticalLineTo(16f)
                curveTo(4f, 17.105f, 4.895f, 18f, 6f, 18f)
                horizontalLineTo(8f)
                curveTo(9.105f, 18f, 10f, 17.105f, 10f, 16f)
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
                moveTo(18f, 9f)
                horizontalLineTo(16f)
                curveTo(14.895f, 9f, 14f, 9.895f, 14f, 11f)
                verticalLineTo(16f)
                curveTo(14f, 17.105f, 14.895f, 18f, 16f, 18f)
                horizontalLineTo(18f)
                curveTo(19.105f, 18f, 20f, 17.105f, 20f, 16f)
                verticalLineTo(11f)
                curveTo(20f, 9.895f, 19.105f, 9f, 18f, 9f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 22f)
                horizontalLineTo(2f)
            }
        }.build()

        return _AlignEndHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _AlignEndHorizontal: ImageVector? = null
