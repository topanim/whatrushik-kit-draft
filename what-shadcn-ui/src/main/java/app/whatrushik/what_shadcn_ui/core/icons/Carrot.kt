package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Carrot: ImageVector
    get() {
        if (_Carrot != null) {
            return _Carrot!!
        }
        _Carrot = ImageVector.Builder(
            name = "Carrot",
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
                moveTo(8.64f, 14f)
                lineTo(6.59f, 11.96f)
                moveTo(15.34f, 15f)
                lineTo(12.88f, 12.54f)
                moveTo(2.27f, 21.7f)
                curveTo(2.27f, 21.7f, 12.14f, 18.2f, 15f, 15.34f)
                curveTo(15.418f, 14.922f, 15.75f, 14.427f, 15.977f, 13.881f)
                curveTo(16.203f, 13.335f, 16.32f, 12.75f, 16.321f, 12.158f)
                curveTo(16.321f, 11.568f, 16.205f, 10.982f, 15.979f, 10.436f)
                curveTo(15.754f, 9.89f, 15.423f, 9.393f, 15.005f, 8.975f)
                curveTo(14.587f, 8.557f, 14.092f, 8.225f, 13.546f, 7.998f)
                curveTo(13f, 7.772f, 12.415f, 7.655f, 11.824f, 7.654f)
                curveTo(11.233f, 7.654f, 10.647f, 7.77f, 10.101f, 7.995f)
                curveTo(9.555f, 8.221f, 9.058f, 8.552f, 8.64f, 8.97f)
                curveTo(5.77f, 11.84f, 2.27f, 21.7f, 2.27f, 21.7f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 9f)
                curveTo(22f, 9f, 20.67f, 7f, 18.5f, 7f)
                curveTo(16.86f, 7f, 15f, 9f, 15f, 9f)
                curveTo(15f, 9f, 16.33f, 11f, 18.5f, 11f)
                curveTo(20.67f, 11f, 22f, 9f, 22f, 9f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 2f)
                curveTo(15f, 2f, 13f, 3.33f, 13f, 5.5f)
                curveTo(13f, 7.67f, 15f, 9f, 15f, 9f)
                curveTo(15f, 9f, 17f, 7.16f, 17f, 5.5f)
                curveTo(17f, 3.33f, 15f, 2f, 15f, 2f)
                close()
            }
        }.build()

        return _Carrot!!
    }

@Suppress("ObjectPropertyName")
private var _Carrot: ImageVector? = null
