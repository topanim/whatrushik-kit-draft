package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Gamepad2: ImageVector
    get() {
        if (_Gamepad2 != null) {
            return _Gamepad2!!
        }
        _Gamepad2 = ImageVector.Builder(
            name = "Gamepad2",
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
                moveTo(6f, 11f)
                horizontalLineTo(10f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 9f)
                verticalLineTo(13f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 12f)
                horizontalLineTo(15.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 10f)
                horizontalLineTo(18.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.32f, 5f)
                horizontalLineTo(6.68f)
                curveTo(5.69f, 5f, 4.736f, 5.367f, 4.001f, 6.03f)
                curveTo(3.266f, 6.694f, 2.803f, 7.605f, 2.702f, 8.59f)
                curveTo(2.696f, 8.642f, 2.692f, 8.691f, 2.685f, 8.742f)
                curveTo(2.604f, 9.416f, 2f, 14.456f, 2f, 16f)
                curveTo(2f, 16.796f, 2.316f, 17.559f, 2.879f, 18.121f)
                curveTo(3.441f, 18.684f, 4.204f, 19f, 5f, 19f)
                curveTo(6f, 19f, 6.5f, 18.5f, 7f, 18f)
                lineTo(8.414f, 16.586f)
                curveTo(8.789f, 16.211f, 9.298f, 16f, 9.828f, 16f)
                horizontalLineTo(14.172f)
                curveTo(14.702f, 16f, 15.211f, 16.211f, 15.586f, 16.586f)
                lineTo(17f, 18f)
                curveTo(17.5f, 18.5f, 18f, 19f, 19f, 19f)
                curveTo(19.796f, 19f, 20.559f, 18.684f, 21.121f, 18.121f)
                curveTo(21.684f, 17.559f, 22f, 16.796f, 22f, 16f)
                curveTo(22f, 14.455f, 21.396f, 9.416f, 21.315f, 8.742f)
                curveTo(21.308f, 8.692f, 21.304f, 8.642f, 21.298f, 8.591f)
                curveTo(21.197f, 7.606f, 20.734f, 6.694f, 19.999f, 6.031f)
                curveTo(19.264f, 5.368f, 18.31f, 5f, 17.32f, 5f)
                close()
            }
        }.build()

        return _Gamepad2!!
    }

@Suppress("ObjectPropertyName")
private var _Gamepad2: ImageVector? = null
