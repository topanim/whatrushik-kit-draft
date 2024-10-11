package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val SHUIIcons.CloudLightning: ImageVector
    get() {
        if (_CloudLightning != null) {
            return _CloudLightning!!
        }
        _CloudLightning = ImageVector.Builder(
            name = "CloudLightning",
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
                moveTo(6f, 16.326f)
                curveTo(4.946f, 15.826f, 4.034f, 15.07f, 3.347f, 14.127f)
                curveTo(2.659f, 13.185f, 2.219f, 12.085f, 2.064f, 10.929f)
                curveTo(1.91f, 9.773f, 2.047f, 8.596f, 2.463f, 7.507f)
                curveTo(2.879f, 6.417f, 3.56f, 5.448f, 4.446f, 4.689f)
                curveTo(5.332f, 3.929f, 6.393f, 3.403f, 7.533f, 3.159f)
                curveTo(8.674f, 2.914f, 9.858f, 2.958f, 10.977f, 3.287f)
                curveTo(12.096f, 3.616f, 13.115f, 4.219f, 13.942f, 5.042f)
                curveTo(14.768f, 5.866f, 15.376f, 6.882f, 15.71f, 8f)
                horizontalLineTo(17.5f)
                curveTo(18.652f, 7.998f, 19.76f, 8.437f, 20.597f, 9.228f)
                curveTo(21.434f, 10.019f, 21.937f, 11.1f, 22.001f, 12.25f)
                curveTo(22.065f, 13.399f, 21.686f, 14.53f, 20.942f, 15.408f)
                curveTo(20.197f, 16.287f, 19.145f, 16.847f, 18f, 16.973f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 12f)
                lineTo(10f, 17f)
                horizontalLineTo(14f)
                lineTo(11f, 22f)
            }
        }.build()

        return _CloudLightning!!
    }

@Suppress("ObjectPropertyName")
private var _CloudLightning: ImageVector? = null
