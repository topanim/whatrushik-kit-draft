package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.LampDesk: ImageVector
    get() {
        if (_LampDesk != null) {
            return _LampDesk!!
        }
        _LampDesk = ImageVector.Builder(
            name = "LampDesk",
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
                moveTo(14f, 5f)
                lineTo(11f, 8f)
                lineTo(13f, 15f)
                lineTo(21f, 7f)
                lineTo(14f, 5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 5f)
                lineTo(11f, 8f)
                lineTo(8f, 5f)
                lineTo(11f, 2f)
                lineTo(14f, 5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.5f, 6.5f)
                lineTo(4f, 12f)
                lineTo(7f, 18f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 22f)
                verticalLineTo(20f)
                curveTo(3f, 18.9f, 3.9f, 18f, 5f, 18f)
                horizontalLineTo(9f)
                curveTo(9.53f, 18f, 10.039f, 18.211f, 10.414f, 18.586f)
                curveTo(10.789f, 18.961f, 11f, 19.47f, 11f, 20f)
                verticalLineTo(22f)
                horizontalLineTo(3f)
                close()
            }
        }.build()

        return _LampDesk!!
    }

@Suppress("ObjectPropertyName")
private var _LampDesk: ImageVector? = null
