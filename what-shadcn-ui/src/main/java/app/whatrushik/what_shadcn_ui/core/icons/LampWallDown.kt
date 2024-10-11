package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.LampWallDown: ImageVector
    get() {
        if (_LampWallDown != null) {
            return _LampWallDown!!
        }
        _LampWallDown = ImageVector.Builder(
            name = "LampWallDown",
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
                moveTo(11f, 13f)
                horizontalLineTo(17f)
                lineTo(20f, 20f)
                horizontalLineTo(8f)
                lineTo(11f, 13f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 13f)
                verticalLineTo(8f)
                curveTo(14f, 7.47f, 13.789f, 6.961f, 13.414f, 6.586f)
                curveTo(13.039f, 6.211f, 12.53f, 6f, 12f, 6f)
                horizontalLineTo(8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 9f)
                horizontalLineTo(6f)
                curveTo(6.53f, 9f, 7.039f, 8.789f, 7.414f, 8.414f)
                curveTo(7.789f, 8.039f, 8f, 7.53f, 8f, 7f)
                verticalLineTo(5f)
                curveTo(8f, 4.47f, 7.789f, 3.961f, 7.414f, 3.586f)
                curveTo(7.039f, 3.211f, 6.53f, 3f, 6f, 3f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _LampWallDown!!
    }

@Suppress("ObjectPropertyName")
private var _LampWallDown: ImageVector? = null
