package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val SHUIIcons.Gitlab: ImageVector
    get() {
        if (_Gitlab != null) {
            return _Gitlab!!
        }
        _Gitlab = ImageVector.Builder(
            name = "Gitlab",
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
                moveTo(22f, 13.29f)
                lineTo(18.67f, 3.29f)
                curveTo(18.641f, 3.218f, 18.592f, 3.156f, 18.53f, 3.11f)
                curveTo(18.471f, 3.05f, 18.393f, 3.011f, 18.31f, 3f)
                curveTo(18.228f, 2.999f, 18.147f, 3.023f, 18.08f, 3.07f)
                curveTo(18.018f, 3.116f, 17.969f, 3.178f, 17.94f, 3.25f)
                lineTo(15.68f, 9.92f)
                horizontalLineTo(8.32f)
                lineTo(6.1f, 3.26f)
                curveTo(6.082f, 3.193f, 6.048f, 3.131f, 6f, 3.08f)
                curveTo(5.926f, 3.022f, 5.834f, 2.994f, 5.74f, 3f)
                curveTo(5.658f, 2.999f, 5.577f, 3.023f, 5.51f, 3.07f)
                curveTo(5.448f, 3.116f, 5.399f, 3.178f, 5.37f, 3.25f)
                lineTo(2f, 13.29f)
                curveTo(1.951f, 13.439f, 1.951f, 13.6f, 2f, 13.749f)
                curveTo(2.048f, 13.898f, 2.143f, 14.028f, 2.27f, 14.12f)
                lineTo(12f, 21f)
                lineTo(21.69f, 14.12f)
                curveTo(21.828f, 14.037f, 21.934f, 13.91f, 21.99f, 13.759f)
                curveTo(22.047f, 13.608f, 22.05f, 13.443f, 22f, 13.29f)
                close()
            }
        }.build()

        return _Gitlab!!
    }

@Suppress("ObjectPropertyName")
private var _Gitlab: ImageVector? = null
