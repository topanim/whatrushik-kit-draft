package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Bean: ImageVector
    get() {
        if (_Bean != null) {
            return _Bean!!
        }
        _Bean = ImageVector.Builder(
            name = "Bean",
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
                moveTo(10.165f, 6.598f)
                curveTo(9.954f, 7.478f, 9.64f, 8.36f, 9f, 9f)
                curveTo(8.36f, 9.64f, 7.479f, 9.954f, 6.598f, 10.165f)
                curveTo(5.169f, 10.507f, 3.914f, 11.363f, 3.074f, 12.568f)
                curveTo(2.233f, 13.774f, 1.864f, 15.246f, 2.037f, 16.706f)
                curveTo(2.21f, 18.166f, 2.913f, 19.511f, 4.012f, 20.487f)
                curveTo(5.111f, 21.463f, 6.53f, 22.001f, 8f, 22f)
                curveTo(15.732f, 22f, 22f, 15.732f, 22f, 8f)
                curveTo(22.001f, 6.53f, 21.463f, 5.111f, 20.487f, 4.012f)
                curveTo(19.511f, 2.913f, 18.166f, 2.21f, 16.706f, 2.037f)
                curveTo(15.246f, 1.864f, 13.774f, 2.233f, 12.568f, 3.074f)
                curveTo(11.362f, 3.915f, 10.507f, 5.169f, 10.165f, 6.598f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.341f, 10.62f)
                curveTo(5.605f, 11.213f, 6.009f, 11.733f, 6.518f, 12.136f)
                curveTo(7.028f, 12.538f, 7.628f, 12.81f, 8.266f, 12.929f)
                curveTo(8.904f, 13.047f, 9.562f, 13.008f, 10.182f, 12.816f)
                curveTo(10.802f, 12.623f, 11.366f, 12.283f, 11.825f, 11.824f)
                curveTo(12.284f, 11.365f, 12.624f, 10.801f, 12.817f, 10.181f)
                curveTo(13.009f, 9.561f, 13.048f, 8.903f, 12.929f, 8.265f)
                curveTo(12.81f, 7.626f, 12.538f, 7.027f, 12.136f, 6.517f)
                curveTo(11.733f, 6.008f, 11.213f, 5.604f, 10.62f, 5.34f)
            }
        }.build()

        return _Bean!!
    }

@Suppress("ObjectPropertyName")
private var _Bean: ImageVector? = null
