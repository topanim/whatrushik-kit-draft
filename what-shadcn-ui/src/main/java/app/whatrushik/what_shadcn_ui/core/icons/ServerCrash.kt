package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.ServerCrash: ImageVector
    get() {
        if (_ServerCrash != null) {
            return _ServerCrash!!
        }
        _ServerCrash = ImageVector.Builder(
            name = "ServerCrash",
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
                moveTo(6f, 10f)
                horizontalLineTo(4f)
                curveTo(3.47f, 10f, 2.961f, 9.789f, 2.586f, 9.414f)
                curveTo(2.211f, 9.039f, 2f, 8.53f, 2f, 8f)
                verticalLineTo(4f)
                curveTo(2f, 3.47f, 2.211f, 2.961f, 2.586f, 2.586f)
                curveTo(2.961f, 2.211f, 3.47f, 2f, 4f, 2f)
                horizontalLineTo(20f)
                curveTo(20.53f, 2f, 21.039f, 2.211f, 21.414f, 2.586f)
                curveTo(21.789f, 2.961f, 22f, 3.47f, 22f, 4f)
                verticalLineTo(8f)
                curveTo(22f, 8.53f, 21.789f, 9.039f, 21.414f, 9.414f)
                curveTo(21.039f, 9.789f, 20.53f, 10f, 20f, 10f)
                horizontalLineTo(18f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 14f)
                horizontalLineTo(4f)
                curveTo(3.47f, 14f, 2.961f, 14.211f, 2.586f, 14.586f)
                curveTo(2.211f, 14.961f, 2f, 15.47f, 2f, 16f)
                verticalLineTo(20f)
                curveTo(2f, 20.53f, 2.211f, 21.039f, 2.586f, 21.414f)
                curveTo(2.961f, 21.789f, 3.47f, 22f, 4f, 22f)
                horizontalLineTo(20f)
                curveTo(20.53f, 22f, 21.039f, 21.789f, 21.414f, 21.414f)
                curveTo(21.789f, 21.039f, 22f, 20.53f, 22f, 20f)
                verticalLineTo(16f)
                curveTo(22f, 15.47f, 21.789f, 14.961f, 21.414f, 14.586f)
                curveTo(21.039f, 14.211f, 20.53f, 14f, 20f, 14f)
                horizontalLineTo(18f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 6f)
                horizontalLineTo(6.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 18f)
                horizontalLineTo(6.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 6f)
                lineTo(9f, 12f)
                horizontalLineTo(15f)
                lineTo(11f, 18f)
            }
        }.build()

        return _ServerCrash!!
    }

@Suppress("ObjectPropertyName")
private var _ServerCrash: ImageVector? = null
