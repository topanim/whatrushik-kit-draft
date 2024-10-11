package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Euro: ImageVector
    get() {
        if (_Euro != null) {
            return _Euro!!
        }
        _Euro = ImageVector.Builder(
            name = "Euro",
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
                moveTo(4f, 10f)
                horizontalLineTo(16f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 14f)
                horizontalLineTo(13f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 6f)
                curveTo(17.577f, 4.708f, 15.722f, 3.994f, 13.8f, 4f)
                curveTo(12.763f, 4.013f, 11.738f, 4.23f, 10.784f, 4.639f)
                curveTo(9.831f, 5.049f, 8.967f, 5.642f, 8.243f, 6.384f)
                curveTo(7.519f, 7.127f, 6.948f, 8.006f, 6.563f, 8.969f)
                curveTo(6.178f, 9.933f, 5.987f, 10.963f, 6f, 12f)
                curveTo(6f, 16.4f, 9.5f, 20f, 13.8f, 20f)
                curveTo(15.8f, 20f, 17.6f, 19.2f, 19f, 18f)
            }
        }.build()

        return _Euro!!
    }

@Suppress("ObjectPropertyName")
private var _Euro: ImageVector? = null
