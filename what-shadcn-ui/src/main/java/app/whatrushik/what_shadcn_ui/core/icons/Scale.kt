package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Scale: ImageVector
    get() {
        if (_Scale != null) {
            return _Scale!!
        }
        _Scale = ImageVector.Builder(
            name = "Scale",
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
                moveTo(16f, 16f)
                lineTo(19f, 8f)
                lineTo(22f, 16f)
                curveTo(21.13f, 16.65f, 20.08f, 17f, 19f, 17f)
                curveTo(17.92f, 17f, 16.87f, 16.65f, 16f, 16f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 16f)
                lineTo(5f, 8f)
                lineTo(8f, 16f)
                curveTo(7.13f, 16.65f, 6.08f, 17f, 5f, 17f)
                curveTo(3.92f, 17f, 2.87f, 16.65f, 2f, 16f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 21f)
                horizontalLineTo(17f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 3f)
                verticalLineTo(21f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 7f)
                horizontalLineTo(5f)
                curveTo(7f, 7f, 10f, 6f, 12f, 5f)
                curveTo(14f, 6f, 17f, 7f, 19f, 7f)
                horizontalLineTo(21f)
            }
        }.build()

        return _Scale!!
    }

@Suppress("ObjectPropertyName")
private var _Scale: ImageVector? = null
