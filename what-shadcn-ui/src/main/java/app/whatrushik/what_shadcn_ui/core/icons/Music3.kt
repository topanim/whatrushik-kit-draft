package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Music3: ImageVector
    get() {
        if (_Music3 != null) {
            return _Music3!!
        }
        _Music3 = ImageVector.Builder(
            name = "Music3",
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
                curveTo(14.209f, 22f, 16f, 20.209f, 16f, 18f)
                curveTo(16f, 15.791f, 14.209f, 14f, 12f, 14f)
                curveTo(9.791f, 14f, 8f, 15.791f, 8f, 18f)
                curveTo(8f, 20.209f, 9.791f, 22f, 12f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 18f)
                verticalLineTo(2f)
            }
        }.build()

        return _Music3!!
    }

@Suppress("ObjectPropertyName")
private var _Music3: ImageVector? = null
