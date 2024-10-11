package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.LampWallUp: ImageVector
    get() {
        if (_LampWallUp != null) {
            return _LampWallUp!!
        }
        _LampWallUp = ImageVector.Builder(
            name = "LampWallUp",
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
                moveTo(11f, 4f)
                horizontalLineTo(17f)
                lineTo(20f, 11f)
                horizontalLineTo(8f)
                lineTo(11f, 4f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 11f)
                verticalLineTo(16f)
                curveTo(14f, 16.53f, 13.789f, 17.039f, 13.414f, 17.414f)
                curveTo(13.039f, 17.789f, 12.53f, 18f, 12f, 18f)
                horizontalLineTo(8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 15f)
                horizontalLineTo(6f)
                curveTo(6.53f, 15f, 7.039f, 15.211f, 7.414f, 15.586f)
                curveTo(7.789f, 15.961f, 8f, 16.47f, 8f, 17f)
                verticalLineTo(19f)
                curveTo(8f, 19.53f, 7.789f, 20.039f, 7.414f, 20.414f)
                curveTo(7.039f, 20.789f, 6.53f, 21f, 6f, 21f)
                horizontalLineTo(4f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _LampWallUp!!
    }

@Suppress("ObjectPropertyName")
private var _LampWallUp: ImageVector? = null
