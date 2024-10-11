package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.MonitorSpeaker: ImageVector
    get() {
        if (_MonitorSpeaker != null) {
            return _MonitorSpeaker!!
        }
        _MonitorSpeaker = ImageVector.Builder(
            name = "MonitorSpeaker",
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
                moveTo(5.5f, 20f)
                horizontalLineTo(8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 9f)
                horizontalLineTo(17.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 4f)
                horizontalLineTo(14f)
                curveTo(12.895f, 4f, 12f, 4.895f, 12f, 6f)
                verticalLineTo(18f)
                curveTo(12f, 19.105f, 12.895f, 20f, 14f, 20f)
                horizontalLineTo(20f)
                curveTo(21.105f, 20f, 22f, 19.105f, 22f, 18f)
                verticalLineTo(6f)
                curveTo(22f, 4.895f, 21.105f, 4f, 20f, 4f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 6f)
                horizontalLineTo(4f)
                curveTo(3.47f, 6f, 2.961f, 6.211f, 2.586f, 6.586f)
                curveTo(2.211f, 6.961f, 2f, 7.47f, 2f, 8f)
                verticalLineTo(14f)
                curveTo(2f, 14.53f, 2.211f, 15.039f, 2.586f, 15.414f)
                curveTo(2.961f, 15.789f, 3.47f, 16f, 4f, 16f)
                horizontalLineTo(8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 16f)
                curveTo(17.552f, 16f, 18f, 15.552f, 18f, 15f)
                curveTo(18f, 14.448f, 17.552f, 14f, 17f, 14f)
                curveTo(16.448f, 14f, 16f, 14.448f, 16f, 15f)
                curveTo(16f, 15.552f, 16.448f, 16f, 17f, 16f)
                close()
            }
        }.build()

        return _MonitorSpeaker!!
    }

@Suppress("ObjectPropertyName")
private var _MonitorSpeaker: ImageVector? = null
