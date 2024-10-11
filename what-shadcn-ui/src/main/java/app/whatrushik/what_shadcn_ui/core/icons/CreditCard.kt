package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val SHUIIcons.CreditCard: ImageVector
    get() {
        if (_CreditCard != null) {
            return _CreditCard!!
        }
        _CreditCard = ImageVector.Builder(
            name = "CreditCard",
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
                moveTo(20f, 5f)
                horizontalLineTo(4f)
                curveTo(2.895f, 5f, 2f, 5.895f, 2f, 7f)
                verticalLineTo(17f)
                curveTo(2f, 18.105f, 2.895f, 19f, 4f, 19f)
                horizontalLineTo(20f)
                curveTo(21.105f, 19f, 22f, 18.105f, 22f, 17f)
                verticalLineTo(7f)
                curveTo(22f, 5.895f, 21.105f, 5f, 20f, 5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 10f)
                horizontalLineTo(22f)
            }
        }.build()

        return _CreditCard!!
    }

@Suppress("ObjectPropertyName")
private var _CreditCard: ImageVector? = null
