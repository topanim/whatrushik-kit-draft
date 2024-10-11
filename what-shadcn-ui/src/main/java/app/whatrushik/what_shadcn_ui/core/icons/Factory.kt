package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Factory: ImageVector
    get() {
        if (_Factory != null) {
            return _Factory!!
        }
        _Factory = ImageVector.Builder(
            name = "Factory",
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
                moveTo(2f, 20f)
                curveTo(2f, 20.53f, 2.211f, 21.039f, 2.586f, 21.414f)
                curveTo(2.961f, 21.789f, 3.47f, 22f, 4f, 22f)
                horizontalLineTo(20f)
                curveTo(20.53f, 22f, 21.039f, 21.789f, 21.414f, 21.414f)
                curveTo(21.789f, 21.039f, 22f, 20.53f, 22f, 20f)
                verticalLineTo(8f)
                lineTo(15f, 13f)
                verticalLineTo(8f)
                lineTo(8f, 13f)
                verticalLineTo(4f)
                curveTo(8f, 3.47f, 7.789f, 2.961f, 7.414f, 2.586f)
                curveTo(7.039f, 2.211f, 6.53f, 2f, 6f, 2f)
                horizontalLineTo(4f)
                curveTo(3.47f, 2f, 2.961f, 2.211f, 2.586f, 2.586f)
                curveTo(2.211f, 2.961f, 2f, 3.47f, 2f, 4f)
                verticalLineTo(20f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 18f)
                horizontalLineTo(18f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 18f)
                horizontalLineTo(13f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 18f)
                horizontalLineTo(8f)
            }
        }.build()

        return _Factory!!
    }

@Suppress("ObjectPropertyName")
private var _Factory: ImageVector? = null
