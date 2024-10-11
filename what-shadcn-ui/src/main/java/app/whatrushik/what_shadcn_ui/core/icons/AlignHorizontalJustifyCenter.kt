package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.AlignHorizontalJustifyCenter: ImageVector
    get() {
        if (_AlignHorizontalJustifyCenter != null) {
            return _AlignHorizontalJustifyCenter!!
        }
        _AlignHorizontalJustifyCenter = ImageVector.Builder(
            name = "AlignHorizontalJustifyCenter",
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
                moveTo(6f, 5f)
                horizontalLineTo(4f)
                curveTo(2.895f, 5f, 2f, 5.895f, 2f, 7f)
                verticalLineTo(17f)
                curveTo(2f, 18.105f, 2.895f, 19f, 4f, 19f)
                horizontalLineTo(6f)
                curveTo(7.105f, 19f, 8f, 18.105f, 8f, 17f)
                verticalLineTo(7f)
                curveTo(8f, 5.895f, 7.105f, 5f, 6f, 5f)
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
                moveTo(12f, 2f)
                verticalLineTo(22f)
            }
        }.build()

        return _AlignHorizontalJustifyCenter!!
    }

@Suppress("ObjectPropertyName")
private var _AlignHorizontalJustifyCenter: ImageVector? = null
