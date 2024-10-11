package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Apple: ImageVector
    get() {
        if (_Apple != null) {
            return _Apple!!
        }
        _Apple = ImageVector.Builder(
            name = "Apple",
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
                moveTo(12f, 20.94f)
                curveTo(13.5f, 20.94f, 14.75f, 22f, 16f, 22f)
                curveTo(19f, 22f, 22f, 14f, 22f, 9.78f)
                curveTo(21.966f, 8.485f, 21.421f, 7.255f, 20.485f, 6.36f)
                curveTo(19.548f, 5.465f, 18.295f, 4.976f, 17f, 5f)
                curveTo(14.78f, 5f, 13f, 6.44f, 12f, 7f)
                curveTo(11f, 6.44f, 9.22f, 5f, 7f, 5f)
                curveTo(5.704f, 4.973f, 4.45f, 5.461f, 3.513f, 6.357f)
                curveTo(2.575f, 7.253f, 2.031f, 8.484f, 2f, 9.78f)
                curveTo(2f, 14f, 5f, 22f, 8f, 22f)
                curveTo(9.25f, 22f, 10.5f, 20.94f, 12f, 20.94f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 2f)
                curveTo(11f, 2.5f, 12f, 4f, 12f, 7f)
            }
        }.build()

        return _Apple!!
    }

@Suppress("ObjectPropertyName")
private var _Apple: ImageVector? = null
