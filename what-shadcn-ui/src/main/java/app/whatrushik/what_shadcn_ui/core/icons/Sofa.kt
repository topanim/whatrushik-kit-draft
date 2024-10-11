package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Sofa: ImageVector
    get() {
        if (_Sofa != null) {
            return _Sofa!!
        }
        _Sofa = ImageVector.Builder(
            name = "Sofa",
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
                moveTo(20f, 9f)
                verticalLineTo(6f)
                curveTo(20f, 5.47f, 19.789f, 4.961f, 19.414f, 4.586f)
                curveTo(19.039f, 4.211f, 18.53f, 4f, 18f, 4f)
                horizontalLineTo(6f)
                curveTo(5.47f, 4f, 4.961f, 4.211f, 4.586f, 4.586f)
                curveTo(4.211f, 4.961f, 4f, 5.47f, 4f, 6f)
                verticalLineTo(9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 11f)
                verticalLineTo(16f)
                curveTo(2f, 16.53f, 2.211f, 17.039f, 2.586f, 17.414f)
                curveTo(2.961f, 17.789f, 3.47f, 18f, 4f, 18f)
                horizontalLineTo(20f)
                curveTo(20.53f, 18f, 21.039f, 17.789f, 21.414f, 17.414f)
                curveTo(21.789f, 17.039f, 22f, 16.53f, 22f, 16f)
                verticalLineTo(11f)
                curveTo(22f, 10.47f, 21.789f, 9.961f, 21.414f, 9.586f)
                curveTo(21.039f, 9.211f, 20.53f, 9f, 20f, 9f)
                curveTo(19.47f, 9f, 18.961f, 9.211f, 18.586f, 9.586f)
                curveTo(18.211f, 9.961f, 18f, 10.47f, 18f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                curveTo(6f, 10.47f, 5.789f, 9.961f, 5.414f, 9.586f)
                curveTo(5.039f, 9.211f, 4.53f, 9f, 4f, 9f)
                curveTo(3.47f, 9f, 2.961f, 9.211f, 2.586f, 9.586f)
                curveTo(2.211f, 9.961f, 2f, 10.47f, 2f, 11f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 18f)
                verticalLineTo(20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 18f)
                verticalLineTo(20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 4f)
                verticalLineTo(13f)
            }
        }.build()

        return _Sofa!!
    }

@Suppress("ObjectPropertyName")
private var _Sofa: ImageVector? = null
