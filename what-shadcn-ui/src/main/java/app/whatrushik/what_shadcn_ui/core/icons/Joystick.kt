package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Joystick: ImageVector
    get() {
        if (_Joystick != null) {
            return _Joystick!!
        }
        _Joystick = ImageVector.Builder(
            name = "Joystick",
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
                moveTo(21f, 17f)
                curveTo(21f, 16.47f, 20.789f, 15.961f, 20.414f, 15.586f)
                curveTo(20.039f, 15.211f, 19.53f, 15f, 19f, 15f)
                horizontalLineTo(5f)
                curveTo(4.47f, 15f, 3.961f, 15.211f, 3.586f, 15.586f)
                curveTo(3.211f, 15.961f, 3f, 16.47f, 3f, 17f)
                verticalLineTo(19f)
                curveTo(3f, 19.53f, 3.211f, 20.039f, 3.586f, 20.414f)
                curveTo(3.961f, 20.789f, 4.47f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(19.53f, 21f, 20.039f, 20.789f, 20.414f, 20.414f)
                curveTo(20.789f, 20.039f, 21f, 19.53f, 21f, 19f)
                verticalLineTo(17f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 15f)
                verticalLineTo(13f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 15f)
                verticalLineTo(9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 9f)
                curveTo(13.657f, 9f, 15f, 7.657f, 15f, 6f)
                curveTo(15f, 4.343f, 13.657f, 3f, 12f, 3f)
                curveTo(10.343f, 3f, 9f, 4.343f, 9f, 6f)
                curveTo(9f, 7.657f, 10.343f, 9f, 12f, 9f)
                close()
            }
        }.build()

        return _Joystick!!
    }

@Suppress("ObjectPropertyName")
private var _Joystick: ImageVector? = null
