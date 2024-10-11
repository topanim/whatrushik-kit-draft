package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Archive: ImageVector
    get() {
        if (_Archive != null) {
            return _Archive!!
        }
        _Archive = ImageVector.Builder(
            name = "Archive",
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
                moveTo(20f, 4f)
                horizontalLineTo(4f)
                curveTo(2.895f, 4f, 2f, 4.895f, 2f, 6f)
                verticalLineTo(7f)
                curveTo(2f, 8.105f, 2.895f, 9f, 4f, 9f)
                horizontalLineTo(20f)
                curveTo(21.105f, 9f, 22f, 8.105f, 22f, 7f)
                verticalLineTo(6f)
                curveTo(22f, 4.895f, 21.105f, 4f, 20f, 4f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 9f)
                verticalLineTo(18f)
                curveTo(4f, 18.53f, 4.211f, 19.039f, 4.586f, 19.414f)
                curveTo(4.961f, 19.789f, 5.47f, 20f, 6f, 20f)
                horizontalLineTo(18f)
                curveTo(18.53f, 20f, 19.039f, 19.789f, 19.414f, 19.414f)
                curveTo(19.789f, 19.039f, 20f, 18.53f, 20f, 18f)
                verticalLineTo(9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 13f)
                horizontalLineTo(14f)
            }
        }.build()

        return _Archive!!
    }

@Suppress("ObjectPropertyName")
private var _Archive: ImageVector? = null
