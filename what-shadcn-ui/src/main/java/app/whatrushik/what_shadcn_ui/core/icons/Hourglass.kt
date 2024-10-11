package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Hourglass: ImageVector
    get() {
        if (_Hourglass != null) {
            return _Hourglass!!
        }
        _Hourglass = ImageVector.Builder(
            name = "Hourglass",
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
                moveTo(5f, 22f)
                horizontalLineTo(19f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 2f)
                horizontalLineTo(19f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 22f)
                verticalLineTo(17.828f)
                curveTo(17f, 17.298f, 16.789f, 16.789f, 16.414f, 16.414f)
                lineTo(12f, 12f)
                lineTo(7.586f, 16.414f)
                curveTo(7.211f, 16.789f, 7f, 17.298f, 7f, 17.828f)
                verticalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 2f)
                verticalLineTo(6.172f)
                curveTo(7f, 6.702f, 7.211f, 7.211f, 7.586f, 7.586f)
                lineTo(12f, 12f)
                lineTo(16.414f, 7.586f)
                curveTo(16.789f, 7.211f, 17f, 6.702f, 17f, 6.172f)
                verticalLineTo(2f)
            }
        }.build()

        return _Hourglass!!
    }

@Suppress("ObjectPropertyName")
private var _Hourglass: ImageVector? = null
