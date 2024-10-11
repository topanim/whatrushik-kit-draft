package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Droplet: ImageVector
    get() {
        if (_Droplet != null) {
            return _Droplet!!
        }
        _Droplet = ImageVector.Builder(
            name = "Droplet",
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
                moveTo(12f, 22f)
                curveTo(13.856f, 22f, 15.637f, 21.263f, 16.95f, 19.95f)
                curveTo(18.263f, 18.637f, 19f, 16.857f, 19f, 15f)
                curveTo(19f, 13f, 18f, 11.1f, 16f, 9.5f)
                curveTo(14f, 7.9f, 12.5f, 5.5f, 12f, 3f)
                curveTo(11.5f, 5.5f, 10f, 7.9f, 8f, 9.5f)
                curveTo(6f, 11.1f, 5f, 13f, 5f, 15f)
                curveTo(5f, 16.857f, 5.738f, 18.637f, 7.05f, 19.95f)
                curveTo(8.363f, 21.263f, 10.144f, 22f, 12f, 22f)
                close()
            }
        }.build()

        return _Droplet!!
    }

@Suppress("ObjectPropertyName")
private var _Droplet: ImageVector? = null
