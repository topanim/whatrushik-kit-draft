package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.HeartOff: ImageVector
    get() {
        if (_HeartOff != null) {
            return _HeartOff!!
        }
        _HeartOff = ImageVector.Builder(
            name = "HeartOff",
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
                moveTo(4.12f, 4.107f)
                curveTo(3.93f, 4.253f, 3.751f, 4.411f, 3.582f, 4.58f)
                curveTo(1.46f, 6.7f, 1.33f, 10.28f, 4f, 13f)
                lineTo(12f, 21f)
                lineTo(16.5f, 16.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.328f, 13.672f)
                lineTo(20f, 13f)
                curveTo(22.67f, 10.28f, 22.54f, 6.7f, 20.42f, 4.58f)
                curveTo(19.918f, 4.077f, 19.322f, 3.677f, 18.666f, 3.405f)
                curveTo(18.009f, 3.132f, 17.306f, 2.992f, 16.595f, 2.992f)
                curveTo(15.884f, 2.992f, 15.181f, 3.132f, 14.524f, 3.405f)
                curveTo(13.868f, 3.677f, 13.272f, 4.077f, 12.77f, 4.58f)
                lineTo(12f, 5.36f)
                lineTo(11.23f, 4.58f)
                curveTo(10.569f, 3.917f, 9.747f, 3.437f, 8.844f, 3.187f)
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

        return _HeartOff!!
    }

@Suppress("ObjectPropertyName")
private var _HeartOff: ImageVector? = null
