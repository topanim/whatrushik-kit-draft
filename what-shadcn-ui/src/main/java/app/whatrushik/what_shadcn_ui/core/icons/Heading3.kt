package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Heading3: ImageVector
    get() {
        if (_Heading3 != null) {
            return _Heading3!!
        }
        _Heading3 = ImageVector.Builder(
            name = "Heading3",
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
                moveTo(4f, 12f)
                horizontalLineTo(12f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 18f)
                verticalLineTo(6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 18f)
                verticalLineTo(6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.5f, 10.5f)
                curveTo(19.2f, 9.5f, 21f, 10.5f, 21f, 12f)
                curveTo(21f, 12.53f, 20.789f, 13.039f, 20.414f, 13.414f)
                curveTo(20.039f, 13.789f, 19.53f, 14f, 19f, 14f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 17.5f)
                curveTo(19f, 19f, 21f, 17.8f, 21f, 16f)
                curveTo(21f, 15.47f, 20.789f, 14.961f, 20.414f, 14.586f)
                curveTo(20.039f, 14.211f, 19.53f, 14f, 19f, 14f)
            }
        }.build()

        return _Heading3!!
    }

@Suppress("ObjectPropertyName")
private var _Heading3: ImageVector? = null
