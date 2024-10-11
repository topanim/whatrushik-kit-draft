package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.IceCream: ImageVector
    get() {
        if (_IceCream != null) {
            return _IceCream!!
        }
        _IceCream = ImageVector.Builder(
            name = "IceCream",
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
                moveTo(7f, 11f)
                lineTo(11.08f, 21.35f)
                curveTo(11.157f, 21.53f, 11.285f, 21.684f, 11.449f, 21.792f)
                curveTo(11.612f, 21.9f, 11.804f, 21.958f, 12f, 21.958f)
                curveTo(12.196f, 21.958f, 12.388f, 21.9f, 12.551f, 21.792f)
                curveTo(12.715f, 21.684f, 12.843f, 21.53f, 12.92f, 21.35f)
                lineTo(17f, 11f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 7f)
                curveTo(17f, 5.674f, 16.473f, 4.402f, 15.535f, 3.464f)
                curveTo(14.598f, 2.527f, 13.326f, 2f, 12f, 2f)
                curveTo(10.674f, 2f, 9.402f, 2.527f, 8.464f, 3.464f)
                curveTo(7.527f, 4.402f, 7f, 5.674f, 7f, 7f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 7f)
                curveTo(17.53f, 7f, 18.039f, 7.211f, 18.414f, 7.586f)
                curveTo(18.789f, 7.961f, 19f, 8.47f, 19f, 9f)
                curveTo(19f, 9.53f, 18.789f, 10.039f, 18.414f, 10.414f)
                curveTo(18.039f, 10.789f, 17.53f, 11f, 17f, 11f)
                horizontalLineTo(7f)
                curveTo(6.47f, 11f, 5.961f, 10.789f, 5.586f, 10.414f)
                curveTo(5.211f, 10.039f, 5f, 9.53f, 5f, 9f)
                curveTo(5f, 8.47f, 5.211f, 7.961f, 5.586f, 7.586f)
                curveTo(5.961f, 7.211f, 6.47f, 7f, 7f, 7f)
            }
        }.build()

        return _IceCream!!
    }

@Suppress("ObjectPropertyName")
private var _IceCream: ImageVector? = null
