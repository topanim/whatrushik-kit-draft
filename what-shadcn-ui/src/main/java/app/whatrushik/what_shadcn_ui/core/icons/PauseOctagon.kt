package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.PauseOctagon: ImageVector
    get() {
        if (_PauseOctagon != null) {
            return _PauseOctagon!!
        }
        _PauseOctagon = ImageVector.Builder(
            name = "PauseOctagon",
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
                moveTo(10f, 15f)
                verticalLineTo(9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 15f)
                verticalLineTo(9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.714f, 2f)
                horizontalLineTo(16.286f)
                lineTo(22f, 7.714f)
                verticalLineTo(16.286f)
                lineTo(16.286f, 22f)
                horizontalLineTo(7.714f)
                lineTo(2f, 16.286f)
                verticalLineTo(7.714f)
                lineTo(7.714f, 2f)
                close()
            }
        }.build()

        return _PauseOctagon!!
    }

@Suppress("ObjectPropertyName")
private var _PauseOctagon: ImageVector? = null
