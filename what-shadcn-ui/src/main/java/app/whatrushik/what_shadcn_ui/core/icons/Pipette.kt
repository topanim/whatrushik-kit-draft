package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Pipette: ImageVector
    get() {
        if (_Pipette != null) {
            return _Pipette!!
        }
        _Pipette = ImageVector.Builder(
            name = "Pipette",
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
                moveTo(2f, 22f)
                lineTo(3f, 21f)
                horizontalLineTo(6f)
                lineTo(15f, 12f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 21f)
                verticalLineTo(18f)
                lineTo(12f, 9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 6f)
                lineTo(18.4f, 2.6f)
                curveTo(18.798f, 2.202f, 19.337f, 1.979f, 19.9f, 1.979f)
                curveTo(20.463f, 1.979f, 21.002f, 2.202f, 21.4f, 2.6f)
                curveTo(21.798f, 2.998f, 22.021f, 3.537f, 22.021f, 4.1f)
                curveTo(22.021f, 4.663f, 21.798f, 5.202f, 21.4f, 5.6f)
                lineTo(18f, 9f)
                lineTo(18.4f, 9.4f)
                curveTo(18.597f, 9.597f, 18.753f, 9.831f, 18.86f, 10.088f)
                curveTo(18.966f, 10.345f, 19.021f, 10.621f, 19.021f, 10.9f)
                curveTo(19.021f, 11.179f, 18.966f, 11.454f, 18.86f, 11.712f)
                curveTo(18.753f, 11.969f, 18.597f, 12.203f, 18.4f, 12.4f)
                curveTo(18.203f, 12.597f, 17.969f, 12.753f, 17.712f, 12.86f)
                curveTo(17.454f, 12.966f, 17.178f, 13.021f, 16.9f, 13.021f)
                curveTo(16.621f, 13.021f, 16.346f, 12.966f, 16.088f, 12.86f)
                curveTo(15.831f, 12.753f, 15.597f, 12.597f, 15.4f, 12.4f)
                lineTo(11.6f, 8.6f)
                curveTo(11.403f, 8.403f, 11.247f, 8.169f, 11.14f, 7.912f)
                curveTo(11.033f, 7.654f, 10.979f, 7.379f, 10.979f, 7.1f)
                curveTo(10.979f, 6.821f, 11.033f, 6.546f, 11.14f, 6.288f)
                curveTo(11.247f, 6.031f, 11.403f, 5.797f, 11.6f, 5.6f)
                curveTo(11.797f, 5.403f, 12.031f, 5.247f, 12.288f, 5.14f)
                curveTo(12.545f, 5.034f, 12.821f, 4.979f, 13.1f, 4.979f)
                curveTo(13.378f, 4.979f, 13.654f, 5.034f, 13.912f, 5.14f)
                curveTo(14.169f, 5.247f, 14.403f, 5.403f, 14.6f, 5.6f)
                lineTo(15f, 6f)
                close()
            }
        }.build()

        return _Pipette!!
    }

@Suppress("ObjectPropertyName")
private var _Pipette: ImageVector? = null
