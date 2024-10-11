package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val SHUIIcons.Subscript: ImageVector
    get() {
        if (_Subscript != null) {
            return _Subscript!!
        }
        _Subscript = ImageVector.Builder(
            name = "Subscript",
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
                moveTo(4f, 5f)
                lineTo(12f, 13f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 5f)
                lineTo(4f, 13f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 19f)
                horizontalLineTo(16f)
                curveTo(16f, 17.5f, 16.44f, 17f, 17.5f, 16.5f)
                curveTo(18.56f, 16f, 20f, 15.33f, 20f, 14f)
                curveTo(20f, 13.53f, 19.83f, 13.07f, 19.52f, 12.71f)
                curveTo(19.2f, 12.348f, 18.765f, 12.106f, 18.288f, 12.026f)
                curveTo(17.811f, 11.946f, 17.321f, 12.032f, 16.9f, 12.27f)
                curveTo(16.48f, 12.51f, 16.16f, 12.89f, 16f, 13.34f)
            }
        }.build()

        return _Subscript!!
    }

@Suppress("ObjectPropertyName")
private var _Subscript: ImageVector? = null
