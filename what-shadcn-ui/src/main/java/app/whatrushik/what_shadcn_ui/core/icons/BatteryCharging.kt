package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.BatteryCharging: ImageVector
    get() {
        if (_BatteryCharging != null) {
            return _BatteryCharging!!
        }
        _BatteryCharging = ImageVector.Builder(
            name = "BatteryCharging",
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
                moveTo(15f, 7f)
                horizontalLineTo(16f)
                curveTo(16.53f, 7f, 17.039f, 7.211f, 17.414f, 7.586f)
                curveTo(17.789f, 7.961f, 18f, 8.47f, 18f, 9f)
                verticalLineTo(15f)
                curveTo(18f, 15.53f, 17.789f, 16.039f, 17.414f, 16.414f)
                curveTo(17.039f, 16.789f, 16.53f, 17f, 16f, 17f)
                horizontalLineTo(14f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 7f)
                horizontalLineTo(4f)
                curveTo(3.47f, 7f, 2.961f, 7.211f, 2.586f, 7.586f)
                curveTo(2.211f, 7.961f, 2f, 8.47f, 2f, 9f)
                verticalLineTo(15f)
                curveTo(2f, 15.53f, 2.211f, 16.039f, 2.586f, 16.414f)
                curveTo(2.961f, 16.789f, 3.47f, 17f, 4f, 17f)
                horizontalLineTo(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 7f)
                lineTo(8f, 12f)
                horizontalLineTo(12f)
                lineTo(9f, 17f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 11f)
                verticalLineTo(13f)
            }
        }.build()

        return _BatteryCharging!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryCharging: ImageVector? = null
