package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.EggOff: ImageVector
    get() {
        if (_EggOff != null) {
            return _EggOff!!
        }
        _EggOff = ImageVector.Builder(
            name = "EggOff",
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
                moveTo(6.399f, 6.399f)
                curveTo(5.362f, 8.157f, 4.65f, 10.189f, 4.5f, 12f)
                curveTo(4.13f, 16.43f, 5.77f, 21.95f, 12f, 22f)
                curveTo(15.256f, 21.974f, 17.259f, 20.453f, 18.375f, 18.375f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.532f, 13.875f)
                curveTo(19.563f, 13.25f, 19.552f, 12.624f, 19.5f, 12f)
                curveTo(19.14f, 7.66f, 15.55f, 2.04f, 12f, 2f)
                curveTo(10.96f, 2.012f, 9.918f, 2.502f, 8.954f, 3.297f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 2f)
                lineTo(22f, 22f)
            }
        }.build()

        return _EggOff!!
    }

@Suppress("ObjectPropertyName")
private var _EggOff: ImageVector? = null
