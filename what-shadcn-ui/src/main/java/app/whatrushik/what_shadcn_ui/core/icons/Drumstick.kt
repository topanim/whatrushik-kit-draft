package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Drumstick: ImageVector
    get() {
        if (_Drumstick != null) {
            return _Drumstick!!
        }
        _Drumstick = ImageVector.Builder(
            name = "Drumstick",
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
                moveTo(15.45f, 15.4f)
                curveTo(13.32f, 16.05f, 11.15f, 15.72f, 9.75f, 14.3f)
                curveTo(7.46f, 12.03f, 7.99f, 7.8f, 10.92f, 4.88f)
                curveTo(13.85f, 1.95f, 18.07f, 1.42f, 20.35f, 3.7f)
                curveTo(21.76f, 5.11f, 22.09f, 7.27f, 21.45f, 9.41f)
                curveTo(20.05f, 8.9f, 18.19f, 9.39f, 16.81f, 10.77f)
                curveTo(15.43f, 12.15f, 14.94f, 14f, 15.45f, 15.4f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.25f, 15.6f)
                lineTo(9.09f, 17.76f)
                curveTo(9.297f, 18.073f, 9.431f, 18.428f, 9.482f, 18.8f)
                curveTo(9.533f, 19.171f, 9.5f, 19.55f, 9.385f, 19.907f)
                curveTo(9.27f, 20.264f, 9.076f, 20.59f, 8.818f, 20.862f)
                curveTo(8.559f, 21.134f, 8.243f, 21.344f, 7.892f, 21.477f)
                curveTo(7.541f, 21.611f, 7.165f, 21.663f, 6.792f, 21.631f)
                curveTo(6.418f, 21.599f, 6.056f, 21.483f, 5.733f, 21.292f)
                curveTo(5.41f, 21.101f, 5.134f, 20.84f, 4.926f, 20.528f)
                curveTo(4.718f, 20.216f, 4.582f, 19.861f, 4.53f, 19.49f)
                curveTo(4.069f, 19.427f, 3.635f, 19.236f, 3.277f, 18.939f)
                curveTo(2.92f, 18.642f, 2.652f, 18.25f, 2.505f, 17.809f)
                curveTo(2.359f, 17.368f, 2.338f, 16.894f, 2.447f, 16.442f)
                curveTo(2.556f, 15.989f, 2.789f, 15.577f, 3.12f, 15.25f)
                curveTo(3.527f, 14.844f, 4.061f, 14.59f, 4.633f, 14.532f)
                curveTo(5.205f, 14.474f, 5.78f, 14.614f, 6.26f, 14.93f)
                lineTo(8.42f, 12.77f)
            }
        }.build()

        return _Drumstick!!
    }

@Suppress("ObjectPropertyName")
private var _Drumstick: ImageVector? = null
