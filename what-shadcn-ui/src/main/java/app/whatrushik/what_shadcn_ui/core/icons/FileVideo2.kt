package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.FileVideo2: ImageVector
    get() {
        if (_FileVideo2 != null) {
            return _FileVideo2!!
        }
        _FileVideo2 = ImageVector.Builder(
            name = "FileVideo2",
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
                moveTo(4f, 8f)
                verticalLineTo(4f)
                curveTo(4f, 3.47f, 4.211f, 2.961f, 4.586f, 2.586f)
                curveTo(4.961f, 2.211f, 5.47f, 2f, 6f, 2f)
                horizontalLineTo(14.5f)
                lineTo(20f, 7.5f)
                verticalLineTo(20f)
                curveTo(20f, 20.53f, 19.789f, 21.039f, 19.414f, 21.414f)
                curveTo(19.039f, 21.789f, 18.53f, 22f, 18f, 22f)
                horizontalLineTo(4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 2f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 15.5f)
                lineTo(14f, 18f)
                verticalLineTo(12f)
                lineTo(10f, 14.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 12f)
                horizontalLineTo(3f)
                curveTo(2.448f, 12f, 2f, 12.448f, 2f, 13f)
                verticalLineTo(17f)
                curveTo(2f, 17.552f, 2.448f, 18f, 3f, 18f)
                horizontalLineTo(9f)
                curveTo(9.552f, 18f, 10f, 17.552f, 10f, 17f)
                verticalLineTo(13f)
                curveTo(10f, 12.448f, 9.552f, 12f, 9f, 12f)
                close()
            }
        }.build()

        return _FileVideo2!!
    }

@Suppress("ObjectPropertyName")
private var _FileVideo2: ImageVector? = null
