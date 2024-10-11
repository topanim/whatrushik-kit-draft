package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val SHUIIcons.Coins: ImageVector
    get() {
        if (_Coins != null) {
            return _Coins!!
        }
        _Coins = ImageVector.Builder(
            name = "Coins",
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
                moveTo(8f, 14f)
                curveTo(11.314f, 14f, 14f, 11.314f, 14f, 8f)
                curveTo(14f, 4.686f, 11.314f, 2f, 8f, 2f)
                curveTo(4.686f, 2f, 2f, 4.686f, 2f, 8f)
                curveTo(2f, 11.314f, 4.686f, 14f, 8f, 14f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.09f, 10.37f)
                curveTo(19.035f, 10.722f, 19.876f, 11.307f, 20.536f, 12.071f)
                curveTo(21.195f, 12.835f, 21.651f, 13.752f, 21.862f, 14.739f)
                curveTo(22.072f, 15.726f, 22.031f, 16.75f, 21.741f, 17.716f)
                curveTo(21.451f, 18.682f, 20.922f, 19.56f, 20.203f, 20.268f)
                curveTo(19.485f, 20.975f, 18.599f, 21.49f, 17.628f, 21.765f)
                curveTo(16.657f, 22.04f, 15.633f, 22.066f, 14.65f, 21.84f)
                curveTo(13.666f, 21.613f, 12.756f, 21.143f, 12.003f, 20.472f)
                curveTo(11.25f, 19.801f, 10.678f, 18.951f, 10.34f, 18f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 6f)
                horizontalLineTo(8f)
                verticalLineTo(10f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.71f, 13.88f)
                lineTo(17.41f, 14.59f)
                lineTo(14.59f, 17.41f)
            }
        }.build()

        return _Coins!!
    }

@Suppress("ObjectPropertyName")
private var _Coins: ImageVector? = null
