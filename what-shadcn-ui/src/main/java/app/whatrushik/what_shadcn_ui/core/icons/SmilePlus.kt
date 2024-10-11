package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.SmilePlus: ImageVector
    get() {
        if (_SmilePlus != null) {
            return _SmilePlus!!
        }
        _SmilePlus = ImageVector.Builder(
            name = "SmilePlus",
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
                moveTo(22f, 11f)
                verticalLineTo(12f)
                curveTo(21.99f, 14.018f, 21.369f, 15.986f, 20.22f, 17.645f)
                curveTo(19.07f, 19.304f, 17.445f, 20.577f, 15.559f, 21.295f)
                curveTo(13.673f, 22.014f, 11.614f, 22.144f, 9.652f, 21.67f)
                curveTo(7.69f, 21.196f, 5.917f, 20.14f, 4.567f, 18.64f)
                curveTo(3.217f, 17.139f, 2.352f, 15.266f, 2.087f, 13.265f)
                curveTo(1.822f, 11.264f, 2.168f, 9.23f, 3.08f, 7.429f)
                curveTo(3.993f, 5.629f, 5.428f, 4.147f, 7.199f, 3.178f)
                curveTo(8.969f, 2.209f, 10.992f, 1.798f, 13f, 2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 14f)
                curveTo(8f, 14f, 9.5f, 16f, 12f, 16f)
                curveTo(14.5f, 16f, 16f, 14f, 16f, 14f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 9f)
                horizontalLineTo(9.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 9f)
                horizontalLineTo(15.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 5f)
                horizontalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 2f)
                verticalLineTo(8f)
            }
        }.build()

        return _SmilePlus!!
    }

@Suppress("ObjectPropertyName")
private var _SmilePlus: ImageVector? = null
