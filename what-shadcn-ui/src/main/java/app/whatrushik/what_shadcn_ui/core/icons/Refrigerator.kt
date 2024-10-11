package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Refrigerator: ImageVector
    get() {
        if (_Refrigerator != null) {
            return _Refrigerator!!
        }
        _Refrigerator = ImageVector.Builder(
            name = "Refrigerator",
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
                moveTo(5f, 6f)
                curveTo(5f, 4.939f, 5.421f, 3.922f, 6.172f, 3.172f)
                curveTo(6.922f, 2.421f, 7.939f, 2f, 9f, 2f)
                horizontalLineTo(15f)
                curveTo(16.061f, 2f, 17.078f, 2.421f, 17.828f, 3.172f)
                curveTo(18.579f, 3.922f, 19f, 4.939f, 19f, 6f)
                verticalLineTo(20f)
                curveTo(19f, 20.53f, 18.789f, 21.039f, 18.414f, 21.414f)
                curveTo(18.039f, 21.789f, 17.53f, 22f, 17f, 22f)
                horizontalLineTo(7f)
                curveTo(6.47f, 22f, 5.961f, 21.789f, 5.586f, 21.414f)
                curveTo(5.211f, 21.039f, 5f, 20.53f, 5f, 20f)
                verticalLineTo(6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 10f)
                horizontalLineTo(19f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 7f)
                verticalLineTo(13f)
            }
        }.build()

        return _Refrigerator!!
    }

@Suppress("ObjectPropertyName")
private var _Refrigerator: ImageVector? = null
