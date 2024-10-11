package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Banana: ImageVector
    get() {
        if (_Banana != null) {
            return _Banana!!
        }
        _Banana = ImageVector.Builder(
            name = "Banana",
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
                moveTo(4f, 13f)
                curveTo(7.5f, 11f, 12f, 11f, 14f, 15f)
                curveTo(14.846f, 14.568f, 15.79f, 14.363f, 16.739f, 14.404f)
                curveTo(17.688f, 14.445f, 18.61f, 14.731f, 19.416f, 15.234f)
                curveTo(20.222f, 15.738f, 20.883f, 16.442f, 21.336f, 17.277f)
                curveTo(21.789f, 18.112f, 22.017f, 19.05f, 22f, 20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.15f, 17.89f)
                curveTo(10.67f, 16.37f, 13.8f, 11f, 12.15f, 5.89f)
                curveTo(11.55f, 4f, 11.5f, 2f, 13f, 2f)
                curveTo(16.22f, 2f, 18f, 7.5f, 18f, 10f)
                curveTo(18f, 16.5f, 13.8f, 22f, 7.51f, 22f)
                curveTo(5.11f, 22f, 2f, 22f, 2f, 20f)
                curveTo(2f, 18.5f, 3.14f, 18.45f, 5.15f, 17.89f)
                close()
            }
        }.build()

        return _Banana!!
    }

@Suppress("ObjectPropertyName")
private var _Banana: ImageVector? = null
