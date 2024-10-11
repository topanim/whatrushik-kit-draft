package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Flashlight: ImageVector
    get() {
        if (_Flashlight != null) {
            return _Flashlight!!
        }
        _Flashlight = ImageVector.Builder(
            name = "Flashlight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(18f, 6f)
                    curveTo(18f, 8f, 16f, 8f, 16f, 10f)
                    verticalLineTo(20f)
                    curveTo(16f, 20.53f, 15.789f, 21.039f, 15.414f, 21.414f)
                    curveTo(15.039f, 21.789f, 14.53f, 22f, 14f, 22f)
                    horizontalLineTo(10f)
                    curveTo(9.47f, 22f, 8.961f, 21.789f, 8.586f, 21.414f)
                    curveTo(8.211f, 21.039f, 8f, 20.53f, 8f, 20f)
                    verticalLineTo(10f)
                    curveTo(8f, 8f, 6f, 8f, 6f, 6f)
                    verticalLineTo(2f)
                    horizontalLineTo(18f)
                    verticalLineTo(6f)
                    close()
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(6f, 6f)
                    horizontalLineTo(18f)
                }
            }
        }.build()

        return _Flashlight!!
    }

@Suppress("ObjectPropertyName")
private var _Flashlight: ImageVector? = null
