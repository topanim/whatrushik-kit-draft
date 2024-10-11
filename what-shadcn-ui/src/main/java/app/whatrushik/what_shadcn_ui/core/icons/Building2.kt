package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Building2: ImageVector
    get() {
        if (_Building2 != null) {
            return _Building2!!
        }
        _Building2 = ImageVector.Builder(
            name = "Building2",
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
                moveTo(6f, 22f)
                verticalLineTo(4f)
                curveTo(6f, 3.73f, 6f, 3.45f, 6.07f, 3.18f)
                curveTo(6.131f, 2.911f, 6.267f, 2.664f, 6.461f, 2.468f)
                curveTo(6.656f, 2.271f, 6.901f, 2.134f, 7.17f, 2.07f)
                curveTo(7.46f, 2f, 8.73f, 2f, 9f, 2f)
                horizontalLineTo(16f)
                curveTo(16.27f, 2f, 16.55f, 2f, 16.82f, 2.07f)
                curveTo(17.089f, 2.131f, 17.336f, 2.267f, 17.532f, 2.461f)
                curveTo(17.729f, 2.656f, 17.866f, 2.901f, 17.93f, 3.17f)
                curveTo(18f, 3.45f, 18f, 3.73f, 18f, 4f)
                verticalLineTo(22f)
                horizontalLineTo(6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 14f)
                verticalLineTo(20f)
                curveTo(2f, 21.1f, 2.9f, 22f, 4f, 22f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                horizontalLineTo(4f)
                curveTo(3.73f, 12f, 3.45f, 12f, 3.18f, 12.07f)
                curveTo(2.91f, 12.14f, 2.66f, 12.27f, 2.46f, 12.47f)
                curveTo(2.27f, 12.66f, 2.14f, 12.91f, 2.07f, 13.18f)
                curveTo(2.014f, 13.45f, 1.99f, 13.725f, 2f, 14f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.82f, 9.07f)
                curveTo(20.551f, 9.014f, 20.275f, 8.99f, 20f, 9f)
                horizontalLineTo(18f)
                verticalLineTo(22f)
                horizontalLineTo(20f)
                curveTo(20.53f, 22f, 21.039f, 21.789f, 21.414f, 21.414f)
                curveTo(21.789f, 21.039f, 22f, 20.531f, 22f, 20f)
                verticalLineTo(11f)
                curveTo(22f, 10.72f, 22f, 10.45f, 21.93f, 10.18f)
                curveTo(21.86f, 9.91f, 21.73f, 9.66f, 21.53f, 9.46f)
                curveTo(21.34f, 9.27f, 21.09f, 9.14f, 20.82f, 9.07f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 6f)
                horizontalLineTo(14f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 10f)
                horizontalLineTo(14f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 14f)
                horizontalLineTo(14f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 18f)
                horizontalLineTo(14f)
            }
        }.build()

        return _Building2!!
    }

@Suppress("ObjectPropertyName")
private var _Building2: ImageVector? = null
