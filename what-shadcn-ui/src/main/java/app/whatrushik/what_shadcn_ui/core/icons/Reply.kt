package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Reply: ImageVector
    get() {
        if (_Reply != null) {
            return _Reply!!
        }
        _Reply = ImageVector.Builder(
            name = "Reply",
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
                moveTo(9f, 17f)
                lineTo(4f, 12f)
                lineTo(9f, 7f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 18f)
                verticalLineTo(16f)
                curveTo(20f, 14.939f, 19.579f, 13.922f, 18.828f, 13.172f)
                curveTo(18.078f, 12.421f, 17.061f, 12f, 16f, 12f)
                horizontalLineTo(4f)
            }
        }.build()

        return _Reply!!
    }

@Suppress("ObjectPropertyName")
private var _Reply: ImageVector? = null
