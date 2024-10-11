package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Redo2: ImageVector
    get() {
        if (_Redo2 != null) {
            return _Redo2!!
        }
        _Redo2 = ImageVector.Builder(
            name = "Redo2",
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
                moveTo(15f, 14f)
                lineTo(20f, 9f)
                lineTo(15f, 4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 9f)
                horizontalLineTo(9.5f)
                curveTo(8.041f, 9f, 6.642f, 9.579f, 5.611f, 10.611f)
                curveTo(4.579f, 11.642f, 4f, 13.041f, 4f, 14.5f)
                curveTo(4f, 15.222f, 4.142f, 15.938f, 4.419f, 16.605f)
                curveTo(4.695f, 17.272f, 5.1f, 17.878f, 5.611f, 18.389f)
                curveTo(6.642f, 19.42f, 8.041f, 20f, 9.5f, 20f)
                horizontalLineTo(13f)
            }
        }.build()

        return _Redo2!!
    }

@Suppress("ObjectPropertyName")
private var _Redo2: ImageVector? = null
