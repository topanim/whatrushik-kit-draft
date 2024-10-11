package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.AlignCenterVertical: ImageVector
    get() {
        if (_AlignCenterVertical != null) {
            return _AlignCenterVertical!!
        }
        _AlignCenterVertical = ImageVector.Builder(
            name = "AlignCenterVertical",
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
                moveTo(12f, 2f)
                verticalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 10f)
                horizontalLineTo(4f)
                curveTo(3.47f, 10f, 2.961f, 9.789f, 2.586f, 9.414f)
                curveTo(2.211f, 9.039f, 2f, 8.53f, 2f, 8f)
                verticalLineTo(6f)
                curveTo(2f, 4.9f, 2.9f, 4f, 4f, 4f)
                horizontalLineTo(8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 10f)
                horizontalLineTo(20f)
                curveTo(20.53f, 10f, 21.039f, 9.789f, 21.414f, 9.414f)
                curveTo(21.789f, 9.039f, 22f, 8.53f, 22f, 8f)
                verticalLineTo(6f)
                curveTo(22f, 5.47f, 21.789f, 4.961f, 21.414f, 4.586f)
                curveTo(21.039f, 4.211f, 20.53f, 4f, 20f, 4f)
                horizontalLineTo(16f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 20f)
                horizontalLineTo(7f)
                curveTo(6.47f, 20f, 5.961f, 19.789f, 5.586f, 19.414f)
                curveTo(5.211f, 19.039f, 5f, 18.53f, 5f, 18f)
                verticalLineTo(16f)
                curveTo(5f, 14.9f, 5.9f, 14f, 7f, 14f)
                horizontalLineTo(8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 14f)
                horizontalLineTo(17f)
                curveTo(17.53f, 14f, 18.039f, 14.211f, 18.414f, 14.586f)
                curveTo(18.789f, 14.961f, 19f, 15.47f, 19f, 16f)
                verticalLineTo(18f)
                curveTo(19f, 18.53f, 18.789f, 19.039f, 18.414f, 19.414f)
                curveTo(18.039f, 19.789f, 17.53f, 20f, 17f, 20f)
                horizontalLineTo(16f)
            }
        }.build()

        return _AlignCenterVertical!!
    }

@Suppress("ObjectPropertyName")
private var _AlignCenterVertical: ImageVector? = null
