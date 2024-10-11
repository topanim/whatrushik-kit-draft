package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val SHUIIcons.Superscript: ImageVector
    get() {
        if (_Superscript != null) {
            return _Superscript!!
        }
        _Superscript = ImageVector.Builder(
            name = "Superscript",
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
                moveTo(4f, 19f)
                lineTo(12f, 11f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 19f)
                lineTo(4f, 11f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 12f)
                horizontalLineTo(16f)
                curveTo(16f, 10.5f, 16.442f, 10f, 17.5f, 9.5f)
                curveTo(18.558f, 9f, 20f, 8.334f, 20f, 7.002f)
                curveTo(20f, 6.53f, 19.83f, 6.072f, 19.516f, 5.712f)
                curveTo(19.196f, 5.35f, 18.761f, 5.109f, 18.285f, 5.03f)
                curveTo(17.808f, 4.95f, 17.319f, 5.037f, 16.899f, 5.276f)
                curveTo(16.479f, 5.515f, 16.161f, 5.89f, 16f, 6.336f)
            }
        }.build()

        return _Superscript!!
    }

@Suppress("ObjectPropertyName")
private var _Superscript: ImageVector? = null
