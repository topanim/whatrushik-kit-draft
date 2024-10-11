package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Wifi: ImageVector
    get() {
        if (_Wifi != null) {
            return _Wifi!!
        }
        _Wifi = ImageVector.Builder(
            name = "Wifi",
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
                moveTo(5f, 13f)
                curveTo(6.869f, 11.168f, 9.382f, 10.141f, 12f, 10.141f)
                curveTo(14.618f, 10.141f, 17.131f, 11.168f, 19f, 13f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.5f, 16.5f)
                curveTo(9.435f, 15.584f, 10.691f, 15.071f, 12f, 15.071f)
                curveTo(13.309f, 15.071f, 14.565f, 15.584f, 15.5f, 16.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 8.82f)
                curveTo(4.75f, 6.36f, 8.31f, 5f, 12f, 5f)
                curveTo(15.69f, 5f, 19.25f, 6.36f, 22f, 8.82f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 20f)
                horizontalLineTo(12.01f)
            }
        }.build()

        return _Wifi!!
    }

@Suppress("ObjectPropertyName")
private var _Wifi: ImageVector? = null
