package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Shrub: ImageVector
    get() {
        if (_Shrub != null) {
            return _Shrub!!
        }
        _Shrub = ImageVector.Builder(
            name = "Shrub",
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
                moveTo(12f, 22f)
                verticalLineTo(15f)
                lineTo(10f, 13f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 8f)
                verticalLineTo(8.8f)
                curveTo(18.163f, 9.467f, 19.068f, 10.505f, 19.573f, 11.746f)
                curveTo(20.077f, 12.988f, 20.151f, 14.363f, 19.782f, 15.652f)
                curveTo(19.414f, 16.941f, 18.625f, 18.069f, 17.541f, 18.857f)
                curveTo(16.456f, 19.645f, 15.14f, 20.048f, 13.8f, 20f)
                horizontalLineTo(10f)
                curveTo(8.629f, 19.907f, 7.323f, 19.382f, 6.269f, 18.5f)
                curveTo(5.215f, 17.618f, 4.468f, 16.425f, 4.134f, 15.091f)
                curveTo(3.801f, 13.758f, 3.899f, 12.354f, 4.414f, 11.08f)
                curveTo(4.929f, 9.805f, 5.834f, 8.727f, 7f, 8f)
                curveTo(7f, 6.674f, 7.527f, 5.402f, 8.464f, 4.464f)
                curveTo(9.402f, 3.527f, 10.674f, 3f, 12f, 3f)
                curveTo(13.326f, 3f, 14.598f, 3.527f, 15.536f, 4.464f)
                curveTo(16.473f, 5.402f, 17f, 6.674f, 17f, 8f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 14f)
                lineTo(12f, 16f)
            }
        }.build()

        return _Shrub!!
    }

@Suppress("ObjectPropertyName")
private var _Shrub: ImageVector? = null
