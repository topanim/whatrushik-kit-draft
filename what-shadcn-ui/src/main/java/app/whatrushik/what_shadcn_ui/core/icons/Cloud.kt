package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Cloud: ImageVector
    get() {
        if (_Cloud != null) {
            return _Cloud!!
        }
        _Cloud = ImageVector.Builder(
            name = "Cloud",
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
                moveTo(17.5f, 19f)
                horizontalLineTo(9f)
                curveTo(7.702f, 19f, 6.429f, 18.638f, 5.325f, 17.956f)
                curveTo(4.22f, 17.275f, 3.327f, 16.299f, 2.745f, 15.139f)
                curveTo(2.163f, 13.978f, 1.915f, 12.679f, 2.029f, 11.386f)
                curveTo(2.143f, 10.093f, 2.614f, 8.857f, 3.39f, 7.816f)
                curveTo(4.166f, 6.775f, 5.216f, 5.971f, 6.423f, 5.492f)
                curveTo(7.629f, 5.014f, 8.945f, 4.881f, 10.224f, 5.107f)
                curveTo(11.502f, 5.334f, 12.692f, 5.912f, 13.661f, 6.776f)
                curveTo(14.63f, 7.64f, 15.339f, 8.756f, 15.71f, 10f)
                horizontalLineTo(17.5f)
                curveTo(18.694f, 10f, 19.838f, 10.474f, 20.682f, 11.318f)
                curveTo(21.526f, 12.162f, 22f, 13.307f, 22f, 14.5f)
                curveTo(22f, 15.693f, 21.526f, 16.838f, 20.682f, 17.682f)
                curveTo(19.838f, 18.526f, 18.694f, 19f, 17.5f, 19f)
                close()
            }
        }.build()

        return _Cloud!!
    }

@Suppress("ObjectPropertyName")
private var _Cloud: ImageVector? = null
