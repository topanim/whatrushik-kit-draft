package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Laptop2: ImageVector
    get() {
        if (_Laptop2 != null) {
            return _Laptop2!!
        }
        _Laptop2 = ImageVector.Builder(
            name = "Laptop2",
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
                moveTo(19f, 4f)
                horizontalLineTo(5f)
                curveTo(3.895f, 4f, 3f, 4.895f, 3f, 6f)
                verticalLineTo(14f)
                curveTo(3f, 15.105f, 3.895f, 16f, 5f, 16f)
                horizontalLineTo(19f)
                curveTo(20.105f, 16f, 21f, 15.105f, 21f, 14f)
                verticalLineTo(6f)
                curveTo(21f, 4.895f, 20.105f, 4f, 19f, 4f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 20f)
                horizontalLineTo(22f)
            }
        }.build()

        return _Laptop2!!
    }

@Suppress("ObjectPropertyName")
private var _Laptop2: ImageVector? = null
