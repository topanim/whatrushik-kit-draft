package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Sandwich: ImageVector
    get() {
        if (_Sandwich != null) {
            return _Sandwich!!
        }
        _Sandwich = ImageVector.Builder(
            name = "Sandwich",
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
                moveTo(3f, 11f)
                verticalLineTo(14f)
                curveTo(3f, 14.265f, 3.105f, 14.52f, 3.293f, 14.707f)
                curveTo(3.48f, 14.895f, 3.735f, 15f, 4f, 15f)
                horizontalLineTo(20f)
                curveTo(20.265f, 15f, 20.52f, 14.895f, 20.707f, 14.707f)
                curveTo(20.895f, 14.52f, 21f, 14.265f, 21f, 14f)
                verticalLineTo(11f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 19f)
                horizontalLineTo(4f)
                curveTo(3.735f, 19f, 3.48f, 18.895f, 3.293f, 18.707f)
                curveTo(3.105f, 18.52f, 3f, 18.265f, 3f, 18f)
                verticalLineTo(16f)
                curveTo(3f, 15.735f, 3.105f, 15.48f, 3.293f, 15.293f)
                curveTo(3.48f, 15.105f, 3.735f, 15f, 4f, 15f)
                horizontalLineTo(20f)
                curveTo(20.265f, 15f, 20.52f, 15.105f, 20.707f, 15.293f)
                curveTo(20.895f, 15.48f, 21f, 15.735f, 21f, 16f)
                verticalLineTo(18f)
                curveTo(21f, 18.265f, 20.895f, 18.52f, 20.707f, 18.707f)
                curveTo(20.52f, 18.895f, 20.265f, 19f, 20f, 19f)
                horizontalLineTo(16.17f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 11f)
                lineTo(10.77f, 4.96f)
                curveTo(11.121f, 4.686f, 11.554f, 4.537f, 12f, 4.537f)
                curveTo(12.446f, 4.537f, 12.879f, 4.686f, 13.23f, 4.96f)
                lineTo(21f, 11f)
                horizontalLineTo(3f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.97f, 19.77f)
                lineTo(7f, 15f)
                horizontalLineTo(19.5f)
                lineTo(15.75f, 19.5f)
                curveTo(15.413f, 19.899f, 14.934f, 20.15f, 14.415f, 20.201f)
                curveTo(13.896f, 20.251f, 13.377f, 20.097f, 12.97f, 19.77f)
                close()
            }
        }.build()

        return _Sandwich!!
    }

@Suppress("ObjectPropertyName")
private var _Sandwich: ImageVector? = null
