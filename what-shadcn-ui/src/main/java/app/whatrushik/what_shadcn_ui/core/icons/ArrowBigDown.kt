package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val SHUIIcons.ArrowBigDown: ImageVector
    get() {
        if (_ArrowBigDown != null) {
            return _ArrowBigDown!!
        }
        _ArrowBigDown = ImageVector.Builder(
            name = "ArrowBigDown",
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
                moveTo(9f, 3f)
                horizontalLineTo(15f)
                verticalLineTo(14f)
                horizontalLineTo(19f)
                lineTo(12f, 21f)
                lineTo(5f, 14f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                close()
            }
        }.build()

        return _ArrowBigDown!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBigDown: ImageVector? = null
