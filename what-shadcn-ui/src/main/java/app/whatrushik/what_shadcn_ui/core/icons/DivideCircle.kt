package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.DivideCircle: ImageVector
    get() {
        if (_DivideCircle != null) {
            return _DivideCircle!!
        }
        _DivideCircle = ImageVector.Builder(
            name = "DivideCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(8f, 12f)
                    horizontalLineTo(16f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(12f, 22f)
                    curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                    curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                    curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                    curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                    close()
                }
            }
        }.build()

        return _DivideCircle!!
    }

@Suppress("ObjectPropertyName")
private var _DivideCircle: ImageVector? = null
