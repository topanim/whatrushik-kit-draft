package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.NutOff: ImageVector
    get() {
        if (_NutOff != null) {
            return _NutOff!!
        }
        _NutOff = ImageVector.Builder(
            name = "NutOff",
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
                moveTo(12f, 4f)
                verticalLineTo(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 10f)
                verticalLineTo(14f)
                curveTo(5f, 15.557f, 5.519f, 17.069f, 6.475f, 18.298f)
                curveTo(7.43f, 19.528f, 8.768f, 20.403f, 10.277f, 20.787f)
                curveTo(10.689f, 20.891f, 11.079f, 21.079f, 11.379f, 21.379f)
                lineTo(12f, 22f)
                lineTo(12.621f, 21.379f)
                curveTo(12.921f, 21.079f, 13.311f, 20.891f, 13.723f, 20.787f)
                curveTo(15.416f, 20.356f, 16.887f, 19.308f, 17.848f, 17.848f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 10f)
                verticalLineTo(13.343f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                curveTo(10.651f, 11.427f, 10.095f, 10.995f, 9.5f, 10f)
                curveTo(8.954f, 10.902f, 8.452f, 11.353f, 7f, 12f)
                curveTo(5.982f, 11.356f, 5.54f, 10.92f, 5f, 10f)
                curveTo(3.972f, 10.71f, 3.31f, 10.918f, 2f, 11f)
                curveTo(3.081f, 9.952f, 3.757f, 8.97f, 4f, 8f)
                curveTo(4.194f, 7.224f, 4.84f, 6.449f, 5.79f, 5.79f)
                moveTo(17.444f, 11.787f)
                curveTo(18.331f, 11.33f, 18.724f, 10.896f, 19f, 10f)
                curveTo(20.032f, 10.916f, 20.683f, 11.157f, 22f, 11f)
                curveTo(20.703f, 9.964f, 20.242f, 8.97f, 20f, 8f)
                curveTo(19.5f, 6f, 16f, 4f, 12f, 4f)
                curveTo(11.26f, 4f, 10.539f, 4.068f, 9.85f, 4.192f)
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

        return _NutOff!!
    }

@Suppress("ObjectPropertyName")
private var _NutOff: ImageVector? = null
