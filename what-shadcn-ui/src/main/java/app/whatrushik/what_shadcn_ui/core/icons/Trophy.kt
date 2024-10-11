package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Trophy: ImageVector
    get() {
        if (_Trophy != null) {
            return _Trophy!!
        }
        _Trophy = ImageVector.Builder(
            name = "Trophy",
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
                moveTo(6f, 9f)
                horizontalLineTo(4.5f)
                curveTo(3.837f, 9f, 3.201f, 8.737f, 2.732f, 8.268f)
                curveTo(2.263f, 7.799f, 2f, 7.163f, 2f, 6.5f)
                curveTo(2f, 5.837f, 2.263f, 5.201f, 2.732f, 4.732f)
                curveTo(3.201f, 4.263f, 3.837f, 4f, 4.5f, 4f)
                horizontalLineTo(6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 9f)
                horizontalLineTo(19.5f)
                curveTo(20.163f, 9f, 20.799f, 8.737f, 21.268f, 8.268f)
                curveTo(21.737f, 7.799f, 22f, 7.163f, 22f, 6.5f)
                curveTo(22f, 5.837f, 21.737f, 5.201f, 21.268f, 4.732f)
                curveTo(20.799f, 4.263f, 20.163f, 4f, 19.5f, 4f)
                horizontalLineTo(18f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 22f)
                horizontalLineTo(20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 14.66f)
                verticalLineTo(17f)
                curveTo(10f, 17.55f, 9.53f, 17.98f, 9.03f, 18.21f)
                curveTo(7.85f, 18.75f, 7f, 20.24f, 7f, 22f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 14.66f)
                verticalLineTo(17f)
                curveTo(14f, 17.55f, 14.47f, 17.98f, 14.97f, 18.21f)
                curveTo(16.15f, 18.75f, 17f, 20.24f, 17f, 22f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 2f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                curveTo(6f, 10.591f, 6.632f, 12.117f, 7.757f, 13.243f)
                curveTo(8.883f, 14.368f, 10.409f, 15f, 12f, 15f)
                curveTo(13.591f, 15f, 15.117f, 14.368f, 16.243f, 13.243f)
                curveTo(17.368f, 12.117f, 18f, 10.591f, 18f, 9f)
                verticalLineTo(2f)
                close()
            }
        }.build()

        return _Trophy!!
    }

@Suppress("ObjectPropertyName")
private var _Trophy: ImageVector? = null
