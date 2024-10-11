package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val SHUIIcons.ArrowBigLeft: ImageVector
    get() {
        if (_ArrowBigLeft != null) {
            return _ArrowBigLeft!!
        }
        _ArrowBigLeft = ImageVector.Builder(
            name = "ArrowBigLeft",
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
                moveTo(3f, 12f)
                lineTo(10f, 5f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                horizontalLineTo(10f)
                verticalLineTo(19f)
                lineTo(3f, 12f)
                close()
            }
        }.build()

        return _ArrowBigLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBigLeft: ImageVector? = null
