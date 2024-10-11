package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.PersonStanding: ImageVector
    get() {
        if (_PersonStanding != null) {
            return _PersonStanding!!
        }
        _PersonStanding = ImageVector.Builder(
            name = "PersonStanding",
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
                moveTo(12f, 6f)
                curveTo(12.552f, 6f, 13f, 5.552f, 13f, 5f)
                curveTo(13f, 4.448f, 12.552f, 4f, 12f, 4f)
                curveTo(11.448f, 4f, 11f, 4.448f, 11f, 5f)
                curveTo(11f, 5.552f, 11.448f, 6f, 12f, 6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 20f)
                lineTo(12f, 14f)
                lineTo(15f, 20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 8f)
                lineTo(12f, 10f)
                lineTo(18f, 8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 10f)
                verticalLineTo(14f)
            }
        }.build()

        return _PersonStanding!!
    }

@Suppress("ObjectPropertyName")
private var _PersonStanding: ImageVector? = null
