package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val SHUIIcons.Brush: ImageVector
    get() {
        if (_Brush != null) {
            return _Brush!!
        }
        _Brush = ImageVector.Builder(
            name = "Brush",
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
                moveTo(9.06f, 11.9f)
                lineTo(17.13f, 3.84f)
                curveTo(17.393f, 3.568f, 17.708f, 3.352f, 18.055f, 3.203f)
                curveTo(18.403f, 3.054f, 18.776f, 2.976f, 19.154f, 2.973f)
                curveTo(19.532f, 2.97f, 19.907f, 3.042f, 20.257f, 3.186f)
                curveTo(20.607f, 3.329f, 20.925f, 3.54f, 21.192f, 3.808f)
                curveTo(21.46f, 4.075f, 21.671f, 4.393f, 21.814f, 4.743f)
                curveTo(21.958f, 5.093f, 22.03f, 5.468f, 22.027f, 5.846f)
                curveTo(22.024f, 6.224f, 21.946f, 6.597f, 21.797f, 6.945f)
                curveTo(21.648f, 7.292f, 21.432f, 7.607f, 21.16f, 7.87f)
                lineTo(13.1f, 15.95f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.07f, 14.94f)
                curveTo(5.41f, 14.94f, 4.07f, 16.29f, 4.07f, 17.96f)
                curveTo(4.07f, 19.29f, 1.57f, 19.48f, 2.07f, 19.98f)
                curveTo(3.15f, 21.08f, 4.56f, 22f, 6.07f, 22f)
                curveTo(8.27f, 22f, 10.07f, 20.2f, 10.07f, 17.96f)
                curveTo(10.071f, 17.565f, 9.995f, 17.173f, 9.845f, 16.807f)
                curveTo(9.695f, 16.442f, 9.474f, 16.109f, 9.195f, 15.829f)
                curveTo(8.917f, 15.548f, 8.586f, 15.325f, 8.221f, 15.173f)
                curveTo(7.856f, 15.021f, 7.465f, 14.941f, 7.07f, 14.94f)
                close()
            }
        }.build()

        return _Brush!!
    }

@Suppress("ObjectPropertyName")
private var _Brush: ImageVector? = null
