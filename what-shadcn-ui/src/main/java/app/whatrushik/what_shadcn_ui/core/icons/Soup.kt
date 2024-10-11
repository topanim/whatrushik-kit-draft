package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Soup: ImageVector
    get() {
        if (_Soup != null) {
            return _Soup!!
        }
        _Soup = ImageVector.Builder(
            name = "Soup",
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
                moveTo(12f, 21f)
                curveTo(14.387f, 21f, 16.676f, 20.052f, 18.364f, 18.364f)
                curveTo(20.052f, 16.676f, 21f, 14.387f, 21f, 12f)
                horizontalLineTo(3f)
                curveTo(3f, 14.387f, 3.948f, 16.676f, 5.636f, 18.364f)
                curveTo(7.324f, 20.052f, 9.613f, 21f, 12f, 21f)
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
                moveTo(19.5f, 12f)
                lineTo(22f, 6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.25f, 3f)
                curveTo(16.52f, 3.1f, 17.05f, 3.53f, 17f, 4.36f)
                curveTo(16.94f, 5.19f, 16.07f, 5.56f, 16f, 6.38f)
                curveTo(15.95f, 7.16f, 16.34f, 7.62f, 16.73f, 8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.25f, 3f)
                curveTo(11.52f, 3.1f, 12.05f, 3.53f, 11.99f, 4.36f)
                curveTo(11.94f, 5.19f, 11.06f, 5.56f, 11.01f, 6.38f)
                curveTo(10.95f, 7.16f, 11.34f, 7.62f, 11.73f, 8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.25f, 3f)
                curveTo(6.52f, 3.1f, 7.05f, 3.53f, 7f, 4.36f)
                curveTo(6.94f, 5.19f, 6.07f, 5.56f, 6f, 6.38f)
                curveTo(5.95f, 7.16f, 6.34f, 7.62f, 6.74f, 8f)
            }
        }.build()

        return _Soup!!
    }

@Suppress("ObjectPropertyName")
private var _Soup: ImageVector? = null
