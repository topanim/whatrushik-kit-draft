package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.BookOpenCheck: ImageVector
    get() {
        if (_BookOpenCheck != null) {
            return _BookOpenCheck!!
        }
        _BookOpenCheck = ImageVector.Builder(
            name = "BookOpenCheck",
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
                horizontalLineTo(2f)
                verticalLineTo(18f)
                horizontalLineTo(9f)
                curveTo(10.7f, 18f, 12f, 19.3f, 12f, 21f)
                verticalLineTo(7f)
                curveTo(12f, 4.8f, 10.2f, 3f, 8f, 3f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 12f)
                lineTo(18f, 14f)
                lineTo(22f, 10f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 6f)
                verticalLineTo(3f)
                horizontalLineTo(16f)
                curveTo(13.8f, 3f, 12f, 4.8f, 12f, 7f)
                verticalLineTo(21f)
                curveTo(12f, 19.3f, 13.3f, 18f, 15f, 18f)
                horizontalLineTo(22f)
                verticalLineTo(15.7f)
            }
        }.build()

        return _BookOpenCheck!!
    }

@Suppress("ObjectPropertyName")
private var _BookOpenCheck: ImageVector? = null
