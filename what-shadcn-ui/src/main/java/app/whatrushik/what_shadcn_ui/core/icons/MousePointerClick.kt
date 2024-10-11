package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.MousePointerClick: ImageVector
    get() {
        if (_MousePointerClick != null) {
            return _MousePointerClick!!
        }
        _MousePointerClick = ImageVector.Builder(
            name = "MousePointerClick",
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
                moveTo(9f, 9f)
                lineTo(14f, 21f)
                lineTo(15.774f, 15.774f)
                lineTo(21f, 14f)
                lineTo(9f, 9f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.071f, 16.071f)
                lineTo(20.314f, 20.314f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.188f, 2.239f)
                lineTo(7.965f, 5.136f)
                moveTo(5.136f, 7.965f)
                lineTo(2.238f, 7.188f)
                moveTo(13.95f, 4.05f)
                lineTo(11.828f, 6.172f)
                moveTo(6.171f, 11.828f)
                lineTo(4.051f, 13.95f)
            }
        }.build()

        return _MousePointerClick!!
    }

@Suppress("ObjectPropertyName")
private var _MousePointerClick: ImageVector? = null
