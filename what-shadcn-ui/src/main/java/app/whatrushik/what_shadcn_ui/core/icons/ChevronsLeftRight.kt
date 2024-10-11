package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.ChevronsLeftRight: ImageVector
    get() {
        if (_ChevronsLeftRight != null) {
            return _ChevronsLeftRight!!
        }
        _ChevronsLeftRight = ImageVector.Builder(
            name = "ChevronsLeftRight",
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
                moveTo(9f, 7f)
                lineTo(4f, 12f)
                lineTo(9f, 17f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 7f)
                lineTo(20f, 12f)
                lineTo(15f, 17f)
            }
        }.build()

        return _ChevronsLeftRight!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronsLeftRight: ImageVector? = null
