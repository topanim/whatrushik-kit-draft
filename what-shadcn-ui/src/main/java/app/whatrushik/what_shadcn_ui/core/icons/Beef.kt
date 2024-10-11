package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Beef: ImageVector
    get() {
        if (_Beef != null) {
            return _Beef!!
        }
        _Beef = ImageVector.Builder(
            name = "Beef",
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
                moveTo(12.5f, 11f)
                curveTo(13.881f, 11f, 15f, 9.881f, 15f, 8.5f)
                curveTo(15f, 7.119f, 13.881f, 6f, 12.5f, 6f)
                curveTo(11.119f, 6f, 10f, 7.119f, 10f, 8.5f)
                curveTo(10f, 9.881f, 11.119f, 11f, 12.5f, 11f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.5f, 2f)
                curveTo(11.107f, 1.999f, 9.751f, 2.446f, 8.631f, 3.274f)
                curveTo(7.511f, 4.102f, 6.687f, 5.268f, 6.28f, 6.6f)
                curveTo(5.18f, 9.73f, 5.5f, 10.5f, 3.1f, 12.68f)
                curveTo(2.622f, 13.072f, 2.276f, 13.602f, 2.111f, 14.198f)
                curveTo(1.946f, 14.794f, 1.969f, 15.427f, 2.177f, 16.009f)
                curveTo(2.385f, 16.591f, 2.768f, 17.095f, 3.273f, 17.452f)
                curveTo(3.778f, 17.808f, 4.382f, 18f, 5f, 18f)
                curveTo(9f, 18f, 13.4f, 16.2f, 16.4f, 13.7f)
                curveTo(17.491f, 12.882f, 18.298f, 11.74f, 18.704f, 10.438f)
                curveTo(19.111f, 9.136f, 19.098f, 7.739f, 18.666f, 6.445f)
                curveTo(18.235f, 5.15f, 17.407f, 4.025f, 16.301f, 3.227f)
                curveTo(15.194f, 2.429f, 13.864f, 2f, 12.5f, 2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.5f, 6f)
                lineTo(20.69f, 10.5f)
                curveTo(20.897f, 11.146f, 21.002f, 11.821f, 21f, 12.5f)
                curveTo(21.001f, 13.509f, 20.766f, 14.505f, 20.315f, 15.407f)
                curveTo(19.864f, 16.31f, 19.208f, 17.095f, 18.4f, 17.7f)
                curveTo(15.4f, 20.2f, 11f, 22f, 7f, 22f)
                curveTo(6.443f, 21.999f, 5.898f, 21.844f, 5.424f, 21.55f)
                curveTo(4.951f, 21.257f, 4.569f, 20.838f, 4.32f, 20.34f)
                lineTo(2.4f, 16.5f)
            }
        }.build()

        return _Beef!!
    }

@Suppress("ObjectPropertyName")
private var _Beef: ImageVector? = null
