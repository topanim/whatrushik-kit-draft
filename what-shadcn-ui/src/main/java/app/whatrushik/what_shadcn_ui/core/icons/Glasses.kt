package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Glasses: ImageVector
    get() {
        if (_Glasses != null) {
            return _Glasses!!
        }
        _Glasses = ImageVector.Builder(
            name = "Glasses",
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
                moveTo(6f, 19f)
                curveTo(8.209f, 19f, 10f, 17.209f, 10f, 15f)
                curveTo(10f, 12.791f, 8.209f, 11f, 6f, 11f)
                curveTo(3.791f, 11f, 2f, 12.791f, 2f, 15f)
                curveTo(2f, 17.209f, 3.791f, 19f, 6f, 19f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 19f)
                curveTo(20.209f, 19f, 22f, 17.209f, 22f, 15f)
                curveTo(22f, 12.791f, 20.209f, 11f, 18f, 11f)
                curveTo(15.791f, 11f, 14f, 12.791f, 14f, 15f)
                curveTo(14f, 17.209f, 15.791f, 19f, 18f, 19f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 15f)
                curveTo(14f, 14.47f, 13.789f, 13.961f, 13.414f, 13.586f)
                curveTo(13.039f, 13.211f, 12.53f, 13f, 12f, 13f)
                curveTo(11.47f, 13f, 10.961f, 13.211f, 10.586f, 13.586f)
                curveTo(10.211f, 13.961f, 10f, 14.47f, 10f, 15f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.5f, 13f)
                lineTo(5f, 7f)
                curveTo(5.7f, 5.7f, 6.4f, 5f, 8f, 5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.5f, 13f)
                lineTo(19f, 7f)
                curveTo(18.3f, 5.7f, 17.5f, 5f, 16f, 5f)
            }
        }.build()

        return _Glasses!!
    }

@Suppress("ObjectPropertyName")
private var _Glasses: ImageVector? = null
