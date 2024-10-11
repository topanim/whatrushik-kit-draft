package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.AlignStartHorizontal: ImageVector
    get() {
        if (_AlignStartHorizontal != null) {
            return _AlignStartHorizontal!!
        }
        _AlignStartHorizontal = ImageVector.Builder(
            name = "AlignStartHorizontal",
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
                moveTo(8f, 6f)
                horizontalLineTo(6f)
                curveTo(4.895f, 6f, 4f, 6.895f, 4f, 8f)
                verticalLineTo(20f)
                curveTo(4f, 21.105f, 4.895f, 22f, 6f, 22f)
                horizontalLineTo(8f)
                curveTo(9.105f, 22f, 10f, 21.105f, 10f, 20f)
                verticalLineTo(8f)
                curveTo(10f, 6.895f, 9.105f, 6f, 8f, 6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 6f)
                horizontalLineTo(16f)
                curveTo(14.895f, 6f, 14f, 6.895f, 14f, 8f)
                verticalLineTo(13f)
                curveTo(14f, 14.105f, 14.895f, 15f, 16f, 15f)
                horizontalLineTo(18f)
                curveTo(19.105f, 15f, 20f, 14.105f, 20f, 13f)
                verticalLineTo(8f)
                curveTo(20f, 6.895f, 19.105f, 6f, 18f, 6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 2f)
                horizontalLineTo(2f)
            }
        }.build()

        return _AlignStartHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _AlignStartHorizontal: ImageVector? = null
