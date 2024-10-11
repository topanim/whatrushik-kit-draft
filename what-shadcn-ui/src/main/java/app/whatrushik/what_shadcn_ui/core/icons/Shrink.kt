package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Shrink: ImageVector
    get() {
        if (_Shrink != null) {
            return _Shrink!!
        }
        _Shrink = ImageVector.Builder(
            name = "Shrink",
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
                moveTo(15f, 15f)
                lineTo(21f, 21f)
                moveTo(15f, 15f)
                verticalLineTo(19.8f)
                moveTo(15f, 15f)
                horizontalLineTo(19.8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 19.8f)
                verticalLineTo(15f)
                moveTo(9f, 15f)
                horizontalLineTo(4.2f)
                moveTo(9f, 15f)
                lineTo(3f, 21f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 4.2f)
                verticalLineTo(9f)
                moveTo(15f, 9f)
                horizontalLineTo(19.8f)
                moveTo(15f, 9f)
                lineTo(21f, 3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 4.2f)
                verticalLineTo(9f)
                moveTo(9f, 9f)
                horizontalLineTo(4.2f)
                moveTo(9f, 9f)
                lineTo(3f, 3f)
            }
        }.build()

        return _Shrink!!
    }

@Suppress("ObjectPropertyName")
private var _Shrink: ImageVector? = null
