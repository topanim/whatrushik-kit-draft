package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Plug: ImageVector
    get() {
        if (_Plug != null) {
            return _Plug!!
        }
        _Plug = ImageVector.Builder(
            name = "Plug",
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
                verticalLineTo(17f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 7f)
                verticalLineTo(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 7f)
                verticalLineTo(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 13f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                curveTo(18f, 14.061f, 17.579f, 15.078f, 16.828f, 15.828f)
                curveTo(16.078f, 16.579f, 15.061f, 17f, 14f, 17f)
                horizontalLineTo(10f)
                curveTo(8.939f, 17f, 7.922f, 16.579f, 7.172f, 15.828f)
                curveTo(6.421f, 15.078f, 6f, 14.061f, 6f, 13f)
                close()
            }
        }.build()

        return _Plug!!
    }

@Suppress("ObjectPropertyName")
private var _Plug: ImageVector? = null
