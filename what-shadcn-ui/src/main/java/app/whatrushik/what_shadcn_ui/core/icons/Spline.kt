package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Spline: ImageVector
    get() {
        if (_Spline != null) {
            return _Spline!!
        }
        _Spline = ImageVector.Builder(
            name = "Spline",
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
                moveTo(21f, 6f)
                verticalLineTo(4f)
                curveTo(21f, 3.4f, 20.6f, 3f, 20f, 3f)
                horizontalLineTo(18f)
                curveTo(17.735f, 3f, 17.48f, 3.105f, 17.293f, 3.293f)
                curveTo(17.105f, 3.48f, 17f, 3.735f, 17f, 4f)
                verticalLineTo(6f)
                curveTo(17f, 6.6f, 17.4f, 7f, 18f, 7f)
                horizontalLineTo(20f)
                curveTo(20.6f, 7f, 21f, 6.6f, 21f, 6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 20f)
                verticalLineTo(18f)
                curveTo(7f, 17.4f, 6.6f, 17f, 6f, 17f)
                horizontalLineTo(4f)
                curveTo(3.735f, 17f, 3.48f, 17.105f, 3.293f, 17.293f)
                curveTo(3.105f, 17.48f, 3f, 17.735f, 3f, 18f)
                verticalLineTo(20f)
                curveTo(3f, 20.6f, 3.4f, 21f, 4f, 21f)
                horizontalLineTo(6f)
                curveTo(6.6f, 21f, 7f, 20.6f, 7f, 20f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 17f)
                curveTo(5f, 13.817f, 6.264f, 10.765f, 8.515f, 8.515f)
                curveTo(10.765f, 6.264f, 13.817f, 5f, 17f, 5f)
            }
        }.build()

        return _Spline!!
    }

@Suppress("ObjectPropertyName")
private var _Spline: ImageVector? = null
