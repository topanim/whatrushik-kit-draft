package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.EarOff: ImageVector
    get() {
        if (_EarOff != null) {
            return _EarOff!!
        }
        _EarOff = ImageVector.Builder(
            name = "EarOff",
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
                moveTo(6f, 18.5f)
                curveTo(6f, 18.96f, 6.091f, 19.415f, 6.266f, 19.839f)
                curveTo(6.442f, 20.264f, 6.7f, 20.65f, 7.025f, 20.975f)
                curveTo(7.35f, 21.3f, 7.736f, 21.558f, 8.161f, 21.734f)
                curveTo(8.585f, 21.91f, 9.04f, 22f, 9.5f, 22f)
                curveTo(9.96f, 22f, 10.415f, 21.91f, 10.839f, 21.734f)
                curveTo(11.264f, 21.558f, 11.65f, 21.3f, 11.975f, 20.975f)
                curveTo(12.3f, 20.65f, 12.558f, 20.264f, 12.734f, 19.839f)
                curveTo(12.91f, 19.415f, 13f, 18.96f, 13f, 18.5f)
                curveTo(13f, 16.93f, 13.92f, 15.98f, 15.04f, 15.04f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 8.5f)
                curveTo(6f, 7.75f, 6.13f, 7.03f, 6.36f, 6.36f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.8f, 3.15f)
                curveTo(9.776f, 2.474f, 10.918f, 2.079f, 12.102f, 2.006f)
                curveTo(13.287f, 1.934f, 14.468f, 2.187f, 15.519f, 2.738f)
                curveTo(16.57f, 3.289f, 17.45f, 4.117f, 18.064f, 5.133f)
                curveTo(18.677f, 6.149f, 19.001f, 7.313f, 19f, 8.5f)
                curveTo(19f, 10.13f, 18.56f, 11.31f, 17.91f, 12.26f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.5f, 6f)
                curveTo(13.163f, 6f, 13.799f, 6.263f, 14.268f, 6.732f)
                curveTo(14.737f, 7.201f, 15f, 7.837f, 15f, 8.5f)
                moveTo(10f, 13f)
                curveTo(10.385f, 12.999f, 10.761f, 12.887f, 11.084f, 12.678f)
                curveTo(11.407f, 12.469f, 11.662f, 12.171f, 11.82f, 11.82f)
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

        return _EarOff!!
    }

@Suppress("ObjectPropertyName")
private var _EarOff: ImageVector? = null
