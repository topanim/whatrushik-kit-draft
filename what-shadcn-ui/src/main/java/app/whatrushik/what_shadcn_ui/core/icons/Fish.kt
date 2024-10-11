package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Fish: ImageVector
    get() {
        if (_Fish != null) {
            return _Fish!!
        }
        _Fish = ImageVector.Builder(
            name = "Fish",
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
                moveTo(6.5f, 12f)
                curveTo(7.44f, 8.54f, 11.44f, 6f, 15f, 6f)
                curveTo(18.56f, 6f, 21.06f, 8.54f, 22f, 12f)
                curveTo(21.06f, 15.47f, 18.56f, 18f, 15f, 18f)
                curveTo(11.44f, 18f, 7.44f, 15.47f, 6.5f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 12f)
                verticalLineTo(12.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 17.93f)
                curveTo(14.699f, 16.227f, 13.995f, 14.143f, 13.995f, 12f)
                curveTo(13.995f, 9.857f, 14.699f, 7.773f, 16f, 6.07f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 10.67f)
                curveTo(7f, 8f, 5.58f, 5.97f, 2.73f, 5.5f)
                curveTo(1.73f, 7f, 1.73f, 10.5f, 2.96f, 12f)
                curveTo(1.72f, 13.5f, 1.72f, 17f, 2.73f, 18.5f)
                curveTo(5.58f, 18.03f, 7f, 16f, 7f, 13.33f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.46f, 7.26f)
                curveTo(10.2f, 5.88f, 9.17f, 4.24f, 8f, 3f)
                horizontalLineTo(13.8f)
                curveTo(14.274f, 2.998f, 14.734f, 3.165f, 15.097f, 3.471f)
                curveTo(15.46f, 3.777f, 15.702f, 4.202f, 15.78f, 4.67f)
                lineTo(16.01f, 6.07f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.01f, 17.93f)
                lineTo(15.78f, 19.33f)
                curveTo(15.702f, 19.798f, 15.46f, 20.223f, 15.097f, 20.529f)
                curveTo(14.734f, 20.835f, 14.274f, 21.002f, 13.8f, 21f)
                horizontalLineTo(9.5f)
                curveTo(10.469f, 19.902f, 10.999f, 18.485f, 10.99f, 17.02f)
            }
        }.build()

        return _Fish!!
    }

@Suppress("ObjectPropertyName")
private var _Fish: ImageVector? = null
