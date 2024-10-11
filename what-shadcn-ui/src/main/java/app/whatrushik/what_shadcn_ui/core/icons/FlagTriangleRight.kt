package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.FlagTriangleRight: ImageVector
    get() {
        if (_FlagTriangleRight != null) {
            return _FlagTriangleRight!!
        }
        _FlagTriangleRight = ImageVector.Builder(
            name = "FlagTriangleRight",
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
                moveTo(7f, 22f)
                verticalLineTo(2f)
                lineTo(17f, 7f)
                lineTo(7f, 12f)
            }
        }.build()

        return _FlagTriangleRight!!
    }

@Suppress("ObjectPropertyName")
private var _FlagTriangleRight: ImageVector? = null
