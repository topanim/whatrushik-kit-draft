package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Repeat1: ImageVector
    get() {
        if (_Repeat1 != null) {
            return _Repeat1!!
        }
        _Repeat1 = ImageVector.Builder(
            name = "Repeat1",
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
                moveTo(17f, 2f)
                lineTo(21f, 6f)
                lineTo(17f, 10f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 11f)
                verticalLineTo(10f)
                curveTo(3f, 8.939f, 3.421f, 7.922f, 4.172f, 7.172f)
                curveTo(4.922f, 6.421f, 5.939f, 6f, 7f, 6f)
                horizontalLineTo(21f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 22f)
                lineTo(3f, 18f)
                lineTo(7f, 14f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 13f)
                verticalLineTo(14f)
                curveTo(21f, 15.061f, 20.579f, 16.078f, 19.828f, 16.828f)
                curveTo(19.078f, 17.579f, 18.061f, 18f, 17f, 18f)
                horizontalLineTo(3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 10f)
                horizontalLineTo(12f)
                verticalLineTo(14f)
            }
        }.build()

        return _Repeat1!!
    }

@Suppress("ObjectPropertyName")
private var _Repeat1: ImageVector? = null
