package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.ShoppingCart: ImageVector
    get() {
        if (_ShoppingCart != null) {
            return _ShoppingCart!!
        }
        _ShoppingCart = ImageVector.Builder(
            name = "ShoppingCart",
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
                curveTo(8.552f, 22f, 9f, 21.552f, 9f, 21f)
                curveTo(9f, 20.448f, 8.552f, 20f, 8f, 20f)
                curveTo(7.448f, 20f, 7f, 20.448f, 7f, 21f)
                curveTo(7f, 21.552f, 7.448f, 22f, 8f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 22f)
                curveTo(19.552f, 22f, 20f, 21.552f, 20f, 21f)
                curveTo(20f, 20.448f, 19.552f, 20f, 19f, 20f)
                curveTo(18.448f, 20f, 18f, 20.448f, 18f, 21f)
                curveTo(18f, 21.552f, 18.448f, 22f, 19f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.05f, 2.05f)
                horizontalLineTo(4.05f)
                lineTo(6.71f, 14.47f)
                curveTo(6.808f, 14.925f, 7.061f, 15.332f, 7.426f, 15.62f)
                curveTo(7.791f, 15.908f, 8.245f, 16.06f, 8.71f, 16.05f)
                horizontalLineTo(18.49f)
                curveTo(18.945f, 16.049f, 19.386f, 15.893f, 19.741f, 15.608f)
                curveTo(20.096f, 15.322f, 20.342f, 14.925f, 20.44f, 14.48f)
                lineTo(22.09f, 7.05f)
                horizontalLineTo(5.12f)
            }
        }.build()

        return _ShoppingCart!!
    }

@Suppress("ObjectPropertyName")
private var _ShoppingCart: ImageVector? = null
