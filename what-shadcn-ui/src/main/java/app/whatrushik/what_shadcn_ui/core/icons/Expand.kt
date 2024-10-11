package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val SHUIIcons.Expand: ImageVector
    get() {
        if (_Expand != null) {
            return _Expand!!
        }
        _Expand = ImageVector.Builder(
            name = "Expand",
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
                moveTo(21f, 21f)
                lineTo(15f, 15f)
                moveTo(21f, 21f)
                verticalLineTo(16.2f)
                moveTo(21f, 21f)
                horizontalLineTo(16.2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 16.2f)
                verticalLineTo(21f)
                moveTo(3f, 21f)
                horizontalLineTo(7.8f)
                moveTo(3f, 21f)
                lineTo(9f, 15f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 7.8f)
                verticalLineTo(3f)
                moveTo(21f, 3f)
                horizontalLineTo(16.2f)
                moveTo(21f, 3f)
                lineTo(15f, 9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 7.8f)
                verticalLineTo(3f)
                moveTo(3f, 3f)
                horizontalLineTo(7.8f)
                moveTo(3f, 3f)
                lineTo(9f, 9f)
            }
        }.build()

        return _Expand!!
    }

@Suppress("ObjectPropertyName")
private var _Expand: ImageVector? = null
