package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Copyleft: ImageVector
    get() {
        if (_Copyleft != null) {
            return _Copyleft!!
        }
        _Copyleft = ImageVector.Builder(
            name = "Copyleft",
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
                moveTo(12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 9.35f)
                curveTo(9.538f, 8.742f, 10.248f, 8.312f, 11.037f, 8.117f)
                curveTo(11.825f, 7.922f, 12.654f, 7.972f, 13.413f, 8.259f)
                curveTo(14.172f, 8.547f, 14.826f, 9.059f, 15.288f, 9.727f)
                curveTo(15.749f, 10.395f, 15.996f, 11.188f, 15.996f, 12f)
                curveTo(15.996f, 12.812f, 15.749f, 13.605f, 15.288f, 14.273f)
                curveTo(14.826f, 14.941f, 14.172f, 15.453f, 13.413f, 15.741f)
                curveTo(12.654f, 16.028f, 11.825f, 16.078f, 11.037f, 15.883f)
                curveTo(10.248f, 15.688f, 9.538f, 15.258f, 9f, 14.65f)
            }
        }.build()

        return _Copyleft!!
    }

@Suppress("ObjectPropertyName")
private var _Copyleft: ImageVector? = null
