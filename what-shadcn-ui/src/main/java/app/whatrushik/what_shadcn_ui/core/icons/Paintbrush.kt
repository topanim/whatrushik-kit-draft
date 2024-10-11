package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Paintbrush: ImageVector
    get() {
        if (_Paintbrush != null) {
            return _Paintbrush!!
        }
        _Paintbrush = ImageVector.Builder(
            name = "Paintbrush",
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
                moveTo(18.37f, 2.63f)
                lineTo(14f, 7f)
                lineTo(12.41f, 5.41f)
                curveTo(12.035f, 5.037f, 11.528f, 4.828f, 11f, 4.828f)
                curveTo(10.472f, 4.828f, 9.965f, 5.037f, 9.59f, 5.41f)
                lineTo(8f, 7f)
                lineTo(17f, 16f)
                lineTo(18.59f, 14.41f)
                curveTo(18.962f, 14.035f, 19.172f, 13.528f, 19.172f, 13f)
                curveTo(19.172f, 12.472f, 18.962f, 11.965f, 18.59f, 11.59f)
                lineTo(17f, 10f)
                lineTo(21.37f, 5.63f)
                curveTo(21.768f, 5.232f, 21.991f, 4.693f, 21.991f, 4.13f)
                curveTo(21.991f, 3.567f, 21.768f, 3.028f, 21.37f, 2.63f)
                curveTo(20.972f, 2.232f, 20.433f, 2.009f, 19.87f, 2.009f)
                curveTo(19.307f, 2.009f, 18.768f, 2.232f, 18.37f, 2.63f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 8f)
                curveTo(7f, 11f, 5f, 11.5f, 2f, 12f)
                lineTo(10f, 22f)
                curveTo(12f, 21f, 16f, 17f, 16f, 15f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.5f, 17.5f)
                lineTo(4.5f, 15f)
            }
        }.build()

        return _Paintbrush!!
    }

@Suppress("ObjectPropertyName")
private var _Paintbrush: ImageVector? = null
