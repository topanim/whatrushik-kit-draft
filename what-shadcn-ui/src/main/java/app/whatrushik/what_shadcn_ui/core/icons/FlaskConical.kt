package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.FlaskConical: ImageVector
    get() {
        if (_FlaskConical != null) {
            return _FlaskConical!!
        }
        _FlaskConical = ImageVector.Builder(
            name = "FlaskConical",
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
                moveTo(10f, 2f)
                verticalLineTo(9.527f)
                curveTo(10f, 9.838f, 9.928f, 10.145f, 9.789f, 10.423f)
                lineTo(4.72f, 20.55f)
                curveTo(4.643f, 20.703f, 4.606f, 20.873f, 4.614f, 21.044f)
                curveTo(4.622f, 21.215f, 4.673f, 21.382f, 4.763f, 21.527f)
                curveTo(4.854f, 21.673f, 4.98f, 21.793f, 5.13f, 21.876f)
                curveTo(5.28f, 21.958f, 5.449f, 22.001f, 5.62f, 22f)
                horizontalLineTo(18.38f)
                curveTo(18.551f, 22.001f, 18.72f, 21.958f, 18.87f, 21.876f)
                curveTo(19.02f, 21.793f, 19.146f, 21.673f, 19.237f, 21.527f)
                curveTo(19.327f, 21.382f, 19.378f, 21.215f, 19.386f, 21.044f)
                curveTo(19.394f, 20.873f, 19.357f, 20.703f, 19.28f, 20.55f)
                lineTo(14.211f, 10.423f)
                curveTo(14.072f, 10.145f, 14f, 9.838f, 14f, 9.527f)
                verticalLineTo(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.5f, 2f)
                horizontalLineTo(15.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 16f)
                horizontalLineTo(17f)
            }
        }.build()

        return _FlaskConical!!
    }

@Suppress("ObjectPropertyName")
private var _FlaskConical: ImageVector? = null
