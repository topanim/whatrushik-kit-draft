package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val SHUIIcons.Thermometer: ImageVector
    get() {
        if (_Thermometer != null) {
            return _Thermometer!!
        }
        _Thermometer = ImageVector.Builder(
            name = "Thermometer",
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
                moveTo(14f, 4f)
                verticalLineTo(14.54f)
                curveTo(14.763f, 14.98f, 15.359f, 15.66f, 15.696f, 16.473f)
                curveTo(16.032f, 17.287f, 16.092f, 18.189f, 15.864f, 19.039f)
                curveTo(15.636f, 19.89f, 15.134f, 20.642f, 14.435f, 21.177f)
                curveTo(13.736f, 21.714f, 12.88f, 22.004f, 12f, 22.004f)
                curveTo(11.12f, 22.004f, 10.264f, 21.714f, 9.565f, 21.177f)
                curveTo(8.866f, 20.642f, 8.364f, 19.89f, 8.136f, 19.039f)
                curveTo(7.908f, 18.189f, 7.968f, 17.287f, 8.304f, 16.473f)
                curveTo(8.641f, 15.66f, 9.237f, 14.98f, 10f, 14.54f)
                verticalLineTo(4f)
                curveTo(10f, 3.47f, 10.211f, 2.961f, 10.586f, 2.586f)
                curveTo(10.961f, 2.211f, 11.47f, 2f, 12f, 2f)
                curveTo(12.53f, 2f, 13.039f, 2.211f, 13.414f, 2.586f)
                curveTo(13.789f, 2.961f, 14f, 3.47f, 14f, 4f)
                close()
            }
        }.build()

        return _Thermometer!!
    }

@Suppress("ObjectPropertyName")
private var _Thermometer: ImageVector? = null
