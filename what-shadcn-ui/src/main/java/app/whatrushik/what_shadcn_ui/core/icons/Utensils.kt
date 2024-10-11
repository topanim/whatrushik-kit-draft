package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Utensils: ImageVector
    get() {
        if (_Utensils != null) {
            return _Utensils!!
        }
        _Utensils = ImageVector.Builder(
            name = "Utensils",
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
                moveTo(3f, 2f)
                verticalLineTo(9f)
                curveTo(3f, 10.1f, 3.9f, 11f, 5f, 11f)
                horizontalLineTo(9f)
                curveTo(9.53f, 11f, 10.039f, 10.789f, 10.414f, 10.414f)
                curveTo(10.789f, 10.039f, 11f, 9.53f, 11f, 9f)
                verticalLineTo(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 2f)
                verticalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 15f)
                verticalLineTo(2f)
                curveTo(19.674f, 2f, 18.402f, 2.527f, 17.465f, 3.464f)
                curveTo(16.527f, 4.402f, 16f, 5.674f, 16f, 7f)
                verticalLineTo(13f)
                curveTo(16f, 14.1f, 16.9f, 15f, 18f, 15f)
                horizontalLineTo(21f)
                close()
                moveTo(21f, 15f)
                verticalLineTo(22f)
            }
        }.build()

        return _Utensils!!
    }

@Suppress("ObjectPropertyName")
private var _Utensils: ImageVector? = null
