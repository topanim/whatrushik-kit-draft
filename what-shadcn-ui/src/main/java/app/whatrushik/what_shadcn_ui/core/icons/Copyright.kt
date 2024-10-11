package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Copyright: ImageVector
    get() {
        if (_Copyright != null) {
            return _Copyright!!
        }
        _Copyright = ImageVector.Builder(
            name = "Copyright",
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
                moveTo(12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 9.354f)
                curveTo(14.463f, 8.745f, 13.752f, 8.314f, 12.964f, 8.118f)
                curveTo(12.175f, 7.922f, 11.346f, 7.971f, 10.586f, 8.258f)
                curveTo(9.826f, 8.546f, 9.171f, 9.058f, 8.71f, 9.726f)
                curveTo(8.248f, 10.394f, 8f, 11.188f, 8f, 12f)
                curveTo(8f, 12.813f, 8.248f, 13.606f, 8.71f, 14.274f)
                curveTo(9.171f, 14.942f, 9.826f, 15.454f, 10.586f, 15.742f)
                curveTo(11.346f, 16.029f, 12.175f, 16.078f, 12.964f, 15.882f)
                curveTo(13.752f, 15.686f, 14.463f, 15.255f, 15f, 14.646f)
            }
        }.build()

        return _Copyright!!
    }

@Suppress("ObjectPropertyName")
private var _Copyright: ImageVector? = null
