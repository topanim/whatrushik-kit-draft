package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Unlink: ImageVector
    get() {
        if (_Unlink != null) {
            return _Unlink!!
        }
        _Unlink = ImageVector.Builder(
            name = "Unlink",
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
                moveTo(18.84f, 12.25f)
                lineTo(20.56f, 10.54f)
                horizontalLineTo(20.54f)
                curveTo(21.461f, 9.586f, 21.965f, 8.306f, 21.943f, 6.98f)
                curveTo(21.92f, 5.655f, 21.372f, 4.392f, 20.42f, 3.47f)
                curveTo(19.487f, 2.57f, 18.241f, 2.067f, 16.945f, 2.067f)
                curveTo(15.649f, 2.067f, 14.403f, 2.57f, 13.47f, 3.47f)
                lineTo(11.75f, 5.18f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.17f, 11.75f)
                lineTo(3.46f, 13.46f)
                curveTo(2.539f, 14.414f, 2.035f, 15.694f, 2.057f, 17.02f)
                curveTo(2.08f, 18.345f, 2.628f, 19.608f, 3.58f, 20.53f)
                curveTo(4.513f, 21.43f, 5.759f, 21.933f, 7.055f, 21.933f)
                curveTo(8.351f, 21.933f, 9.597f, 21.43f, 10.53f, 20.53f)
                lineTo(12.24f, 18.82f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 2f)
                verticalLineTo(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 8f)
                horizontalLineTo(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 19f)
                verticalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 16f)
                horizontalLineTo(22f)
            }
        }.build()

        return _Unlink!!
    }

@Suppress("ObjectPropertyName")
private var _Unlink: ImageVector? = null
