package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Cast: ImageVector
    get() {
        if (_Cast != null) {
            return _Cast!!
        }
        _Cast = ImageVector.Builder(
            name = "Cast",
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
                moveTo(2f, 8f)
                verticalLineTo(6f)
                curveTo(2f, 5.47f, 2.211f, 4.961f, 2.586f, 4.586f)
                curveTo(2.961f, 4.211f, 3.47f, 4f, 4f, 4f)
                horizontalLineTo(20f)
                curveTo(20.53f, 4f, 21.039f, 4.211f, 21.414f, 4.586f)
                curveTo(21.789f, 4.961f, 22f, 5.47f, 22f, 6f)
                verticalLineTo(18f)
                curveTo(22f, 18.53f, 21.789f, 19.039f, 21.414f, 19.414f)
                curveTo(21.039f, 19.789f, 20.53f, 20f, 20f, 20f)
                horizontalLineTo(14f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 12f)
                curveTo(4.047f, 12.217f, 5.958f, 13.13f, 7.414f, 14.586f)
                curveTo(8.87f, 16.042f, 9.783f, 17.953f, 10f, 20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 16f)
                curveTo(2.993f, 16.185f, 3.906f, 16.666f, 4.62f, 17.38f)
                curveTo(5.334f, 18.094f, 5.815f, 19.007f, 6f, 20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 20f)
                horizontalLineTo(2.01f)
            }
        }.build()

        return _Cast!!
    }

@Suppress("ObjectPropertyName")
private var _Cast: ImageVector? = null
