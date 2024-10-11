package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val SHUIIcons.Stethoscope: ImageVector
    get() {
        if (_Stethoscope != null) {
            return _Stethoscope!!
        }
        _Stethoscope = ImageVector.Builder(
            name = "Stethoscope",
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
                moveTo(4.8f, 2.3f)
                curveTo(4.804f, 2.363f, 4.827f, 2.423f, 4.866f, 2.472f)
                curveTo(4.906f, 2.521f, 4.96f, 2.556f, 5.021f, 2.572f)
                curveTo(5.081f, 2.589f, 5.146f, 2.586f, 5.205f, 2.564f)
                curveTo(5.264f, 2.542f, 5.314f, 2.502f, 5.349f, 2.449f)
                curveTo(5.384f, 2.397f, 5.402f, 2.335f, 5.399f, 2.272f)
                curveTo(5.397f, 2.209f, 5.375f, 2.149f, 5.336f, 2.099f)
                curveTo(5.298f, 2.049f, 5.245f, 2.013f, 5.184f, 1.995f)
                curveTo(5.124f, 1.977f, 5.059f, 1.979f, 5f, 2f)
                horizontalLineTo(4f)
                curveTo(3.47f, 2f, 2.961f, 2.211f, 2.586f, 2.586f)
                curveTo(2.211f, 2.961f, 2f, 3.469f, 2f, 4f)
                verticalLineTo(9f)
                curveTo(2f, 10.591f, 2.632f, 12.117f, 3.757f, 13.243f)
                curveTo(4.883f, 14.368f, 6.409f, 15f, 8f, 15f)
                curveTo(9.591f, 15f, 11.117f, 14.368f, 12.243f, 13.243f)
                curveTo(13.368f, 12.117f, 14f, 10.591f, 14f, 9f)
                verticalLineTo(4f)
                curveTo(14f, 3.469f, 13.789f, 2.961f, 13.414f, 2.586f)
                curveTo(13.039f, 2.211f, 12.53f, 2f, 12f, 2f)
                horizontalLineTo(11f)
                curveTo(10.98f, 2.02f, 10.965f, 2.043f, 10.954f, 2.069f)
                curveTo(10.943f, 2.094f, 10.938f, 2.122f, 10.938f, 2.15f)
                curveTo(10.938f, 2.178f, 10.943f, 2.205f, 10.954f, 2.231f)
                curveTo(10.965f, 2.257f, 10.98f, 2.28f, 11f, 2.3f)
                curveTo(11.02f, 2.32f, 11.043f, 2.335f, 11.069f, 2.346f)
                curveTo(11.095f, 2.357f, 11.122f, 2.362f, 11.15f, 2.362f)
                curveTo(11.178f, 2.362f, 11.205f, 2.357f, 11.231f, 2.346f)
                curveTo(11.257f, 2.335f, 11.28f, 2.32f, 11.3f, 2.3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 15f)
                verticalLineTo(16f)
                curveTo(8f, 17.591f, 8.632f, 19.117f, 9.757f, 20.243f)
                curveTo(10.883f, 21.368f, 12.409f, 22f, 14f, 22f)
                curveTo(15.591f, 22f, 17.117f, 21.368f, 18.243f, 20.243f)
                curveTo(19.368f, 19.117f, 20f, 17.591f, 20f, 16f)
                verticalLineTo(12f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 12f)
                curveTo(21.105f, 12f, 22f, 11.105f, 22f, 10f)
                curveTo(22f, 8.895f, 21.105f, 8f, 20f, 8f)
                curveTo(18.895f, 8f, 18f, 8.895f, 18f, 10f)
                curveTo(18f, 11.105f, 18.895f, 12f, 20f, 12f)
                close()
            }
        }.build()

        return _Stethoscope!!
    }

@Suppress("ObjectPropertyName")
private var _Stethoscope: ImageVector? = null
