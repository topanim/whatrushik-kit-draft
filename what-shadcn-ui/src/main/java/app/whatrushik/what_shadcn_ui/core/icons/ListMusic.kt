package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.ListMusic: ImageVector
    get() {
        if (_ListMusic != null) {
            return _ListMusic!!
        }
        _ListMusic = ImageVector.Builder(
            name = "ListMusic",
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
                moveTo(21f, 15f)
                verticalLineTo(6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.5f, 18f)
                curveTo(19.163f, 18f, 19.799f, 17.737f, 20.268f, 17.268f)
                curveTo(20.737f, 16.799f, 21f, 16.163f, 21f, 15.5f)
                curveTo(21f, 14.837f, 20.737f, 14.201f, 20.268f, 13.732f)
                curveTo(19.799f, 13.263f, 19.163f, 13f, 18.5f, 13f)
                curveTo(17.837f, 13f, 17.201f, 13.263f, 16.732f, 13.732f)
                curveTo(16.263f, 14.201f, 16f, 14.837f, 16f, 15.5f)
                curveTo(16f, 16.163f, 16.263f, 16.799f, 16.732f, 17.268f)
                curveTo(17.201f, 17.737f, 17.837f, 18f, 18.5f, 18f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                horizontalLineTo(3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 6f)
                horizontalLineTo(3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 18f)
                horizontalLineTo(3f)
            }
        }.build()

        return _ListMusic!!
    }

@Suppress("ObjectPropertyName")
private var _ListMusic: ImageVector? = null
