package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.GripVertical: ImageVector
    get() {
        if (_GripVertical != null) {
            return _GripVertical!!
        }
        _GripVertical = ImageVector.Builder(
            name = "GripVertical",
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
                moveTo(9f, 13f)
                curveTo(9.552f, 13f, 10f, 12.552f, 10f, 12f)
                curveTo(10f, 11.448f, 9.552f, 11f, 9f, 11f)
                curveTo(8.448f, 11f, 8f, 11.448f, 8f, 12f)
                curveTo(8f, 12.552f, 8.448f, 13f, 9f, 13f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 6f)
                curveTo(9.552f, 6f, 10f, 5.552f, 10f, 5f)
                curveTo(10f, 4.448f, 9.552f, 4f, 9f, 4f)
                curveTo(8.448f, 4f, 8f, 4.448f, 8f, 5f)
                curveTo(8f, 5.552f, 8.448f, 6f, 9f, 6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 20f)
                curveTo(9.552f, 20f, 10f, 19.552f, 10f, 19f)
                curveTo(10f, 18.448f, 9.552f, 18f, 9f, 18f)
                curveTo(8.448f, 18f, 8f, 18.448f, 8f, 19f)
                curveTo(8f, 19.552f, 8.448f, 20f, 9f, 20f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 13f)
                curveTo(15.552f, 13f, 16f, 12.552f, 16f, 12f)
                curveTo(16f, 11.448f, 15.552f, 11f, 15f, 11f)
                curveTo(14.448f, 11f, 14f, 11.448f, 14f, 12f)
                curveTo(14f, 12.552f, 14.448f, 13f, 15f, 13f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 6f)
                curveTo(15.552f, 6f, 16f, 5.552f, 16f, 5f)
                curveTo(16f, 4.448f, 15.552f, 4f, 15f, 4f)
                curveTo(14.448f, 4f, 14f, 4.448f, 14f, 5f)
                curveTo(14f, 5.552f, 14.448f, 6f, 15f, 6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 20f)
                curveTo(15.552f, 20f, 16f, 19.552f, 16f, 19f)
                curveTo(16f, 18.448f, 15.552f, 18f, 15f, 18f)
                curveTo(14.448f, 18f, 14f, 18.448f, 14f, 19f)
                curveTo(14f, 19.552f, 14.448f, 20f, 15f, 20f)
                close()
            }
        }.build()

        return _GripVertical!!
    }

@Suppress("ObjectPropertyName")
private var _GripVertical: ImageVector? = null
