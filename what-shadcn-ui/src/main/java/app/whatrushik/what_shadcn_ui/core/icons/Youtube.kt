package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Youtube: ImageVector
    get() {
        if (_Youtube != null) {
            return _Youtube!!
        }
        _Youtube = ImageVector.Builder(
            name = "Youtube",
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
                moveTo(12f, 19f)
                curveTo(9.7f, 19f, 5.6f, 18.8f, 3.9f, 18.4f)
                curveTo(3.2f, 18.2f, 2.7f, 17.7f, 2.5f, 17f)
                curveTo(2.2f, 15.9f, 2f, 13.6f, 2f, 12f)
                curveTo(2f, 10.4f, 2.2f, 8.1f, 2.5f, 7f)
                curveTo(2.7f, 6.3f, 3.2f, 5.8f, 3.9f, 5.6f)
                curveTo(5.6f, 5.2f, 9.7f, 5f, 12f, 5f)
                curveTo(14.3f, 5f, 18.4f, 5.2f, 20.1f, 5.6f)
                curveTo(20.8f, 5.8f, 21.3f, 6.3f, 21.5f, 7f)
                curveTo(21.8f, 8.1f, 22f, 10.4f, 22f, 12f)
                curveTo(22f, 13.6f, 21.8f, 15.9f, 21.5f, 17f)
                curveTo(21.3f, 17.7f, 20.8f, 18.2f, 20.1f, 18.4f)
                curveTo(18.4f, 18.8f, 14.3f, 19f, 12f, 19f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 15f)
                lineTo(15f, 12f)
                lineTo(10f, 9f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _Youtube!!
    }

@Suppress("ObjectPropertyName")
private var _Youtube: ImageVector? = null
