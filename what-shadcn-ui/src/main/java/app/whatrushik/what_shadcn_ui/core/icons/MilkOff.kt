package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.MilkOff: ImageVector
    get() {
        if (_MilkOff != null) {
            return _MilkOff!!
        }
        _MilkOff = ImageVector.Builder(
            name = "MilkOff",
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
                moveTo(8f, 2f)
                horizontalLineTo(16f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 2f)
                verticalLineTo(3.343f)
                moveTo(15f, 2f)
                verticalLineTo(4.789f)
                curveTo(15f, 5.579f, 15.234f, 6.351f, 15.672f, 7.008f)
                lineTo(16.328f, 7.992f)
                curveTo(16.766f, 8.649f, 17f, 9.422f, 17f, 10.212f)
                verticalLineTo(11.343f)
                moveTo(7.8f, 7.8f)
                lineTo(7.672f, 7.992f)
                curveTo(7.234f, 8.649f, 7f, 9.422f, 7f, 10.212f)
                verticalLineTo(20f)
                curveTo(7f, 20.53f, 7.211f, 21.039f, 7.586f, 21.414f)
                curveTo(7.961f, 21.789f, 8.47f, 22f, 9f, 22f)
                horizontalLineTo(15f)
                curveTo(15.53f, 22f, 16.039f, 21.789f, 16.414f, 21.414f)
                curveTo(16.789f, 21.039f, 17f, 20.53f, 17f, 20f)
                verticalLineTo(17f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 15f)
                curveTo(7.792f, 14.668f, 8.642f, 14.497f, 9.5f, 14.497f)
                curveTo(10.358f, 14.497f, 11.208f, 14.668f, 12f, 15f)
                curveTo(13.084f, 15.454f, 14.272f, 15.605f, 15.435f, 15.435f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 2f)
                lineTo(22f, 22f)
            }
        }.build()

        return _MilkOff!!
    }

@Suppress("ObjectPropertyName")
private var _MilkOff: ImageVector? = null
