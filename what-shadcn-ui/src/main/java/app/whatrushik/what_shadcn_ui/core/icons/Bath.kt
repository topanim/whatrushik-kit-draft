package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Bath: ImageVector
    get() {
        if (_Bath != null) {
            return _Bath!!
        }
        _Bath = ImageVector.Builder(
            name = "Bath",
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
                moveTo(9f, 6f)
                lineTo(6.5f, 3.5f)
                curveTo(6.244f, 3.211f, 5.885f, 3.032f, 5.5f, 3f)
                curveTo(4.683f, 3f, 4f, 3.683f, 4f, 4.5f)
                verticalLineTo(17f)
                curveTo(4f, 17.53f, 4.211f, 18.039f, 4.586f, 18.414f)
                curveTo(4.961f, 18.789f, 5.47f, 19f, 6f, 19f)
                horizontalLineTo(18f)
                curveTo(18.53f, 19f, 19.039f, 18.789f, 19.414f, 18.414f)
                curveTo(19.789f, 18.039f, 20f, 17.53f, 20f, 17f)
                verticalLineTo(12f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 5f)
                lineTo(8f, 7f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 12f)
                horizontalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 19f)
                verticalLineTo(21f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 19f)
                verticalLineTo(21f)
            }
        }.build()

        return _Bath!!
    }

@Suppress("ObjectPropertyName")
private var _Bath: ImageVector? = null
