package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Egg: ImageVector
    get() {
        if (_Egg != null) {
            return _Egg!!
        }
        _Egg = ImageVector.Builder(
            name = "Egg",
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
                moveTo(12f, 22f)
                curveTo(18.23f, 21.95f, 19.87f, 16.43f, 19.5f, 12f)
                curveTo(19.14f, 7.66f, 15.55f, 2.04f, 12f, 2f)
                curveTo(8.45f, 2.04f, 4.86f, 7.66f, 4.5f, 12f)
                curveTo(4.13f, 16.43f, 5.77f, 21.95f, 12f, 22f)
                close()
            }
        }.build()

        return _Egg!!
    }

@Suppress("ObjectPropertyName")
private var _Egg: ImageVector? = null
