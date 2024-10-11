package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Radio: ImageVector
    get() {
        if (_Radio != null) {
            return _Radio!!
        }
        _Radio = ImageVector.Builder(
            name = "Radio",
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
                moveTo(12f, 14f)
                curveTo(13.105f, 14f, 14f, 13.105f, 14f, 12f)
                curveTo(14f, 10.895f, 13.105f, 10f, 12f, 10f)
                curveTo(10.895f, 10f, 10f, 10.895f, 10f, 12f)
                curveTo(10f, 13.105f, 10.895f, 14f, 12f, 14f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.93f, 19.07f)
                curveTo(3.055f, 17.195f, 2.002f, 14.652f, 2.002f, 12f)
                curveTo(2.002f, 9.348f, 3.055f, 6.805f, 4.93f, 4.93f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.76f, 16.24f)
                curveTo(7.203f, 15.682f, 6.761f, 15.019f, 6.46f, 14.29f)
                curveTo(5.852f, 12.821f, 5.852f, 11.17f, 6.46f, 9.7f)
                curveTo(6.761f, 8.971f, 7.203f, 8.308f, 7.76f, 7.75f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.24f, 7.76f)
                curveTo(16.803f, 8.333f, 17.245f, 9.013f, 17.54f, 9.76f)
                curveTo(18.148f, 11.229f, 18.148f, 12.88f, 17.54f, 14.35f)
                curveTo(17.239f, 15.079f, 16.797f, 15.742f, 16.24f, 16.3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.07f, 4.93f)
                curveTo(20.945f, 6.805f, 21.998f, 9.348f, 21.998f, 12f)
                curveTo(21.998f, 14.652f, 20.945f, 17.195f, 19.07f, 19.07f)
            }
        }.build()

        return _Radio!!
    }

@Suppress("ObjectPropertyName")
private var _Radio: ImageVector? = null
