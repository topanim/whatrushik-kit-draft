package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val SHUIIcons.BatteryWarning: ImageVector
    get() {
        if (_BatteryWarning != null) {
            return _BatteryWarning!!
        }
        _BatteryWarning = ImageVector.Builder(
            name = "BatteryWarning",
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
                moveTo(14f, 7f)
                horizontalLineTo(16f)
                curveTo(16.53f, 7f, 17.039f, 7.211f, 17.414f, 7.586f)
                curveTo(17.789f, 7.961f, 18f, 8.47f, 18f, 9f)
                verticalLineTo(15f)
                curveTo(18f, 16f, 17f, 17f, 16f, 17f)
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
                curveTo(2f, 16f, 3f, 17f, 4f, 17f)
                horizontalLineTo(6f)
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
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 7f)
                verticalLineTo(13f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 17f)
                verticalLineTo(17.01f)
            }
        }.build()

        return _BatteryWarning!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryWarning: ImageVector? = null
