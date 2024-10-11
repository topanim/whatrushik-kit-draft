package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Grab: ImageVector
    get() {
        if (_Grab != null) {
            return _Grab!!
        }
        _Grab = ImageVector.Builder(
            name = "Grab",
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
                moveTo(18f, 11.5f)
                verticalLineTo(9f)
                curveTo(18f, 8.47f, 17.789f, 7.961f, 17.414f, 7.586f)
                curveTo(17.039f, 7.211f, 16.53f, 7f, 16f, 7f)
                curveTo(15.47f, 7f, 14.961f, 7.211f, 14.586f, 7.586f)
                curveTo(14.211f, 7.961f, 14f, 8.47f, 14f, 9f)
                verticalLineTo(10.4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 10f)
                verticalLineTo(8f)
                curveTo(14f, 7.47f, 13.789f, 6.961f, 13.414f, 6.586f)
                curveTo(13.039f, 6.211f, 12.53f, 6f, 12f, 6f)
                curveTo(11.47f, 6f, 10.961f, 6.211f, 10.586f, 6.586f)
                curveTo(10.211f, 6.961f, 10f, 7.47f, 10f, 8f)
                verticalLineTo(10f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 9.9f)
                verticalLineTo(9f)
                curveTo(10f, 8.47f, 9.789f, 7.961f, 9.414f, 7.586f)
                curveTo(9.039f, 7.211f, 8.53f, 7f, 8f, 7f)
                curveTo(7.47f, 7f, 6.961f, 7.211f, 6.586f, 7.586f)
                curveTo(6.211f, 7.961f, 6f, 8.47f, 6f, 9f)
                verticalLineTo(14f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 14f)
                curveTo(6f, 13.47f, 5.789f, 12.961f, 5.414f, 12.586f)
                curveTo(5.039f, 12.211f, 4.53f, 12f, 4f, 12f)
                curveTo(3.47f, 12f, 2.961f, 12.211f, 2.586f, 12.586f)
                curveTo(2.211f, 12.961f, 2f, 13.47f, 2f, 14f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 11f)
                curveTo(18f, 10.47f, 18.211f, 9.961f, 18.586f, 9.586f)
                curveTo(18.961f, 9.211f, 19.47f, 9f, 20f, 9f)
                curveTo(20.53f, 9f, 21.039f, 9.211f, 21.414f, 9.586f)
                curveTo(21.789f, 9.961f, 22f, 10.47f, 22f, 11f)
                verticalLineTo(14f)
                curveTo(22f, 16.122f, 21.157f, 18.157f, 19.657f, 19.657f)
                curveTo(18.157f, 21.157f, 16.122f, 22f, 14f, 22f)
                horizontalLineTo(10f)
                curveTo(7.878f, 22f, 5.843f, 21.157f, 4.343f, 19.657f)
                curveTo(2.843f, 18.157f, 2f, 16.122f, 2f, 14f)
                curveTo(2f, 13.47f, 2.211f, 12.961f, 2.586f, 12.586f)
                curveTo(2.961f, 12.211f, 3.47f, 12f, 4f, 12f)
                curveTo(4.53f, 12f, 5.039f, 12.211f, 5.414f, 12.586f)
                curveTo(5.789f, 12.961f, 6f, 13.47f, 6f, 14f)
            }
        }.build()

        return _Grab!!
    }

@Suppress("ObjectPropertyName")
private var _Grab: ImageVector? = null
