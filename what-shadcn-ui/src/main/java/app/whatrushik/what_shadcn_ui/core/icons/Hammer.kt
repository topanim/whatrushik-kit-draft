package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val SHUIIcons.Hammer: ImageVector
    get() {
        if (_Hammer != null) {
            return _Hammer!!
        }
        _Hammer = ImageVector.Builder(
            name = "Hammer",
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
                moveTo(15f, 12f)
                lineTo(6.5f, 20.5f)
                curveTo(5.67f, 21.33f, 4.33f, 21.33f, 3.5f, 20.5f)
                curveTo(3.303f, 20.303f, 3.147f, 20.069f, 3.04f, 19.812f)
                curveTo(2.933f, 19.555f, 2.878f, 19.279f, 2.878f, 19f)
                curveTo(2.878f, 18.721f, 2.933f, 18.445f, 3.04f, 18.188f)
                curveTo(3.147f, 17.931f, 3.303f, 17.697f, 3.5f, 17.5f)
                lineTo(12f, 9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.64f, 15f)
                lineTo(22f, 10.64f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.91f, 11.7f)
                lineTo(19.66f, 10.45f)
                curveTo(19.06f, 9.85f, 18.73f, 9.05f, 18.73f, 8.2f)
                verticalLineTo(7.34f)
                lineTo(16.01f, 4.6f)
                curveTo(15.494f, 4.081f, 14.88f, 3.668f, 14.204f, 3.387f)
                curveTo(13.528f, 3.105f, 12.802f, 2.96f, 12.07f, 2.96f)
                horizontalLineTo(9f)
                lineTo(9.92f, 3.78f)
                curveTo(10.573f, 4.359f, 11.097f, 5.071f, 11.455f, 5.867f)
                curveTo(11.814f, 6.663f, 11.999f, 7.527f, 12f, 8.4f)
                verticalLineTo(9.96f)
                lineTo(14f, 11.96f)
                horizontalLineTo(16.47f)
                lineTo(18.73f, 13.87f)
            }
        }.build()

        return _Hammer!!
    }

@Suppress("ObjectPropertyName")
private var _Hammer: ImageVector? = null
