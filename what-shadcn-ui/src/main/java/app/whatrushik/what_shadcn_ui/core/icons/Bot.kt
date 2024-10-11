package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Bot: ImageVector
    get() {
        if (_Bot != null) {
            return _Bot!!
        }
        _Bot = ImageVector.Builder(
            name = "Bot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(19f, 11f)
                    horizontalLineTo(5f)
                    curveTo(3.895f, 11f, 3f, 11.895f, 3f, 13f)
                    verticalLineTo(19f)
                    curveTo(3f, 20.105f, 3.895f, 21f, 5f, 21f)
                    horizontalLineTo(19f)
                    curveTo(20.105f, 21f, 21f, 20.105f, 21f, 19f)
                    verticalLineTo(13f)
                    curveTo(21f, 11.895f, 20.105f, 11f, 19f, 11f)
                    close()
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(12f, 7f)
                    curveTo(13.105f, 7f, 14f, 6.105f, 14f, 5f)
                    curveTo(14f, 3.895f, 13.105f, 3f, 12f, 3f)
                    curveTo(10.895f, 3f, 10f, 3.895f, 10f, 5f)
                    curveTo(10f, 6.105f, 10.895f, 7f, 12f, 7f)
                    close()
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(12f, 7f)
                    verticalLineTo(11f)
                }
            }
        }.build()

        return _Bot!!
    }

@Suppress("ObjectPropertyName")
private var _Bot: ImageVector? = null
