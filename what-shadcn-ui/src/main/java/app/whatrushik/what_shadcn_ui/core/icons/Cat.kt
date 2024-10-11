package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Cat: ImageVector
    get() {
        if (_Cat != null) {
            return _Cat!!
        }
        _Cat = ImageVector.Builder(
            name = "Cat",
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
                moveTo(14f, 5.256f)
                curveTo(13.347f, 5.088f, 12.675f, 5.002f, 12f, 5f)
                curveTo(11.327f, 5.001f, 10.656f, 5.077f, 10f, 5.227f)
                moveTo(20.098f, 10f)
                curveTo(20.67f, 11.068f, 21f, 12.24f, 21f, 13.444f)
                curveTo(21f, 17.89f, 16.97f, 21f, 12f, 21f)
                curveTo(7.03f, 21f, 3f, 18f, 3f, 13.444f)
                curveTo(3f, 12.193f, 3.288f, 11.034f, 3.792f, 10f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.75f, 10f)
                curveTo(3.75f, 10f, 2.11f, 3.58f, 3.5f, 3f)
                curveTo(4.89f, 2.42f, 8f, 3f, 9.781f, 5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.172f, 10.002f)
                curveTo(20.172f, 10.002f, 21.812f, 3.582f, 20.422f, 3.002f)
                curveTo(19.032f, 2.422f, 15.922f, 3.002f, 14.14f, 5.002f)
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
        }.build()

        return _Cat!!
    }

@Suppress("ObjectPropertyName")
private var _Cat: ImageVector? = null
