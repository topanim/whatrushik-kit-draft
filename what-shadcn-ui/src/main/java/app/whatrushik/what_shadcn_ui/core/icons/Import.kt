package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val SHUIIcons.Import: ImageVector
    get() {
        if (_Import != null) {
            return _Import!!
        }
        _Import = ImageVector.Builder(
            name = "Import",
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
                moveTo(12f, 3f)
                verticalLineTo(15f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 11f)
                lineTo(12f, 15f)
                lineTo(16f, 11f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 5f)
                horizontalLineTo(4f)
                curveTo(3.47f, 5f, 2.961f, 5.211f, 2.586f, 5.586f)
                curveTo(2.211f, 5.961f, 2f, 6.47f, 2f, 7f)
                verticalLineTo(17f)
                curveTo(2f, 17.53f, 2.211f, 18.039f, 2.586f, 18.414f)
                curveTo(2.961f, 18.789f, 3.47f, 19f, 4f, 19f)
                horizontalLineTo(20f)
                curveTo(20.53f, 19f, 21.039f, 18.789f, 21.414f, 18.414f)
                curveTo(21.789f, 18.039f, 22f, 17.53f, 22f, 17f)
                verticalLineTo(7f)
                curveTo(22f, 6.47f, 21.789f, 5.961f, 21.414f, 5.586f)
                curveTo(21.039f, 5.211f, 20.53f, 5f, 20f, 5f)
                horizontalLineTo(16f)
            }
        }.build()

        return _Import!!
    }

@Suppress("ObjectPropertyName")
private var _Import: ImageVector? = null
