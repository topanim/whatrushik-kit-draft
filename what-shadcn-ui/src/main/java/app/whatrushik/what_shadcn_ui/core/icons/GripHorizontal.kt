package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.GripHorizontal: ImageVector
    get() {
        if (_GripHorizontal != null) {
            return _GripHorizontal!!
        }
        _GripHorizontal = ImageVector.Builder(
            name = "GripHorizontal",
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
                moveTo(12f, 10f)
                curveTo(12.552f, 10f, 13f, 9.552f, 13f, 9f)
                curveTo(13f, 8.448f, 12.552f, 8f, 12f, 8f)
                curveTo(11.448f, 8f, 11f, 8.448f, 11f, 9f)
                curveTo(11f, 9.552f, 11.448f, 10f, 12f, 10f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 10f)
                curveTo(19.552f, 10f, 20f, 9.552f, 20f, 9f)
                curveTo(20f, 8.448f, 19.552f, 8f, 19f, 8f)
                curveTo(18.448f, 8f, 18f, 8.448f, 18f, 9f)
                curveTo(18f, 9.552f, 18.448f, 10f, 19f, 10f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 10f)
                curveTo(5.552f, 10f, 6f, 9.552f, 6f, 9f)
                curveTo(6f, 8.448f, 5.552f, 8f, 5f, 8f)
                curveTo(4.448f, 8f, 4f, 8.448f, 4f, 9f)
                curveTo(4f, 9.552f, 4.448f, 10f, 5f, 10f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 16f)
                curveTo(12.552f, 16f, 13f, 15.552f, 13f, 15f)
                curveTo(13f, 14.448f, 12.552f, 14f, 12f, 14f)
                curveTo(11.448f, 14f, 11f, 14.448f, 11f, 15f)
                curveTo(11f, 15.552f, 11.448f, 16f, 12f, 16f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 16f)
                curveTo(19.552f, 16f, 20f, 15.552f, 20f, 15f)
                curveTo(20f, 14.448f, 19.552f, 14f, 19f, 14f)
                curveTo(18.448f, 14f, 18f, 14.448f, 18f, 15f)
                curveTo(18f, 15.552f, 18.448f, 16f, 19f, 16f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 16f)
                curveTo(5.552f, 16f, 6f, 15.552f, 6f, 15f)
                curveTo(6f, 14.448f, 5.552f, 14f, 5f, 14f)
                curveTo(4.448f, 14f, 4f, 14.448f, 4f, 15f)
                curveTo(4f, 15.552f, 4.448f, 16f, 5f, 16f)
                close()
            }
        }.build()

        return _GripHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _GripHorizontal: ImageVector? = null
