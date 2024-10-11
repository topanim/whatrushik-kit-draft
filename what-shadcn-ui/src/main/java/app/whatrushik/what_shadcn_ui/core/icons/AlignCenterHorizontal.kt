package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.AlignCenterHorizontal: ImageVector
    get() {
        if (_AlignCenterHorizontal != null) {
            return _AlignCenterHorizontal!!
        }
        _AlignCenterHorizontal = ImageVector.Builder(
            name = "AlignCenterHorizontal",
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
                moveTo(2f, 12f)
                horizontalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 16f)
                verticalLineTo(20f)
                curveTo(10f, 20.53f, 9.789f, 21.039f, 9.414f, 21.414f)
                curveTo(9.039f, 21.789f, 8.53f, 22f, 8f, 22f)
                horizontalLineTo(6f)
                curveTo(5.47f, 22f, 4.961f, 21.789f, 4.586f, 21.414f)
                curveTo(4.211f, 21.039f, 4f, 20.53f, 4f, 20f)
                verticalLineTo(16f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 8f)
                verticalLineTo(4f)
                curveTo(10f, 3.47f, 9.789f, 2.961f, 9.414f, 2.586f)
                curveTo(9.039f, 2.211f, 8.53f, 2f, 8f, 2f)
                horizontalLineTo(6f)
                curveTo(5.47f, 2f, 4.961f, 2.211f, 4.586f, 2.586f)
                curveTo(4.211f, 2.961f, 4f, 3.47f, 4f, 4f)
                verticalLineTo(8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 16f)
                verticalLineTo(17f)
                curveTo(20f, 17.53f, 19.789f, 18.039f, 19.414f, 18.414f)
                curveTo(19.039f, 18.789f, 18.53f, 19f, 18f, 19f)
                horizontalLineTo(16f)
                curveTo(15.47f, 19f, 14.961f, 18.789f, 14.586f, 18.414f)
                curveTo(14.211f, 18.039f, 14f, 17.53f, 14f, 17f)
                verticalLineTo(16f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 8f)
                verticalLineTo(7f)
                curveTo(14f, 5.9f, 14.9f, 5f, 16f, 5f)
                horizontalLineTo(18f)
                curveTo(18.53f, 5f, 19.039f, 5.211f, 19.414f, 5.586f)
                curveTo(19.789f, 5.961f, 20f, 6.47f, 20f, 7f)
                verticalLineTo(8f)
            }
        }.build()

        return _AlignCenterHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _AlignCenterHorizontal: ImageVector? = null
