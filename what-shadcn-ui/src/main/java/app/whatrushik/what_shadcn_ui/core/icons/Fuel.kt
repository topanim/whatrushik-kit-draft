package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Fuel: ImageVector
    get() {
        if (_Fuel != null) {
            return _Fuel!!
        }
        _Fuel = ImageVector.Builder(
            name = "Fuel",
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
                moveTo(3f, 22f)
                horizontalLineTo(15f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 9f)
                horizontalLineTo(14f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 22f)
                verticalLineTo(4f)
                curveTo(14f, 3.47f, 13.789f, 2.961f, 13.414f, 2.586f)
                curveTo(13.039f, 2.211f, 12.53f, 2f, 12f, 2f)
                horizontalLineTo(6f)
                curveTo(5.47f, 2f, 4.961f, 2.211f, 4.586f, 2.586f)
                curveTo(4.211f, 2.961f, 4f, 3.47f, 4f, 4f)
                verticalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 13f)
                horizontalLineTo(16f)
                curveTo(16.53f, 13f, 17.039f, 13.211f, 17.414f, 13.586f)
                curveTo(17.789f, 13.961f, 18f, 14.47f, 18f, 15f)
                verticalLineTo(17f)
                curveTo(18f, 17.53f, 18.211f, 18.039f, 18.586f, 18.414f)
                curveTo(18.961f, 18.789f, 19.47f, 19f, 20f, 19f)
                curveTo(20.53f, 19f, 21.039f, 18.789f, 21.414f, 18.414f)
                curveTo(21.789f, 18.039f, 22f, 17.53f, 22f, 17f)
                verticalLineTo(9.83f)
                curveTo(22f, 9.566f, 21.948f, 9.305f, 21.847f, 9.061f)
                curveTo(21.746f, 8.817f, 21.597f, 8.596f, 21.41f, 8.41f)
                lineTo(18f, 5f)
            }
        }.build()

        return _Fuel!!
    }

@Suppress("ObjectPropertyName")
private var _Fuel: ImageVector? = null
