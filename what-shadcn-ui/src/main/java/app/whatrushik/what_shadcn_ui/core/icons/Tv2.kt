package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Tv2: ImageVector
    get() {
        if (_Tv2 != null) {
            return _Tv2!!
        }
        _Tv2 = ImageVector.Builder(
            name = "Tv2",
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
                moveTo(7f, 21f)
                horizontalLineTo(17f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 3f)
                horizontalLineTo(4f)
                curveTo(2.895f, 3f, 2f, 3.895f, 2f, 5f)
                verticalLineTo(15f)
                curveTo(2f, 16.105f, 2.895f, 17f, 4f, 17f)
                horizontalLineTo(20f)
                curveTo(21.105f, 17f, 22f, 16.105f, 22f, 15f)
                verticalLineTo(5f)
                curveTo(22f, 3.895f, 21.105f, 3f, 20f, 3f)
                close()
            }
        }.build()

        return _Tv2!!
    }

@Suppress("ObjectPropertyName")
private var _Tv2: ImageVector? = null
