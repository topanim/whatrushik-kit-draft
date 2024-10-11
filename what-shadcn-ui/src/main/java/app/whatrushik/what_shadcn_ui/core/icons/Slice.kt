package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Slice: ImageVector
    get() {
        if (_Slice != null) {
            return _Slice!!
        }
        _Slice = ImageVector.Builder(
            name = "Slice",
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
                moveTo(8f, 14f)
                lineTo(2f, 20f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.37f, 3.63f)
                lineTo(8f, 14f)
                lineTo(11f, 17f)
                lineTo(21.37f, 6.63f)
                curveTo(21.768f, 6.232f, 21.991f, 5.693f, 21.991f, 5.13f)
                curveTo(21.991f, 4.568f, 21.768f, 4.028f, 21.37f, 3.63f)
                curveTo(20.972f, 3.232f, 20.433f, 3.009f, 19.87f, 3.009f)
                curveTo(19.307f, 3.009f, 18.768f, 3.232f, 18.37f, 3.63f)
                close()
            }
        }.build()

        return _Slice!!
    }

@Suppress("ObjectPropertyName")
private var _Slice: ImageVector? = null
