package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val SHUIIcons.ChevronsDownUp: ImageVector
    get() {
        if (_ChevronsDownUp != null) {
            return _ChevronsDownUp!!
        }
        _ChevronsDownUp = ImageVector.Builder(
            name = "ChevronsDownUp",
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
                moveTo(7f, 20f)
                lineTo(12f, 15f)
                lineTo(17f, 20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 4f)
                lineTo(12f, 9f)
                lineTo(17f, 4f)
            }
        }.build()

        return _ChevronsDownUp!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronsDownUp: ImageVector? = null
