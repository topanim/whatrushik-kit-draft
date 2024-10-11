package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Axe: ImageVector
    get() {
        if (_Axe != null) {
            return _Axe!!
        }
        _Axe = ImageVector.Builder(
            name = "Axe",
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
                moveTo(14f, 12f)
                lineTo(5.499f, 20.501f)
                curveTo(5.101f, 20.899f, 4.562f, 21.122f, 4f, 21.122f)
                curveTo(3.438f, 21.122f, 2.899f, 20.899f, 2.501f, 20.501f)
                horizontalLineTo(2.499f)
                curveTo(2.102f, 20.103f, 1.878f, 19.564f, 1.878f, 19.002f)
                curveTo(1.878f, 18.44f, 2.102f, 17.901f, 2.499f, 17.503f)
                lineTo(11f, 9.002f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 7f)
                lineTo(13f, 3f)
                lineTo(19f, 9f)
                horizontalLineTo(22f)
                lineTo(21.87f, 9.648f)
                curveTo(21.606f, 10.97f, 20.996f, 12.199f, 20.104f, 13.21f)
                curveTo(19.212f, 14.221f, 18.068f, 14.978f, 16.789f, 15.404f)
                lineTo(15f, 16f)
                verticalLineTo(13f)
                lineTo(9f, 7f)
                close()
            }
        }.build()

        return _Axe!!
    }

@Suppress("ObjectPropertyName")
private var _Axe: ImageVector? = null
