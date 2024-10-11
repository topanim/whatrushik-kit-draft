package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val SHUIIcons.Settings2: ImageVector
    get() {
        if (_Settings2 != null) {
            return _Settings2!!
        }
        _Settings2 = ImageVector.Builder(
            name = "Settings2",
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
                moveTo(20f, 7f)
                horizontalLineTo(11f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 17f)
                horizontalLineTo(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 20f)
                curveTo(18.657f, 20f, 20f, 18.657f, 20f, 17f)
                curveTo(20f, 15.343f, 18.657f, 14f, 17f, 14f)
                curveTo(15.343f, 14f, 14f, 15.343f, 14f, 17f)
                curveTo(14f, 18.657f, 15.343f, 20f, 17f, 20f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 10f)
                curveTo(8.657f, 10f, 10f, 8.657f, 10f, 7f)
                curveTo(10f, 5.343f, 8.657f, 4f, 7f, 4f)
                curveTo(5.343f, 4f, 4f, 5.343f, 4f, 7f)
                curveTo(4f, 8.657f, 5.343f, 10f, 7f, 10f)
                close()
            }
        }.build()

        return _Settings2!!
    }

@Suppress("ObjectPropertyName")
private var _Settings2: ImageVector? = null
