package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val SHUIIcons.Sailboat: ImageVector
    get() {
        if (_Sailboat != null) {
            return _Sailboat!!
        }
        _Sailboat = ImageVector.Builder(
            name = "Sailboat",
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
                moveTo(22f, 18f)
                horizontalLineTo(2f)
                curveTo(2f, 19.061f, 2.421f, 20.078f, 3.172f, 20.828f)
                curveTo(3.922f, 21.579f, 4.939f, 22f, 6f, 22f)
                horizontalLineTo(18f)
                curveTo(19.061f, 22f, 20.078f, 21.579f, 20.828f, 20.828f)
                curveTo(21.579f, 20.078f, 22f, 19.061f, 22f, 18f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 14f)
                lineTo(10f, 2f)
                lineTo(3f, 14f)
                horizontalLineTo(21f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 2f)
                verticalLineTo(18f)
            }
        }.build()

        return _Sailboat!!
    }

@Suppress("ObjectPropertyName")
private var _Sailboat: ImageVector? = null
