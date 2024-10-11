package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.AlignStartVertical: ImageVector
    get() {
        if (_AlignStartVertical != null) {
            return _AlignStartVertical!!
        }
        _AlignStartVertical = ImageVector.Builder(
            name = "AlignStartVertical",
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
                moveTo(13f, 14f)
                horizontalLineTo(8f)
                curveTo(6.895f, 14f, 6f, 14.895f, 6f, 16f)
                verticalLineTo(18f)
                curveTo(6f, 19.105f, 6.895f, 20f, 8f, 20f)
                horizontalLineTo(13f)
                curveTo(14.105f, 20f, 15f, 19.105f, 15f, 18f)
                verticalLineTo(16f)
                curveTo(15f, 14.895f, 14.105f, 14f, 13f, 14f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 4f)
                horizontalLineTo(8f)
                curveTo(6.895f, 4f, 6f, 4.895f, 6f, 6f)
                verticalLineTo(8f)
                curveTo(6f, 9.105f, 6.895f, 10f, 8f, 10f)
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
                moveTo(2f, 2f)
                verticalLineTo(22f)
            }
        }.build()

        return _AlignStartVertical!!
    }

@Suppress("ObjectPropertyName")
private var _AlignStartVertical: ImageVector? = null
