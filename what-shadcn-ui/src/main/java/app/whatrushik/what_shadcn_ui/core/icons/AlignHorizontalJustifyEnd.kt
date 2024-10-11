package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.AlignHorizontalJustifyEnd: ImageVector
    get() {
        if (_AlignHorizontalJustifyEnd != null) {
            return _AlignHorizontalJustifyEnd!!
        }
        _AlignHorizontalJustifyEnd = ImageVector.Builder(
            name = "AlignHorizontalJustifyEnd",
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
                moveTo(16f, 7f)
                horizontalLineTo(14f)
                curveTo(12.895f, 7f, 12f, 7.895f, 12f, 9f)
                verticalLineTo(15f)
                curveTo(12f, 16.105f, 12.895f, 17f, 14f, 17f)
                horizontalLineTo(16f)
                curveTo(17.105f, 17f, 18f, 16.105f, 18f, 15f)
                verticalLineTo(9f)
                curveTo(18f, 7.895f, 17.105f, 7f, 16f, 7f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 2f)
                verticalLineTo(22f)
            }
        }.build()

        return _AlignHorizontalJustifyEnd!!
    }

@Suppress("ObjectPropertyName")
private var _AlignHorizontalJustifyEnd: ImageVector? = null
