package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Paperclip: ImageVector
    get() {
        if (_Paperclip != null) {
            return _Paperclip!!
        }
        _Paperclip = ImageVector.Builder(
            name = "Paperclip",
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
                moveTo(21.44f, 11.05f)
                lineTo(12.25f, 20.24f)
                curveTo(11.124f, 21.366f, 9.597f, 21.998f, 8.005f, 21.998f)
                curveTo(6.413f, 21.998f, 4.886f, 21.366f, 3.76f, 20.24f)
                curveTo(2.634f, 19.114f, 2.002f, 17.587f, 2.002f, 15.995f)
                curveTo(2.002f, 14.403f, 2.634f, 12.876f, 3.76f, 11.75f)
                lineTo(12.33f, 3.18f)
                curveTo(13.081f, 2.428f, 14.099f, 2.005f, 15.161f, 2.004f)
                curveTo(16.224f, 2.003f, 17.243f, 2.424f, 17.995f, 3.175f)
                curveTo(18.747f, 3.926f, 19.17f, 4.944f, 19.171f, 6.006f)
                curveTo(19.172f, 7.069f, 18.751f, 8.088f, 18f, 8.84f)
                lineTo(9.41f, 17.41f)
                curveTo(9.035f, 17.785f, 8.526f, 17.996f, 7.995f, 17.996f)
                curveTo(7.464f, 17.996f, 6.955f, 17.785f, 6.58f, 17.41f)
                curveTo(6.205f, 17.035f, 5.994f, 16.526f, 5.994f, 15.995f)
                curveTo(5.994f, 15.464f, 6.205f, 14.955f, 6.58f, 14.58f)
                lineTo(15.07f, 6.1f)
            }
        }.build()

        return _Paperclip!!
    }

@Suppress("ObjectPropertyName")
private var _Paperclip: ImageVector? = null
