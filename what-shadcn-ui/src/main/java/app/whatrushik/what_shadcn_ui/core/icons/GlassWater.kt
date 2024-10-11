package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.GlassWater: ImageVector
    get() {
        if (_GlassWater != null) {
            return _GlassWater!!
        }
        _GlassWater = ImageVector.Builder(
            name = "GlassWater",
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
                moveTo(15.2f, 22f)
                horizontalLineTo(8.8f)
                curveTo(8.304f, 22.003f, 7.825f, 21.821f, 7.455f, 21.49f)
                curveTo(7.086f, 21.16f, 6.852f, 20.703f, 6.8f, 20.21f)
                lineTo(5f, 3f)
                horizontalLineTo(19f)
                lineTo(17.19f, 20.21f)
                curveTo(17.138f, 20.701f, 16.906f, 21.156f, 16.539f, 21.487f)
                curveTo(16.171f, 21.817f, 15.694f, 22f, 15.2f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 12f)
                curveTo(6.865f, 11.351f, 7.918f, 11f, 9f, 11f)
                curveTo(10.082f, 11f, 11.134f, 11.351f, 12f, 12f)
                curveTo(12.866f, 12.649f, 13.918f, 13f, 15f, 13f)
                curveTo(16.082f, 13f, 17.135f, 12.649f, 18f, 12f)
            }
        }.build()

        return _GlassWater!!
    }

@Suppress("ObjectPropertyName")
private var _GlassWater: ImageVector? = null
