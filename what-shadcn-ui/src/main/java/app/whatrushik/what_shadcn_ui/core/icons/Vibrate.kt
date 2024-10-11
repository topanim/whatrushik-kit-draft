package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Vibrate: ImageVector
    get() {
        if (_Vibrate != null) {
            return _Vibrate!!
        }
        _Vibrate = ImageVector.Builder(
            name = "Vibrate",
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
                moveTo(2f, 8f)
                lineTo(4f, 10f)
                lineTo(2f, 12f)
                lineTo(4f, 14f)
                lineTo(2f, 16f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 8f)
                lineTo(20f, 10f)
                lineTo(22f, 12f)
                lineTo(20f, 14f)
                lineTo(22f, 16f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 5f)
                horizontalLineTo(9f)
                curveTo(8.448f, 5f, 8f, 5.448f, 8f, 6f)
                verticalLineTo(18f)
                curveTo(8f, 18.552f, 8.448f, 19f, 9f, 19f)
                horizontalLineTo(15f)
                curveTo(15.552f, 19f, 16f, 18.552f, 16f, 18f)
                verticalLineTo(6f)
                curveTo(16f, 5.448f, 15.552f, 5f, 15f, 5f)
                close()
            }
        }.build()

        return _Vibrate!!
    }

@Suppress("ObjectPropertyName")
private var _Vibrate: ImageVector? = null
