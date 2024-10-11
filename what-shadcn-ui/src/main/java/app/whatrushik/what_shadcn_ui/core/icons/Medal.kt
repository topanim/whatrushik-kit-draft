package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Medal: ImageVector
    get() {
        if (_Medal != null) {
            return _Medal!!
        }
        _Medal = ImageVector.Builder(
            name = "Medal",
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
                moveTo(7.21f, 15f)
                lineTo(2.66f, 7.14f)
                curveTo(2.464f, 6.801f, 2.371f, 6.412f, 2.395f, 6.02f)
                curveTo(2.418f, 5.629f, 2.555f, 5.254f, 2.79f, 4.94f)
                lineTo(4.4f, 2.8f)
                curveTo(4.586f, 2.552f, 4.828f, 2.35f, 5.106f, 2.211f)
                curveTo(5.383f, 2.072f, 5.689f, 2f, 6f, 2f)
                horizontalLineTo(18f)
                curveTo(18.31f, 2f, 18.617f, 2.072f, 18.894f, 2.211f)
                curveTo(19.172f, 2.35f, 19.414f, 2.552f, 19.6f, 2.8f)
                lineTo(21.2f, 4.94f)
                curveTo(21.436f, 5.253f, 21.576f, 5.628f, 21.6f, 6.019f)
                curveTo(21.625f, 6.41f, 21.535f, 6.8f, 21.34f, 7.14f)
                lineTo(16.79f, 15f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 12f)
                lineTo(5.12f, 2.2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 12f)
                lineTo(18.88f, 2.2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 7f)
                horizontalLineTo(16f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 22f)
                curveTo(14.761f, 22f, 17f, 19.761f, 17f, 17f)
                curveTo(17f, 14.239f, 14.761f, 12f, 12f, 12f)
                curveTo(9.239f, 12f, 7f, 14.239f, 7f, 17f)
                curveTo(7f, 19.761f, 9.239f, 22f, 12f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 18f)
                verticalLineTo(16f)
                horizontalLineTo(11.5f)
            }
        }.build()

        return _Medal!!
    }

@Suppress("ObjectPropertyName")
private var _Medal: ImageVector? = null
