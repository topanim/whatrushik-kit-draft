package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Truck: ImageVector
    get() {
        if (_Truck != null) {
            return _Truck!!
        }
        _Truck = ImageVector.Builder(
            name = "Truck",
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
                moveTo(10f, 17f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                horizontalLineTo(2f)
                verticalLineTo(17f)
                horizontalLineTo(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 17f)
                horizontalLineTo(22f)
                verticalLineTo(13.66f)
                curveTo(22f, 13.135f, 21.897f, 12.614f, 21.697f, 12.129f)
                curveTo(21.496f, 11.643f, 21.201f, 11.202f, 20.83f, 10.83f)
                lineTo(19f, 9f)
                horizontalLineTo(14f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 17f)
                horizontalLineTo(15f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.5f, 20f)
                curveTo(8.881f, 20f, 10f, 18.881f, 10f, 17.5f)
                curveTo(10f, 16.119f, 8.881f, 15f, 7.5f, 15f)
                curveTo(6.119f, 15f, 5f, 16.119f, 5f, 17.5f)
                curveTo(5f, 18.881f, 6.119f, 20f, 7.5f, 20f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.5f, 20f)
                curveTo(18.881f, 20f, 20f, 18.881f, 20f, 17.5f)
                curveTo(20f, 16.119f, 18.881f, 15f, 17.5f, 15f)
                curveTo(16.119f, 15f, 15f, 16.119f, 15f, 17.5f)
                curveTo(15f, 18.881f, 16.119f, 20f, 17.5f, 20f)
                close()
            }
        }.build()

        return _Truck!!
    }

@Suppress("ObjectPropertyName")
private var _Truck: ImageVector? = null
