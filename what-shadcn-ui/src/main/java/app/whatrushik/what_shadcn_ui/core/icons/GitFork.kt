package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.GitFork: ImageVector
    get() {
        if (_GitFork != null) {
            return _GitFork!!
        }
        _GitFork = ImageVector.Builder(
            name = "GitFork",
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
                moveTo(12f, 21f)
                curveTo(13.657f, 21f, 15f, 19.657f, 15f, 18f)
                curveTo(15f, 16.343f, 13.657f, 15f, 12f, 15f)
                curveTo(10.343f, 15f, 9f, 16.343f, 9f, 18f)
                curveTo(9f, 19.657f, 10.343f, 21f, 12f, 21f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 9f)
                curveTo(7.657f, 9f, 9f, 7.657f, 9f, 6f)
                curveTo(9f, 4.343f, 7.657f, 3f, 6f, 3f)
                curveTo(4.343f, 3f, 3f, 4.343f, 3f, 6f)
                curveTo(3f, 7.657f, 4.343f, 9f, 6f, 9f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 9f)
                curveTo(19.657f, 9f, 21f, 7.657f, 21f, 6f)
                curveTo(21f, 4.343f, 19.657f, 3f, 18f, 3f)
                curveTo(16.343f, 3f, 15f, 4.343f, 15f, 6f)
                curveTo(15f, 7.657f, 16.343f, 9f, 18f, 9f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 9f)
                verticalLineTo(10f)
                curveTo(18f, 10.53f, 17.789f, 11.039f, 17.414f, 11.414f)
                curveTo(17.039f, 11.789f, 16.53f, 12f, 16f, 12f)
                horizontalLineTo(8f)
                curveTo(7.47f, 12f, 6.961f, 11.789f, 6.586f, 11.414f)
                curveTo(6.211f, 11.039f, 6f, 10.53f, 6f, 10f)
                verticalLineTo(9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                verticalLineTo(15f)
            }
        }.build()

        return _GitFork!!
    }

@Suppress("ObjectPropertyName")
private var _GitFork: ImageVector? = null
