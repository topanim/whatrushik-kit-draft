package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val SHUIIcons.DatabaseBackup: ImageVector
    get() {
        if (_DatabaseBackup != null) {
            return _DatabaseBackup!!
        }
        _DatabaseBackup = ImageVector.Builder(
            name = "DatabaseBackup",
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
                moveTo(12f, 8f)
                curveTo(16.971f, 8f, 21f, 6.657f, 21f, 5f)
                curveTo(21f, 3.343f, 16.971f, 2f, 12f, 2f)
                curveTo(7.029f, 2f, 3f, 3.343f, 3f, 5f)
                curveTo(3f, 6.657f, 7.029f, 8f, 12f, 8f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 12f)
                curveTo(3f, 13.18f, 5.03f, 14.2f, 8f, 14.7f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 5f)
                verticalLineTo(9.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 16f)
                lineTo(13.27f, 14.65f)
                curveTo(13.814f, 13.818f, 14.606f, 13.178f, 15.533f, 12.82f)
                curveTo(16.46f, 12.462f, 17.476f, 12.403f, 18.438f, 12.653f)
                curveTo(19.401f, 12.903f, 20.26f, 13.448f, 20.896f, 14.212f)
                curveTo(21.532f, 14.976f, 21.912f, 15.921f, 21.983f, 16.912f)
                curveTo(22.053f, 17.904f, 21.812f, 18.892f, 21.291f, 19.739f)
                curveTo(20.77f, 20.586f, 19.997f, 21.248f, 19.08f, 21.632f)
                curveTo(18.163f, 22.016f, 17.149f, 22.103f, 16.18f, 21.88f)
                curveTo(15.211f, 21.657f, 14.337f, 21.136f, 13.68f, 20.39f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                verticalLineTo(16f)
                horizontalLineTo(16f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.43f, 5.97f, 21.63f, 10f, 21.93f)
            }
        }.build()

        return _DatabaseBackup!!
    }

@Suppress("ObjectPropertyName")
private var _DatabaseBackup: ImageVector? = null
