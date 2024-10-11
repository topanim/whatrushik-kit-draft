package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.CloudOff: ImageVector
    get() {
        if (_CloudOff != null) {
            return _CloudOff!!
        }
        _CloudOff = ImageVector.Builder(
            name = "CloudOff",
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
                moveTo(2f, 2f)
                lineTo(22f, 22f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.782f, 5.782f)
                curveTo(4.388f, 6.503f, 3.277f, 7.671f, 2.627f, 9.098f)
                curveTo(1.976f, 10.526f, 1.825f, 12.131f, 2.196f, 13.656f)
                curveTo(2.567f, 15.18f, 3.439f, 16.536f, 4.673f, 17.505f)
                curveTo(5.907f, 18.474f, 7.431f, 19.001f, 9f, 19f)
                horizontalLineTo(17.5f)
                curveTo(17.943f, 19f, 18.383f, 18.935f, 18.807f, 18.807f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.532f, 16.5f)
                curveTo(21.872f, 15.814f, 22.032f, 15.052f, 21.996f, 14.287f)
                curveTo(21.96f, 13.522f, 21.729f, 12.779f, 21.325f, 12.128f)
                curveTo(20.921f, 11.477f, 20.358f, 10.94f, 19.689f, 10.568f)
                curveTo(19.019f, 10.195f, 18.266f, 10f, 17.5f, 10f)
                horizontalLineTo(15.71f)
                curveTo(15.328f, 8.719f, 14.587f, 7.575f, 13.575f, 6.701f)
                curveTo(12.563f, 5.828f, 11.323f, 5.262f, 10f, 5.07f)
            }
        }.build()

        return _CloudOff!!
    }

@Suppress("ObjectPropertyName")
private var _CloudOff: ImageVector? = null
