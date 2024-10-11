package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Undo2: ImageVector
    get() {
        if (_Undo2 != null) {
            return _Undo2!!
        }
        _Undo2 = ImageVector.Builder(
            name = "Undo2",
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
                moveTo(9f, 14f)
                lineTo(4f, 9f)
                lineTo(9f, 4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 9f)
                horizontalLineTo(14.5f)
                curveTo(15.222f, 9f, 15.938f, 9.142f, 16.605f, 9.419f)
                curveTo(17.272f, 9.695f, 17.878f, 10.1f, 18.389f, 10.611f)
                curveTo(18.9f, 11.122f, 19.305f, 11.728f, 19.581f, 12.395f)
                curveTo(19.858f, 13.063f, 20f, 13.778f, 20f, 14.5f)
                curveTo(20f, 15.222f, 19.858f, 15.938f, 19.581f, 16.605f)
                curveTo(19.305f, 17.272f, 18.9f, 17.878f, 18.389f, 18.389f)
                curveTo(17.878f, 18.9f, 17.272f, 19.305f, 16.605f, 19.581f)
                curveTo(15.938f, 19.858f, 15.222f, 20f, 14.5f, 20f)
                horizontalLineTo(11f)
            }
        }.build()

        return _Undo2!!
    }

@Suppress("ObjectPropertyName")
private var _Undo2: ImageVector? = null
