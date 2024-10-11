package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.FolderLock: ImageVector
    get() {
        if (_FolderLock != null) {
            return _FolderLock!!
        }
        _FolderLock = ImageVector.Builder(
            name = "FolderLock",
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
                moveTo(10f, 20f)
                horizontalLineTo(4f)
                curveTo(3.47f, 20f, 2.961f, 19.789f, 2.586f, 19.414f)
                curveTo(2.211f, 19.039f, 2f, 18.53f, 2f, 18f)
                verticalLineTo(5f)
                curveTo(2f, 3.9f, 2.9f, 3f, 4f, 3f)
                horizontalLineTo(7.93f)
                curveTo(8.259f, 3.002f, 8.583f, 3.085f, 8.873f, 3.242f)
                curveTo(9.163f, 3.399f, 9.409f, 3.625f, 9.59f, 3.9f)
                lineTo(10.41f, 5.1f)
                curveTo(10.591f, 5.375f, 10.837f, 5.601f, 11.127f, 5.758f)
                curveTo(11.417f, 5.915f, 11.741f, 5.998f, 12.07f, 6f)
                horizontalLineTo(20f)
                curveTo(20.53f, 6f, 21.039f, 6.211f, 21.414f, 6.586f)
                curveTo(21.789f, 6.961f, 22f, 7.47f, 22f, 8f)
                verticalLineTo(10.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 17f)
                horizontalLineTo(15f)
                curveTo(14.448f, 17f, 14f, 17.448f, 14f, 18f)
                verticalLineTo(21f)
                curveTo(14f, 21.552f, 14.448f, 22f, 15f, 22f)
                horizontalLineTo(21f)
                curveTo(21.552f, 22f, 22f, 21.552f, 22f, 21f)
                verticalLineTo(18f)
                curveTo(22f, 17.448f, 21.552f, 17f, 21f, 17f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 17f)
                verticalLineTo(15f)
                curveTo(20f, 14.47f, 19.789f, 13.961f, 19.414f, 13.586f)
                curveTo(19.039f, 13.211f, 18.53f, 13f, 18f, 13f)
                curveTo(17.47f, 13f, 16.961f, 13.211f, 16.586f, 13.586f)
                curveTo(16.211f, 13.961f, 16f, 14.47f, 16f, 15f)
                verticalLineTo(17f)
            }
        }.build()

        return _FolderLock!!
    }

@Suppress("ObjectPropertyName")
private var _FolderLock: ImageVector? = null
