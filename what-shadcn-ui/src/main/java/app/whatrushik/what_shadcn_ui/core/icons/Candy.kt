package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Candy: ImageVector
    get() {
        if (_Candy != null) {
            return _Candy!!
        }
        _Candy = ImageVector.Builder(
            name = "Candy",
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
                moveTo(9.5f, 7.5f)
                lineTo(7.5f, 9.5f)
                curveTo(7.033f, 9.958f, 6.661f, 10.504f, 6.406f, 11.106f)
                curveTo(6.151f, 11.709f, 6.018f, 12.356f, 6.015f, 13.01f)
                curveTo(6.011f, 13.665f, 6.138f, 14.313f, 6.387f, 14.918f)
                curveTo(6.636f, 15.523f, 7.002f, 16.073f, 7.464f, 16.535f)
                curveTo(7.927f, 16.998f, 8.477f, 17.365f, 9.082f, 17.613f)
                curveTo(9.687f, 17.862f, 10.335f, 17.989f, 10.99f, 17.985f)
                curveTo(11.644f, 17.982f, 12.291f, 17.849f, 12.894f, 17.594f)
                curveTo(13.496f, 17.339f, 14.042f, 16.967f, 14.5f, 16.5f)
                lineTo(16.5f, 14.5f)
                curveTo(16.967f, 14.042f, 17.339f, 13.496f, 17.594f, 12.894f)
                curveTo(17.849f, 12.291f, 17.982f, 11.644f, 17.985f, 10.99f)
                curveTo(17.989f, 10.335f, 17.862f, 9.687f, 17.613f, 9.082f)
                curveTo(17.365f, 8.477f, 16.998f, 7.927f, 16.535f, 7.464f)
                curveTo(16.073f, 7.002f, 15.523f, 6.636f, 14.918f, 6.387f)
                curveTo(14.313f, 6.138f, 13.665f, 6.011f, 13.01f, 6.015f)
                curveTo(12.356f, 6.018f, 11.709f, 6.151f, 11.106f, 6.406f)
                curveTo(10.504f, 6.661f, 9.958f, 7.033f, 9.5f, 7.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 6.5f)
                verticalLineTo(16.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 7.5f)
                verticalLineTo(17.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 7f)
                lineTo(17f, 2f)
                lineTo(18.37f, 2.68f)
                curveTo(18.783f, 2.888f, 19.238f, 2.997f, 19.7f, 3f)
                horizontalLineTo(21f)
                verticalLineTo(4.3f)
                curveTo(21f, 4.76f, 21.1f, 5.22f, 21.32f, 5.63f)
                lineTo(22f, 7f)
                lineTo(17f, 8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 17f)
                lineTo(7f, 22f)
                lineTo(5.63f, 21.32f)
                curveTo(5.217f, 21.112f, 4.762f, 21.003f, 4.3f, 21f)
                horizontalLineTo(3f)
                verticalLineTo(19.7f)
                curveTo(2.997f, 19.238f, 2.888f, 18.783f, 2.68f, 18.37f)
                lineTo(2f, 17f)
                lineTo(7f, 16f)
            }
        }.build()

        return _Candy!!
    }

@Suppress("ObjectPropertyName")
private var _Candy: ImageVector? = null
