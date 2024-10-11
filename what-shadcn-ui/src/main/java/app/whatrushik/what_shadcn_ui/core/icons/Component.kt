package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Component: ImageVector
    get() {
        if (_Component != null) {
            return _Component!!
        }
        _Component = ImageVector.Builder(
            name = "Component",
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
                moveTo(5.5f, 8.5f)
                lineTo(9f, 12f)
                lineTo(5.5f, 15.5f)
                lineTo(2f, 12f)
                lineTo(5.5f, 8.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 2f)
                lineTo(15.5f, 5.5f)
                lineTo(12f, 9f)
                lineTo(8.5f, 5.5f)
                lineTo(12f, 2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.5f, 8.5f)
                lineTo(22f, 12f)
                lineTo(18.5f, 15.5f)
                lineTo(15f, 12f)
                lineTo(18.5f, 8.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 15f)
                lineTo(15.5f, 18.5f)
                lineTo(12f, 22f)
                lineTo(8.5f, 18.5f)
                lineTo(12f, 15f)
                close()
            }
        }.build()

        return _Component!!
    }

@Suppress("ObjectPropertyName")
private var _Component: ImageVector? = null
