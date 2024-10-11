package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val SHUIIcons.ReplyAll: ImageVector
    get() {
        if (_ReplyAll != null) {
            return _ReplyAll!!
        }
        _ReplyAll = ImageVector.Builder(
            name = "ReplyAll",
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
                moveTo(7f, 17f)
                lineTo(2f, 12f)
                lineTo(7f, 7f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 17f)
                lineTo(7f, 12f)
                lineTo(12f, 7f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 18f)
                verticalLineTo(16f)
                curveTo(22f, 14.939f, 21.579f, 13.922f, 20.828f, 13.172f)
                curveTo(20.078f, 12.421f, 19.061f, 12f, 18f, 12f)
                horizontalLineTo(7f)
            }
        }.build()

        return _ReplyAll!!
    }

@Suppress("ObjectPropertyName")
private var _ReplyAll: ImageVector? = null
