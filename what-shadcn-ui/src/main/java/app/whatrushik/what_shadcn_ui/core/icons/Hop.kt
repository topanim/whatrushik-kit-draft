package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Hop: ImageVector
    get() {
        if (_Hop != null) {
            return _Hop!!
        }
        _Hop = ImageVector.Builder(
            name = "Hop",
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
                moveTo(17.5f, 5.5f)
                curveTo(19f, 7f, 20.5f, 9f, 21f, 11f)
                curveTo(18.5f, 11.5f, 16f, 11.5f, 12.5f, 10f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.5f, 17.5f)
                curveTo(7f, 19f, 9f, 20.5f, 11f, 21f)
                curveTo(11.5f, 18.5f, 11.5f, 16f, 10f, 12.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.5f, 11.5f)
                curveTo(17.5f, 13.5f, 17.5f, 15f, 17.5f, 17.5f)
                curveTo(15f, 17.5f, 13.5f, 17.5f, 11.5f, 16.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 11.5f)
                curveTo(21f, 13f, 22f, 15f, 22f, 16f)
                curveTo(20.5f, 16.5f, 19f, 16f, 17.5f, 15.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.5f, 20f)
                curveTo(13f, 21f, 15f, 22f, 16f, 22f)
                curveTo(16.5f, 20.5f, 16f, 19f, 15.5f, 17.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.5f, 16.5f)
                curveTo(21.5f, 18.5f, 22f, 20f, 22f, 22f)
                curveTo(20f, 22f, 18.5f, 21.5f, 16.5f, 20.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.783f, 4.782f)
                curveTo(8.493f, 1.072f, 14.5f, 1f, 18f, 5f)
                curveTo(17f, 6f, 13.5f, 7f, 11.5f, 6.5f)
                curveTo(12.5f, 8f, 12.5f, 10.5f, 12f, 12f)
                curveTo(10.5f, 12.5f, 8f, 12.5f, 6.5f, 11.5f)
                curveTo(7f, 13.5f, 6f, 17f, 5f, 18f)
                curveTo(1f, 14.5f, 1.073f, 8.492f, 4.783f, 4.782f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.5f, 4.5f)
                lineTo(3f, 3f)
                curveTo(2.816f, 2.815f, 2.816f, 2.184f, 3f, 2f)
            }
        }.build()

        return _Hop!!
    }

@Suppress("ObjectPropertyName")
private var _Hop: ImageVector? = null
