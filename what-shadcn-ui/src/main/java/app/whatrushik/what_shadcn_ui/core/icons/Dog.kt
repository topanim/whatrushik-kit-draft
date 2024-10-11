package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Dog: ImageVector
    get() {
        if (_Dog != null) {
            return _Dog!!
        }
        _Dog = ImageVector.Builder(
            name = "Dog",
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
                moveTo(10f, 5.172f)
                curveTo(10f, 3.782f, 8.423f, 2.679f, 6.5f, 3f)
                curveTo(3.677f, 3.47f, 2.387f, 9.006f, 2.5f, 10f)
                curveTo(2.58f, 10.703f, 4.225f, 11.722f, 6.156f, 11f)
                curveTo(7.417f, 10.528f, 8.116f, 9.55f, 8.5f, 8.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.267f, 5.172f)
                curveTo(14.267f, 3.782f, 15.844f, 2.679f, 17.767f, 3f)
                curveTo(20.59f, 3.47f, 21.88f, 9.006f, 21.767f, 10f)
                curveTo(21.687f, 10.703f, 20.042f, 11.722f, 18.111f, 11f)
                curveTo(16.85f, 10.528f, 16.256f, 9.55f, 15.872f, 8.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 14f)
                verticalLineTo(14.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 14f)
                verticalLineTo(14.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.25f, 16.25f)
                horizontalLineTo(12.75f)
                lineTo(12f, 17f)
                lineTo(11.25f, 16.25f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.42f, 11.247f)
                curveTo(4.14f, 12.328f, 3.999f, 13.44f, 4f, 14.556f)
                curveTo(4f, 18.728f, 7.582f, 21f, 12f, 21f)
                curveTo(16.418f, 21f, 20f, 18.728f, 20f, 14.556f)
                curveTo(20f, 13.495f, 19.838f, 12.356f, 19.507f, 11.247f)
                moveTo(10.264f, 5.165f)
                curveTo(10.836f, 5.053f, 11.417f, 4.997f, 12f, 5f)
                curveTo(12.78f, 5f, 13.5f, 5.108f, 14.161f, 5.306f)
            }
        }.build()

        return _Dog!!
    }

@Suppress("ObjectPropertyName")
private var _Dog: ImageVector? = null
