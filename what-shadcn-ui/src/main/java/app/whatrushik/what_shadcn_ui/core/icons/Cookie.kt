package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Cookie: ImageVector
    get() {
        if (_Cookie != null) {
            return _Cookie!!
        }
        _Cookie = ImageVector.Builder(
            name = "Cookie",
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
                curveTo(10.022f, 2f, 8.089f, 2.586f, 6.444f, 3.685f)
                curveTo(4.8f, 4.784f, 3.518f, 6.346f, 2.761f, 8.173f)
                curveTo(2.004f, 10f, 1.806f, 12.011f, 2.192f, 13.951f)
                curveTo(2.578f, 15.891f, 3.53f, 17.673f, 4.929f, 19.071f)
                curveTo(6.327f, 20.47f, 8.109f, 21.422f, 10.049f, 21.808f)
                curveTo(11.989f, 22.194f, 14f, 21.996f, 15.827f, 21.239f)
                curveTo(17.654f, 20.482f, 19.216f, 19.2f, 20.315f, 17.556f)
                curveTo(21.413f, 15.911f, 22f, 13.978f, 22f, 12f)
                curveTo(21.305f, 12.214f, 20.565f, 12.234f, 19.859f, 12.059f)
                curveTo(19.153f, 11.884f, 18.509f, 11.52f, 17.994f, 11.006f)
                curveTo(17.48f, 10.491f, 17.116f, 9.847f, 16.941f, 9.141f)
                curveTo(16.765f, 8.435f, 16.786f, 7.695f, 17f, 7f)
                curveTo(16.305f, 7.214f, 15.565f, 7.234f, 14.859f, 7.059f)
                curveTo(14.153f, 6.884f, 13.509f, 6.52f, 12.995f, 6.006f)
                curveTo(12.48f, 5.491f, 12.116f, 4.847f, 11.941f, 4.141f)
                curveTo(11.766f, 3.435f, 11.786f, 2.695f, 12f, 2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.5f, 8.5f)
                verticalLineTo(8.51f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 15.5f)
                verticalLineTo(15.51f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                verticalLineTo(12.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 17f)
                verticalLineTo(17.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 14f)
                verticalLineTo(14.01f)
            }
        }.build()

        return _Cookie!!
    }

@Suppress("ObjectPropertyName")
private var _Cookie: ImageVector? = null
