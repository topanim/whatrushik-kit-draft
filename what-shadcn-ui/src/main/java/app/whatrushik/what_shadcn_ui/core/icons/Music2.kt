package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Music2: ImageVector
    get() {
        if (_Music2 != null) {
            return _Music2!!
        }
        _Music2 = ImageVector.Builder(
            name = "Music2",
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
                moveTo(8f, 22f)
                curveTo(10.209f, 22f, 12f, 20.209f, 12f, 18f)
                curveTo(12f, 15.791f, 10.209f, 14f, 8f, 14f)
                curveTo(5.791f, 14f, 4f, 15.791f, 4f, 18f)
                curveTo(4f, 20.209f, 5.791f, 22f, 8f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 18f)
                verticalLineTo(2f)
                lineTo(19f, 6f)
            }
        }.build()

        return _Music2!!
    }

@Suppress("ObjectPropertyName")
private var _Music2: ImageVector? = null
