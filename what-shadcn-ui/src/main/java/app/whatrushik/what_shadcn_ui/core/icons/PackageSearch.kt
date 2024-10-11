package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.PackageSearch: ImageVector
    get() {
        if (_PackageSearch != null) {
            return _PackageSearch!!
        }
        _PackageSearch = ImageVector.Builder(
            name = "PackageSearch",
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
                moveTo(21f, 10f)
                verticalLineTo(8f)
                curveTo(21f, 7.649f, 20.907f, 7.305f, 20.732f, 7.001f)
                curveTo(20.556f, 6.698f, 20.304f, 6.445f, 20f, 6.27f)
                lineTo(13f, 2.27f)
                curveTo(12.696f, 2.094f, 12.351f, 2.002f, 12f, 2.002f)
                curveTo(11.649f, 2.002f, 11.304f, 2.094f, 11f, 2.27f)
                lineTo(4f, 6.27f)
                curveTo(3.696f, 6.445f, 3.444f, 6.698f, 3.268f, 7.001f)
                curveTo(3.093f, 7.305f, 3f, 7.649f, 3f, 8f)
                verticalLineTo(16f)
                curveTo(3f, 16.351f, 3.093f, 16.695f, 3.268f, 16.999f)
                curveTo(3.444f, 17.302f, 3.696f, 17.555f, 4f, 17.73f)
                lineTo(11f, 21.73f)
                curveTo(11.304f, 21.906f, 11.649f, 21.998f, 12f, 21.998f)
                curveTo(12.351f, 21.998f, 12.696f, 21.906f, 13f, 21.73f)
                lineTo(15f, 20.59f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.5f, 9.4f)
                lineTo(7.55f, 4.24f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.29f, 7f)
                lineTo(12f, 12f)
                lineTo(20.71f, 7f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 22f)
                verticalLineTo(12f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.5f, 18f)
                curveTo(19.881f, 18f, 21f, 16.881f, 21f, 15.5f)
                curveTo(21f, 14.119f, 19.881f, 13f, 18.5f, 13f)
                curveTo(17.119f, 13f, 16f, 14.119f, 16f, 15.5f)
                curveTo(16f, 16.881f, 17.119f, 18f, 18.5f, 18f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.27f, 17.27f)
                lineTo(22f, 19f)
            }
        }.build()

        return _PackageSearch!!
    }

@Suppress("ObjectPropertyName")
private var _PackageSearch: ImageVector? = null
