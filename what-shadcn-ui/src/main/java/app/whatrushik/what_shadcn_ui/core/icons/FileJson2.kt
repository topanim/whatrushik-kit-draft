package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.FileJson2: ImageVector
    get() {
        if (_FileJson2 != null) {
            return _FileJson2!!
        }
        _FileJson2 = ImageVector.Builder(
            name = "FileJson2",
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
                moveTo(4f, 22f)
                horizontalLineTo(18f)
                curveTo(18.53f, 22f, 19.039f, 21.789f, 19.414f, 21.414f)
                curveTo(19.789f, 21.039f, 20f, 20.53f, 20f, 20f)
                verticalLineTo(7.5f)
                lineTo(14.5f, 2f)
                horizontalLineTo(6f)
                curveTo(5.47f, 2f, 4.961f, 2.211f, 4.586f, 2.586f)
                curveTo(4.211f, 2.961f, 4f, 3.47f, 4f, 4f)
                verticalLineTo(8f)
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
                moveTo(4f, 12f)
                curveTo(3.735f, 12f, 3.48f, 12.105f, 3.293f, 12.293f)
                curveTo(3.105f, 12.48f, 3f, 12.735f, 3f, 13f)
                verticalLineTo(14f)
                curveTo(3f, 14.265f, 2.895f, 14.52f, 2.707f, 14.707f)
                curveTo(2.52f, 14.895f, 2.265f, 15f, 2f, 15f)
                curveTo(2.265f, 15f, 2.52f, 15.105f, 2.707f, 15.293f)
                curveTo(2.895f, 15.48f, 3f, 15.735f, 3f, 16f)
                verticalLineTo(17f)
                curveTo(3f, 17.265f, 3.105f, 17.52f, 3.293f, 17.707f)
                curveTo(3.48f, 17.895f, 3.735f, 18f, 4f, 18f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 18f)
                curveTo(8.265f, 18f, 8.52f, 17.895f, 8.707f, 17.707f)
                curveTo(8.895f, 17.52f, 9f, 17.265f, 9f, 17f)
                verticalLineTo(16f)
                curveTo(9f, 15.735f, 9.105f, 15.48f, 9.293f, 15.293f)
                curveTo(9.48f, 15.105f, 9.735f, 15f, 10f, 15f)
                curveTo(9.735f, 15f, 9.48f, 14.895f, 9.293f, 14.707f)
                curveTo(9.105f, 14.52f, 9f, 14.265f, 9f, 14f)
                verticalLineTo(13f)
                curveTo(9f, 12.735f, 8.895f, 12.48f, 8.707f, 12.293f)
                curveTo(8.52f, 12.105f, 8.265f, 12f, 8f, 12f)
            }
        }.build()

        return _FileJson2!!
    }

@Suppress("ObjectPropertyName")
private var _FileJson2: ImageVector? = null
