package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Laptop: ImageVector
    get() {
        if (_Laptop != null) {
            return _Laptop!!
        }
        _Laptop = ImageVector.Builder(
            name = "Laptop",
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
                moveTo(20f, 16f)
                verticalLineTo(7f)
                curveTo(20f, 6.47f, 19.789f, 5.961f, 19.414f, 5.586f)
                curveTo(19.039f, 5.211f, 18.531f, 5f, 18f, 5f)
                horizontalLineTo(6f)
                curveTo(5.47f, 5f, 4.961f, 5.211f, 4.586f, 5.586f)
                curveTo(4.211f, 5.961f, 4f, 6.47f, 4f, 7f)
                verticalLineTo(16f)
                moveTo(20f, 16f)
                horizontalLineTo(4f)
                moveTo(20f, 16f)
                lineTo(21.28f, 18.55f)
                curveTo(21.357f, 18.703f, 21.394f, 18.873f, 21.386f, 19.044f)
                curveTo(21.378f, 19.215f, 21.327f, 19.382f, 21.237f, 19.527f)
                curveTo(21.146f, 19.673f, 21.02f, 19.793f, 20.87f, 19.876f)
                curveTo(20.72f, 19.958f, 20.551f, 20.001f, 20.38f, 20f)
                horizontalLineTo(3.62f)
                curveTo(3.449f, 20.001f, 3.28f, 19.958f, 3.13f, 19.876f)
                curveTo(2.98f, 19.793f, 2.854f, 19.673f, 2.763f, 19.527f)
                curveTo(2.673f, 19.382f, 2.622f, 19.215f, 2.614f, 19.044f)
                curveTo(2.606f, 18.873f, 2.643f, 18.703f, 2.72f, 18.55f)
                lineTo(4f, 16f)
            }
        }.build()

        return _Laptop!!
    }

@Suppress("ObjectPropertyName")
private var _Laptop: ImageVector? = null
