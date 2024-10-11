package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Divide: ImageVector
    get() {
        if (_Divide != null) {
            return _Divide!!
        }
        _Divide = ImageVector.Builder(
            name = "Divide",
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
                moveTo(12f, 7f)
                curveTo(12.552f, 7f, 13f, 6.552f, 13f, 6f)
                curveTo(13f, 5.448f, 12.552f, 5f, 12f, 5f)
                curveTo(11.448f, 5f, 11f, 5.448f, 11f, 6f)
                curveTo(11f, 6.552f, 11.448f, 7f, 12f, 7f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 12f)
                horizontalLineTo(19f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 19f)
                curveTo(12.552f, 19f, 13f, 18.552f, 13f, 18f)
                curveTo(13f, 17.448f, 12.552f, 17f, 12f, 17f)
                curveTo(11.448f, 17f, 11f, 17.448f, 11f, 18f)
                curveTo(11f, 18.552f, 11.448f, 19f, 12f, 19f)
                close()
            }
        }.build()

        return _Divide!!
    }

@Suppress("ObjectPropertyName")
private var _Divide: ImageVector? = null
