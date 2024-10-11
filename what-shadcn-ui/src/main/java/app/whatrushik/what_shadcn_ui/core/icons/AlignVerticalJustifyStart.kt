package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.AlignVerticalJustifyStart: ImageVector
    get() {
        if (_AlignVerticalJustifyStart != null) {
            return _AlignVerticalJustifyStart!!
        }
        _AlignVerticalJustifyStart = ImageVector.Builder(
            name = "AlignVerticalJustifyStart",
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
                moveTo(17f, 16f)
                horizontalLineTo(7f)
                curveTo(5.895f, 16f, 5f, 16.895f, 5f, 18f)
                verticalLineTo(20f)
                curveTo(5f, 21.105f, 5.895f, 22f, 7f, 22f)
                horizontalLineTo(17f)
                curveTo(18.105f, 22f, 19f, 21.105f, 19f, 20f)
                verticalLineTo(18f)
                curveTo(19f, 16.895f, 18.105f, 16f, 17f, 16f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 6f)
                horizontalLineTo(9f)
                curveTo(7.895f, 6f, 7f, 6.895f, 7f, 8f)
                verticalLineTo(10f)
                curveTo(7f, 11.105f, 7.895f, 12f, 9f, 12f)
                horizontalLineTo(15f)
                curveTo(16.105f, 12f, 17f, 11.105f, 17f, 10f)
                verticalLineTo(8f)
                curveTo(17f, 6.895f, 16.105f, 6f, 15f, 6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 2f)
                horizontalLineTo(22f)
            }
        }.build()

        return _AlignVerticalJustifyStart!!
    }

@Suppress("ObjectPropertyName")
private var _AlignVerticalJustifyStart: ImageVector? = null
