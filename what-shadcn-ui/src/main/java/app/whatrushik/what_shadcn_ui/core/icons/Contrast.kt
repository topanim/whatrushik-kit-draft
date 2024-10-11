package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Contrast: ImageVector
    get() {
        if (_Contrast != null) {
            return _Contrast!!
        }
        _Contrast = ImageVector.Builder(
            name = "Contrast",
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
                moveTo(12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 18f)
                curveTo(13.591f, 18f, 15.117f, 17.368f, 16.243f, 16.243f)
                curveTo(17.368f, 15.117f, 18f, 13.591f, 18f, 12f)
                curveTo(18f, 10.409f, 17.368f, 8.883f, 16.243f, 7.757f)
                curveTo(15.117f, 6.632f, 13.591f, 6f, 12f, 6f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _Contrast!!
    }

@Suppress("ObjectPropertyName")
private var _Contrast: ImageVector? = null
