package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val SHUIIcons.Github: ImageVector
    get() {
        if (_Github != null) {
            return _Github!!
        }
        _Github = ImageVector.Builder(
            name = "Github",
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
                moveTo(15f, 22f)
                verticalLineTo(18f)
                curveTo(15.139f, 16.747f, 14.78f, 15.49f, 14f, 14.5f)
                curveTo(17f, 14.5f, 20f, 12.5f, 20f, 9f)
                curveTo(20.08f, 7.75f, 19.73f, 6.52f, 19f, 5.5f)
                curveTo(19.28f, 4.35f, 19.28f, 3.15f, 19f, 2f)
                curveTo(19f, 2f, 18f, 2f, 16f, 3.5f)
                curveTo(13.36f, 3f, 10.64f, 3f, 8f, 3.5f)
                curveTo(6f, 2f, 5f, 2f, 5f, 2f)
                curveTo(4.7f, 3.15f, 4.7f, 4.35f, 5f, 5.5f)
                curveTo(4.272f, 6.516f, 3.919f, 7.753f, 4f, 9f)
                curveTo(4f, 12.5f, 7f, 14.5f, 10f, 14.5f)
                curveTo(9.61f, 14.99f, 9.32f, 15.55f, 9.15f, 16.15f)
                curveTo(8.98f, 16.75f, 8.93f, 17.38f, 9f, 18f)
                verticalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 18f)
                curveTo(4.49f, 20f, 4f, 16f, 2f, 16f)
            }
        }.build()

        return _Github!!
    }

@Suppress("ObjectPropertyName")
private var _Github: ImageVector? = null
