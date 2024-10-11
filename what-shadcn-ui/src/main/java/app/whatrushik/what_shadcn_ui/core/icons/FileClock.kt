package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.FileClock: ImageVector
    get() {
        if (_FileClock != null) {
            return _FileClock!!
        }
        _FileClock = ImageVector.Builder(
            name = "FileClock",
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
                moveTo(16f, 22f)
                horizontalLineTo(18f)
                curveTo(18.5f, 22f, 19f, 21.8f, 19.4f, 21.4f)
                curveTo(19.8f, 21f, 20f, 20.5f, 20f, 20f)
                verticalLineTo(7.5f)
                lineTo(14.5f, 2f)
                horizontalLineTo(6f)
                curveTo(5.5f, 2f, 5f, 2.2f, 4.6f, 2.6f)
                curveTo(4.2f, 3f, 4f, 3.5f, 4f, 4f)
                verticalLineTo(7f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 2f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 22f)
                curveTo(11.314f, 22f, 14f, 19.314f, 14f, 16f)
                curveTo(14f, 12.686f, 11.314f, 10f, 8f, 10f)
                curveTo(4.686f, 10f, 2f, 12.686f, 2f, 16f)
                curveTo(2f, 19.314f, 4.686f, 22f, 8f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.5f, 17.5f)
                lineTo(8f, 16.25f)
                verticalLineTo(14f)
            }
        }.build()

        return _FileClock!!
    }

@Suppress("ObjectPropertyName")
private var _FileClock: ImageVector? = null
