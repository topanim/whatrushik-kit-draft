package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Shirt: ImageVector
    get() {
        if (_Shirt != null) {
            return _Shirt!!
        }
        _Shirt = ImageVector.Builder(
            name = "Shirt",
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
                moveTo(20.38f, 3.46f)
                lineTo(16f, 2f)
                curveTo(16f, 3.061f, 15.579f, 4.078f, 14.828f, 4.828f)
                curveTo(14.078f, 5.579f, 13.061f, 6f, 12f, 6f)
                curveTo(10.939f, 6f, 9.922f, 5.579f, 9.172f, 4.828f)
                curveTo(8.421f, 4.078f, 8f, 3.061f, 8f, 2f)
                lineTo(3.62f, 3.46f)
                curveTo(3.167f, 3.611f, 2.784f, 3.918f, 2.538f, 4.327f)
                curveTo(2.292f, 4.736f, 2.201f, 5.22f, 2.28f, 5.69f)
                lineTo(2.86f, 9.16f)
                curveTo(2.898f, 9.395f, 3.019f, 9.609f, 3.2f, 9.763f)
                curveTo(3.382f, 9.916f, 3.612f, 10.001f, 3.85f, 10f)
                horizontalLineTo(6f)
                verticalLineTo(20f)
                curveTo(6f, 21.1f, 6.9f, 22f, 8f, 22f)
                horizontalLineTo(16f)
                curveTo(16.531f, 22f, 17.039f, 21.789f, 17.414f, 21.414f)
                curveTo(17.789f, 21.039f, 18f, 20.53f, 18f, 20f)
                verticalLineTo(10f)
                horizontalLineTo(20.15f)
                curveTo(20.388f, 10.001f, 20.618f, 9.916f, 20.8f, 9.763f)
                curveTo(20.981f, 9.609f, 21.102f, 9.395f, 21.14f, 9.16f)
                lineTo(21.72f, 5.69f)
                curveTo(21.799f, 5.22f, 21.708f, 4.736f, 21.462f, 4.327f)
                curveTo(21.216f, 3.918f, 20.833f, 3.611f, 20.38f, 3.46f)
                close()
            }
        }.build()

        return _Shirt!!
    }

@Suppress("ObjectPropertyName")
private var _Shirt: ImageVector? = null
