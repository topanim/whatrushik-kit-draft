package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Link2: ImageVector
    get() {
        if (_Link2 != null) {
            return _Link2!!
        }
        _Link2 = ImageVector.Builder(
            name = "Link2",
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
                horizontalLineTo(9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 7f)
                horizontalLineTo(17f)
                curveTo(18.326f, 7f, 19.598f, 7.527f, 20.535f, 8.464f)
                curveTo(21.473f, 9.402f, 22f, 10.674f, 22f, 12f)
                curveTo(22f, 13.326f, 21.473f, 14.598f, 20.535f, 15.535f)
                curveTo(19.598f, 16.473f, 18.326f, 17f, 17f, 17f)
                horizontalLineTo(15f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 12f)
                horizontalLineTo(16f)
            }
        }.build()

        return _Link2!!
    }

@Suppress("ObjectPropertyName")
private var _Link2: ImageVector? = null
