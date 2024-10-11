package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Beaker: ImageVector
    get() {
        if (_Beaker != null) {
            return _Beaker!!
        }
        _Beaker = ImageVector.Builder(
            name = "Beaker",
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
                moveTo(4.5f, 3f)
                horizontalLineTo(19.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 3f)
                verticalLineTo(19f)
                curveTo(6f, 19.53f, 6.211f, 20.039f, 6.586f, 20.414f)
                curveTo(6.961f, 20.789f, 7.47f, 21f, 8f, 21f)
                horizontalLineTo(16f)
                curveTo(16.53f, 21f, 17.039f, 20.789f, 17.414f, 20.414f)
                curveTo(17.789f, 20.039f, 18f, 19.53f, 18f, 19f)
                verticalLineTo(3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 14f)
                horizontalLineTo(18f)
            }
        }.build()

        return _Beaker!!
    }

@Suppress("ObjectPropertyName")
private var _Beaker: ImageVector? = null
