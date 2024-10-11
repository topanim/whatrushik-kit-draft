package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Microwave: ImageVector
    get() {
        if (_Microwave != null) {
            return _Microwave!!
        }
        _Microwave = ImageVector.Builder(
            name = "Microwave",
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
                moveTo(20f, 4f)
                horizontalLineTo(4f)
                curveTo(2.895f, 4f, 2f, 4.895f, 2f, 6f)
                verticalLineTo(17f)
                curveTo(2f, 18.105f, 2.895f, 19f, 4f, 19f)
                horizontalLineTo(20f)
                curveTo(21.105f, 19f, 22f, 18.105f, 22f, 17f)
                verticalLineTo(6f)
                curveTo(22f, 4.895f, 21.105f, 4f, 20f, 4f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 8f)
                horizontalLineTo(7f)
                curveTo(6.448f, 8f, 6f, 8.448f, 6f, 9f)
                verticalLineTo(14f)
                curveTo(6f, 14.552f, 6.448f, 15f, 7f, 15f)
                horizontalLineTo(13f)
                curveTo(13.552f, 15f, 14f, 14.552f, 14f, 14f)
                verticalLineTo(9f)
                curveTo(14f, 8.448f, 13.552f, 8f, 13f, 8f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 8f)
                verticalLineTo(15f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 19f)
                verticalLineTo(21f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 19f)
                verticalLineTo(21f)
            }
        }.build()

        return _Microwave!!
    }

@Suppress("ObjectPropertyName")
private var _Microwave: ImageVector? = null
