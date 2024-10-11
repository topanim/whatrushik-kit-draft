package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.ThumbsUp: ImageVector
    get() {
        if (_ThumbsUp != null) {
            return _ThumbsUp!!
        }
        _ThumbsUp = ImageVector.Builder(
            name = "ThumbsUp",
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
                moveTo(7f, 10f)
                verticalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 5.88f)
                lineTo(14f, 10f)
                horizontalLineTo(19.83f)
                curveTo(20.14f, 10f, 20.447f, 10.072f, 20.724f, 10.211f)
                curveTo(21.002f, 10.35f, 21.244f, 10.552f, 21.43f, 10.8f)
                curveTo(21.616f, 11.048f, 21.742f, 11.337f, 21.798f, 11.642f)
                curveTo(21.853f, 11.948f, 21.837f, 12.262f, 21.75f, 12.56f)
                lineTo(19.42f, 20.56f)
                curveTo(19.299f, 20.975f, 19.046f, 21.34f, 18.7f, 21.6f)
                curveTo(18.354f, 21.86f, 17.933f, 22f, 17.5f, 22f)
                horizontalLineTo(4f)
                curveTo(3.47f, 22f, 2.961f, 21.789f, 2.586f, 21.414f)
                curveTo(2.211f, 21.039f, 2f, 20.53f, 2f, 20f)
                verticalLineTo(12f)
                curveTo(2f, 11.47f, 2.211f, 10.961f, 2.586f, 10.586f)
                curveTo(2.961f, 10.211f, 3.47f, 10f, 4f, 10f)
                horizontalLineTo(6.76f)
                curveTo(7.132f, 10f, 7.497f, 9.896f, 7.813f, 9.7f)
                curveTo(8.129f, 9.504f, 8.384f, 9.223f, 8.55f, 8.89f)
                lineTo(12f, 2f)
                curveTo(12.472f, 2.006f, 12.936f, 2.118f, 13.358f, 2.329f)
                curveTo(13.78f, 2.539f, 14.149f, 2.842f, 14.437f, 3.215f)
                curveTo(14.726f, 3.588f, 14.926f, 4.022f, 15.024f, 4.483f)
                curveTo(15.121f, 4.945f, 15.113f, 5.422f, 15f, 5.88f)
                close()
            }
        }.build()

        return _ThumbsUp!!
    }

@Suppress("ObjectPropertyName")
private var _ThumbsUp: ImageVector? = null
