package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.PlugZap: ImageVector
    get() {
        if (_PlugZap != null) {
            return _PlugZap!!
        }
        _PlugZap = ImageVector.Builder(
            name = "PlugZap",
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
                moveTo(13f, 2f)
                lineTo(11f, 4.5f)
                horizontalLineTo(14f)
                lineTo(12f, 7f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 22f)
                verticalLineTo(19f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 13f)
                verticalLineTo(10.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 12.5f)
                verticalLineTo(10.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 12.5f)
                verticalLineTo(10.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 15f)
                curveTo(16f, 14.47f, 15.789f, 13.961f, 15.414f, 13.586f)
                curveTo(15.039f, 13.211f, 14.53f, 13f, 14f, 13f)
                horizontalLineTo(10f)
                curveTo(9.47f, 13f, 8.961f, 13.211f, 8.586f, 13.586f)
                curveTo(8.211f, 13.961f, 8f, 14.47f, 8f, 15f)
                verticalLineTo(17f)
                curveTo(8f, 17.53f, 8.211f, 18.039f, 8.586f, 18.414f)
                curveTo(8.961f, 18.789f, 9.47f, 19f, 10f, 19f)
                horizontalLineTo(14f)
                curveTo(14.53f, 19f, 15.039f, 18.789f, 15.414f, 18.414f)
                curveTo(15.789f, 18.039f, 16f, 17.53f, 16f, 17f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _PlugZap!!
    }

@Suppress("ObjectPropertyName")
private var _PlugZap: ImageVector? = null
