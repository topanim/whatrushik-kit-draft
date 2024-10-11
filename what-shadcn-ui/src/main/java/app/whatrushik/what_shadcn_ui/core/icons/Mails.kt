package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Mails: ImageVector
    get() {
        if (_Mails != null) {
            return _Mails!!
        }
        _Mails = ImageVector.Builder(
            name = "Mails",
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
                moveTo(20f, 4f)
                horizontalLineTo(8f)
                curveTo(6.895f, 4f, 6f, 4.895f, 6f, 6f)
                verticalLineTo(15f)
                curveTo(6f, 16.105f, 6.895f, 17f, 8f, 17f)
                horizontalLineTo(20f)
                curveTo(21.105f, 17f, 22f, 16.105f, 22f, 15f)
                verticalLineTo(6f)
                curveTo(22f, 4.895f, 21.105f, 4f, 20f, 4f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 7f)
                lineTo(14.9f, 10.78f)
                curveTo(14.33f, 11.08f, 13.67f, 11.08f, 13.1f, 10.78f)
                lineTo(6f, 7f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 8f)
                verticalLineTo(19f)
                curveTo(2f, 20.1f, 2.9f, 21f, 4f, 21f)
                horizontalLineTo(18f)
            }
        }.build()

        return _Mails!!
    }

@Suppress("ObjectPropertyName")
private var _Mails: ImageVector? = null
