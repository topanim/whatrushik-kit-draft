package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Watch: ImageVector
    get() {
        if (_Watch != null) {
            return _Watch!!
        }
        _Watch = ImageVector.Builder(
            name = "Watch",
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
                moveTo(12f, 18f)
                curveTo(15.314f, 18f, 18f, 15.314f, 18f, 12f)
                curveTo(18f, 8.686f, 15.314f, 6f, 12f, 6f)
                curveTo(8.686f, 6f, 6f, 8.686f, 6f, 12f)
                curveTo(6f, 15.314f, 8.686f, 18f, 12f, 18f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 10f)
                verticalLineTo(12f)
                lineTo(13f, 13f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.13f, 7.66f)
                lineTo(15.32f, 3.61f)
                curveTo(15.229f, 3.149f, 14.978f, 2.736f, 14.612f, 2.442f)
                curveTo(14.247f, 2.147f, 13.789f, 1.991f, 13.32f, 2f)
                horizontalLineTo(10.64f)
                curveTo(10.171f, 1.991f, 9.713f, 2.147f, 9.348f, 2.442f)
                curveTo(8.982f, 2.736f, 8.731f, 3.149f, 8.64f, 3.61f)
                lineTo(7.86f, 7.66f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.88f, 16.36f)
                lineTo(8.68f, 20.36f)
                curveTo(8.771f, 20.82f, 9.022f, 21.234f, 9.388f, 21.528f)
                curveTo(9.753f, 21.823f, 10.211f, 21.979f, 10.68f, 21.97f)
                horizontalLineTo(13.4f)
                curveTo(13.869f, 21.979f, 14.327f, 21.823f, 14.693f, 21.528f)
                curveTo(15.058f, 21.234f, 15.309f, 20.82f, 15.4f, 20.36f)
                lineTo(16.21f, 16.31f)
            }
        }.build()

        return _Watch!!
    }

@Suppress("ObjectPropertyName")
private var _Watch: ImageVector? = null
