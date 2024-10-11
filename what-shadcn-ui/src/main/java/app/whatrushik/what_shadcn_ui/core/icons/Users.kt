package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Users: ImageVector
    get() {
        if (_Users != null) {
            return _Users!!
        }
        _Users = ImageVector.Builder(
            name = "Users",
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
                moveTo(16f, 21f)
                verticalLineTo(19f)
                curveTo(16f, 17.939f, 15.579f, 16.922f, 14.828f, 16.172f)
                curveTo(14.078f, 15.421f, 13.061f, 15f, 12f, 15f)
                horizontalLineTo(6f)
                curveTo(4.939f, 15f, 3.922f, 15.421f, 3.172f, 16.172f)
                curveTo(2.421f, 16.922f, 2f, 17.939f, 2f, 19f)
                verticalLineTo(21f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 11f)
                curveTo(11.209f, 11f, 13f, 9.209f, 13f, 7f)
                curveTo(13f, 4.791f, 11.209f, 3f, 9f, 3f)
                curveTo(6.791f, 3f, 5f, 4.791f, 5f, 7f)
                curveTo(5f, 9.209f, 6.791f, 11f, 9f, 11f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 21f)
                verticalLineTo(19f)
                curveTo(21.999f, 18.114f, 21.704f, 17.253f, 21.161f, 16.552f)
                curveTo(20.618f, 15.852f, 19.858f, 15.351f, 19f, 15.13f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 3.13f)
                curveTo(16.86f, 3.35f, 17.623f, 3.851f, 18.168f, 4.552f)
                curveTo(18.712f, 5.254f, 19.008f, 6.117f, 19.008f, 7.005f)
                curveTo(19.008f, 7.893f, 18.712f, 8.756f, 18.168f, 9.458f)
                curveTo(17.623f, 10.159f, 16.86f, 10.66f, 16f, 10.88f)
            }
        }.build()

        return _Users!!
    }

@Suppress("ObjectPropertyName")
private var _Users: ImageVector? = null
