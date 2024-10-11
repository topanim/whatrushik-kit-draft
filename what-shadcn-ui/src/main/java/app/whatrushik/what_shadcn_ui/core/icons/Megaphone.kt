package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Megaphone: ImageVector
    get() {
        if (_Megaphone != null) {
            return _Megaphone!!
        }
        _Megaphone = ImageVector.Builder(
            name = "Megaphone",
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
                moveTo(3f, 11f)
                lineTo(21f, 6f)
                verticalLineTo(18f)
                lineTo(3f, 14f)
                verticalLineTo(11f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.6f, 16.8f)
                curveTo(11.495f, 17.181f, 11.316f, 17.537f, 11.073f, 17.849f)
                curveTo(10.83f, 18.16f, 10.528f, 18.421f, 10.185f, 18.616f)
                curveTo(9.841f, 18.811f, 9.463f, 18.937f, 9.071f, 18.985f)
                curveTo(8.679f, 19.034f, 8.281f, 19.005f, 7.9f, 18.9f)
                curveTo(7.519f, 18.795f, 7.163f, 18.616f, 6.851f, 18.373f)
                curveTo(6.539f, 18.13f, 6.279f, 17.829f, 6.084f, 17.485f)
                curveTo(5.889f, 17.141f, 5.763f, 16.763f, 5.715f, 16.371f)
                curveTo(5.666f, 15.979f, 5.695f, 15.581f, 5.8f, 15.2f)
            }
        }.build()

        return _Megaphone!!
    }

@Suppress("ObjectPropertyName")
private var _Megaphone: ImageVector? = null
