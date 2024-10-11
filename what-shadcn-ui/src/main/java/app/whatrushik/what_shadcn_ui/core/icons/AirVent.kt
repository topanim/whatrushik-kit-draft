package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.AirVent: ImageVector
    get() {
        if (_AirVent != null) {
            return _AirVent!!
        }
        _AirVent = ImageVector.Builder(
            name = "AirVent",
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
                moveTo(6f, 12f)
                horizontalLineTo(4f)
                curveTo(3.47f, 12f, 2.961f, 11.789f, 2.586f, 11.414f)
                curveTo(2.211f, 11.039f, 2f, 10.53f, 2f, 10f)
                verticalLineTo(5f)
                curveTo(2f, 4.47f, 2.211f, 3.961f, 2.586f, 3.586f)
                curveTo(2.961f, 3.211f, 3.47f, 3f, 4f, 3f)
                horizontalLineTo(20f)
                curveTo(20.53f, 3f, 21.039f, 3.211f, 21.414f, 3.586f)
                curveTo(21.789f, 3.961f, 22f, 4.47f, 22f, 5f)
                verticalLineTo(10f)
                curveTo(22f, 10.53f, 21.789f, 11.039f, 21.414f, 11.414f)
                curveTo(21.039f, 11.789f, 20.53f, 12f, 20f, 12f)
                horizontalLineTo(18f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 8f)
                horizontalLineTo(18f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.3f, 17.7f)
                curveTo(18.723f, 18.142f, 18.969f, 18.725f, 18.992f, 19.336f)
                curveTo(19.014f, 19.948f, 18.811f, 20.547f, 18.422f, 21.019f)
                curveTo(18.032f, 21.491f, 17.483f, 21.804f, 16.878f, 21.898f)
                curveTo(16.273f, 21.992f, 15.655f, 21.861f, 15.14f, 21.53f)
                curveTo(14.805f, 21.311f, 14.528f, 21.015f, 14.329f, 20.667f)
                curveTo(14.131f, 20.319f, 14.018f, 19.93f, 14f, 19.53f)
                verticalLineTo(12f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.6f, 15.6f)
                curveTo(6.364f, 15.832f, 6.189f, 16.118f, 6.09f, 16.434f)
                curveTo(5.992f, 16.75f, 5.974f, 17.086f, 6.037f, 17.411f)
                curveTo(6.1f, 17.736f, 6.243f, 18.039f, 6.453f, 18.295f)
                curveTo(6.663f, 18.552f, 6.933f, 18.751f, 7.239f, 18.877f)
                curveTo(7.545f, 19.003f, 7.877f, 19.052f, 8.206f, 19.017f)
                curveTo(8.536f, 18.983f, 8.851f, 18.868f, 9.125f, 18.682f)
                curveTo(9.398f, 18.496f, 9.622f, 18.245f, 9.774f, 17.951f)
                curveTo(9.927f, 17.658f, 10.005f, 17.331f, 10f, 17f)
                verticalLineTo(12f)
            }
        }.build()

        return _AirVent!!
    }

@Suppress("ObjectPropertyName")
private var _AirVent: ImageVector? = null
