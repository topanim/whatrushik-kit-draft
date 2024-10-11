package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.GraduationCap: ImageVector
    get() {
        if (_GraduationCap != null) {
            return _GraduationCap!!
        }
        _GraduationCap = ImageVector.Builder(
            name = "GraduationCap",
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
                moveTo(22f, 10f)
                verticalLineTo(16f)
                moveTo(22f, 10f)
                lineTo(12f, 5f)
                lineTo(2f, 10f)
                lineTo(12f, 15f)
                lineTo(22f, 10f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 12f)
                verticalLineTo(17f)
                curveTo(9f, 20f, 15f, 20f, 18f, 17f)
                verticalLineTo(12f)
            }
        }.build()

        return _GraduationCap!!
    }

@Suppress("ObjectPropertyName")
private var _GraduationCap: ImageVector? = null
