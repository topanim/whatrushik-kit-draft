package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.AlignHorizontalSpaceBetween: ImageVector
    get() {
        if (_AlignHorizontalSpaceBetween != null) {
            return _AlignHorizontalSpaceBetween!!
        }
        _AlignHorizontalSpaceBetween = ImageVector.Builder(
            name = "AlignHorizontalSpaceBetween",
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
                moveTo(7f, 5f)
                horizontalLineTo(5f)
                curveTo(3.895f, 5f, 3f, 5.895f, 3f, 7f)
                verticalLineTo(17f)
                curveTo(3f, 18.105f, 3.895f, 19f, 5f, 19f)
                horizontalLineTo(7f)
                curveTo(8.105f, 19f, 9f, 18.105f, 9f, 17f)
                verticalLineTo(7f)
                curveTo(9f, 5.895f, 8.105f, 5f, 7f, 5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 7f)
                horizontalLineTo(17f)
                curveTo(15.895f, 7f, 15f, 7.895f, 15f, 9f)
                verticalLineTo(15f)
                curveTo(15f, 16.105f, 15.895f, 17f, 17f, 17f)
                horizontalLineTo(19f)
                curveTo(20.105f, 17f, 21f, 16.105f, 21f, 15f)
                verticalLineTo(9f)
                curveTo(21f, 7.895f, 20.105f, 7f, 19f, 7f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 2f)
                verticalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 2f)
                verticalLineTo(22f)
            }
        }.build()

        return _AlignHorizontalSpaceBetween!!
    }

@Suppress("ObjectPropertyName")
private var _AlignHorizontalSpaceBetween: ImageVector? = null
