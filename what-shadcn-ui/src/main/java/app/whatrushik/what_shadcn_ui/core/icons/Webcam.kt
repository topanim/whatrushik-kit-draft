package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Webcam: ImageVector
    get() {
        if (_Webcam != null) {
            return _Webcam!!
        }
        _Webcam = ImageVector.Builder(
            name = "Webcam",
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
                moveTo(12f, 18f)
                curveTo(16.418f, 18f, 20f, 14.418f, 20f, 10f)
                curveTo(20f, 5.582f, 16.418f, 2f, 12f, 2f)
                curveTo(7.582f, 2f, 4f, 5.582f, 4f, 10f)
                curveTo(4f, 14.418f, 7.582f, 18f, 12f, 18f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 13f)
                curveTo(13.657f, 13f, 15f, 11.657f, 15f, 10f)
                curveTo(15f, 8.343f, 13.657f, 7f, 12f, 7f)
                curveTo(10.343f, 7f, 9f, 8.343f, 9f, 10f)
                curveTo(9f, 11.657f, 10.343f, 13f, 12f, 13f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 22f)
                horizontalLineTo(17f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 22f)
                verticalLineTo(18f)
            }
        }.build()

        return _Webcam!!
    }

@Suppress("ObjectPropertyName")
private var _Webcam: ImageVector? = null
