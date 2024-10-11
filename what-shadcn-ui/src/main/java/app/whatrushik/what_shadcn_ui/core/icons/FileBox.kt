package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.FileBox: ImageVector
    get() {
        if (_FileBox != null) {
            return _FileBox!!
        }
        _FileBox = ImageVector.Builder(
            name = "FileBox",
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
                moveTo(14.5f, 22f)
                horizontalLineTo(18f)
                curveTo(18.53f, 22f, 19.039f, 21.789f, 19.414f, 21.414f)
                curveTo(19.789f, 21.039f, 20f, 20.53f, 20f, 20f)
                verticalLineTo(7.5f)
                lineTo(14.5f, 2f)
                horizontalLineTo(6f)
                curveTo(5.47f, 2f, 4.961f, 2.211f, 4.586f, 2.586f)
                curveTo(4.211f, 2.961f, 4f, 3.47f, 4f, 4f)
                verticalLineTo(8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 2f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.97f, 13.12f)
                curveTo(2.37f, 13.48f, 2f, 14.14f, 2f, 14.86f)
                verticalLineTo(18.14f)
                curveTo(2f, 18.86f, 2.37f, 19.52f, 2.97f, 19.88f)
                lineTo(5.97f, 21.71f)
                curveTo(6.6f, 22.1f, 7.4f, 22.1f, 8.03f, 21.71f)
                lineTo(11.03f, 19.88f)
                curveTo(11.63f, 19.52f, 12f, 18.86f, 12f, 18.14f)
                verticalLineTo(14.86f)
                curveTo(12f, 14.14f, 11.63f, 13.48f, 11.03f, 13.12f)
                lineTo(8.03f, 11.29f)
                curveTo(7.72f, 11.1f, 7.364f, 10.999f, 7f, 10.999f)
                curveTo(6.636f, 10.999f, 6.28f, 11.1f, 5.97f, 11.29f)
                lineTo(2.97f, 13.12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 17f)
                lineTo(2.26f, 14.15f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 17f)
                lineTo(11.74f, 14.15f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 17f)
                verticalLineTo(22f)
            }
        }.build()

        return _FileBox!!
    }

@Suppress("ObjectPropertyName")
private var _FileBox: ImageVector? = null
