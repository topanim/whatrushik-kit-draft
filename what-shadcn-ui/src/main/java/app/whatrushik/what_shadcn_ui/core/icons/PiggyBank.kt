package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.PiggyBank: ImageVector
    get() {
        if (_PiggyBank != null) {
            return _PiggyBank!!
        }
        _PiggyBank = ImageVector.Builder(
            name = "PiggyBank",
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
                moveTo(19f, 5f)
                curveTo(17.5f, 5f, 16.2f, 6.4f, 16f, 7f)
                curveTo(12.5f, 5.5f, 5f, 6.7f, 5f, 12f)
                curveTo(5f, 13.8f, 5f, 15f, 7f, 16.5f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                horizontalLineTo(14f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(16f)
                curveTo(19f, 15.5f, 19.7f, 15f, 20f, 14f)
                horizontalLineTo(22f)
                verticalLineTo(10f)
                horizontalLineTo(20f)
                curveTo(20f, 9f, 19.5f, 8.5f, 19f, 8f)
                verticalLineTo(5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 9f)
                verticalLineTo(10f)
                curveTo(2f, 11.1f, 2.9f, 12f, 4f, 12f)
                horizontalLineTo(5f)
            }
        }.build()

        return _PiggyBank!!
    }

@Suppress("ObjectPropertyName")
private var _PiggyBank: ImageVector? = null
