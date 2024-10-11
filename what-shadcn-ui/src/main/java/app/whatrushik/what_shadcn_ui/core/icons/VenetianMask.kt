package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.VenetianMask: ImageVector
    get() {
        if (_VenetianMask != null) {
            return _VenetianMask!!
        }
        _VenetianMask = ImageVector.Builder(
            name = "VenetianMask",
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
                moveTo(2f, 12f)
                curveTo(2f, 13.326f, 2.527f, 14.598f, 3.464f, 15.535f)
                curveTo(4.402f, 16.473f, 5.674f, 17f, 7f, 17f)
                curveTo(8.848f, 17.069f, 10.615f, 17.776f, 12f, 19f)
                curveTo(13.385f, 17.776f, 15.152f, 17.069f, 17f, 17f)
                curveTo(18.326f, 17f, 19.598f, 16.473f, 20.535f, 15.535f)
                curveTo(21.473f, 14.598f, 22f, 13.326f, 22f, 12f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                curveTo(15.152f, 7.069f, 13.385f, 7.776f, 12f, 9f)
                curveTo(10.615f, 7.776f, 8.848f, 7.069f, 7f, 7f)
                horizontalLineTo(2f)
                verticalLineTo(12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 11f)
                curveTo(7.5f, 11f, 9f, 11.5f, 9f, 13f)
                curveTo(7f, 13f, 6f, 13f, 6f, 11f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 11f)
                curveTo(16.5f, 11f, 15f, 11.5f, 15f, 13f)
                curveTo(17f, 13f, 18f, 13f, 18f, 11f)
                close()
            }
        }.build()

        return _VenetianMask!!
    }

@Suppress("ObjectPropertyName")
private var _VenetianMask: ImageVector? = null
