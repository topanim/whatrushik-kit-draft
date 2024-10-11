package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val SHUIIcons.HopOff: ImageVector
    get() {
        if (_HopOff != null) {
            return _HopOff!!
        }
        _HopOff = ImageVector.Builder(
            name = "HopOff",
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
                moveTo(17.5f, 5.5f)
                curveTo(19f, 7f, 20.5f, 9f, 21f, 11f)
                curveTo(19.677f, 11.265f, 18.354f, 11.39f, 16.882f, 11.226f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.5f, 17.5f)
                curveTo(7f, 19f, 9f, 20.5f, 11f, 21f)
                curveTo(11.5f, 18.5f, 11.5f, 16f, 10f, 12.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.5f, 17.5f)
                curveTo(15f, 17.5f, 13.5f, 17.5f, 11.5f, 16.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 11.5f)
                curveTo(21f, 13f, 22f, 15f, 22f, 16f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.5f, 20f)
                curveTo(13f, 21f, 15f, 22f, 16f, 22f)
                curveTo(16.5f, 20.5f, 16f, 19f, 15.5f, 17.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 22f)
                curveTo(20f, 22f, 18.5f, 21.5f, 16.5f, 20.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.783f, 4.782f)
                curveTo(1.073f, 8.492f, 1f, 14.5f, 5f, 18f)
                curveTo(6f, 17f, 7f, 13.5f, 6.5f, 11.5f)
                curveTo(8f, 12.5f, 10.5f, 12.5f, 12f, 12f)
                moveTo(8.227f, 2.57f)
                curveTo(11.578f, 1.335f, 15.453f, 2.089f, 18f, 5f)
                curveTo(17.12f, 5.88f, 14.3f, 6.761f, 12.274f, 6.618f)
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
        }.build()

        return _HopOff!!
    }

@Suppress("ObjectPropertyName")
private var _HopOff: ImageVector? = null
