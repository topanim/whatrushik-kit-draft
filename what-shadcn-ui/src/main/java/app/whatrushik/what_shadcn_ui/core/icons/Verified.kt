package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Verified: ImageVector
    get() {
        if (_Verified != null) {
            return _Verified!!
        }
        _Verified = ImageVector.Builder(
            name = "Verified",
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
                moveTo(12f, 3f)
                curveTo(10.8f, 3f, 9.6f, 3.6f, 9f, 4.7f)
                curveTo(8.401f, 4.547f, 7.773f, 4.55f, 7.176f, 4.71f)
                curveTo(6.579f, 4.87f, 6.033f, 5.181f, 5.591f, 5.613f)
                curveTo(5.149f, 6.045f, 4.826f, 6.583f, 4.652f, 7.177f)
                curveTo(4.478f, 7.77f, 4.461f, 8.398f, 4.6f, 9f)
                curveTo(3.6f, 9.6f, 2.9f, 10.8f, 2.9f, 12f)
                curveTo(2.9f, 13.2f, 3.6f, 14.4f, 4.6f, 15f)
                curveTo(4.3f, 16.2f, 4.6f, 17.5f, 5.6f, 18.4f)
                curveTo(6.4f, 19.2f, 7.7f, 19.6f, 8.9f, 19.4f)
                curveTo(9.5f, 20.4f, 10.7f, 21f, 11.9f, 21f)
                curveTo(13.1f, 21f, 14.3f, 20.4f, 14.9f, 19.3f)
                curveTo(16.1f, 19.6f, 17.4f, 19.3f, 18.3f, 18.3f)
                curveTo(19.1f, 17.5f, 19.5f, 16.3f, 19.3f, 15f)
                curveTo(20.3f, 14.4f, 20.9f, 13.2f, 20.9f, 12f)
                curveTo(20.9f, 10.8f, 20.3f, 9.6f, 19.2f, 9f)
                curveTo(19.5f, 7.8f, 19.2f, 6.5f, 18.2f, 5.6f)
                curveTo(17.772f, 5.178f, 17.249f, 4.866f, 16.674f, 4.692f)
                curveTo(16.099f, 4.518f, 15.49f, 4.486f, 14.9f, 4.6f)
                curveTo(14.3f, 3.6f, 13.1f, 3f, 11.9f, 3f)
                horizontalLineTo(12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 12f)
                lineTo(11f, 14f)
                lineTo(15f, 10f)
            }
        }.build()

        return _Verified!!
    }

@Suppress("ObjectPropertyName")
private var _Verified: ImageVector? = null
