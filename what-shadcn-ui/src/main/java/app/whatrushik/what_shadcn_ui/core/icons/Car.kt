package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Car: ImageVector
    get() {
        if (_Car != null) {
            return _Car!!
        }
        _Car = ImageVector.Builder(
            name = "Car",
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
                moveTo(14f, 16f)
                horizontalLineTo(9f)
                moveTo(19f, 16f)
                horizontalLineTo(22f)
                verticalLineTo(12.85f)
                curveTo(22.001f, 12.612f, 21.917f, 12.382f, 21.763f, 12.2f)
                curveTo(21.608f, 12.019f, 21.395f, 11.898f, 21.16f, 11.86f)
                lineTo(16f, 11f)
                lineTo(13.3f, 7.4f)
                curveTo(13.207f, 7.276f, 13.086f, 7.175f, 12.947f, 7.106f)
                curveTo(12.808f, 7.036f, 12.655f, 7f, 12.5f, 7f)
                horizontalLineTo(5.24f)
                curveTo(4.867f, 6.997f, 4.501f, 7.099f, 4.183f, 7.293f)
                curveTo(3.865f, 7.488f, 3.608f, 7.767f, 3.44f, 8.1f)
                lineTo(2.64f, 9.73f)
                curveTo(2.22f, 10.565f, 2.001f, 11.486f, 2f, 12.42f)
                verticalLineTo(16f)
                horizontalLineTo(4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.5f, 19f)
                curveTo(7.881f, 19f, 9f, 17.881f, 9f, 16.5f)
                curveTo(9f, 15.119f, 7.881f, 14f, 6.5f, 14f)
                curveTo(5.119f, 14f, 4f, 15.119f, 4f, 16.5f)
                curveTo(4f, 17.881f, 5.119f, 19f, 6.5f, 19f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.5f, 19f)
                curveTo(17.881f, 19f, 19f, 17.881f, 19f, 16.5f)
                curveTo(19f, 15.119f, 17.881f, 14f, 16.5f, 14f)
                curveTo(15.119f, 14f, 14f, 15.119f, 14f, 16.5f)
                curveTo(14f, 17.881f, 15.119f, 19f, 16.5f, 19f)
                close()
            }
        }.build()

        return _Car!!
    }

@Suppress("ObjectPropertyName")
private var _Car: ImageVector? = null
