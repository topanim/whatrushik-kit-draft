package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.LayoutTemplate: ImageVector
    get() {
        if (_LayoutTemplate != null) {
            return _LayoutTemplate!!
        }
        _LayoutTemplate = ImageVector.Builder(
            name = "LayoutTemplate",
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
                moveTo(21f, 3f)
                horizontalLineTo(3f)
                verticalLineTo(10f)
                horizontalLineTo(21f)
                verticalLineTo(3f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 14f)
                horizontalLineTo(16f)
                verticalLineTo(21f)
                horizontalLineTo(21f)
                verticalLineTo(14f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 14f)
                horizontalLineTo(3f)
                verticalLineTo(21f)
                horizontalLineTo(12f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _LayoutTemplate!!
    }

@Suppress("ObjectPropertyName")
private var _LayoutTemplate: ImageVector? = null
