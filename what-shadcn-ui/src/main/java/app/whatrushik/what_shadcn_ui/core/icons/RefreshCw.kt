package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.RefreshCw: ImageVector
    get() {
        if (_RefreshCw != null) {
            return _RefreshCw!!
        }
        _RefreshCw = ImageVector.Builder(
            name = "RefreshCw",
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
                moveTo(21f, 2f)
                verticalLineTo(8f)
                horizontalLineTo(15f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 12f)
                curveTo(3.002f, 10.263f, 3.506f, 8.564f, 4.451f, 7.108f)
                curveTo(5.397f, 5.651f, 6.744f, 4.499f, 8.33f, 3.791f)
                curveTo(9.915f, 3.083f, 11.672f, 2.848f, 13.388f, 3.116f)
                curveTo(15.104f, 3.384f, 16.706f, 4.142f, 18f, 5.3f)
                lineTo(21f, 8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 22f)
                verticalLineTo(16f)
                horizontalLineTo(9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 12f)
                curveTo(20.998f, 13.737f, 20.494f, 15.436f, 19.549f, 16.892f)
                curveTo(18.603f, 18.349f, 17.256f, 19.501f, 15.67f, 20.209f)
                curveTo(14.085f, 20.918f, 12.328f, 21.152f, 10.612f, 20.884f)
                curveTo(8.896f, 20.616f, 7.294f, 19.858f, 6f, 18.7f)
                lineTo(3f, 16f)
            }
        }.build()

        return _RefreshCw!!
    }

@Suppress("ObjectPropertyName")
private var _RefreshCw: ImageVector? = null
