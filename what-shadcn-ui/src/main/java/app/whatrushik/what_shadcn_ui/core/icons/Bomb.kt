package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Bomb: ImageVector
    get() {
        if (_Bomb != null) {
            return _Bomb!!
        }
        _Bomb = ImageVector.Builder(
            name = "Bomb",
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
                moveTo(11f, 22f)
                curveTo(15.971f, 22f, 20f, 17.971f, 20f, 13f)
                curveTo(20f, 8.029f, 15.971f, 4f, 11f, 4f)
                curveTo(6.029f, 4f, 2f, 8.029f, 2f, 13f)
                curveTo(2f, 17.971f, 6.029f, 22f, 11f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.5f, 9.5f)
                lineTo(21.3f, 7.7f)
                curveTo(21.524f, 7.477f, 21.701f, 7.212f, 21.822f, 6.92f)
                curveTo(21.944f, 6.629f, 22.006f, 6.316f, 22.006f, 6f)
                curveTo(22.006f, 5.684f, 21.944f, 5.371f, 21.822f, 5.08f)
                curveTo(21.701f, 4.788f, 21.524f, 4.523f, 21.3f, 4.3f)
                lineTo(19.7f, 2.7f)
                curveTo(19.248f, 2.251f, 18.637f, 1.998f, 18f, 1.998f)
                curveTo(17.363f, 1.998f, 16.752f, 2.251f, 16.3f, 2.7f)
                lineTo(14.5f, 4.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 2f)
                lineTo(20.5f, 3.5f)
            }
        }.build()

        return _Bomb!!
    }

@Suppress("ObjectPropertyName")
private var _Bomb: ImageVector? = null
