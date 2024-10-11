package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.AlignHorizontalSpaceAround: ImageVector
    get() {
        if (_AlignHorizontalSpaceAround != null) {
            return _AlignHorizontalSpaceAround!!
        }
        _AlignHorizontalSpaceAround = ImageVector.Builder(
            name = "AlignHorizontalSpaceAround",
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
                moveTo(13f, 7f)
                horizontalLineTo(11f)
                curveTo(9.895f, 7f, 9f, 7.895f, 9f, 9f)
                verticalLineTo(15f)
                curveTo(9f, 16.105f, 9.895f, 17f, 11f, 17f)
                horizontalLineTo(13f)
                curveTo(14.105f, 17f, 15f, 16.105f, 15f, 15f)
                verticalLineTo(9f)
                curveTo(15f, 7.895f, 14.105f, 7f, 13f, 7f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 22f)
                verticalLineTo(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 22f)
                verticalLineTo(2f)
            }
        }.build()

        return _AlignHorizontalSpaceAround!!
    }

@Suppress("ObjectPropertyName")
private var _AlignHorizontalSpaceAround: ImageVector? = null
