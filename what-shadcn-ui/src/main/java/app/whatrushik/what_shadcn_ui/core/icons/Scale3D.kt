package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Scale3D: ImageVector
    get() {
        if (_Scale3D != null) {
            return _Scale3D!!
        }
        _Scale3D = ImageVector.Builder(
            name = "Scale3D",
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
                moveTo(5f, 7f)
                verticalLineTo(19f)
                horizontalLineTo(17f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 19f)
                lineTo(11f, 13f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 3f)
                horizontalLineTo(4f)
                curveTo(3.448f, 3f, 3f, 3.448f, 3f, 4f)
                verticalLineTo(6f)
                curveTo(3f, 6.552f, 3.448f, 7f, 4f, 7f)
                horizontalLineTo(6f)
                curveTo(6.552f, 7f, 7f, 6.552f, 7f, 6f)
                verticalLineTo(4f)
                curveTo(7f, 3.448f, 6.552f, 3f, 6f, 3f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 17f)
                horizontalLineTo(18f)
                curveTo(17.448f, 17f, 17f, 17.448f, 17f, 18f)
                verticalLineTo(20f)
                curveTo(17f, 20.552f, 17.448f, 21f, 18f, 21f)
                horizontalLineTo(20f)
                curveTo(20.552f, 21f, 21f, 20.552f, 21f, 20f)
                verticalLineTo(18f)
                curveTo(21f, 17.448f, 20.552f, 17f, 20f, 17f)
                close()
            }
        }.build()

        return _Scale3D!!
    }

@Suppress("ObjectPropertyName")
private var _Scale3D: ImageVector? = null
