package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Nut: ImageVector
    get() {
        if (_Nut != null) {
            return _Nut!!
        }
        _Nut = ImageVector.Builder(
            name = "Nut",
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
                curveTo(15.232f, 20.403f, 16.57f, 19.528f, 17.525f, 18.299f)
                curveTo(18.481f, 17.069f, 19f, 15.557f, 19f, 14f)
                verticalLineTo(10f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 4f)
                curveTo(8f, 4f, 4.5f, 6f, 4f, 8f)
                curveTo(3.757f, 8.97f, 3.081f, 9.952f, 2f, 11f)
                curveTo(3.31f, 10.918f, 3.972f, 10.71f, 5f, 10f)
                curveTo(5.54f, 10.92f, 5.982f, 11.356f, 7f, 12f)
                curveTo(8.452f, 11.353f, 8.954f, 10.902f, 9.5f, 10f)
                curveTo(10.095f, 10.995f, 10.651f, 11.427f, 12f, 12f)
                curveTo(13.31f, 11.379f, 13.862f, 10.942f, 14.5f, 10f)
                curveTo(15.129f, 10.977f, 15.662f, 11.423f, 17f, 12f)
                curveTo(18.209f, 11.452f, 18.68f, 11.033f, 19f, 10f)
                curveTo(20.032f, 10.916f, 20.683f, 11.157f, 22f, 11f)
                curveTo(20.703f, 9.964f, 20.242f, 8.97f, 20f, 8f)
                curveTo(19.5f, 6f, 16f, 4f, 12f, 4f)
                close()
            }
        }.build()

        return _Nut!!
    }

@Suppress("ObjectPropertyName")
private var _Nut: ImageVector? = null
