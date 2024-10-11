package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.TreeDeciduous: ImageVector
    get() {
        if (_TreeDeciduous != null) {
            return _TreeDeciduous!!
        }
        _TreeDeciduous = ImageVector.Builder(
            name = "TreeDeciduous",
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
                moveTo(8f, 19f)
                horizontalLineTo(16f)
                curveTo(16.848f, 18.997f, 17.674f, 18.724f, 18.357f, 18.22f)
                curveTo(19.04f, 17.717f, 19.545f, 17.009f, 19.8f, 16.2f)
                curveTo(20.053f, 15.378f, 20.034f, 14.496f, 19.745f, 13.685f)
                curveTo(19.457f, 12.874f, 18.915f, 12.178f, 18.2f, 11.7f)
                curveTo(19.2f, 10.6f, 19.2f, 9f, 18.6f, 7.7f)
                curveTo(17.9f, 6.5f, 16.4f, 5.7f, 15f, 6f)
                curveTo(15f, 5.204f, 14.684f, 4.441f, 14.121f, 3.879f)
                curveTo(13.559f, 3.316f, 12.796f, 3f, 12f, 3f)
                curveTo(11.204f, 3f, 10.441f, 3.316f, 9.879f, 3.879f)
                curveTo(9.316f, 4.441f, 9f, 5.204f, 9f, 6f)
                curveTo(7.6f, 5.8f, 6.1f, 6.5f, 5.4f, 7.7f)
                curveTo(4.7f, 9f, 4.9f, 10.6f, 5.8f, 11.7f)
                curveTo(5.085f, 12.178f, 4.543f, 12.874f, 4.255f, 13.685f)
                curveTo(3.966f, 14.496f, 3.947f, 15.378f, 4.2f, 16.2f)
                curveTo(4.455f, 17.009f, 4.96f, 17.717f, 5.643f, 18.22f)
                curveTo(6.326f, 18.724f, 7.152f, 18.997f, 8f, 19f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 19f)
                verticalLineTo(22f)
            }
        }.build()

        return _TreeDeciduous!!
    }

@Suppress("ObjectPropertyName")
private var _TreeDeciduous: ImageVector? = null
