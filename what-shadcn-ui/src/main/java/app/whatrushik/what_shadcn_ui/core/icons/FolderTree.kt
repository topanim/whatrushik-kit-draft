package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.FolderTree: ImageVector
    get() {
        if (_FolderTree != null) {
            return _FolderTree!!
        }
        _FolderTree = ImageVector.Builder(
            name = "FolderTree",
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
                moveTo(13f, 10f)
                horizontalLineTo(20f)
                curveTo(20.265f, 10f, 20.52f, 9.895f, 20.707f, 9.707f)
                curveTo(20.895f, 9.52f, 21f, 9.265f, 21f, 9f)
                verticalLineTo(6f)
                curveTo(21f, 5.735f, 20.895f, 5.48f, 20.707f, 5.293f)
                curveTo(20.52f, 5.105f, 20.265f, 5f, 20f, 5f)
                horizontalLineTo(17.5f)
                curveTo(17.345f, 5f, 17.192f, 4.964f, 17.053f, 4.894f)
                curveTo(16.914f, 4.825f, 16.793f, 4.724f, 16.7f, 4.6f)
                lineTo(15.8f, 3.4f)
                curveTo(15.707f, 3.276f, 15.586f, 3.175f, 15.447f, 3.106f)
                curveTo(15.308f, 3.036f, 15.155f, 3f, 15f, 3f)
                horizontalLineTo(13f)
                curveTo(12.735f, 3f, 12.48f, 3.105f, 12.293f, 3.293f)
                curveTo(12.105f, 3.48f, 12f, 3.735f, 12f, 4f)
                verticalLineTo(9f)
                curveTo(12f, 9.265f, 12.105f, 9.52f, 12.293f, 9.707f)
                curveTo(12.48f, 9.895f, 12.735f, 10f, 13f, 10f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 21f)
                horizontalLineTo(20f)
                curveTo(20.265f, 21f, 20.52f, 20.895f, 20.707f, 20.707f)
                curveTo(20.895f, 20.52f, 21f, 20.265f, 21f, 20f)
                verticalLineTo(17f)
                curveTo(21f, 16.735f, 20.895f, 16.48f, 20.707f, 16.293f)
                curveTo(20.52f, 16.105f, 20.265f, 16f, 20f, 16f)
                horizontalLineTo(17.12f)
                curveTo(16.934f, 16.001f, 16.751f, 15.95f, 16.592f, 15.853f)
                curveTo(16.433f, 15.756f, 16.304f, 15.616f, 16.22f, 15.45f)
                lineTo(15.78f, 14.55f)
                curveTo(15.696f, 14.384f, 15.567f, 14.244f, 15.408f, 14.147f)
                curveTo(15.249f, 14.05f, 15.066f, 13.999f, 14.88f, 14f)
                horizontalLineTo(13f)
                curveTo(12.735f, 14f, 12.48f, 14.105f, 12.293f, 14.293f)
                curveTo(12.105f, 14.481f, 12f, 14.735f, 12f, 15f)
                verticalLineTo(20f)
                curveTo(12f, 20.265f, 12.105f, 20.52f, 12.293f, 20.707f)
                curveTo(12.48f, 20.895f, 12.735f, 21f, 13f, 21f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                verticalLineTo(5f)
                curveTo(3f, 6.1f, 3.9f, 7f, 5f, 7f)
                horizontalLineTo(8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                verticalLineTo(16f)
                curveTo(3f, 17.1f, 3.9f, 18f, 5f, 18f)
                horizontalLineTo(8f)
            }
        }.build()

        return _FolderTree!!
    }

@Suppress("ObjectPropertyName")
private var _FolderTree: ImageVector? = null
