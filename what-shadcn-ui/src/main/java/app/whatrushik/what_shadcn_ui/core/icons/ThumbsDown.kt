package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.ThumbsDown: ImageVector
    get() {
        if (_ThumbsDown != null) {
            return _ThumbsDown!!
        }
        _ThumbsDown = ImageVector.Builder(
            name = "ThumbsDown",
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
                moveTo(17f, 14f)
                verticalLineTo(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 18.12f)
                lineTo(10f, 14f)
                horizontalLineTo(4.17f)
                curveTo(3.86f, 14f, 3.553f, 13.928f, 3.276f, 13.789f)
                curveTo(2.998f, 13.65f, 2.756f, 13.448f, 2.57f, 13.2f)
                curveTo(2.384f, 12.952f, 2.258f, 12.663f, 2.202f, 12.358f)
                curveTo(2.147f, 12.052f, 2.163f, 11.738f, 2.25f, 11.44f)
                lineTo(4.58f, 3.44f)
                curveTo(4.701f, 3.025f, 4.954f, 2.66f, 5.3f, 2.4f)
                curveTo(5.646f, 2.14f, 6.067f, 2f, 6.5f, 2f)
                horizontalLineTo(20f)
                curveTo(20.531f, 2f, 21.039f, 2.211f, 21.414f, 2.586f)
                curveTo(21.789f, 2.961f, 22f, 3.47f, 22f, 4f)
                verticalLineTo(12f)
                curveTo(22f, 12.53f, 21.789f, 13.039f, 21.414f, 13.414f)
                curveTo(21.039f, 13.789f, 20.531f, 14f, 20f, 14f)
                horizontalLineTo(17.24f)
                curveTo(16.868f, 14f, 16.503f, 14.104f, 16.187f, 14.3f)
                curveTo(15.871f, 14.496f, 15.616f, 14.777f, 15.45f, 15.11f)
                lineTo(12f, 22f)
                curveTo(11.528f, 21.994f, 11.064f, 21.882f, 10.642f, 21.671f)
                curveTo(10.22f, 21.461f, 9.851f, 21.158f, 9.563f, 20.785f)
                curveTo(9.274f, 20.412f, 9.074f, 19.978f, 8.976f, 19.517f)
                curveTo(8.879f, 19.055f, 8.887f, 18.578f, 9f, 18.12f)
                close()
            }
        }.build()

        return _ThumbsDown!!
    }

@Suppress("ObjectPropertyName")
private var _ThumbsDown: ImageVector? = null
