package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Palette: ImageVector
    get() {
        if (_Palette != null) {
            return _Palette!!
        }
        _Palette = ImageVector.Builder(
            name = "Palette",
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
                moveTo(13.5f, 7f)
                curveTo(13.776f, 7f, 14f, 6.776f, 14f, 6.5f)
                curveTo(14f, 6.224f, 13.776f, 6f, 13.5f, 6f)
                curveTo(13.224f, 6f, 13f, 6.224f, 13f, 6.5f)
                curveTo(13f, 6.776f, 13.224f, 7f, 13.5f, 7f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.5f, 11f)
                curveTo(17.776f, 11f, 18f, 10.776f, 18f, 10.5f)
                curveTo(18f, 10.224f, 17.776f, 10f, 17.5f, 10f)
                curveTo(17.224f, 10f, 17f, 10.224f, 17f, 10.5f)
                curveTo(17f, 10.776f, 17.224f, 11f, 17.5f, 11f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.5f, 8f)
                curveTo(8.776f, 8f, 9f, 7.776f, 9f, 7.5f)
                curveTo(9f, 7.224f, 8.776f, 7f, 8.5f, 7f)
                curveTo(8.224f, 7f, 8f, 7.224f, 8f, 7.5f)
                curveTo(8f, 7.776f, 8.224f, 8f, 8.5f, 8f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.5f, 13f)
                curveTo(6.776f, 13f, 7f, 12.776f, 7f, 12.5f)
                curveTo(7f, 12.224f, 6.776f, 12f, 6.5f, 12f)
                curveTo(6.224f, 12f, 6f, 12.224f, 6f, 12.5f)
                curveTo(6f, 12.776f, 6.224f, 13f, 6.5f, 13f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 2f)
                curveTo(6.5f, 2f, 2f, 6.5f, 2f, 12f)
                curveTo(2f, 17.5f, 6.5f, 22f, 12f, 22f)
                curveTo(12.926f, 22f, 13.648f, 21.254f, 13.648f, 20.312f)
                curveTo(13.648f, 19.875f, 13.468f, 19.477f, 13.211f, 19.187f)
                curveTo(12.921f, 18.898f, 12.773f, 18.535f, 12.773f, 18.062f)
                curveTo(12.769f, 17.842f, 12.81f, 17.623f, 12.892f, 17.419f)
                curveTo(12.975f, 17.215f, 13.097f, 17.03f, 13.253f, 16.874f)
                curveTo(13.409f, 16.719f, 13.594f, 16.596f, 13.798f, 16.513f)
                curveTo(14.002f, 16.431f, 14.221f, 16.39f, 14.441f, 16.394f)
                horizontalLineTo(16.437f)
                curveTo(19.488f, 16.394f, 21.992f, 13.891f, 21.992f, 10.84f)
                curveTo(21.965f, 6.012f, 17.461f, 2f, 12f, 2f)
                close()
            }
        }.build()

        return _Palette!!
    }

@Suppress("ObjectPropertyName")
private var _Palette: ImageVector? = null
