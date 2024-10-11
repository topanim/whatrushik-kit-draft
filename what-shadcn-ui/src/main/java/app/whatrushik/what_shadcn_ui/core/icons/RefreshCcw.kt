package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.RefreshCcw: ImageVector
    get() {
        if (_RefreshCcw != null) {
            return _RefreshCcw!!
        }
        _RefreshCcw = ImageVector.Builder(
            name = "RefreshCcw",
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
                moveTo(3f, 2f)
                verticalLineTo(8f)
                horizontalLineTo(9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 12f)
                curveTo(20.998f, 10.263f, 20.494f, 8.564f, 19.549f, 7.108f)
                curveTo(18.603f, 5.651f, 17.256f, 4.499f, 15.67f, 3.791f)
                curveTo(14.085f, 3.083f, 12.328f, 2.848f, 10.612f, 3.116f)
                curveTo(8.896f, 3.384f, 7.294f, 4.142f, 6f, 5.3f)
                lineTo(3f, 8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 22f)
                verticalLineTo(16f)
                horizontalLineTo(15f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 12f)
                curveTo(3.002f, 13.737f, 3.506f, 15.436f, 4.451f, 16.892f)
                curveTo(5.397f, 18.349f, 6.744f, 19.501f, 8.33f, 20.209f)
                curveTo(9.915f, 20.918f, 11.672f, 21.152f, 13.388f, 20.884f)
                curveTo(15.104f, 20.616f, 16.706f, 19.858f, 18f, 18.7f)
                lineTo(21f, 16f)
            }
        }.build()

        return _RefreshCcw!!
    }

@Suppress("ObjectPropertyName")
private var _RefreshCcw: ImageVector? = null
