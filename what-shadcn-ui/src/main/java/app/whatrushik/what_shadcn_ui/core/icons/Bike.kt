package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Bike: ImageVector
    get() {
        if (_Bike != null) {
            return _Bike!!
        }
        _Bike = ImageVector.Builder(
            name = "Bike",
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
                moveTo(5.5f, 21f)
                curveTo(7.433f, 21f, 9f, 19.433f, 9f, 17.5f)
                curveTo(9f, 15.567f, 7.433f, 14f, 5.5f, 14f)
                curveTo(3.567f, 14f, 2f, 15.567f, 2f, 17.5f)
                curveTo(2f, 19.433f, 3.567f, 21f, 5.5f, 21f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.5f, 21f)
                curveTo(20.433f, 21f, 22f, 19.433f, 22f, 17.5f)
                curveTo(22f, 15.567f, 20.433f, 14f, 18.5f, 14f)
                curveTo(16.567f, 14f, 15f, 15.567f, 15f, 17.5f)
                curveTo(15f, 19.433f, 16.567f, 21f, 18.5f, 21f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 17.5f)
                verticalLineTo(14f)
                lineTo(9f, 11f)
                lineTo(13f, 8f)
                lineTo(15f, 11f)
                horizontalLineTo(17f)
                moveTo(15f, 6f)
                curveTo(15.265f, 6f, 15.52f, 5.895f, 15.707f, 5.707f)
                curveTo(15.895f, 5.52f, 16f, 5.265f, 16f, 5f)
                curveTo(16f, 4.735f, 15.895f, 4.48f, 15.707f, 4.293f)
                curveTo(15.52f, 4.105f, 15.265f, 4f, 15f, 4f)
                curveTo(14.735f, 4f, 14.48f, 4.105f, 14.293f, 4.293f)
                curveTo(14.105f, 4.48f, 14f, 4.735f, 14f, 5f)
                curveTo(14f, 5.265f, 14.105f, 5.52f, 14.293f, 5.707f)
                curveTo(14.48f, 5.895f, 14.735f, 6f, 15f, 6f)
                close()
            }
        }.build()

        return _Bike!!
    }

@Suppress("ObjectPropertyName")
private var _Bike: ImageVector? = null
