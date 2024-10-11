package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.BeanOff: ImageVector
    get() {
        if (_BeanOff != null) {
            return _BeanOff!!
        }
        _BeanOff = ImageVector.Builder(
            name = "BeanOff",
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
                moveTo(9f, 9f)
                curveTo(8.36f, 9.64f, 7.479f, 9.954f, 6.598f, 10.165f)
                curveTo(5.169f, 10.507f, 3.914f, 11.363f, 3.074f, 12.568f)
                curveTo(2.233f, 13.774f, 1.864f, 15.246f, 2.037f, 16.706f)
                curveTo(2.21f, 18.166f, 2.913f, 19.511f, 4.012f, 20.487f)
                curveTo(5.111f, 21.463f, 6.53f, 22.001f, 8f, 22f)
                curveTo(9.839f, 22.002f, 11.66f, 21.641f, 13.359f, 20.938f)
                curveTo(15.058f, 20.234f, 16.601f, 19.202f, 17.9f, 17.9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.75f, 5.093f)
                curveTo(11.394f, 3.929f, 12.407f, 3.012f, 13.629f, 2.486f)
                curveTo(14.851f, 1.96f, 16.213f, 1.856f, 17.501f, 2.189f)
                curveTo(18.789f, 2.521f, 19.93f, 3.273f, 20.744f, 4.325f)
                curveTo(21.559f, 5.377f, 22f, 6.67f, 22f, 8f)
                curveTo(22f, 10.411f, 21.39f, 12.68f, 20.317f, 14.66f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.341f, 10.62f)
                curveTo(5.604f, 11.214f, 6.008f, 11.735f, 6.518f, 12.138f)
                curveTo(7.027f, 12.541f, 7.627f, 12.814f, 8.266f, 12.933f)
                curveTo(8.905f, 13.052f, 9.563f, 13.014f, 10.184f, 12.821f)
                curveTo(10.804f, 12.628f, 11.369f, 12.288f, 11.828f, 11.828f)
                moveTo(10.62f, 5.341f)
                curveTo(11.529f, 5.745f, 12.255f, 6.472f, 12.659f, 7.381f)
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

        return _BeanOff!!
    }

@Suppress("ObjectPropertyName")
private var _BeanOff: ImageVector? = null
