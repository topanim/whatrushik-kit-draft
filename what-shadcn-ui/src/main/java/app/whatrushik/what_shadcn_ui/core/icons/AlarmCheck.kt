package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val SHUIIcons.AlarmCheck: ImageVector
    get() {
        if (_AlarmCheck != null) {
            return _AlarmCheck!!
        }
        _AlarmCheck = ImageVector.Builder(
            name = "AlarmCheck",
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
                moveTo(12f, 21f)
                curveTo(14.122f, 21f, 16.157f, 20.157f, 17.657f, 18.657f)
                curveTo(19.157f, 17.157f, 20f, 15.122f, 20f, 13f)
                curveTo(20f, 10.878f, 19.157f, 8.843f, 17.657f, 7.343f)
                curveTo(16.157f, 5.843f, 14.122f, 5f, 12f, 5f)
                curveTo(9.878f, 5f, 7.843f, 5.843f, 6.343f, 7.343f)
                curveTo(4.843f, 8.843f, 4f, 10.878f, 4f, 13f)
                curveTo(4f, 15.122f, 4.843f, 17.157f, 6.343f, 18.657f)
                curveTo(7.843f, 20.157f, 9.878f, 21f, 12f, 21f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 3f)
                lineTo(2f, 6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 6f)
                lineTo(19f, 3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 19f)
                lineTo(4f, 21f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 19f)
                lineTo(20f, 21f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 13f)
                lineTo(11f, 15f)
                lineTo(15f, 11f)
            }
        }.build()

        return _AlarmCheck!!
    }

@Suppress("ObjectPropertyName")
private var _AlarmCheck: ImageVector? = null
