package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.MapPin: ImageVector
    get() {
        if (_MapPin != null) {
            return _MapPin!!
        }
        _MapPin = ImageVector.Builder(
            name = "MapPin",
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
                moveTo(20f, 10f)
                curveTo(20f, 16f, 12f, 22f, 12f, 22f)
                curveTo(12f, 22f, 4f, 16f, 4f, 10f)
                curveTo(4f, 7.878f, 4.843f, 5.843f, 6.343f, 4.343f)
                curveTo(7.843f, 2.843f, 9.878f, 2f, 12f, 2f)
                curveTo(14.122f, 2f, 16.157f, 2.843f, 17.657f, 4.343f)
                curveTo(19.157f, 5.843f, 20f, 7.878f, 20f, 10f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 13f)
                curveTo(13.657f, 13f, 15f, 11.657f, 15f, 10f)
                curveTo(15f, 8.343f, 13.657f, 7f, 12f, 7f)
                curveTo(10.343f, 7f, 9f, 8.343f, 9f, 10f)
                curveTo(9f, 11.657f, 10.343f, 13f, 12f, 13f)
                close()
            }
        }.build()

        return _MapPin!!
    }

@Suppress("ObjectPropertyName")
private var _MapPin: ImageVector? = null
