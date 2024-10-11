package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.BellPlus: ImageVector
    get() {
        if (_BellPlus != null) {
            return _BellPlus!!
        }
        _BellPlus = ImageVector.Builder(
            name = "BellPlus",
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
                moveTo(18.387f, 12f)
                curveTo(19.198f, 15.799f, 21f, 17f, 21f, 17f)
                horizontalLineTo(3f)
                curveTo(3f, 17f, 6f, 15f, 6f, 8f)
                curveTo(6f, 7.127f, 6.19f, 6.265f, 6.558f, 5.474f)
                curveTo(6.925f, 4.682f, 7.461f, 3.981f, 8.127f, 3.417f)
                curveTo(8.793f, 2.854f, 9.575f, 2.443f, 10.416f, 2.213f)
                curveTo(11.258f, 1.983f, 12.14f, 1.939f, 13f, 2.084f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.73f, 21f)
                curveTo(13.554f, 21.303f, 13.302f, 21.555f, 12.998f, 21.729f)
                curveTo(12.695f, 21.904f, 12.35f, 21.997f, 12f, 21.997f)
                curveTo(11.65f, 21.997f, 11.305f, 21.904f, 11.002f, 21.729f)
                curveTo(10.698f, 21.555f, 10.446f, 21.303f, 10.27f, 21f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 2f)
                verticalLineTo(8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 5f)
                horizontalLineTo(15f)
            }
        }.build()

        return _BellPlus!!
    }

@Suppress("ObjectPropertyName")
private var _BellPlus: ImageVector? = null
