package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Cloudy: ImageVector
    get() {
        if (_Cloudy != null) {
            return _Cloudy!!
        }
        _Cloudy = ImageVector.Builder(
            name = "Cloudy",
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
                moveTo(17.5f, 21f)
                horizontalLineTo(9f)
                curveTo(7.702f, 21f, 6.429f, 20.638f, 5.325f, 19.956f)
                curveTo(4.22f, 19.275f, 3.327f, 18.299f, 2.745f, 17.139f)
                curveTo(2.163f, 15.978f, 1.915f, 14.679f, 2.029f, 13.386f)
                curveTo(2.143f, 12.093f, 2.614f, 10.857f, 3.39f, 9.816f)
                curveTo(4.166f, 8.775f, 5.216f, 7.971f, 6.423f, 7.492f)
                curveTo(7.629f, 7.014f, 8.945f, 6.881f, 10.224f, 7.107f)
                curveTo(11.502f, 7.334f, 12.692f, 7.912f, 13.661f, 8.776f)
                curveTo(14.63f, 9.64f, 15.339f, 10.756f, 15.71f, 12f)
                horizontalLineTo(17.5f)
                curveTo(18.091f, 12f, 18.676f, 12.116f, 19.222f, 12.342f)
                curveTo(19.768f, 12.569f, 20.264f, 12.9f, 20.682f, 13.318f)
                curveTo(21.1f, 13.736f, 21.431f, 14.232f, 21.657f, 14.778f)
                curveTo(21.884f, 15.324f, 22f, 15.909f, 22f, 16.5f)
                curveTo(22f, 17.091f, 21.884f, 17.676f, 21.657f, 18.222f)
                curveTo(21.431f, 18.768f, 21.1f, 19.264f, 20.682f, 19.682f)
                curveTo(20.264f, 20.1f, 19.768f, 20.431f, 19.222f, 20.657f)
                curveTo(18.676f, 20.884f, 18.091f, 21f, 17.5f, 21f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 10f)
                curveTo(22f, 9.204f, 21.684f, 8.441f, 21.121f, 7.879f)
                curveTo(20.559f, 7.316f, 19.796f, 7f, 19f, 7f)
                horizontalLineTo(16.793f)
                curveTo(16.454f, 5.806f, 15.721f, 4.762f, 14.714f, 4.038f)
                curveTo(13.706f, 3.313f, 12.483f, 2.95f, 11.244f, 3.008f)
                curveTo(10.004f, 3.066f, 8.821f, 3.541f, 7.885f, 4.357f)
                curveTo(6.95f, 5.172f, 6.317f, 6.28f, 6.091f, 7.5f)
            }
        }.build()

        return _Cloudy!!
    }

@Suppress("ObjectPropertyName")
private var _Cloudy: ImageVector? = null
