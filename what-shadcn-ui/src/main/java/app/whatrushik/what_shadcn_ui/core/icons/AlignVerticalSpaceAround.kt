package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.AlignVerticalSpaceAround: ImageVector
    get() {
        if (_AlignVerticalSpaceAround != null) {
            return _AlignVerticalSpaceAround!!
        }
        _AlignVerticalSpaceAround = ImageVector.Builder(
            name = "AlignVerticalSpaceAround",
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
                moveTo(15f, 9f)
                horizontalLineTo(9f)
                curveTo(7.895f, 9f, 7f, 9.895f, 7f, 11f)
                verticalLineTo(13f)
                curveTo(7f, 14.105f, 7.895f, 15f, 9f, 15f)
                horizontalLineTo(15f)
                curveTo(16.105f, 15f, 17f, 14.105f, 17f, 13f)
                verticalLineTo(11f)
                curveTo(17f, 9.895f, 16.105f, 9f, 15f, 9f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 20f)
                horizontalLineTo(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 4f)
                horizontalLineTo(2f)
            }
        }.build()

        return _AlignVerticalSpaceAround!!
    }

@Suppress("ObjectPropertyName")
private var _AlignVerticalSpaceAround: ImageVector? = null
