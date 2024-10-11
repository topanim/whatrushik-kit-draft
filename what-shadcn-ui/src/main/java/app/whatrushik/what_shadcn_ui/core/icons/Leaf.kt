package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Leaf: ImageVector
    get() {
        if (_Leaf != null) {
            return _Leaf!!
        }
        _Leaf = ImageVector.Builder(
            name = "Leaf",
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
                moveTo(11f, 20f)
                curveTo(9.244f, 20.005f, 7.55f, 19.351f, 6.254f, 18.165f)
                curveTo(4.959f, 16.98f, 4.156f, 15.351f, 4.005f, 13.602f)
                curveTo(3.854f, 11.853f, 4.366f, 10.11f, 5.439f, 8.721f)
                curveTo(6.513f, 7.331f, 8.069f, 6.396f, 9.8f, 6.1f)
                curveTo(15.5f, 5f, 17f, 4.48f, 19f, 2f)
                curveTo(20f, 4f, 21f, 6.18f, 21f, 10f)
                curveTo(21f, 15.5f, 16.22f, 20f, 11f, 20f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 21f)
                curveTo(2f, 18f, 3.85f, 15.64f, 7.08f, 15f)
                curveTo(9.5f, 14.52f, 12f, 13f, 13f, 12f)
            }
        }.build()

        return _Leaf!!
    }

@Suppress("ObjectPropertyName")
private var _Leaf: ImageVector? = null
