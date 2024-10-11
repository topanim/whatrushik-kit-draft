package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Umbrella: ImageVector
    get() {
        if (_Umbrella != null) {
            return _Umbrella!!
        }
        _Umbrella = ImageVector.Builder(
            name = "Umbrella",
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
                moveTo(22f, 12f)
                curveTo(21.759f, 9.534f, 20.603f, 7.247f, 18.76f, 5.59f)
                curveTo(16.903f, 3.923f, 14.495f, 3.001f, 12f, 3.001f)
                curveTo(9.505f, 3.001f, 7.097f, 3.923f, 5.24f, 5.59f)
                curveTo(3.397f, 7.247f, 2.241f, 9.534f, 2f, 12f)
                horizontalLineTo(22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                verticalLineTo(20f)
                curveTo(12f, 20.53f, 12.211f, 21.039f, 12.586f, 21.414f)
                curveTo(12.961f, 21.789f, 13.47f, 22f, 14f, 22f)
                curveTo(14.53f, 22f, 15.039f, 21.789f, 15.414f, 21.414f)
                curveTo(15.789f, 21.039f, 16f, 20.53f, 16f, 20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 2f)
                verticalLineTo(3f)
            }
        }.build()

        return _Umbrella!!
    }

@Suppress("ObjectPropertyName")
private var _Umbrella: ImageVector? = null
