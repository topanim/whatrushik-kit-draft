package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Twitter: ImageVector
    get() {
        if (_Twitter != null) {
            return _Twitter!!
        }
        _Twitter = ImageVector.Builder(
            name = "Twitter",
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
                moveTo(22f, 4f)
                curveTo(22f, 4f, 21.3f, 6.1f, 20f, 7.4f)
                curveTo(21.6f, 17.4f, 10.6f, 24.7f, 2f, 19f)
                curveTo(4.2f, 19.1f, 6.4f, 18.4f, 8f, 17f)
                curveTo(3f, 15.5f, 0.5f, 9.6f, 3f, 5f)
                curveTo(5.2f, 7.6f, 8.6f, 9.1f, 12f, 9f)
                curveTo(11.1f, 4.8f, 16f, 2.4f, 19f, 5.2f)
                curveTo(20.1f, 5.2f, 22f, 4f, 22f, 4f)
                close()
            }
        }.build()

        return _Twitter!!
    }

@Suppress("ObjectPropertyName")
private var _Twitter: ImageVector? = null
