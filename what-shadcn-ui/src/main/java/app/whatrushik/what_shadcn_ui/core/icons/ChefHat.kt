package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.ChefHat: ImageVector
    get() {
        if (_ChefHat != null) {
            return _ChefHat!!
        }
        _ChefHat = ImageVector.Builder(
            name = "ChefHat",
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
                moveTo(6f, 13.87f)
                curveTo(4.986f, 13.652f, 4.096f, 13.049f, 3.518f, 12.188f)
                curveTo(2.94f, 11.327f, 2.72f, 10.275f, 2.902f, 9.254f)
                curveTo(3.085f, 8.233f, 3.658f, 7.323f, 4.499f, 6.716f)
                curveTo(5.34f, 6.109f, 6.383f, 5.852f, 7.41f, 6f)
                curveTo(7.663f, 5.427f, 8.019f, 4.905f, 8.46f, 4.46f)
                curveTo(8.924f, 3.994f, 9.476f, 3.625f, 10.084f, 3.373f)
                curveTo(10.691f, 3.121f, 11.342f, 2.991f, 12f, 2.991f)
                curveTo(12.658f, 2.991f, 13.309f, 3.121f, 13.916f, 3.373f)
                curveTo(14.524f, 3.625f, 15.075f, 3.994f, 15.54f, 4.46f)
                curveTo(15.981f, 4.905f, 16.337f, 5.427f, 16.59f, 6f)
                curveTo(17.617f, 5.852f, 18.66f, 6.109f, 19.501f, 6.716f)
                curveTo(20.342f, 7.323f, 20.915f, 8.233f, 21.097f, 9.254f)
                curveTo(21.28f, 10.275f, 21.06f, 11.327f, 20.482f, 12.188f)
                curveTo(19.904f, 13.049f, 19.014f, 13.652f, 18f, 13.87f)
                verticalLineTo(21f)
                horizontalLineTo(6f)
                verticalLineTo(13.87f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 17f)
                horizontalLineTo(18f)
            }
        }.build()

        return _ChefHat!!
    }

@Suppress("ObjectPropertyName")
private var _ChefHat: ImageVector? = null
