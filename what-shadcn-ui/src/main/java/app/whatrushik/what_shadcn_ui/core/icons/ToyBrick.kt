package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.ToyBrick: ImageVector
    get() {
        if (_ToyBrick != null) {
            return _ToyBrick!!
        }
        _ToyBrick = ImageVector.Builder(
            name = "ToyBrick",
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
                moveTo(20f, 8f)
                horizontalLineTo(4f)
                curveTo(3.448f, 8f, 3f, 8.448f, 3f, 9f)
                verticalLineTo(19f)
                curveTo(3f, 19.552f, 3.448f, 20f, 4f, 20f)
                horizontalLineTo(20f)
                curveTo(20.552f, 20f, 21f, 19.552f, 21f, 19f)
                verticalLineTo(9f)
                curveTo(21f, 8.448f, 20.552f, 8f, 20f, 8f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 8f)
                verticalLineTo(5f)
                curveTo(10f, 4.4f, 9.6f, 4f, 9f, 4f)
                horizontalLineTo(6f)
                curveTo(5.735f, 4f, 5.48f, 4.105f, 5.293f, 4.293f)
                curveTo(5.105f, 4.48f, 5f, 4.735f, 5f, 5f)
                verticalLineTo(8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 8f)
                verticalLineTo(5f)
                curveTo(19f, 4.4f, 18.6f, 4f, 18f, 4f)
                horizontalLineTo(15f)
                curveTo(14.735f, 4f, 14.48f, 4.105f, 14.293f, 4.293f)
                curveTo(14.105f, 4.48f, 14f, 4.735f, 14f, 5f)
                verticalLineTo(8f)
            }
        }.build()

        return _ToyBrick!!
    }

@Suppress("ObjectPropertyName")
private var _ToyBrick: ImageVector? = null
