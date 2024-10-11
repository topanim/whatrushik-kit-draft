package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.QrCode: ImageVector
    get() {
        if (_QrCode != null) {
            return _QrCode!!
        }
        _QrCode = ImageVector.Builder(
            name = "QrCode",
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
                moveTo(7f, 3f)
                horizontalLineTo(4f)
                curveTo(3.448f, 3f, 3f, 3.448f, 3f, 4f)
                verticalLineTo(7f)
                curveTo(3f, 7.552f, 3.448f, 8f, 4f, 8f)
                horizontalLineTo(7f)
                curveTo(7.552f, 8f, 8f, 7.552f, 8f, 7f)
                verticalLineTo(4f)
                curveTo(8f, 3.448f, 7.552f, 3f, 7f, 3f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 3f)
                horizontalLineTo(17f)
                curveTo(16.448f, 3f, 16f, 3.448f, 16f, 4f)
                verticalLineTo(7f)
                curveTo(16f, 7.552f, 16.448f, 8f, 17f, 8f)
                horizontalLineTo(20f)
                curveTo(20.552f, 8f, 21f, 7.552f, 21f, 7f)
                verticalLineTo(4f)
                curveTo(21f, 3.448f, 20.552f, 3f, 20f, 3f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 16f)
                horizontalLineTo(4f)
                curveTo(3.448f, 16f, 3f, 16.448f, 3f, 17f)
                verticalLineTo(20f)
                curveTo(3f, 20.552f, 3.448f, 21f, 4f, 21f)
                horizontalLineTo(7f)
                curveTo(7.552f, 21f, 8f, 20.552f, 8f, 20f)
                verticalLineTo(17f)
                curveTo(8f, 16.448f, 7.552f, 16f, 7f, 16f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 16f)
                horizontalLineTo(18f)
                curveTo(17.47f, 16f, 16.961f, 16.211f, 16.586f, 16.586f)
                curveTo(16.211f, 16.961f, 16f, 17.47f, 16f, 18f)
                verticalLineTo(21f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 21f)
                verticalLineTo(21.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 7f)
                verticalLineTo(10f)
                curveTo(12f, 10.53f, 11.789f, 11.039f, 11.414f, 11.414f)
                curveTo(11.039f, 11.789f, 10.53f, 12f, 10f, 12f)
                horizontalLineTo(7f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 12f)
                horizontalLineTo(3.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 3f)
                horizontalLineTo(12.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 16f)
                verticalLineTo(16.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 12f)
                horizontalLineTo(17f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 12f)
                verticalLineTo(12.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 21f)
                verticalLineTo(20f)
            }
        }.build()

        return _QrCode!!
    }

@Suppress("ObjectPropertyName")
private var _QrCode: ImageVector? = null
