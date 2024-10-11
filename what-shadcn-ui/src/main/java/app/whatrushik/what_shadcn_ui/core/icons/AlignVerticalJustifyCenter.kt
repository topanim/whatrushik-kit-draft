package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.AlignVerticalJustifyCenter: ImageVector
    get() {
        if (_AlignVerticalJustifyCenter != null) {
            return _AlignVerticalJustifyCenter!!
        }
        _AlignVerticalJustifyCenter = ImageVector.Builder(
            name = "AlignVerticalJustifyCenter",
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
                moveTo(2f, 12f)
                horizontalLineTo(22f)
            }
        }.build()

        return _AlignVerticalJustifyCenter!!
    }

@Suppress("ObjectPropertyName")
private var _AlignVerticalJustifyCenter: ImageVector? = null
