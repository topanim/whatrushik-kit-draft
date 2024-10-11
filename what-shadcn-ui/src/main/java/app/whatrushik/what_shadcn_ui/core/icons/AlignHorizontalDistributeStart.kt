package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.AlignHorizontalDistributeStart: ImageVector
    get() {
        if (_AlignHorizontalDistributeStart != null) {
            return _AlignHorizontalDistributeStart!!
        }
        _AlignHorizontalDistributeStart = ImageVector.Builder(
            name = "AlignHorizontalDistributeStart",
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
                moveTo(8f, 5f)
                horizontalLineTo(6f)
                curveTo(4.895f, 5f, 4f, 5.895f, 4f, 7f)
                verticalLineTo(17f)
                curveTo(4f, 18.105f, 4.895f, 19f, 6f, 19f)
                horizontalLineTo(8f)
                curveTo(9.105f, 19f, 10f, 18.105f, 10f, 17f)
                verticalLineTo(7f)
                curveTo(10f, 5.895f, 9.105f, 5f, 8f, 5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 7f)
                horizontalLineTo(16f)
                curveTo(14.895f, 7f, 14f, 7.895f, 14f, 9f)
                verticalLineTo(15f)
                curveTo(14f, 16.105f, 14.895f, 17f, 16f, 17f)
                horizontalLineTo(18f)
                curveTo(19.105f, 17f, 20f, 16.105f, 20f, 15f)
                verticalLineTo(9f)
                curveTo(20f, 7.895f, 19.105f, 7f, 18f, 7f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 2f)
                verticalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 2f)
                verticalLineTo(22f)
            }
        }.build()

        return _AlignHorizontalDistributeStart!!
    }

@Suppress("ObjectPropertyName")
private var _AlignHorizontalDistributeStart: ImageVector? = null
