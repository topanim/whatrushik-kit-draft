package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val SHUIIcons.BatteryLow: ImageVector
    get() {
        if (_BatteryLow != null) {
            return _BatteryLow!!
        }
        _BatteryLow = ImageVector.Builder(
            name = "BatteryLow",
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
                moveTo(16f, 7f)
                horizontalLineTo(4f)
                curveTo(2.895f, 7f, 2f, 7.895f, 2f, 9f)
                verticalLineTo(15f)
                curveTo(2f, 16.105f, 2.895f, 17f, 4f, 17f)
                horizontalLineTo(16f)
                curveTo(17.105f, 17f, 18f, 16.105f, 18f, 15f)
                verticalLineTo(9f)
                curveTo(18f, 7.895f, 17.105f, 7f, 16f, 7f)
                close()
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
                moveTo(6f, 11f)
                verticalLineTo(13f)
            }
        }.build()

        return _BatteryLow!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryLow: ImageVector? = null
