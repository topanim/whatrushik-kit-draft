package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.HeartHandshake: ImageVector
    get() {
        if (_HeartHandshake != null) {
            return _HeartHandshake!!
        }
        _HeartHandshake = ImageVector.Builder(
            name = "HeartHandshake",
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
                moveTo(20.42f, 4.58f)
                curveTo(19.918f, 4.077f, 19.322f, 3.677f, 18.666f, 3.405f)
                curveTo(18.009f, 3.132f, 17.306f, 2.992f, 16.595f, 2.992f)
                curveTo(15.884f, 2.992f, 15.181f, 3.132f, 14.524f, 3.405f)
                curveTo(13.868f, 3.677f, 13.272f, 4.077f, 12.77f, 4.58f)
                lineTo(12f, 5.36f)
                lineTo(11.23f, 4.58f)
                curveTo(10.728f, 4.077f, 10.132f, 3.677f, 9.476f, 3.405f)
                curveTo(8.819f, 3.132f, 8.116f, 2.992f, 7.405f, 2.992f)
                curveTo(6.694f, 2.992f, 5.991f, 3.132f, 5.334f, 3.405f)
                curveTo(4.678f, 3.677f, 4.082f, 4.077f, 3.58f, 4.58f)
                curveTo(1.46f, 6.7f, 1.33f, 10.28f, 4f, 13f)
                lineTo(12f, 21f)
                lineTo(20f, 13f)
                curveTo(22.67f, 10.28f, 22.54f, 6.7f, 20.42f, 4.58f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 5.36f)
                lineTo(8.87f, 8.5f)
                curveTo(8.474f, 8.899f, 8.252f, 9.438f, 8.252f, 10f)
                curveTo(8.252f, 10.562f, 8.474f, 11.101f, 8.87f, 11.5f)
                curveTo(9.269f, 11.896f, 9.808f, 12.118f, 10.37f, 12.118f)
                curveTo(10.932f, 12.118f, 11.471f, 11.896f, 11.87f, 11.5f)
                lineTo(14.13f, 9.29f)
                curveTo(14.692f, 8.734f, 15.45f, 8.423f, 16.24f, 8.423f)
                curveTo(17.03f, 8.423f, 17.788f, 8.734f, 18.35f, 9.29f)
                lineTo(20.75f, 11.69f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 15f)
                lineTo(16f, 13f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 18f)
                lineTo(13f, 16f)
            }
        }.build()

        return _HeartHandshake!!
    }

@Suppress("ObjectPropertyName")
private var _HeartHandshake: ImageVector? = null
