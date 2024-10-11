package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val SHUIIcons.Globe2: ImageVector
    get() {
        if (_Globe2 != null) {
            return _Globe2!!
        }
        _Globe2 = ImageVector.Builder(
            name = "Globe2",
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
                moveTo(15f, 21f)
                verticalLineTo(17f)
                curveTo(15f, 16.47f, 15.211f, 15.961f, 15.586f, 15.586f)
                curveTo(15.961f, 15.211f, 16.47f, 15f, 17f, 15f)
                horizontalLineTo(21f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 4f)
                verticalLineTo(6f)
                curveTo(7.216f, 6.613f, 7.625f, 7.14f, 8.166f, 7.501f)
                curveTo(8.707f, 7.862f, 9.351f, 8.037f, 10f, 8f)
                curveTo(10.53f, 8f, 11.039f, 8.211f, 11.414f, 8.586f)
                curveTo(11.789f, 8.961f, 12f, 9.47f, 12f, 10f)
                curveTo(12f, 10.53f, 12.211f, 11.039f, 12.586f, 11.414f)
                curveTo(12.961f, 11.789f, 13.47f, 12f, 14f, 12f)
                curveTo(14.53f, 12f, 15.039f, 11.789f, 15.414f, 11.414f)
                curveTo(15.789f, 11.039f, 16f, 10.53f, 16f, 10f)
                curveTo(16f, 9.47f, 16.211f, 8.961f, 16.586f, 8.586f)
                curveTo(16.961f, 8.211f, 17.47f, 8f, 18f, 8f)
                horizontalLineTo(21f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 11f)
                horizontalLineTo(5f)
                curveTo(5.53f, 11f, 6.039f, 11.211f, 6.414f, 11.586f)
                curveTo(6.789f, 11.961f, 7f, 12.47f, 7f, 13f)
                verticalLineTo(14f)
                curveTo(7f, 14.53f, 7.211f, 15.039f, 7.586f, 15.414f)
                curveTo(7.961f, 15.789f, 8.47f, 16f, 9f, 16f)
                curveTo(9.53f, 16f, 10.039f, 16.211f, 10.414f, 16.586f)
                curveTo(10.789f, 16.961f, 11f, 17.47f, 11f, 18f)
                verticalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                close()
            }
        }.build()

        return _Globe2!!
    }

@Suppress("ObjectPropertyName")
private var _Globe2: ImageVector? = null
