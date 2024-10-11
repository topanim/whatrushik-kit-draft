package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.ScreenShare: ImageVector
    get() {
        if (_ScreenShare != null) {
            return _ScreenShare!!
        }
        _ScreenShare = ImageVector.Builder(
            name = "ScreenShare",
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
                moveTo(13f, 3f)
                horizontalLineTo(4f)
                curveTo(3.47f, 3f, 2.961f, 3.211f, 2.586f, 3.586f)
                curveTo(2.211f, 3.961f, 2f, 4.47f, 2f, 5f)
                verticalLineTo(15f)
                curveTo(2f, 15.53f, 2.211f, 16.039f, 2.586f, 16.414f)
                curveTo(2.961f, 16.789f, 3.47f, 17f, 4f, 17f)
                horizontalLineTo(20f)
                curveTo(20.53f, 17f, 21.039f, 16.789f, 21.414f, 16.414f)
                curveTo(21.789f, 16.039f, 22f, 15.53f, 22f, 15f)
                verticalLineTo(12f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 21f)
                horizontalLineTo(16f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 17f)
                verticalLineTo(21f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 8f)
                lineTo(22f, 3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 3f)
                horizontalLineTo(22f)
                verticalLineTo(8f)
            }
        }.build()

        return _ScreenShare!!
    }

@Suppress("ObjectPropertyName")
private var _ScreenShare: ImageVector? = null
