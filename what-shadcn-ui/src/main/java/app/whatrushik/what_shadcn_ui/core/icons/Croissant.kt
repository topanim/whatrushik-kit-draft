package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Croissant: ImageVector
    get() {
        if (_Croissant != null) {
            return _Croissant!!
        }
        _Croissant = ImageVector.Builder(
            name = "Croissant",
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
                moveTo(4.6f, 13.11f)
                lineTo(10.39f, 9.9f)
                curveTo(12.28f, 8.85f, 15.18f, 11.68f, 14.1f, 13.61f)
                lineTo(10.88f, 19.42f)
                curveTo(8.8f, 23.16f, 0.79f, 15.23f, 4.6f, 13.11f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.5f, 9.5f)
                lineTo(9.5f, 7.21f)
                curveTo(9.2f, 6.48f, 8.8f, 6f, 8f, 6f)
                horizontalLineTo(4.5f)
                curveTo(2.79f, 6f, 2f, 6.5f, 2f, 8.5f)
                curveTo(2.084f, 10.294f, 2.791f, 12.002f, 4f, 13.33f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 6f)
                curveTo(8f, 4.45f, 8.24f, 2f, 6f, 2f)
                curveTo(4f, 2f, 3.5f, 4.17f, 3.5f, 6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.5f, 13.5f)
                lineTo(16.79f, 14.5f)
                curveTo(17.52f, 14.8f, 18f, 15.2f, 18f, 16f)
                verticalLineTo(19.5f)
                curveTo(18f, 21.21f, 17.5f, 22f, 15.5f, 22f)
                curveTo(13.706f, 21.916f, 11.998f, 21.209f, 10.67f, 20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 16f)
                curveTo(19.55f, 16f, 22f, 15.76f, 22f, 18f)
                curveTo(22f, 20f, 19.83f, 20.5f, 18f, 20.5f)
            }
        }.build()

        return _Croissant!!
    }

@Suppress("ObjectPropertyName")
private var _Croissant: ImageVector? = null
