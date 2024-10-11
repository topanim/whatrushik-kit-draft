package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.ChevronsRightLeft: ImageVector
    get() {
        if (_ChevronsRightLeft != null) {
            return _ChevronsRightLeft!!
        }
        _ChevronsRightLeft = ImageVector.Builder(
            name = "ChevronsRightLeft",
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
                moveTo(20f, 17f)
                lineTo(15f, 12f)
                lineTo(20f, 7f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 17f)
                lineTo(9f, 12f)
                lineTo(4f, 7f)
            }
        }.build()

        return _ChevronsRightLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronsRightLeft: ImageVector? = null
