package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Microscope: ImageVector
    get() {
        if (_Microscope != null) {
            return _Microscope!!
        }
        _Microscope = ImageVector.Builder(
            name = "Microscope",
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
                moveTo(6f, 18f)
                horizontalLineTo(14f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 22f)
                horizontalLineTo(21f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 22f)
                curveTo(15.856f, 22f, 17.637f, 21.263f, 18.95f, 19.95f)
                curveTo(20.263f, 18.637f, 21f, 16.857f, 21f, 15f)
                curveTo(21f, 13.144f, 20.263f, 11.363f, 18.95f, 10.05f)
                curveTo(17.637f, 8.738f, 15.856f, 8f, 14f, 8f)
                horizontalLineTo(13f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 14f)
                horizontalLineTo(11f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 6f)
                horizontalLineTo(12f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 10f)
                verticalLineTo(6.5f)
                curveTo(13f, 6.367f, 12.947f, 6.24f, 12.854f, 6.146f)
                curveTo(12.76f, 6.053f, 12.633f, 6f, 12.5f, 6f)
                curveTo(12.367f, 6f, 12.24f, 5.947f, 12.146f, 5.854f)
                curveTo(12.053f, 5.76f, 12f, 5.633f, 12f, 5.5f)
                verticalLineTo(3f)
                curveTo(12f, 2.735f, 11.895f, 2.48f, 11.707f, 2.293f)
                curveTo(11.52f, 2.105f, 11.265f, 2f, 11f, 2f)
                horizontalLineTo(9f)
                curveTo(8.735f, 2f, 8.48f, 2.105f, 8.293f, 2.293f)
                curveTo(8.105f, 2.48f, 8f, 2.735f, 8f, 3f)
                verticalLineTo(5.5f)
                curveTo(8f, 5.633f, 7.947f, 5.76f, 7.854f, 5.854f)
                curveTo(7.76f, 5.947f, 7.633f, 6f, 7.5f, 6f)
                curveTo(7.367f, 6f, 7.24f, 6.053f, 7.146f, 6.146f)
                curveTo(7.053f, 6.24f, 7f, 6.367f, 7f, 6.5f)
                verticalLineTo(10f)
                curveTo(7f, 11.1f, 7.9f, 12f, 9f, 12f)
                horizontalLineTo(11f)
                curveTo(11.53f, 12f, 12.039f, 11.789f, 12.414f, 11.414f)
                curveTo(12.789f, 11.039f, 13f, 10.53f, 13f, 10f)
                close()
            }
        }.build()

        return _Microscope!!
    }

@Suppress("ObjectPropertyName")
private var _Microscope: ImageVector? = null
