package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Sprout: ImageVector
    get() {
        if (_Sprout != null) {
            return _Sprout!!
        }
        _Sprout = ImageVector.Builder(
            name = "Sprout",
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
                horizontalLineTo(17f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 20f)
                curveTo(15.5f, 17.5f, 10.8f, 13.6f, 13f, 10f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.5f, 9.4f)
                curveTo(10.6f, 10.2f, 11.3f, 11.6f, 11.8f, 13.1f)
                curveTo(9.8f, 13.5f, 8.3f, 13.5f, 7f, 12.8f)
                curveTo(5.8f, 12.2f, 4.7f, 10.9f, 4f, 8.6f)
                curveTo(6.8f, 8.1f, 8.4f, 8.6f, 9.5f, 9.4f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.1f, 6f)
                curveTo(13.338f, 7.192f, 12.954f, 8.586f, 13f, 10f)
                curveTo(14.9f, 9.9f, 16.3f, 9.4f, 17.3f, 8.6f)
                curveTo(18.3f, 7.6f, 18.9f, 6.3f, 19f, 4f)
                curveTo(16.3f, 4.1f, 15f, 5f, 14.1f, 6f)
                close()
            }
        }.build()

        return _Sprout!!
    }

@Suppress("ObjectPropertyName")
private var _Sprout: ImageVector? = null
