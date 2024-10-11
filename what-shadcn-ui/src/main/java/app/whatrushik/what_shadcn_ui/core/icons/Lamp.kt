package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Lamp: ImageVector
    get() {
        if (_Lamp != null) {
            return _Lamp!!
        }
        _Lamp = ImageVector.Builder(
            name = "Lamp",
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
                moveTo(8f, 2f)
                horizontalLineTo(16f)
                lineTo(20f, 12f)
                horizontalLineTo(4f)
                lineTo(8f, 2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                verticalLineTo(18f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 22f)
                verticalLineTo(20f)
                curveTo(8f, 18.9f, 8.9f, 18f, 10f, 18f)
                horizontalLineTo(14f)
                curveTo(14.53f, 18f, 15.039f, 18.211f, 15.414f, 18.586f)
                curveTo(15.789f, 18.961f, 16f, 19.47f, 16f, 20f)
                verticalLineTo(22f)
                horizontalLineTo(8f)
                close()
            }
        }.build()

        return _Lamp!!
    }

@Suppress("ObjectPropertyName")
private var _Lamp: ImageVector? = null
