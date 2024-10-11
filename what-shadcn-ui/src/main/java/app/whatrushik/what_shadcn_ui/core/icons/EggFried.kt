package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.EggFried: ImageVector
    get() {
        if (_EggFried != null) {
            return _EggFried!!
        }
        _EggFried = ImageVector.Builder(
            name = "EggFried",
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
                moveTo(11.5f, 16f)
                curveTo(13.433f, 16f, 15f, 14.433f, 15f, 12.5f)
                curveTo(15f, 10.567f, 13.433f, 9f, 11.5f, 9f)
                curveTo(9.567f, 9f, 8f, 10.567f, 8f, 12.5f)
                curveTo(8f, 14.433f, 9.567f, 16f, 11.5f, 16f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 8f)
                curveTo(3f, 4.5f, 5.5f, 2f, 9.5f, 2f)
                curveTo(14.5f, 2f, 14.33f, 5f, 17f, 7f)
                curveTo(19.67f, 9f, 22f, 9f, 22f, 13f)
                curveTo(22f, 17.5f, 19.5f, 19.5f, 15f, 19.5f)
                curveTo(12.5f, 19.5f, 12.5f, 22f, 9f, 22f)
                curveTo(5.5f, 22f, 2f, 20f, 2f, 16.5f)
                curveTo(2f, 13.5f, 3.5f, 13.5f, 3.5f, 11.5f)
                curveTo(3.5f, 10f, 3f, 9f, 3f, 8f)
                close()
            }
        }.build()

        return _EggFried!!
    }

@Suppress("ObjectPropertyName")
private var _EggFried: ImageVector? = null
