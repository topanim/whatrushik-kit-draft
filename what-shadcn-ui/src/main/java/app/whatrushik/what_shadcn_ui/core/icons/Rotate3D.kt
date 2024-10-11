package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val SHUIIcons.Rotate3D: ImageVector
    get() {
        if (_Rotate3D != null) {
            return _Rotate3D!!
        }
        _Rotate3D = ImageVector.Builder(
            name = "Rotate3D",
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
                moveTo(16.466f, 7.5f)
                curveTo(15.643f, 4.237f, 13.952f, 2f, 12f, 2f)
                curveTo(9.239f, 2f, 7f, 6.477f, 7f, 12f)
                curveTo(7f, 17.523f, 9.239f, 22f, 12f, 22f)
                curveTo(12.342f, 22f, 12.677f, 21.931f, 13f, 21.8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.194f, 13.707f)
                lineTo(19.008f, 15.567f)
                lineTo(17.148f, 19.381f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 15.57f)
                curveTo(17.196f, 16.455f, 14.726f, 17f, 12f, 17f)
                curveTo(6.477f, 17f, 2f, 14.761f, 2f, 12f)
                curveTo(2f, 9.239f, 6.477f, 7f, 12f, 7f)
                curveTo(16.838f, 7f, 20.873f, 8.718f, 21.8f, 11f)
            }
        }.build()

        return _Rotate3D!!
    }

@Suppress("ObjectPropertyName")
private var _Rotate3D: ImageVector? = null
