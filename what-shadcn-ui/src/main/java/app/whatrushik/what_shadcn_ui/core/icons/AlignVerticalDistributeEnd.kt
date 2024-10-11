package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.AlignVerticalDistributeEnd: ImageVector
    get() {
        if (_AlignVerticalDistributeEnd != null) {
            return _AlignVerticalDistributeEnd!!
        }
        _AlignVerticalDistributeEnd = ImageVector.Builder(
            name = "AlignVerticalDistributeEnd",
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
                moveTo(17f, 14f)
                horizontalLineTo(7f)
                curveTo(5.895f, 14f, 5f, 14.895f, 5f, 16f)
                verticalLineTo(18f)
                curveTo(5f, 19.105f, 5.895f, 20f, 7f, 20f)
                horizontalLineTo(17f)
                curveTo(18.105f, 20f, 19f, 19.105f, 19f, 18f)
                verticalLineTo(16f)
                curveTo(19f, 14.895f, 18.105f, 14f, 17f, 14f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 4f)
                horizontalLineTo(9f)
                curveTo(7.895f, 4f, 7f, 4.895f, 7f, 6f)
                verticalLineTo(8f)
                curveTo(7f, 9.105f, 7.895f, 10f, 9f, 10f)
                horizontalLineTo(15f)
                curveTo(16.105f, 10f, 17f, 9.105f, 17f, 8f)
                verticalLineTo(6f)
                curveTo(17f, 4.895f, 16.105f, 4f, 15f, 4f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 20f)
                horizontalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 10f)
                horizontalLineTo(22f)
            }
        }.build()

        return _AlignVerticalDistributeEnd!!
    }

@Suppress("ObjectPropertyName")
private var _AlignVerticalDistributeEnd: ImageVector? = null
