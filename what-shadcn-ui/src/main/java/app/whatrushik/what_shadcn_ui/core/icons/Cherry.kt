package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Cherry: ImageVector
    get() {
        if (_Cherry != null) {
            return _Cherry!!
        }
        _Cherry = ImageVector.Builder(
            name = "Cherry",
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
                moveTo(2f, 17f)
                curveTo(2f, 18.326f, 2.527f, 19.598f, 3.464f, 20.536f)
                curveTo(4.402f, 21.473f, 5.674f, 22f, 7f, 22f)
                curveTo(8.326f, 22f, 9.598f, 21.473f, 10.535f, 20.536f)
                curveTo(11.473f, 19.598f, 12f, 18.326f, 12f, 17f)
                curveTo(12f, 14.24f, 9.5f, 12f, 7f, 14f)
                curveTo(4.5f, 12f, 2f, 14.24f, 2f, 17f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 17f)
                curveTo(12f, 18.326f, 12.527f, 19.598f, 13.465f, 20.536f)
                curveTo(14.402f, 21.473f, 15.674f, 22f, 17f, 22f)
                curveTo(18.326f, 22f, 19.598f, 21.473f, 20.535f, 20.536f)
                curveTo(21.473f, 19.598f, 22f, 18.326f, 22f, 17f)
                curveTo(22f, 14.24f, 19.5f, 12f, 17f, 14f)
                curveTo(14.5f, 12f, 12f, 14.24f, 12f, 17f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 14f)
                curveTo(10.22f, 11.09f, 11.29f, 5.25f, 12f, 2f)
                curveTo(13.66f, 4.38f, 16.94f, 11f, 17f, 14f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 9f)
                curveTo(17.71f, 9f, 14.86f, 6.67f, 12f, 2f)
                curveTo(17.71f, 2f, 22f, 6.67f, 22f, 9f)
                close()
            }
        }.build()

        return _Cherry!!
    }

@Suppress("ObjectPropertyName")
private var _Cherry: ImageVector? = null
