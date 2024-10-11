package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.AlignHorizontalJustifyStart: ImageVector
    get() {
        if (_AlignHorizontalJustifyStart != null) {
            return _AlignHorizontalJustifyStart!!
        }
        _AlignHorizontalJustifyStart = ImageVector.Builder(
            name = "AlignHorizontalJustifyStart",
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
                moveTo(10f, 5f)
                horizontalLineTo(8f)
                curveTo(6.895f, 5f, 6f, 5.895f, 6f, 7f)
                verticalLineTo(17f)
                curveTo(6f, 18.105f, 6.895f, 19f, 8f, 19f)
                horizontalLineTo(10f)
                curveTo(11.105f, 19f, 12f, 18.105f, 12f, 17f)
                verticalLineTo(7f)
                curveTo(12f, 5.895f, 11.105f, 5f, 10f, 5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 7f)
                horizontalLineTo(18f)
                curveTo(16.895f, 7f, 16f, 7.895f, 16f, 9f)
                verticalLineTo(15f)
                curveTo(16f, 16.105f, 16.895f, 17f, 18f, 17f)
                horizontalLineTo(20f)
                curveTo(21.105f, 17f, 22f, 16.105f, 22f, 15f)
                verticalLineTo(9f)
                curveTo(22f, 7.895f, 21.105f, 7f, 20f, 7f)
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

        return _AlignHorizontalJustifyStart!!
    }

@Suppress("ObjectPropertyName")
private var _AlignHorizontalJustifyStart: ImageVector? = null
