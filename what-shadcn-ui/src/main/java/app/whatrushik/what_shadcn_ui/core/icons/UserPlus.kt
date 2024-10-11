package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.UserPlus: ImageVector
    get() {
        if (_UserPlus != null) {
            return _UserPlus!!
        }
        _UserPlus = ImageVector.Builder(
            name = "UserPlus",
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
                moveTo(19f, 8f)
                verticalLineTo(14f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 11f)
                horizontalLineTo(16f)
            }
        }.build()

        return _UserPlus!!
    }

@Suppress("ObjectPropertyName")
private var _UserPlus: ImageVector? = null
