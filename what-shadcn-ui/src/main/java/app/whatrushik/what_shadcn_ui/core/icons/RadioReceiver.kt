package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.RadioReceiver: ImageVector
    get() {
        if (_RadioReceiver != null) {
            return _RadioReceiver!!
        }
        _RadioReceiver = ImageVector.Builder(
            name = "RadioReceiver",
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
                moveTo(5f, 16f)
                verticalLineTo(18f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 16f)
                verticalLineTo(18f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 8f)
                horizontalLineTo(4f)
                curveTo(2.895f, 8f, 2f, 8.895f, 2f, 10f)
                verticalLineTo(14f)
                curveTo(2f, 15.105f, 2.895f, 16f, 4f, 16f)
                horizontalLineTo(20f)
                curveTo(21.105f, 16f, 22f, 15.105f, 22f, 14f)
                verticalLineTo(10f)
                curveTo(22f, 8.895f, 21.105f, 8f, 20f, 8f)
                close()
            }
        }.build()

        return _RadioReceiver!!
    }

@Suppress("ObjectPropertyName")
private var _RadioReceiver: ImageVector? = null
