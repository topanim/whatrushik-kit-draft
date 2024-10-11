package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Gavel: ImageVector
    get() {
        if (_Gavel != null) {
            return _Gavel!!
        }
        _Gavel = ImageVector.Builder(
            name = "Gavel",
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
                moveTo(14f, 13f)
                lineTo(6.5f, 20.5f)
                curveTo(5.67f, 21.33f, 4.33f, 21.33f, 3.5f, 20.5f)
                curveTo(3.303f, 20.303f, 3.147f, 20.069f, 3.04f, 19.812f)
                curveTo(2.933f, 19.555f, 2.878f, 19.279f, 2.878f, 19f)
                curveTo(2.878f, 18.721f, 2.933f, 18.445f, 3.04f, 18.188f)
                curveTo(3.147f, 17.931f, 3.303f, 17.697f, 3.5f, 17.5f)
                lineTo(11f, 10f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 16f)
                lineTo(22f, 10f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 8f)
                lineTo(14f, 2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 7f)
                lineTo(17f, 15f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 11f)
                lineTo(13f, 3f)
            }
        }.build()

        return _Gavel!!
    }

@Suppress("ObjectPropertyName")
private var _Gavel: ImageVector? = null
