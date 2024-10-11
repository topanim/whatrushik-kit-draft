package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.FileJson: ImageVector
    get() {
        if (_FileJson != null) {
            return _FileJson!!
        }
        _FileJson = ImageVector.Builder(
            name = "FileJson",
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
                moveTo(14.5f, 2f)
                horizontalLineTo(6f)
                curveTo(5.47f, 2f, 4.961f, 2.211f, 4.586f, 2.586f)
                curveTo(4.211f, 2.961f, 4f, 3.47f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 20.53f, 4.211f, 21.039f, 4.586f, 21.414f)
                curveTo(4.961f, 21.789f, 5.47f, 22f, 6f, 22f)
                horizontalLineTo(18f)
                curveTo(18.53f, 22f, 19.039f, 21.789f, 19.414f, 21.414f)
                curveTo(19.789f, 21.039f, 20f, 20.53f, 20f, 20f)
                verticalLineTo(7.5f)
                lineTo(14.5f, 2f)
                close()
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
                moveTo(10f, 12f)
                curveTo(9.735f, 12f, 9.48f, 12.105f, 9.293f, 12.293f)
                curveTo(9.105f, 12.48f, 9f, 12.735f, 9f, 13f)
                verticalLineTo(14f)
                curveTo(9f, 14.265f, 8.895f, 14.52f, 8.707f, 14.707f)
                curveTo(8.52f, 14.895f, 8.265f, 15f, 8f, 15f)
                curveTo(8.265f, 15f, 8.52f, 15.105f, 8.707f, 15.293f)
                curveTo(8.895f, 15.48f, 9f, 15.735f, 9f, 16f)
                verticalLineTo(17f)
                curveTo(9f, 17.265f, 9.105f, 17.52f, 9.293f, 17.707f)
                curveTo(9.48f, 17.895f, 9.735f, 18f, 10f, 18f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 18f)
                curveTo(14.265f, 18f, 14.52f, 17.895f, 14.707f, 17.707f)
                curveTo(14.895f, 17.52f, 15f, 17.265f, 15f, 17f)
                verticalLineTo(16f)
                curveTo(15f, 15.735f, 15.105f, 15.48f, 15.293f, 15.293f)
                curveTo(15.48f, 15.105f, 15.735f, 15f, 16f, 15f)
                curveTo(15.735f, 15f, 15.48f, 14.895f, 15.293f, 14.707f)
                curveTo(15.105f, 14.52f, 15f, 14.265f, 15f, 14f)
                verticalLineTo(13f)
                curveTo(15f, 12.735f, 14.895f, 12.48f, 14.707f, 12.293f)
                curveTo(14.52f, 12.105f, 14.265f, 12f, 14f, 12f)
            }
        }.build()

        return _FileJson!!
    }

@Suppress("ObjectPropertyName")
private var _FileJson: ImageVector? = null
