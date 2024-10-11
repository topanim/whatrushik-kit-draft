package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.LightbulbOff: ImageVector
    get() {
        if (_LightbulbOff != null) {
            return _LightbulbOff!!
        }
        _LightbulbOff = ImageVector.Builder(
            name = "LightbulbOff",
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
                moveTo(9f, 18f)
                horizontalLineTo(15f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 22f)
                horizontalLineTo(14f)
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
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 2.804f)
                curveTo(9.912f, 2.277f, 10.947f, 2f, 12f, 2f)
                curveTo(13.053f, 2f, 14.088f, 2.277f, 15f, 2.804f)
                curveTo(15.912f, 3.331f, 16.67f, 4.088f, 17.196f, 5f)
                curveTo(17.723f, 5.912f, 18f, 6.947f, 18f, 8f)
                curveTo(18.019f, 9.09f, 17.654f, 10.152f, 16.97f, 11f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.91f, 14f)
                curveTo(8.718f, 13.038f, 8.224f, 12.162f, 7.5f, 11.5f)
                curveTo(6.23f, 10.23f, 6f, 9f, 6f, 8f)
                curveTo(6f, 7.665f, 6.028f, 7.33f, 6.084f, 7f)
            }
        }.build()

        return _LightbulbOff!!
    }

@Suppress("ObjectPropertyName")
private var _LightbulbOff: ImageVector? = null
