package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Bus: ImageVector
    get() {
        if (_Bus != null) {
            return _Bus!!
        }
        _Bus = ImageVector.Builder(
            name = "Bus",
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
                moveTo(19f, 17f)
                horizontalLineTo(21f)
                lineTo(21.64f, 14.46f)
                curveTo(21.88f, 13.501f, 21.88f, 12.498f, 21.64f, 11.54f)
                lineTo(20.57f, 7.27f)
                curveTo(20.407f, 6.621f, 20.033f, 6.046f, 19.505f, 5.635f)
                curveTo(18.978f, 5.223f, 18.329f, 5f, 17.66f, 5f)
                horizontalLineTo(4f)
                curveTo(3.47f, 5f, 2.961f, 5.211f, 2.586f, 5.586f)
                curveTo(2.211f, 5.961f, 2f, 6.47f, 2f, 7f)
                verticalLineTo(17f)
                horizontalLineTo(4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 17f)
                horizontalLineTo(9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.5f, 20f)
                curveTo(7.881f, 20f, 9f, 18.881f, 9f, 17.5f)
                curveTo(9f, 16.119f, 7.881f, 15f, 6.5f, 15f)
                curveTo(5.119f, 15f, 4f, 16.119f, 4f, 17.5f)
                curveTo(4f, 18.881f, 5.119f, 20f, 6.5f, 20f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.5f, 20f)
                curveTo(17.881f, 20f, 19f, 18.881f, 19f, 17.5f)
                curveTo(19f, 16.119f, 17.881f, 15f, 16.5f, 15f)
                curveTo(15.119f, 15f, 14f, 16.119f, 14f, 17.5f)
                curveTo(14f, 18.881f, 15.119f, 20f, 16.5f, 20f)
                close()
            }
        }.build()

        return _Bus!!
    }

@Suppress("ObjectPropertyName")
private var _Bus: ImageVector? = null
