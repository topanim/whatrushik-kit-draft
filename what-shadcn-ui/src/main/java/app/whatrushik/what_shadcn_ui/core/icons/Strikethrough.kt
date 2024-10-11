package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Strikethrough: ImageVector
    get() {
        if (_Strikethrough != null) {
            return _Strikethrough!!
        }
        _Strikethrough = ImageVector.Builder(
            name = "Strikethrough",
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
                moveTo(16f, 4f)
                horizontalLineTo(9f)
                curveTo(8.52f, 4f, 8.047f, 4.115f, 7.62f, 4.335f)
                curveTo(7.194f, 4.556f, 6.827f, 4.875f, 6.549f, 5.267f)
                curveTo(6.272f, 5.659f, 6.093f, 6.112f, 6.027f, 6.587f)
                curveTo(5.961f, 7.063f, 6.01f, 7.547f, 6.17f, 8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 12f)
                curveTo(15.061f, 12f, 16.078f, 12.421f, 16.828f, 13.172f)
                curveTo(17.579f, 13.922f, 18f, 14.939f, 18f, 16f)
                curveTo(18f, 17.061f, 17.579f, 18.078f, 16.828f, 18.828f)
                curveTo(16.078f, 19.579f, 15.061f, 20f, 14f, 20f)
                horizontalLineTo(6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 12f)
                horizontalLineTo(20f)
            }
        }.build()

        return _Strikethrough!!
    }

@Suppress("ObjectPropertyName")
private var _Strikethrough: ImageVector? = null
