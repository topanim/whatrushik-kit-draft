package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val SHUIIcons.Link2Off: ImageVector
    get() {
        if (_Link2Off != null) {
            return _Link2Off!!
        }
        _Link2Off = ImageVector.Builder(
            name = "Link2Off",
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
                moveTo(9f, 17f)
                horizontalLineTo(7f)
                curveTo(5.674f, 17f, 4.402f, 16.473f, 3.464f, 15.535f)
                curveTo(2.527f, 14.598f, 2f, 13.326f, 2f, 12f)
                curveTo(2f, 10.674f, 2.527f, 9.402f, 3.464f, 8.464f)
                curveTo(4.402f, 7.527f, 5.674f, 7f, 7f, 7f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 7f)
                horizontalLineTo(17f)
                curveTo(17.929f, 7f, 18.839f, 7.259f, 19.629f, 7.747f)
                curveTo(20.419f, 8.235f, 21.057f, 8.933f, 21.472f, 9.764f)
                curveTo(21.887f, 10.594f, 22.063f, 11.524f, 21.98f, 12.449f)
                curveTo(21.896f, 13.374f, 21.557f, 14.257f, 21f, 15f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 12f)
                horizontalLineTo(12f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 2f)
                lineTo(22f, 22f)
            }
        }.build()

        return _Link2Off!!
    }

@Suppress("ObjectPropertyName")
private var _Link2Off: ImageVector? = null
