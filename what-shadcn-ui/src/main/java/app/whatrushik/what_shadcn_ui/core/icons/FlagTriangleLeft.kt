package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.FlagTriangleLeft: ImageVector
    get() {
        if (_FlagTriangleLeft != null) {
            return _FlagTriangleLeft!!
        }
        _FlagTriangleLeft = ImageVector.Builder(
            name = "FlagTriangleLeft",
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
                moveTo(17f, 22f)
                verticalLineTo(2f)
                lineTo(7f, 7f)
                lineTo(17f, 12f)
            }
        }.build()

        return _FlagTriangleLeft!!
    }

@Suppress("ObjectPropertyName")
private var _FlagTriangleLeft: ImageVector? = null
