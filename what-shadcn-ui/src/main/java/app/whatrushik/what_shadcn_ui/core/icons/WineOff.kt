package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.WineOff: ImageVector
    get() {
        if (_WineOff != null) {
            return _WineOff!!
        }
        _WineOff = ImageVector.Builder(
            name = "WineOff",
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
                moveTo(8f, 22f)
                horizontalLineTo(16f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 10f)
                horizontalLineTo(10f)
                moveTo(17f, 10f)
                horizontalLineTo(15.657f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 15f)
                verticalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.307f, 7.307f)
                curveTo(7.106f, 8.191f, 7.003f, 9.094f, 7f, 10f)
                curveTo(7f, 10.867f, 7.226f, 11.719f, 7.654f, 12.473f)
                curveTo(8.083f, 13.226f, 8.701f, 13.856f, 9.446f, 14.298f)
                curveTo(10.192f, 14.741f, 11.039f, 14.983f, 11.906f, 14.999f)
                curveTo(12.773f, 15.015f, 13.63f, 14.806f, 14.391f, 14.391f)
                moveTo(8.638f, 2.981f)
                curveTo(8.75f, 2.668f, 8.872f, 2.34f, 9f, 2f)
                horizontalLineTo(15f)
                curveTo(16.5f, 6f, 17f, 8f, 17f, 10f)
                curveTo(17f, 10.407f, 16.95f, 10.809f, 16.855f, 11.198f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 2f)
                lineTo(22f, 22f)
            }
        }.build()

        return _WineOff!!
    }

@Suppress("ObjectPropertyName")
private var _WineOff: ImageVector? = null
