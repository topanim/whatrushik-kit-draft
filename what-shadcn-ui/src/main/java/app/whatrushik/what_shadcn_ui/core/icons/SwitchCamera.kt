package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.SwitchCamera: ImageVector
    get() {
        if (_SwitchCamera != null) {
            return _SwitchCamera!!
        }
        _SwitchCamera = ImageVector.Builder(
            name = "SwitchCamera",
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
                moveTo(11f, 19f)
                horizontalLineTo(4f)
                curveTo(3.47f, 19f, 2.961f, 18.789f, 2.586f, 18.414f)
                curveTo(2.211f, 18.039f, 2f, 17.53f, 2f, 17f)
                verticalLineTo(7f)
                curveTo(2f, 6.47f, 2.211f, 5.961f, 2.586f, 5.586f)
                curveTo(2.961f, 5.211f, 3.47f, 5f, 4f, 5f)
                horizontalLineTo(9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 5f)
                horizontalLineTo(20f)
                curveTo(20.53f, 5f, 21.039f, 5.211f, 21.414f, 5.586f)
                curveTo(21.789f, 5.961f, 22f, 6.47f, 22f, 7f)
                verticalLineTo(17f)
                curveTo(22f, 17.53f, 21.789f, 18.039f, 21.414f, 18.414f)
                curveTo(21.039f, 18.789f, 20.53f, 19f, 20f, 19f)
                horizontalLineTo(15f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 15f)
                curveTo(13.657f, 15f, 15f, 13.657f, 15f, 12f)
                curveTo(15f, 10.343f, 13.657f, 9f, 12f, 9f)
                curveTo(10.343f, 9f, 9f, 10.343f, 9f, 12f)
                curveTo(9f, 13.657f, 10.343f, 15f, 12f, 15f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 22f)
                lineTo(15f, 19f)
                lineTo(18f, 16f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 2f)
                lineTo(9f, 5f)
                lineTo(6f, 8f)
            }
        }.build()

        return _SwitchCamera!!
    }

@Suppress("ObjectPropertyName")
private var _SwitchCamera: ImageVector? = null
