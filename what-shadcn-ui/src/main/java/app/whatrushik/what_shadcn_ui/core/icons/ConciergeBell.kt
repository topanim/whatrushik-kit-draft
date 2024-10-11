package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.ConciergeBell: ImageVector
    get() {
        if (_ConciergeBell != null) {
            return _ConciergeBell!!
        }
        _ConciergeBell = ImageVector.Builder(
            name = "ConciergeBell",
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
                moveTo(2f, 18f)
                curveTo(2f, 17.47f, 2.211f, 16.961f, 2.586f, 16.586f)
                curveTo(2.961f, 16.211f, 3.47f, 16f, 4f, 16f)
                horizontalLineTo(20f)
                curveTo(20.53f, 16f, 21.039f, 16.211f, 21.414f, 16.586f)
                curveTo(21.789f, 16.961f, 22f, 17.47f, 22f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(2f)
                verticalLineTo(18f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 16f)
                curveTo(20f, 13.878f, 19.157f, 11.843f, 17.657f, 10.343f)
                curveTo(16.157f, 8.843f, 14.122f, 8f, 12f, 8f)
                curveTo(9.878f, 8f, 7.843f, 8.843f, 6.343f, 10.343f)
                curveTo(4.843f, 11.843f, 4f, 13.878f, 4f, 16f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 4f)
                verticalLineTo(8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 4f)
                horizontalLineTo(14f)
            }
        }.build()

        return _ConciergeBell!!
    }

@Suppress("ObjectPropertyName")
private var _ConciergeBell: ImageVector? = null
