package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Wind: ImageVector
    get() {
        if (_Wind != null) {
            return _Wind!!
        }
        _Wind = ImageVector.Builder(
            name = "Wind",
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
                moveTo(17.7f, 7.7f)
                curveTo(17.993f, 7.418f, 18.35f, 7.212f, 18.74f, 7.099f)
                curveTo(19.13f, 6.986f, 19.542f, 6.97f, 19.94f, 7.053f)
                curveTo(20.338f, 7.135f, 20.71f, 7.313f, 21.024f, 7.571f)
                curveTo(21.337f, 7.83f, 21.583f, 8.161f, 21.74f, 8.536f)
                curveTo(21.897f, 8.91f, 21.96f, 9.318f, 21.924f, 9.723f)
                curveTo(21.888f, 10.127f, 21.754f, 10.517f, 21.533f, 10.858f)
                curveTo(21.313f, 11.2f, 21.012f, 11.482f, 20.658f, 11.681f)
                curveTo(20.304f, 11.88f, 19.906f, 11.989f, 19.5f, 12f)
                horizontalLineTo(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.6f, 4.6f)
                curveTo(9.832f, 4.364f, 10.118f, 4.189f, 10.434f, 4.09f)
                curveTo(10.75f, 3.992f, 11.086f, 3.974f, 11.411f, 4.037f)
                curveTo(11.736f, 4.1f, 12.04f, 4.243f, 12.295f, 4.453f)
                curveTo(12.552f, 4.663f, 12.751f, 4.933f, 12.877f, 5.239f)
                curveTo(13.003f, 5.545f, 13.052f, 5.877f, 13.017f, 6.206f)
                curveTo(12.983f, 6.536f, 12.868f, 6.851f, 12.682f, 7.125f)
                curveTo(12.496f, 7.398f, 12.245f, 7.622f, 11.951f, 7.774f)
                curveTo(11.658f, 7.927f, 11.331f, 8.005f, 11f, 8f)
                horizontalLineTo(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.6f, 19.4f)
                curveTo(12.832f, 19.636f, 13.118f, 19.811f, 13.434f, 19.91f)
                curveTo(13.75f, 20.008f, 14.086f, 20.026f, 14.411f, 19.963f)
                curveTo(14.736f, 19.899f, 15.04f, 19.757f, 15.295f, 19.547f)
                curveTo(15.552f, 19.337f, 15.751f, 19.067f, 15.877f, 18.761f)
                curveTo(16.003f, 18.455f, 16.052f, 18.123f, 16.017f, 17.794f)
                curveTo(15.983f, 17.465f, 15.868f, 17.149f, 15.682f, 16.875f)
                curveTo(15.496f, 16.602f, 15.245f, 16.378f, 14.951f, 16.226f)
                curveTo(14.658f, 16.073f, 14.331f, 15.995f, 14f, 16f)
                horizontalLineTo(2f)
            }
        }.build()

        return _Wind!!
    }

@Suppress("ObjectPropertyName")
private var _Wind: ImageVector? = null
