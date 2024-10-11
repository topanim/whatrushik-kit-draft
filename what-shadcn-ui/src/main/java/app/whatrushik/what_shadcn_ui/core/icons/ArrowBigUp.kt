package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val SHUIIcons.ArrowBigUp: ImageVector
    get() {
        if (_ArrowBigUp != null) {
            return _ArrowBigUp!!
        }
        _ArrowBigUp = ImageVector.Builder(
            name = "ArrowBigUp",
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
                moveTo(9f, 21f)
                verticalLineTo(10f)
                horizontalLineTo(5f)
                lineTo(12f, 3f)
                lineTo(19f, 10f)
                horizontalLineTo(15f)
                verticalLineTo(21f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _ArrowBigUp!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBigUp: ImageVector? = null
