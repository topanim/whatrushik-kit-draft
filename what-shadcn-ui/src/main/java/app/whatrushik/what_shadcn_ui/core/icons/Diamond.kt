package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Diamond: ImageVector
    get() {
        if (_Diamond != null) {
            return _Diamond!!
        }
        _Diamond = ImageVector.Builder(
            name = "Diamond",
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
                    moveTo(21.299f, 10.299f)
                    lineTo(13.704f, 2.704f)
                    curveTo(12.763f, 1.763f, 11.237f, 1.763f, 10.296f, 2.704f)
                    lineTo(2.702f, 10.299f)
                    curveTo(1.76f, 11.24f, 1.76f, 12.766f, 2.702f, 13.707f)
                    lineTo(10.296f, 21.301f)
                    curveTo(11.237f, 22.242f, 12.763f, 22.242f, 13.704f, 21.301f)
                    lineTo(21.299f, 13.707f)
                    curveTo(22.24f, 12.766f, 22.24f, 11.24f, 21.299f, 10.299f)
                    close()
                }
            }
        }.build()

        return _Diamond!!
    }

@Suppress("ObjectPropertyName")
private var _Diamond: ImageVector? = null
