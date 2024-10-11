package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.CupSoda: ImageVector
    get() {
        if (_CupSoda != null) {
            return _CupSoda!!
        }
        _CupSoda = ImageVector.Builder(
            name = "CupSoda",
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
                moveTo(6f, 8f)
                lineTo(7.75f, 20.28f)
                curveTo(7.818f, 20.761f, 8.058f, 21.2f, 8.426f, 21.517f)
                curveTo(8.794f, 21.833f, 9.265f, 22.005f, 9.75f, 22f)
                horizontalLineTo(14.29f)
                curveTo(14.775f, 22.005f, 15.246f, 21.833f, 15.614f, 21.517f)
                curveTo(15.982f, 21.2f, 16.222f, 20.761f, 16.29f, 20.28f)
                lineTo(18f, 8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 8f)
                horizontalLineTo(19f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 15f)
                curveTo(7.792f, 14.668f, 8.642f, 14.497f, 9.5f, 14.497f)
                curveTo(10.358f, 14.497f, 11.208f, 14.668f, 12f, 15f)
                curveTo(12.792f, 15.332f, 13.642f, 15.502f, 14.5f, 15.502f)
                curveTo(15.358f, 15.502f, 16.208f, 15.332f, 17f, 15f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 8f)
                lineTo(13f, 2f)
                horizontalLineTo(15f)
            }
        }.build()

        return _CupSoda!!
    }

@Suppress("ObjectPropertyName")
private var _CupSoda: ImageVector? = null
