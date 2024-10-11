package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.History: ImageVector
    get() {
        if (_History != null) {
            return _History!!
        }
        _History = ImageVector.Builder(
            name = "History",
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
                moveTo(3f, 3f)
                verticalLineTo(8f)
                horizontalLineTo(8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.05f, 13f)
                curveTo(3.272f, 15.006f, 4.161f, 16.879f, 5.575f, 18.319f)
                curveTo(6.989f, 19.758f, 8.846f, 20.681f, 10.847f, 20.938f)
                curveTo(12.849f, 21.196f, 14.879f, 20.773f, 16.611f, 19.738f)
                curveTo(18.344f, 18.704f, 19.678f, 17.116f, 20.4f, 15.232f)
                curveTo(21.122f, 13.347f, 21.19f, 11.275f, 20.592f, 9.348f)
                curveTo(19.995f, 7.42f, 18.767f, 5.749f, 17.106f, 4.603f)
                curveTo(15.444f, 3.458f, 13.446f, 2.903f, 11.432f, 3.03f)
                curveTo(9.418f, 3.156f, 7.505f, 3.956f, 6f, 5.3f)
                lineTo(3f, 8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 7f)
                verticalLineTo(12f)
                lineTo(16f, 14f)
            }
        }.build()

        return _History!!
    }

@Suppress("ObjectPropertyName")
private var _History: ImageVector? = null
