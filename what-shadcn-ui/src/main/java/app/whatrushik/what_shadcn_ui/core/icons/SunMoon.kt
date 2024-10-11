package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.SunMoon: ImageVector
    get() {
        if (_SunMoon != null) {
            return _SunMoon!!
        }
        _SunMoon = ImageVector.Builder(
            name = "SunMoon",
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
                moveTo(12f, 8f)
                curveTo(11.47f, 8.53f, 11.172f, 9.25f, 11.172f, 10f)
                curveTo(11.172f, 10.75f, 11.47f, 11.47f, 12f, 12f)
                curveTo(12.531f, 12.53f, 13.25f, 12.828f, 14f, 12.828f)
                curveTo(14.75f, 12.828f, 15.47f, 12.53f, 16f, 12f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 2f)
                verticalLineTo(4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 20f)
                verticalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.93f, 4.93f)
                lineTo(6.34f, 6.34f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.66f, 17.66f)
                lineTo(19.07f, 19.07f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 12f)
                horizontalLineTo(4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 12f)
                horizontalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.34f, 17.66f)
                lineTo(4.93f, 19.07f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.07f, 4.93f)
                lineTo(17.66f, 6.34f)
            }
        }.build()

        return _SunMoon!!
    }

@Suppress("ObjectPropertyName")
private var _SunMoon: ImageVector? = null
