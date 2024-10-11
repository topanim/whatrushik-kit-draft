package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Droplets: ImageVector
    get() {
        if (_Droplets != null) {
            return _Droplets!!
        }
        _Droplets = ImageVector.Builder(
            name = "Droplets",
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
                moveTo(7f, 16.3f)
                curveTo(9.2f, 16.3f, 11f, 14.47f, 11f, 12.25f)
                curveTo(11f, 11.09f, 10.43f, 9.99f, 9.29f, 9.06f)
                curveTo(8.15f, 8.13f, 7.29f, 6.75f, 7f, 5.3f)
                curveTo(6.71f, 6.75f, 5.86f, 8.14f, 4.71f, 9.06f)
                curveTo(3.56f, 9.98f, 3f, 11.1f, 3f, 12.25f)
                curveTo(3f, 14.47f, 4.8f, 16.3f, 7f, 16.3f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.56f, 6.6f)
                curveTo(13.248f, 5.501f, 13.735f, 4.289f, 14f, 3.02f)
                curveTo(14.5f, 5.52f, 16f, 7.92f, 18f, 9.52f)
                curveTo(20f, 11.12f, 21f, 13.02f, 21f, 15.02f)
                curveTo(21.006f, 16.402f, 20.601f, 17.755f, 19.837f, 18.907f)
                curveTo(19.073f, 20.059f, 17.984f, 20.958f, 16.708f, 21.49f)
                curveTo(15.432f, 22.023f, 14.027f, 22.164f, 12.671f, 21.897f)
                curveTo(11.315f, 21.63f, 10.068f, 20.966f, 9.09f, 19.99f)
            }
        }.build()

        return _Droplets!!
    }

@Suppress("ObjectPropertyName")
private var _Droplets: ImageVector? = null
