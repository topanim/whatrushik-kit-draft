package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.AlertTriangle: ImageVector
    get() {
        if (_AlertTriangle != null) {
            return _AlertTriangle!!
        }
        _AlertTriangle = ImageVector.Builder(
            name = "AlertTriangle",
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
                moveTo(21.73f, 18f)
                lineTo(13.73f, 4f)
                curveTo(13.556f, 3.692f, 13.303f, 3.436f, 12.997f, 3.258f)
                curveTo(12.691f, 3.08f, 12.344f, 2.986f, 11.99f, 2.986f)
                curveTo(11.636f, 2.986f, 11.289f, 3.08f, 10.983f, 3.258f)
                curveTo(10.677f, 3.436f, 10.425f, 3.692f, 10.25f, 4f)
                lineTo(2.25f, 18f)
                curveTo(2.074f, 18.305f, 1.981f, 18.652f, 1.982f, 19.004f)
                curveTo(1.983f, 19.357f, 2.077f, 19.703f, 2.254f, 20.008f)
                curveTo(2.432f, 20.312f, 2.687f, 20.565f, 2.994f, 20.739f)
                curveTo(3.3f, 20.913f, 3.647f, 21.003f, 4f, 21f)
                horizontalLineTo(20f)
                curveTo(20.351f, 21f, 20.696f, 20.907f, 20.999f, 20.731f)
                curveTo(21.303f, 20.556f, 21.555f, 20.303f, 21.731f, 19.999f)
                curveTo(21.906f, 19.695f, 21.998f, 19.35f, 21.998f, 19f)
                curveTo(21.998f, 18.649f, 21.906f, 18.304f, 21.73f, 18f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 9f)
                verticalLineTo(13f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 17f)
                horizontalLineTo(12.01f)
            }
        }.build()

        return _AlertTriangle!!
    }

@Suppress("ObjectPropertyName")
private var _AlertTriangle: ImageVector? = null
