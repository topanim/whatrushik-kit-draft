package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.MonitorSmartphone: ImageVector
    get() {
        if (_MonitorSmartphone != null) {
            return _MonitorSmartphone!!
        }
        _MonitorSmartphone = ImageVector.Builder(
            name = "MonitorSmartphone",
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
                moveTo(18f, 8f)
                verticalLineTo(6f)
                curveTo(18f, 5.47f, 17.789f, 4.961f, 17.414f, 4.586f)
                curveTo(17.039f, 4.211f, 16.53f, 4f, 16f, 4f)
                horizontalLineTo(4f)
                curveTo(3.47f, 4f, 2.961f, 4.211f, 2.586f, 4.586f)
                curveTo(2.211f, 4.961f, 2f, 5.47f, 2f, 6f)
                verticalLineTo(13f)
                curveTo(2f, 13.53f, 2.211f, 14.039f, 2.586f, 14.414f)
                curveTo(2.961f, 14.789f, 3.47f, 15f, 4f, 15f)
                horizontalLineTo(12f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 19f)
                verticalLineTo(15.04f)
                verticalLineTo(18.19f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 19f)
                horizontalLineTo(12f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 12f)
                horizontalLineTo(18f)
                curveTo(16.895f, 12f, 16f, 12.895f, 16f, 14f)
                verticalLineTo(20f)
                curveTo(16f, 21.105f, 16.895f, 22f, 18f, 22f)
                horizontalLineTo(20f)
                curveTo(21.105f, 22f, 22f, 21.105f, 22f, 20f)
                verticalLineTo(14f)
                curveTo(22f, 12.895f, 21.105f, 12f, 20f, 12f)
                close()
            }
        }.build()

        return _MonitorSmartphone!!
    }

@Suppress("ObjectPropertyName")
private var _MonitorSmartphone: ImageVector? = null
