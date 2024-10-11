package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.SunDim: ImageVector
    get() {
        if (_SunDim != null) {
            return _SunDim!!
        }
        _SunDim = ImageVector.Builder(
            name = "SunDim",
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
                moveTo(12f, 16f)
                curveTo(13.061f, 16f, 14.078f, 15.579f, 14.828f, 14.828f)
                curveTo(15.579f, 14.078f, 16f, 13.061f, 16f, 12f)
                curveTo(16f, 10.939f, 15.579f, 9.922f, 14.828f, 9.172f)
                curveTo(14.078f, 8.421f, 13.061f, 8f, 12f, 8f)
                curveTo(10.939f, 8f, 9.922f, 8.421f, 9.172f, 9.172f)
                curveTo(8.421f, 9.922f, 8f, 10.939f, 8f, 12f)
                curveTo(8f, 13.061f, 8.421f, 14.078f, 9.172f, 14.828f)
                curveTo(9.922f, 15.579f, 10.939f, 16f, 12f, 16f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 4f)
                horizontalLineTo(12.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 12f)
                horizontalLineTo(20.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 20f)
                horizontalLineTo(12.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 12f)
                horizontalLineTo(4.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.657f, 6.343f)
                horizontalLineTo(17.667f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.657f, 17.657f)
                horizontalLineTo(17.667f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.343f, 17.657f)
                horizontalLineTo(6.353f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.343f, 6.343f)
                horizontalLineTo(6.353f)
            }
        }.build()

        return _SunDim!!
    }

@Suppress("ObjectPropertyName")
private var _SunDim: ImageVector? = null
