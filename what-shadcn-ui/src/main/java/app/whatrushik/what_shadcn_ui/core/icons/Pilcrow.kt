package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Pilcrow: ImageVector
    get() {
        if (_Pilcrow != null) {
            return _Pilcrow!!
        }
        _Pilcrow = ImageVector.Builder(
            name = "Pilcrow",
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
                moveTo(13f, 4f)
                verticalLineTo(20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 4f)
                verticalLineTo(20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 4f)
                horizontalLineTo(9.5f)
                curveTo(8.307f, 4f, 7.162f, 4.474f, 6.318f, 5.318f)
                curveTo(5.474f, 6.162f, 5f, 7.307f, 5f, 8.5f)
                curveTo(5f, 9.693f, 5.474f, 10.838f, 6.318f, 11.682f)
                curveTo(7.162f, 12.526f, 8.307f, 13f, 9.5f, 13f)
                horizontalLineTo(13f)
            }
        }.build()

        return _Pilcrow!!
    }

@Suppress("ObjectPropertyName")
private var _Pilcrow: ImageVector? = null
