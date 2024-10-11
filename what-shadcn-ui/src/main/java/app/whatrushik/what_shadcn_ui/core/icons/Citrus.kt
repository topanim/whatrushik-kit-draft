package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Citrus: ImageVector
    get() {
        if (_Citrus != null) {
            return _Citrus!!
        }
        _Citrus = ImageVector.Builder(
            name = "Citrus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(5.51f, 18.49f)
                    curveTo(7.619f, 20.601f, 10.439f, 21.85f, 13.419f, 21.995f)
                    curveTo(16.4f, 22.139f, 19.327f, 21.167f, 21.63f, 19.27f)
                    curveTo(22.12f, 18.86f, 22.12f, 18.12f, 21.66f, 17.67f)
                    lineTo(6.34f, 2.33f)
                    curveTo(6.237f, 2.22f, 6.111f, 2.133f, 5.973f, 2.075f)
                    curveTo(5.834f, 2.016f, 5.684f, 1.988f, 5.533f, 1.99f)
                    curveTo(5.383f, 1.993f, 5.234f, 2.028f, 5.098f, 2.091f)
                    curveTo(4.961f, 2.155f, 4.839f, 2.246f, 4.74f, 2.36f)
                    curveTo(2.834f, 4.662f, 1.856f, 7.592f, 1.996f, 10.577f)
                    curveTo(2.137f, 13.562f, 3.386f, 16.387f, 5.5f, 18.5f)
                    lineTo(5.51f, 18.49f)
                    close()
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(8.34f, 15.66f)
                    curveTo(9.694f, 17.012f, 11.487f, 17.834f, 13.396f, 17.978f)
                    curveTo(15.304f, 18.121f, 17.2f, 17.575f, 18.74f, 16.44f)
                    curveTo(19.28f, 16.04f, 19.28f, 15.28f, 18.8f, 14.8f)
                    lineTo(9.2f, 5.2f)
                    curveTo(8.72f, 4.72f, 7.95f, 4.72f, 7.56f, 5.26f)
                    curveTo(6.425f, 6.8f, 5.879f, 8.696f, 6.022f, 10.605f)
                    curveTo(6.166f, 12.513f, 6.988f, 14.306f, 8.34f, 15.66f)
                    close()
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(14f, 10f)
                    lineTo(8.5f, 15.5f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(14f, 10f)
                    verticalLineTo(18f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(14f, 10f)
                    horizontalLineTo(6f)
                }
            }
        }.build()

        return _Citrus!!
    }

@Suppress("ObjectPropertyName")
private var _Citrus: ImageVector? = null
