package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.AlignVerticalSpaceBetween: ImageVector
    get() {
        if (_AlignVerticalSpaceBetween != null) {
            return _AlignVerticalSpaceBetween!!
        }
        _AlignVerticalSpaceBetween = ImageVector.Builder(
            name = "AlignVerticalSpaceBetween",
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
                moveTo(17f, 15f)
                horizontalLineTo(7f)
                curveTo(5.895f, 15f, 5f, 15.895f, 5f, 17f)
                verticalLineTo(19f)
                curveTo(5f, 20.105f, 5.895f, 21f, 7f, 21f)
                horizontalLineTo(17f)
                curveTo(18.105f, 21f, 19f, 20.105f, 19f, 19f)
                verticalLineTo(17f)
                curveTo(19f, 15.895f, 18.105f, 15f, 17f, 15f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 3f)
                horizontalLineTo(9f)
                curveTo(7.895f, 3f, 7f, 3.895f, 7f, 5f)
                verticalLineTo(7f)
                curveTo(7f, 8.105f, 7.895f, 9f, 9f, 9f)
                horizontalLineTo(15f)
                curveTo(16.105f, 9f, 17f, 8.105f, 17f, 7f)
                verticalLineTo(5f)
                curveTo(17f, 3.895f, 16.105f, 3f, 15f, 3f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 21f)
                horizontalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 3f)
                horizontalLineTo(22f)
            }
        }.build()

        return _AlignVerticalSpaceBetween!!
    }

@Suppress("ObjectPropertyName")
private var _AlignVerticalSpaceBetween: ImageVector? = null
