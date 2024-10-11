package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.LampCeiling: ImageVector
    get() {
        if (_LampCeiling != null) {
            return _LampCeiling!!
        }
        _LampCeiling = ImageVector.Builder(
            name = "LampCeiling",
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
                moveTo(12f, 2f)
                verticalLineTo(7f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 7f)
                horizontalLineTo(18f)
                lineTo(22f, 16f)
                horizontalLineTo(2f)
                lineTo(6f, 7f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.17f, 16f)
                curveTo(9.011f, 16.452f, 8.962f, 16.936f, 9.029f, 17.411f)
                curveTo(9.095f, 17.886f, 9.275f, 18.338f, 9.552f, 18.729f)
                curveTo(9.829f, 19.121f, 10.196f, 19.44f, 10.622f, 19.66f)
                curveTo(11.048f, 19.881f, 11.521f, 19.996f, 12f, 19.996f)
                curveTo(12.479f, 19.996f, 12.952f, 19.881f, 13.378f, 19.66f)
                curveTo(13.804f, 19.44f, 14.171f, 19.121f, 14.448f, 18.729f)
                curveTo(14.725f, 18.338f, 14.905f, 17.886f, 14.971f, 17.411f)
                curveTo(15.038f, 16.936f, 14.989f, 16.452f, 14.83f, 16f)
            }
        }.build()

        return _LampCeiling!!
    }

@Suppress("ObjectPropertyName")
private var _LampCeiling: ImageVector? = null
