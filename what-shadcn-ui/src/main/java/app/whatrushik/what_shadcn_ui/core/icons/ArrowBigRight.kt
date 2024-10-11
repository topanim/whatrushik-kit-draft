package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.ArrowBigRight: ImageVector
    get() {
        if (_ArrowBigRight != null) {
            return _ArrowBigRight!!
        }
        _ArrowBigRight = ImageVector.Builder(
            name = "ArrowBigRight",
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
                moveTo(21f, 12f)
                lineTo(14f, 5f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(15f)
                horizontalLineTo(14f)
                verticalLineTo(19f)
                lineTo(21f, 12f)
                close()
            }
        }.build()

        return _ArrowBigRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBigRight: ImageVector? = null
