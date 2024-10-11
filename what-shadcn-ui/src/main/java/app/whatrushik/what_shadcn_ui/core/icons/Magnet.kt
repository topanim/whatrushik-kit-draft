package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Magnet: ImageVector
    get() {
        if (_Magnet != null) {
            return _Magnet!!
        }
        _Magnet = ImageVector.Builder(
            name = "Magnet",
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
                moveTo(6f, 15f)
                lineTo(2f, 11f)
                lineTo(8.75f, 4.23f)
                curveTo(10.234f, 2.901f, 12.17f, 2.191f, 14.161f, 2.246f)
                curveTo(16.152f, 2.301f, 18.047f, 3.117f, 19.455f, 4.525f)
                curveTo(20.863f, 5.933f, 21.679f, 7.828f, 21.734f, 9.819f)
                curveTo(21.788f, 11.81f, 21.079f, 13.746f, 19.75f, 15.23f)
                lineTo(13f, 22f)
                lineTo(9f, 18f)
                lineTo(15.39f, 11.64f)
                curveTo(15.705f, 11.228f, 15.86f, 10.716f, 15.826f, 10.198f)
                curveTo(15.792f, 9.681f, 15.571f, 9.193f, 15.204f, 8.826f)
                curveTo(14.837f, 8.46f, 14.349f, 8.238f, 13.832f, 8.204f)
                curveTo(13.314f, 8.17f, 12.802f, 8.325f, 12.39f, 8.64f)
                lineTo(6f, 15f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 8f)
                lineTo(9f, 12f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 15f)
                lineTo(16f, 19f)
            }
        }.build()

        return _Magnet!!
    }

@Suppress("ObjectPropertyName")
private var _Magnet: ImageVector? = null
