package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Beer: ImageVector
    get() {
        if (_Beer != null) {
            return _Beer!!
        }
        _Beer = ImageVector.Builder(
            name = "Beer",
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
                moveTo(17f, 11f)
                horizontalLineTo(18f)
                curveTo(18.796f, 11f, 19.559f, 11.316f, 20.121f, 11.879f)
                curveTo(20.684f, 12.441f, 21f, 13.204f, 21f, 14f)
                curveTo(21f, 14.796f, 20.684f, 15.559f, 20.121f, 16.121f)
                curveTo(19.559f, 16.684f, 18.796f, 17f, 18f, 17f)
                horizontalLineTo(17f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 12f)
                verticalLineTo(18f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 12f)
                verticalLineTo(18f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 7.5f)
                curveTo(13f, 7.5f, 12.56f, 8f, 11f, 8f)
                curveTo(9.44f, 8f, 9f, 7.5f, 8f, 7.5f)
                curveTo(7f, 7.5f, 6.28f, 8f, 5.5f, 8f)
                curveTo(4.837f, 8f, 4.201f, 7.737f, 3.732f, 7.268f)
                curveTo(3.263f, 6.799f, 3f, 6.163f, 3f, 5.5f)
                curveTo(3f, 4.837f, 3.263f, 4.201f, 3.732f, 3.732f)
                curveTo(4.201f, 3.263f, 4.837f, 3f, 5.5f, 3f)
                curveTo(6.28f, 3f, 7.07f, 3.5f, 8f, 3.5f)
                curveTo(8.93f, 3.5f, 9.44f, 2f, 11f, 2f)
                curveTo(12.56f, 2f, 13f, 3.5f, 14f, 3.5f)
                curveTo(15f, 3.5f, 15.72f, 3f, 16.5f, 3f)
                curveTo(17.163f, 3f, 17.799f, 3.263f, 18.268f, 3.732f)
                curveTo(18.737f, 4.201f, 19f, 4.837f, 19f, 5.5f)
                curveTo(19f, 6.163f, 18.737f, 6.799f, 18.268f, 7.268f)
                curveTo(17.799f, 7.737f, 17.163f, 8f, 16.5f, 8f)
                curveTo(15.72f, 8f, 15f, 7.5f, 14f, 7.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 8f)
                verticalLineTo(20f)
                curveTo(5f, 20.53f, 5.211f, 21.039f, 5.586f, 21.414f)
                curveTo(5.961f, 21.789f, 6.47f, 22f, 7f, 22f)
                horizontalLineTo(15f)
                curveTo(15.53f, 22f, 16.039f, 21.789f, 16.414f, 21.414f)
                curveTo(16.789f, 21.039f, 17f, 20.53f, 17f, 20f)
                verticalLineTo(8f)
            }
        }.build()

        return _Beer!!
    }

@Suppress("ObjectPropertyName")
private var _Beer: ImageVector? = null
