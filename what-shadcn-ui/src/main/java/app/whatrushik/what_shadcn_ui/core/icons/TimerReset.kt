package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.TimerReset: ImageVector
    get() {
        if (_TimerReset != null) {
            return _TimerReset!!
        }
        _TimerReset = ImageVector.Builder(
            name = "TimerReset",
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
                moveTo(12f, 14f)
                verticalLineTo(10f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 13f)
                curveTo(4.245f, 11.056f, 5.195f, 9.269f, 6.669f, 7.979f)
                curveTo(8.144f, 6.689f, 10.041f, 5.985f, 12f, 6f)
                curveTo(13.294f, 6.001f, 14.568f, 6.317f, 15.714f, 6.919f)
                curveTo(16.859f, 7.521f, 17.842f, 8.392f, 18.576f, 9.457f)
                curveTo(19.311f, 10.522f, 19.777f, 11.75f, 19.933f, 13.034f)
                curveTo(20.089f, 14.319f, 19.931f, 15.622f, 19.473f, 16.832f)
                curveTo(19.015f, 18.043f, 18.27f, 19.124f, 17.302f, 19.983f)
                curveTo(16.335f, 20.842f, 15.173f, 21.453f, 13.917f, 21.765f)
                curveTo(12.661f, 22.076f, 11.348f, 22.078f, 10.091f, 21.771f)
                curveTo(8.834f, 21.464f, 7.671f, 20.856f, 6.7f, 20f)
                lineTo(4f, 17.6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 17f)
                horizontalLineTo(4f)
                verticalLineTo(22f)
            }
        }.build()

        return _TimerReset!!
    }

@Suppress("ObjectPropertyName")
private var _TimerReset: ImageVector? = null
