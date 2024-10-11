package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.HardHat: ImageVector
    get() {
        if (_HardHat != null) {
            return _HardHat!!
        }
        _HardHat = ImageVector.Builder(
            name = "HardHat",
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
                moveTo(2f, 18f)
                curveTo(2f, 18.265f, 2.105f, 18.52f, 2.293f, 18.707f)
                curveTo(2.48f, 18.895f, 2.735f, 19f, 3f, 19f)
                horizontalLineTo(21f)
                curveTo(21.265f, 19f, 21.52f, 18.895f, 21.707f, 18.707f)
                curveTo(21.895f, 18.52f, 22f, 18.265f, 22f, 18f)
                verticalLineTo(16f)
                curveTo(22f, 15.735f, 21.895f, 15.48f, 21.707f, 15.293f)
                curveTo(21.52f, 15.105f, 21.265f, 15f, 21f, 15f)
                horizontalLineTo(3f)
                curveTo(2.735f, 15f, 2.48f, 15.105f, 2.293f, 15.293f)
                curveTo(2.105f, 15.48f, 2f, 15.735f, 2f, 16f)
                verticalLineTo(18f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 10f)
                verticalLineTo(5f)
                curveTo(10f, 4.735f, 10.105f, 4.48f, 10.293f, 4.293f)
                curveTo(10.48f, 4.105f, 10.735f, 4f, 11f, 4f)
                horizontalLineTo(13f)
                curveTo(13.265f, 4f, 13.52f, 4.105f, 13.707f, 4.293f)
                curveTo(13.895f, 4.48f, 14f, 4.735f, 14f, 5f)
                verticalLineTo(10f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 15f)
                verticalLineTo(12f)
                curveTo(4f, 10.409f, 4.632f, 8.883f, 5.757f, 7.757f)
                curveTo(6.883f, 6.632f, 8.409f, 6f, 10f, 6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 6f)
                curveTo(15.591f, 6f, 17.117f, 6.632f, 18.243f, 7.757f)
                curveTo(19.368f, 8.883f, 20f, 10.409f, 20f, 12f)
                verticalLineTo(15f)
            }
        }.build()

        return _HardHat!!
    }

@Suppress("ObjectPropertyName")
private var _HardHat: ImageVector? = null
