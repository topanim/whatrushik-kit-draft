package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Wine: ImageVector
    get() {
        if (_Wine != null) {
            return _Wine!!
        }
        _Wine = ImageVector.Builder(
            name = "Wine",
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
                moveTo(8f, 22f)
                horizontalLineTo(16f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 10f)
                horizontalLineTo(17f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 15f)
                verticalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 15f)
                curveTo(13.326f, 15f, 14.598f, 14.473f, 15.535f, 13.535f)
                curveTo(16.473f, 12.598f, 17f, 11.326f, 17f, 10f)
                curveTo(17f, 8f, 16.5f, 6f, 15f, 2f)
                horizontalLineTo(9f)
                curveTo(7.5f, 6f, 7f, 8f, 7f, 10f)
                curveTo(7f, 11.326f, 7.527f, 12.598f, 8.464f, 13.535f)
                curveTo(9.402f, 14.473f, 10.674f, 15f, 12f, 15f)
                close()
            }
        }.build()

        return _Wine!!
    }

@Suppress("ObjectPropertyName")
private var _Wine: ImageVector? = null
