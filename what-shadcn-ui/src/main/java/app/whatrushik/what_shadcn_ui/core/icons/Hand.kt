package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Hand: ImageVector
    get() {
        if (_Hand != null) {
            return _Hand!!
        }
        _Hand = ImageVector.Builder(
            name = "Hand",
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
                moveTo(18f, 11f)
                verticalLineTo(6f)
                curveTo(18f, 5.47f, 17.789f, 4.961f, 17.414f, 4.586f)
                curveTo(17.039f, 4.211f, 16.53f, 4f, 16f, 4f)
                curveTo(15.47f, 4f, 14.961f, 4.211f, 14.586f, 4.586f)
                curveTo(14.211f, 4.961f, 14f, 5.47f, 14f, 6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 10f)
                verticalLineTo(4f)
                curveTo(14f, 3.47f, 13.789f, 2.961f, 13.414f, 2.586f)
                curveTo(13.039f, 2.211f, 12.53f, 2f, 12f, 2f)
                curveTo(11.47f, 2f, 10.961f, 2.211f, 10.586f, 2.586f)
                curveTo(10.211f, 2.961f, 10f, 3.47f, 10f, 4f)
                verticalLineTo(6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 10.5f)
                verticalLineTo(6f)
                curveTo(10f, 5.47f, 9.789f, 4.961f, 9.414f, 4.586f)
                curveTo(9.039f, 4.211f, 8.53f, 4f, 8f, 4f)
                curveTo(7.47f, 4f, 6.961f, 4.211f, 6.586f, 4.586f)
                curveTo(6.211f, 4.961f, 6f, 5.47f, 6f, 6f)
                verticalLineTo(14f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 8f)
                curveTo(18f, 7.47f, 18.211f, 6.961f, 18.586f, 6.586f)
                curveTo(18.961f, 6.211f, 19.469f, 6f, 20f, 6f)
                curveTo(20.53f, 6f, 21.039f, 6.211f, 21.414f, 6.586f)
                curveTo(21.789f, 6.961f, 22f, 7.47f, 22f, 8f)
                verticalLineTo(14f)
                curveTo(22f, 16.122f, 21.157f, 18.157f, 19.657f, 19.657f)
                curveTo(18.156f, 21.157f, 16.122f, 22f, 14f, 22f)
                horizontalLineTo(12f)
                curveTo(9.2f, 22f, 7.5f, 21.14f, 6.01f, 19.66f)
                lineTo(2.41f, 16.06f)
                curveTo(2.066f, 15.679f, 1.882f, 15.18f, 1.895f, 14.667f)
                curveTo(1.909f, 14.154f, 2.119f, 13.665f, 2.483f, 13.303f)
                curveTo(2.846f, 12.941f, 3.335f, 12.732f, 3.849f, 12.72f)
                curveTo(4.362f, 12.708f, 4.86f, 12.895f, 5.24f, 13.24f)
                lineTo(7f, 15f)
            }
        }.build()

        return _Hand!!
    }

@Suppress("ObjectPropertyName")
private var _Hand: ImageVector? = null
