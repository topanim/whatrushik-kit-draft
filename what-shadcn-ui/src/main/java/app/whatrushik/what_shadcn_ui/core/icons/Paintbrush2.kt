package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Paintbrush2: ImageVector
    get() {
        if (_Paintbrush2 != null) {
            return _Paintbrush2!!
        }
        _Paintbrush2 = ImageVector.Builder(
            name = "Paintbrush2",
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
                moveTo(14f, 19.9f)
                verticalLineTo(16f)
                horizontalLineTo(17f)
                curveTo(17.53f, 16f, 18.039f, 15.789f, 18.414f, 15.414f)
                curveTo(18.789f, 15.039f, 19f, 14.53f, 19f, 14f)
                verticalLineTo(12f)
                horizontalLineTo(5f)
                verticalLineTo(14f)
                curveTo(5f, 15.1f, 5.9f, 16f, 7f, 16f)
                horizontalLineTo(10f)
                verticalLineTo(19.9f)
                curveTo(10f, 20.43f, 10.211f, 20.939f, 10.586f, 21.314f)
                curveTo(10.961f, 21.689f, 11.47f, 21.9f, 12f, 21.9f)
                curveTo(12.53f, 21.9f, 13.039f, 21.689f, 13.414f, 21.314f)
                curveTo(13.789f, 20.939f, 14f, 20.43f, 14f, 19.9f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 12f)
                verticalLineTo(2f)
                horizontalLineTo(18f)
                verticalLineTo(12f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 2f)
                verticalLineTo(6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 2f)
                verticalLineTo(4f)
            }
        }.build()

        return _Paintbrush2!!
    }

@Suppress("ObjectPropertyName")
private var _Paintbrush2: ImageVector? = null
