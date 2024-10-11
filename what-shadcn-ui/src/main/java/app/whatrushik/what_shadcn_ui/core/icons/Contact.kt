package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Contact: ImageVector
    get() {
        if (_Contact != null) {
            return _Contact!!
        }
        _Contact = ImageVector.Builder(
            name = "Contact",
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
                moveTo(17f, 18f)
                curveTo(17f, 17.47f, 16.789f, 16.961f, 16.414f, 16.586f)
                curveTo(16.039f, 16.211f, 15.53f, 16f, 15f, 16f)
                horizontalLineTo(9f)
                curveTo(8.47f, 16f, 7.961f, 16.211f, 7.586f, 16.586f)
                curveTo(7.211f, 16.961f, 7f, 17.47f, 7f, 18f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 4f)
                horizontalLineTo(5f)
                curveTo(3.895f, 4f, 3f, 4.895f, 3f, 6f)
                verticalLineTo(20f)
                curveTo(3f, 21.105f, 3.895f, 22f, 5f, 22f)
                horizontalLineTo(19f)
                curveTo(20.105f, 22f, 21f, 21.105f, 21f, 20f)
                verticalLineTo(6f)
                curveTo(21f, 4.895f, 20.105f, 4f, 19f, 4f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                curveTo(13.105f, 12f, 14f, 11.105f, 14f, 10f)
                curveTo(14f, 8.895f, 13.105f, 8f, 12f, 8f)
                curveTo(10.895f, 8f, 10f, 8.895f, 10f, 10f)
                curveTo(10f, 11.105f, 10.895f, 12f, 12f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 2f)
                verticalLineTo(4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 2f)
                verticalLineTo(4f)
            }
        }.build()

        return _Contact!!
    }

@Suppress("ObjectPropertyName")
private var _Contact: ImageVector? = null
