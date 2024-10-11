package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Waves: ImageVector
    get() {
        if (_Waves != null) {
            return _Waves!!
        }
        _Waves = ImageVector.Builder(
            name = "Waves",
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
                moveTo(2f, 6f)
                curveTo(2.6f, 6.5f, 3.2f, 7f, 4.5f, 7f)
                curveTo(7f, 7f, 7f, 5f, 9.5f, 5f)
                curveTo(12.1f, 5f, 11.9f, 7f, 14.5f, 7f)
                curveTo(17f, 7f, 17f, 5f, 19.5f, 5f)
                curveTo(20.8f, 5f, 21.4f, 5.5f, 22f, 6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 12f)
                curveTo(2.6f, 12.5f, 3.2f, 13f, 4.5f, 13f)
                curveTo(7f, 13f, 7f, 11f, 9.5f, 11f)
                curveTo(12.1f, 11f, 11.9f, 13f, 14.5f, 13f)
                curveTo(17f, 13f, 17f, 11f, 19.5f, 11f)
                curveTo(20.8f, 11f, 21.4f, 11.5f, 22f, 12f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 18f)
                curveTo(2.6f, 18.5f, 3.2f, 19f, 4.5f, 19f)
                curveTo(7f, 19f, 7f, 17f, 9.5f, 17f)
                curveTo(12.1f, 17f, 11.9f, 19f, 14.5f, 19f)
                curveTo(17f, 19f, 17f, 17f, 19.5f, 17f)
                curveTo(20.8f, 17f, 21.4f, 17.5f, 22f, 18f)
            }
        }.build()

        return _Waves!!
    }

@Suppress("ObjectPropertyName")
private var _Waves: ImageVector? = null
