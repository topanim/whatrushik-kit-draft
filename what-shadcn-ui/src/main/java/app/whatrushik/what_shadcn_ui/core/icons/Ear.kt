package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Ear: ImageVector
    get() {
        if (_Ear != null) {
            return _Ear!!
        }
        _Ear = ImageVector.Builder(
            name = "Ear",
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
                moveTo(6f, 8.5f)
                curveTo(6f, 6.776f, 6.685f, 5.123f, 7.904f, 3.904f)
                curveTo(9.123f, 2.685f, 10.776f, 2f, 12.5f, 2f)
                curveTo(14.224f, 2f, 15.877f, 2.685f, 17.096f, 3.904f)
                curveTo(18.315f, 5.123f, 19f, 6.776f, 19f, 8.5f)
                curveTo(19f, 14.5f, 13f, 14.5f, 13f, 18.5f)
                curveTo(13f, 18.96f, 12.91f, 19.415f, 12.734f, 19.839f)
                curveTo(12.558f, 20.264f, 12.3f, 20.65f, 11.975f, 20.975f)
                curveTo(11.65f, 21.3f, 11.264f, 21.558f, 10.839f, 21.734f)
                curveTo(10.415f, 21.91f, 9.96f, 22f, 9.5f, 22f)
                curveTo(9.04f, 22f, 8.585f, 21.91f, 8.161f, 21.734f)
                curveTo(7.736f, 21.558f, 7.35f, 21.3f, 7.025f, 20.975f)
                curveTo(6.7f, 20.65f, 6.442f, 20.264f, 6.266f, 19.839f)
                curveTo(6.091f, 19.415f, 6f, 18.96f, 6f, 18.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 8.5f)
                curveTo(15f, 7.837f, 14.737f, 7.201f, 14.268f, 6.732f)
                curveTo(13.799f, 6.263f, 13.163f, 6f, 12.5f, 6f)
                curveTo(11.837f, 6f, 11.201f, 6.263f, 10.732f, 6.732f)
                curveTo(10.263f, 7.201f, 10f, 7.837f, 10f, 8.5f)
                verticalLineTo(9.5f)
                curveTo(10.53f, 9.5f, 11.039f, 9.711f, 11.414f, 10.086f)
                curveTo(11.789f, 10.461f, 12f, 10.97f, 12f, 11.5f)
                curveTo(12f, 12.03f, 11.789f, 12.539f, 11.414f, 12.914f)
                curveTo(11.039f, 13.289f, 10.53f, 13.5f, 10f, 13.5f)
            }
        }.build()

        return _Ear!!
    }

@Suppress("ObjectPropertyName")
private var _Ear: ImageVector? = null
