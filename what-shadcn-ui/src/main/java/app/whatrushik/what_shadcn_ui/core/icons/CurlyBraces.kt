package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.CurlyBraces: ImageVector
    get() {
        if (_CurlyBraces != null) {
            return _CurlyBraces!!
        }
        _CurlyBraces = ImageVector.Builder(
            name = "CurlyBraces",
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
                horizontalLineTo(7f)
                curveTo(6.47f, 3f, 5.961f, 3.211f, 5.586f, 3.586f)
                curveTo(5.211f, 3.961f, 5f, 4.47f, 5f, 5f)
                verticalLineTo(10f)
                curveTo(5f, 10.53f, 4.789f, 11.039f, 4.414f, 11.414f)
                curveTo(4.039f, 11.789f, 3.53f, 12f, 3f, 12f)
                curveTo(3.53f, 12f, 4.039f, 12.211f, 4.414f, 12.586f)
                curveTo(4.789f, 12.961f, 5f, 13.47f, 5f, 14f)
                verticalLineTo(19f)
                curveTo(5f, 20.1f, 5.9f, 21f, 7f, 21f)
                horizontalLineTo(8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 21f)
                horizontalLineTo(17f)
                curveTo(17.53f, 21f, 18.039f, 20.789f, 18.414f, 20.414f)
                curveTo(18.789f, 20.039f, 19f, 19.53f, 19f, 19f)
                verticalLineTo(14f)
                curveTo(19f, 12.9f, 19.9f, 12f, 21f, 12f)
                curveTo(20.47f, 12f, 19.961f, 11.789f, 19.586f, 11.414f)
                curveTo(19.211f, 11.039f, 19f, 10.53f, 19f, 10f)
                verticalLineTo(5f)
                curveTo(19f, 4.47f, 18.789f, 3.961f, 18.414f, 3.586f)
                curveTo(18.039f, 3.211f, 17.53f, 3f, 17f, 3f)
                horizontalLineTo(16f)
            }
        }.build()

        return _CurlyBraces!!
    }

@Suppress("ObjectPropertyName")
private var _CurlyBraces: ImageVector? = null
