package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.AlignVerticalJustifyEnd: ImageVector
    get() {
        if (_AlignVerticalJustifyEnd != null) {
            return _AlignVerticalJustifyEnd!!
        }
        _AlignVerticalJustifyEnd = ImageVector.Builder(
            name = "AlignVerticalJustifyEnd",
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
                moveTo(17f, 12f)
                horizontalLineTo(7f)
                curveTo(5.895f, 12f, 5f, 12.895f, 5f, 14f)
                verticalLineTo(16f)
                curveTo(5f, 17.105f, 5.895f, 18f, 7f, 18f)
                horizontalLineTo(17f)
                curveTo(18.105f, 18f, 19f, 17.105f, 19f, 16f)
                verticalLineTo(14f)
                curveTo(19f, 12.895f, 18.105f, 12f, 17f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 2f)
                horizontalLineTo(9f)
                curveTo(7.895f, 2f, 7f, 2.895f, 7f, 4f)
                verticalLineTo(6f)
                curveTo(7f, 7.105f, 7.895f, 8f, 9f, 8f)
                horizontalLineTo(15f)
                curveTo(16.105f, 8f, 17f, 7.105f, 17f, 6f)
                verticalLineTo(4f)
                curveTo(17f, 2.895f, 16.105f, 2f, 15f, 2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 22f)
                horizontalLineTo(22f)
            }
        }.build()

        return _AlignVerticalJustifyEnd!!
    }

@Suppress("ObjectPropertyName")
private var _AlignVerticalJustifyEnd: ImageVector? = null
