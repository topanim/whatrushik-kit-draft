package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.FormInput: ImageVector
    get() {
        if (_FormInput != null) {
            return _FormInput!!
        }
        _FormInput = ImageVector.Builder(
            name = "FormInput",
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
                moveTo(20f, 6f)
                horizontalLineTo(4f)
                curveTo(2.895f, 6f, 2f, 6.895f, 2f, 8f)
                verticalLineTo(16f)
                curveTo(2f, 17.105f, 2.895f, 18f, 4f, 18f)
                horizontalLineTo(20f)
                curveTo(21.105f, 18f, 22f, 17.105f, 22f, 16f)
                verticalLineTo(8f)
                curveTo(22f, 6.895f, 21.105f, 6f, 20f, 6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                horizontalLineTo(12.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 12f)
                horizontalLineTo(17.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 12f)
                horizontalLineTo(7.01f)
            }
        }.build()

        return _FormInput!!
    }

@Suppress("ObjectPropertyName")
private var _FormInput: ImageVector? = null
