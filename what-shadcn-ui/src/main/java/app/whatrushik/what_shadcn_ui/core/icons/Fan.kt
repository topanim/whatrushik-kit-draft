package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Fan: ImageVector
    get() {
        if (_Fan != null) {
            return _Fan!!
        }
        _Fan = ImageVector.Builder(
            name = "Fan",
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
                moveTo(10.827f, 16.379f)
                curveTo(9.779f, 16.909f, 8.6f, 17.123f, 7.433f, 16.998f)
                curveTo(6.266f, 16.872f, 5.16f, 16.411f, 4.249f, 15.671f)
                curveTo(3.337f, 14.931f, 2.66f, 13.943f, 2.298f, 12.826f)
                curveTo(1.936f, 11.709f, 1.905f, 10.511f, 2.209f, 9.377f)
                lineTo(7.621f, 10.827f)
                curveTo(7.091f, 9.779f, 6.877f, 8.6f, 7.002f, 7.433f)
                curveTo(7.128f, 6.266f, 7.589f, 5.16f, 8.329f, 4.249f)
                curveTo(9.069f, 3.337f, 10.057f, 2.66f, 11.174f, 2.298f)
                curveTo(12.291f, 1.936f, 13.489f, 1.905f, 14.623f, 2.209f)
                lineTo(13.173f, 7.621f)
                curveTo(14.221f, 7.091f, 15.399f, 6.877f, 16.567f, 7.002f)
                curveTo(17.734f, 7.128f, 18.84f, 7.589f, 19.751f, 8.329f)
                curveTo(20.663f, 9.069f, 21.34f, 10.057f, 21.702f, 11.174f)
                curveTo(22.064f, 12.291f, 22.095f, 13.489f, 21.791f, 14.623f)
                lineTo(16.379f, 13.173f)
                curveTo(16.909f, 14.221f, 17.123f, 15.399f, 16.998f, 16.567f)
                curveTo(16.872f, 17.734f, 16.411f, 18.84f, 15.671f, 19.751f)
                curveTo(14.931f, 20.663f, 13.943f, 21.34f, 12.826f, 21.702f)
                curveTo(11.709f, 22.064f, 10.511f, 22.095f, 9.377f, 21.791f)
                lineTo(10.827f, 16.379f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                verticalLineTo(12.01f)
            }
        }.build()

        return _Fan!!
    }

@Suppress("ObjectPropertyName")
private var _Fan: ImageVector? = null
