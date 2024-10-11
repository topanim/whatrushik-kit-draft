package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Backpack: ImageVector
    get() {
        if (_Backpack != null) {
            return _Backpack!!
        }
        _Backpack = ImageVector.Builder(
            name = "Backpack",
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
                moveTo(4f, 20f)
                verticalLineTo(10f)
                curveTo(4f, 8.939f, 4.421f, 7.922f, 5.172f, 7.172f)
                curveTo(5.922f, 6.421f, 6.939f, 6f, 8f, 6f)
                horizontalLineTo(16f)
                curveTo(17.061f, 6f, 18.078f, 6.421f, 18.828f, 7.172f)
                curveTo(19.579f, 7.922f, 20f, 8.939f, 20f, 10f)
                verticalLineTo(20f)
                curveTo(20f, 20.53f, 19.789f, 21.039f, 19.414f, 21.414f)
                curveTo(19.039f, 21.789f, 18.53f, 22f, 18f, 22f)
                horizontalLineTo(6f)
                curveTo(5.47f, 22f, 4.961f, 21.789f, 4.586f, 21.414f)
                curveTo(4.211f, 21.039f, 4f, 20.53f, 4f, 20f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 6f)
                verticalLineTo(4f)
                curveTo(9f, 3.47f, 9.211f, 2.961f, 9.586f, 2.586f)
                curveTo(9.961f, 2.211f, 10.47f, 2f, 11f, 2f)
                horizontalLineTo(13f)
                curveTo(13.53f, 2f, 14.039f, 2.211f, 14.414f, 2.586f)
                curveTo(14.789f, 2.961f, 15f, 3.47f, 15f, 4f)
                verticalLineTo(6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 21f)
                verticalLineTo(16f)
                curveTo(8f, 15.47f, 8.211f, 14.961f, 8.586f, 14.586f)
                curveTo(8.961f, 14.211f, 9.47f, 14f, 10f, 14f)
                horizontalLineTo(14f)
                curveTo(14.53f, 14f, 15.039f, 14.211f, 15.414f, 14.586f)
                curveTo(15.789f, 14.961f, 16f, 15.47f, 16f, 16f)
                verticalLineTo(21f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 10f)
                horizontalLineTo(16f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 18f)
                horizontalLineTo(16f)
            }
        }.build()

        return _Backpack!!
    }

@Suppress("ObjectPropertyName")
private var _Backpack: ImageVector? = null
