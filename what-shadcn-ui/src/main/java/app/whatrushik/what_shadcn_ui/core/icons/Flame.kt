package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Flame: ImageVector
    get() {
        if (_Flame != null) {
            return _Flame!!
        }
        _Flame = ImageVector.Builder(
            name = "Flame",
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
                moveTo(8.5f, 14.5f)
                curveTo(9.163f, 14.5f, 9.799f, 14.237f, 10.268f, 13.768f)
                curveTo(10.737f, 13.299f, 11f, 12.663f, 11f, 12f)
                curveTo(11f, 10.62f, 10.5f, 10f, 10f, 9f)
                curveTo(8.928f, 6.857f, 9.776f, 4.946f, 12f, 3f)
                curveTo(12.5f, 5.5f, 14f, 7.9f, 16f, 9.5f)
                curveTo(18f, 11.1f, 19f, 13f, 19f, 15f)
                curveTo(19f, 15.919f, 18.819f, 16.83f, 18.467f, 17.679f)
                curveTo(18.115f, 18.528f, 17.6f, 19.3f, 16.95f, 19.95f)
                curveTo(16.3f, 20.6f, 15.528f, 21.115f, 14.679f, 21.467f)
                curveTo(13.83f, 21.819f, 12.919f, 22f, 12f, 22f)
                curveTo(11.081f, 22f, 10.17f, 21.819f, 9.321f, 21.467f)
                curveTo(8.472f, 21.115f, 7.7f, 20.6f, 7.05f, 19.95f)
                curveTo(6.4f, 19.3f, 5.885f, 18.528f, 5.533f, 17.679f)
                curveTo(5.181f, 16.83f, 5f, 15.919f, 5f, 15f)
                curveTo(5f, 13.847f, 5.433f, 12.706f, 6f, 12f)
                curveTo(6f, 12.663f, 6.263f, 13.299f, 6.732f, 13.768f)
                curveTo(7.201f, 14.237f, 7.837f, 14.5f, 8.5f, 14.5f)
                close()
            }
        }.build()

        return _Flame!!
    }

@Suppress("ObjectPropertyName")
private var _Flame: ImageVector? = null
