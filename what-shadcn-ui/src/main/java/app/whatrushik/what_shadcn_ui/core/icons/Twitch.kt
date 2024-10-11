package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Twitch: ImageVector
    get() {
        if (_Twitch != null) {
            return _Twitch!!
        }
        _Twitch = ImageVector.Builder(
            name = "Twitch",
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
                moveTo(11f, 11f)
                verticalLineTo(7f)
                moveTo(16f, 11f)
                verticalLineTo(7f)
                moveTo(21f, 2f)
                horizontalLineTo(3f)
                verticalLineTo(18f)
                horizontalLineTo(8f)
                verticalLineTo(22f)
                lineTo(12f, 18f)
                horizontalLineTo(17f)
                lineTo(21f, 14f)
                verticalLineTo(2f)
                close()
            }
        }.build()

        return _Twitch!!
    }

@Suppress("ObjectPropertyName")
private var _Twitch: ImageVector? = null
