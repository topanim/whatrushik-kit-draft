package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val SHUIIcons.Mountain: ImageVector
    get() {
        if (_Mountain != null) {
            return _Mountain!!
        }
        _Mountain = ImageVector.Builder(
            name = "Mountain",
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
                moveTo(8f, 3f)
                lineTo(12f, 11f)
                lineTo(17f, 6f)
                lineTo(22f, 21f)
                horizontalLineTo(2f)
                lineTo(8f, 3f)
                close()
            }
        }.build()

        return _Mountain!!
    }

@Suppress("ObjectPropertyName")
private var _Mountain: ImageVector? = null
