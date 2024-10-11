package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.TimerOff: ImageVector
    get() {
        if (_TimerOff != null) {
            return _TimerOff!!
        }
        _TimerOff = ImageVector.Builder(
            name = "TimerOff",
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
                moveTo(10f, 2f)
                horizontalLineTo(14f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.6f, 11f)
                curveTo(3.994f, 12.456f, 3.832f, 14.059f, 4.135f, 15.607f)
                curveTo(4.437f, 17.155f, 5.191f, 18.579f, 6.3f, 19.7f)
                curveTo(7.421f, 20.809f, 8.845f, 21.563f, 10.393f, 21.865f)
                curveTo(11.941f, 22.168f, 13.544f, 22.006f, 15f, 21.4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.4f, 7.4f)
                curveTo(8.957f, 6.32f, 10.847f, 5.827f, 12.733f, 6.01f)
                curveTo(14.62f, 6.193f, 16.38f, 7.04f, 17.7f, 8.4f)
                curveTo(19.019f, 9.727f, 19.831f, 11.474f, 19.996f, 13.337f)
                curveTo(20.16f, 15.201f, 19.666f, 17.063f, 18.6f, 18.6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 2f)
                lineTo(22f, 22f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                verticalLineTo(10f)
            }
        }.build()

        return _TimerOff!!
    }

@Suppress("ObjectPropertyName")
private var _TimerOff: ImageVector? = null
