package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.CandyOff: ImageVector
    get() {
        if (_CandyOff != null) {
            return _CandyOff!!
        }
        _CandyOff = ImageVector.Builder(
            name = "CandyOff",
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
                moveTo(8.5f, 8.5f)
                lineTo(7.5f, 9.5f)
                curveTo(6.587f, 10.431f, 6.079f, 11.686f, 6.085f, 12.99f)
                curveTo(6.092f, 14.294f, 6.613f, 15.543f, 7.535f, 16.465f)
                curveTo(8.457f, 17.387f, 9.706f, 17.908f, 11.01f, 17.915f)
                curveTo(12.314f, 17.921f, 13.568f, 17.413f, 14.5f, 16.5f)
                lineTo(15.5f, 15.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.843f, 6.187f)
                curveTo(12.667f, 5.989f, 13.528f, 6.005f, 14.343f, 6.235f)
                curveTo(15.158f, 6.465f, 15.901f, 6.901f, 16.5f, 7.5f)
                curveTo(17.099f, 8.099f, 17.535f, 8.842f, 17.765f, 9.657f)
                curveTo(17.995f, 10.472f, 18.011f, 11.333f, 17.813f, 12.157f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 16.5f)
                verticalLineTo(14f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 6.5f)
                verticalLineTo(8.343f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 10f)
                verticalLineTo(17.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 7f)
                lineTo(17f, 2f)
                lineTo(18.367f, 2.683f)
                curveTo(18.783f, 2.891f, 19.243f, 3f, 19.708f, 3f)
                horizontalLineTo(21f)
                verticalLineTo(4.292f)
                curveTo(21f, 4.758f, 21.109f, 5.217f, 21.317f, 5.633f)
                lineTo(22f, 7f)
                lineTo(17f, 8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 17f)
                lineTo(7f, 22f)
                lineTo(5.633f, 21.317f)
                curveTo(5.217f, 21.109f, 4.758f, 21f, 4.292f, 21f)
                horizontalLineTo(3f)
                verticalLineTo(19.708f)
                curveTo(3f, 19.243f, 2.891f, 18.783f, 2.683f, 18.367f)
                lineTo(2f, 17f)
                lineTo(7f, 16f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 2f)
                lineTo(22f, 22f)
            }
        }.build()

        return _CandyOff!!
    }

@Suppress("ObjectPropertyName")
private var _CandyOff: ImageVector? = null
