package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.AlignEndVertical: ImageVector
    get() {
        if (_AlignEndVertical != null) {
            return _AlignEndVertical!!
        }
        _AlignEndVertical = ImageVector.Builder(
            name = "AlignEndVertical",
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
                moveTo(16f, 4f)
                horizontalLineTo(4f)
                curveTo(2.895f, 4f, 2f, 4.895f, 2f, 6f)
                verticalLineTo(8f)
                curveTo(2f, 9.105f, 2.895f, 10f, 4f, 10f)
                horizontalLineTo(16f)
                curveTo(17.105f, 10f, 18f, 9.105f, 18f, 8f)
                verticalLineTo(6f)
                curveTo(18f, 4.895f, 17.105f, 4f, 16f, 4f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 14f)
                horizontalLineTo(11f)
                curveTo(9.895f, 14f, 9f, 14.895f, 9f, 16f)
                verticalLineTo(18f)
                curveTo(9f, 19.105f, 9.895f, 20f, 11f, 20f)
                horizontalLineTo(16f)
                curveTo(17.105f, 20f, 18f, 19.105f, 18f, 18f)
                verticalLineTo(16f)
                curveTo(18f, 14.895f, 17.105f, 14f, 16f, 14f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 22f)
                verticalLineTo(2f)
            }
        }.build()

        return _AlignEndVertical!!
    }

@Suppress("ObjectPropertyName")
private var _AlignEndVertical: ImageVector? = null
