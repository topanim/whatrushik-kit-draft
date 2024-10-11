package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val SHUIIcons.Voicemail: ImageVector
    get() {
        if (_Voicemail != null) {
            return _Voicemail!!
        }
        _Voicemail = ImageVector.Builder(
            name = "Voicemail",
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
                moveTo(6f, 16f)
                curveTo(8.209f, 16f, 10f, 14.209f, 10f, 12f)
                curveTo(10f, 9.791f, 8.209f, 8f, 6f, 8f)
                curveTo(3.791f, 8f, 2f, 9.791f, 2f, 12f)
                curveTo(2f, 14.209f, 3.791f, 16f, 6f, 16f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 16f)
                curveTo(20.209f, 16f, 22f, 14.209f, 22f, 12f)
                curveTo(22f, 9.791f, 20.209f, 8f, 18f, 8f)
                curveTo(15.791f, 8f, 14f, 9.791f, 14f, 12f)
                curveTo(14f, 14.209f, 15.791f, 16f, 18f, 16f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 16f)
                horizontalLineTo(18f)
            }
        }.build()

        return _Voicemail!!
    }

@Suppress("ObjectPropertyName")
private var _Voicemail: ImageVector? = null
