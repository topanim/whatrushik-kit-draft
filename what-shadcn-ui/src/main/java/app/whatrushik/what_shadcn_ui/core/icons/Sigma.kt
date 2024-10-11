package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Sigma: ImageVector
    get() {
        if (_Sigma != null) {
            return _Sigma!!
        }
        _Sigma = ImageVector.Builder(
            name = "Sigma",
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
                moveTo(18f, 7f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                lineTo(12f, 12f)
                lineTo(6f, 20f)
                horizontalLineTo(18f)
                verticalLineTo(17f)
            }
        }.build()

        return _Sigma!!
    }

@Suppress("ObjectPropertyName")
private var _Sigma: ImageVector? = null
