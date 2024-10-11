package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Ruler: ImageVector
    get() {
        if (_Ruler != null) {
            return _Ruler!!
        }
        _Ruler = ImageVector.Builder(
            name = "Ruler",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(21.3f, 8.7f)
                    lineTo(8.7f, 21.3f)
                    curveTo(7.7f, 22.3f, 6.2f, 22.3f, 5.3f, 21.3f)
                    lineTo(2.7f, 18.7f)
                    curveTo(1.7f, 17.7f, 1.7f, 16.2f, 2.7f, 15.3f)
                    lineTo(15.3f, 2.7f)
                    curveTo(16.3f, 1.7f, 17.8f, 1.7f, 18.7f, 2.7f)
                    lineTo(21.3f, 5.3f)
                    curveTo(22.3f, 6.3f, 22.3f, 7.8f, 21.3f, 8.7f)
                    close()
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(7.5f, 10.5f)
                    lineTo(9.5f, 12.5f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(10.5f, 7.5f)
                    lineTo(12.5f, 9.5f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(13.5f, 4.5f)
                    lineTo(15.5f, 6.5f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(4.5f, 13.5f)
                    lineTo(6.5f, 15.5f)
                }
            }
        }.build()

        return _Ruler!!
    }

@Suppress("ObjectPropertyName")
private var _Ruler: ImageVector? = null
