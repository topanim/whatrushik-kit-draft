package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Skull: ImageVector
    get() {
        if (_Skull != null) {
            return _Skull!!
        }
        _Skull = ImageVector.Builder(
            name = "Skull",
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
                moveTo(9f, 13f)
                curveTo(9.552f, 13f, 10f, 12.552f, 10f, 12f)
                curveTo(10f, 11.448f, 9.552f, 11f, 9f, 11f)
                curveTo(8.448f, 11f, 8f, 11.448f, 8f, 12f)
                curveTo(8f, 12.552f, 8.448f, 13f, 9f, 13f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 13f)
                curveTo(15.552f, 13f, 16f, 12.552f, 16f, 12f)
                curveTo(16f, 11.448f, 15.552f, 11f, 15f, 11f)
                curveTo(14.448f, 11f, 14f, 11.448f, 14f, 12f)
                curveTo(14f, 12.552f, 14.448f, 13f, 15f, 13f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 20f)
                verticalLineTo(22f)
                horizontalLineTo(16f)
                verticalLineTo(20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.5f, 17f)
                lineTo(12f, 16f)
                lineTo(11.5f, 17f)
                horizontalLineTo(12.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 20f)
                curveTo(16.377f, 20f, 16.746f, 19.893f, 17.064f, 19.692f)
                curveTo(17.383f, 19.492f, 17.639f, 19.205f, 17.802f, 18.865f)
                curveTo(17.965f, 18.526f, 18.029f, 18.147f, 17.986f, 17.773f)
                curveTo(17.943f, 17.399f, 17.795f, 17.044f, 17.56f, 16.75f)
                curveTo(18.706f, 15.642f, 19.495f, 14.217f, 19.826f, 12.658f)
                curveTo(20.157f, 11.099f, 20.014f, 9.477f, 19.417f, 7.999f)
                curveTo(18.819f, 6.522f, 17.794f, 5.256f, 16.473f, 4.365f)
                curveTo(15.151f, 3.474f, 13.594f, 2.998f, 12f, 2.998f)
                curveTo(10.406f, 2.998f, 8.849f, 3.474f, 7.527f, 4.365f)
                curveTo(6.206f, 5.256f, 5.181f, 6.522f, 4.583f, 7.999f)
                curveTo(3.986f, 9.477f, 3.843f, 11.099f, 4.174f, 12.658f)
                curveTo(4.505f, 14.217f, 5.294f, 15.642f, 6.44f, 16.75f)
                curveTo(6.205f, 17.044f, 6.057f, 17.399f, 6.014f, 17.773f)
                curveTo(5.971f, 18.147f, 6.035f, 18.526f, 6.198f, 18.865f)
                curveTo(6.361f, 19.205f, 6.617f, 19.492f, 6.936f, 19.692f)
                curveTo(7.254f, 19.893f, 7.623f, 20f, 8f, 20f)
            }
        }.build()

        return _Skull!!
    }

@Suppress("ObjectPropertyName")
private var _Skull: ImageVector? = null
