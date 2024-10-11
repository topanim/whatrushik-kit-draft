package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Files: ImageVector
    get() {
        if (_Files != null) {
            return _Files!!
        }
        _Files = ImageVector.Builder(
            name = "Files",
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
                moveTo(15.5f, 2f)
                horizontalLineTo(8.6f)
                curveTo(8.2f, 2f, 7.8f, 2.2f, 7.5f, 2.5f)
                curveTo(7.2f, 2.8f, 7f, 3.2f, 7f, 3.6f)
                verticalLineTo(16.4f)
                curveTo(7f, 16.8f, 7.2f, 17.2f, 7.5f, 17.5f)
                curveTo(7.8f, 17.8f, 8.2f, 18f, 8.6f, 18f)
                horizontalLineTo(18.4f)
                curveTo(18.8f, 18f, 19.2f, 17.8f, 19.5f, 17.5f)
                curveTo(19.8f, 17.2f, 20f, 16.8f, 20f, 16.4f)
                verticalLineTo(6.5f)
                lineTo(15.5f, 2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 7.6f)
                verticalLineTo(20.4f)
                curveTo(3f, 20.8f, 3.2f, 21.2f, 3.5f, 21.5f)
                curveTo(3.8f, 21.8f, 4.2f, 22f, 4.6f, 22f)
                horizontalLineTo(14.4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 2f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
            }
        }.build()

        return _Files!!
    }

@Suppress("ObjectPropertyName")
private var _Files: ImageVector? = null
