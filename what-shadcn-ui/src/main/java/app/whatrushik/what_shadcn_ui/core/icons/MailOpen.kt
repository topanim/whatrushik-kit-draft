package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val SHUIIcons.MailOpen: ImageVector
    get() {
        if (_MailOpen != null) {
            return _MailOpen!!
        }
        _MailOpen = ImageVector.Builder(
            name = "MailOpen",
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
                moveTo(21.2f, 8.4f)
                curveTo(21.7f, 8.78f, 22f, 9.37f, 22f, 10f)
                verticalLineTo(20f)
                curveTo(22f, 20.53f, 21.789f, 21.039f, 21.414f, 21.414f)
                curveTo(21.039f, 21.789f, 20.53f, 22f, 20f, 22f)
                horizontalLineTo(4f)
                curveTo(3.47f, 22f, 2.961f, 21.789f, 2.586f, 21.414f)
                curveTo(2.211f, 21.039f, 2f, 20.53f, 2f, 20f)
                verticalLineTo(10f)
                curveTo(2f, 9.69f, 2.072f, 9.383f, 2.211f, 9.106f)
                curveTo(2.35f, 8.828f, 2.552f, 8.586f, 2.8f, 8.4f)
                lineTo(10.8f, 2.4f)
                curveTo(11.146f, 2.14f, 11.567f, 2f, 12f, 2f)
                curveTo(12.433f, 2f, 12.854f, 2.14f, 13.2f, 2.4f)
                lineTo(21.2f, 8.4f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 10f)
                lineTo(13.03f, 15.7f)
                curveTo(12.721f, 15.893f, 12.364f, 15.996f, 12f, 15.996f)
                curveTo(11.636f, 15.996f, 11.279f, 15.893f, 10.97f, 15.7f)
                lineTo(2f, 10f)
            }
        }.build()

        return _MailOpen!!
    }

@Suppress("ObjectPropertyName")
private var _MailOpen: ImageVector? = null
