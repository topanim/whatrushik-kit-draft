package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Shovel: ImageVector
    get() {
        if (_Shovel != null) {
            return _Shovel!!
        }
        _Shovel = ImageVector.Builder(
            name = "Shovel",
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
                verticalLineTo(17f)
                lineTo(7f, 12f)
                lineTo(12f, 17f)
                lineTo(7f, 22f)
                horizontalLineTo(2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.5f, 14.5f)
                lineTo(16f, 8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 2f)
                lineTo(22f, 7f)
                lineTo(21.5f, 7.5f)
                curveTo(21.172f, 7.829f, 20.782f, 8.09f, 20.353f, 8.268f)
                curveTo(19.924f, 8.446f, 19.465f, 8.538f, 19f, 8.538f)
                curveTo(18.535f, 8.538f, 18.076f, 8.446f, 17.647f, 8.268f)
                curveTo(17.218f, 8.09f, 16.828f, 7.829f, 16.5f, 7.5f)
                curveTo(16.171f, 7.172f, 15.91f, 6.782f, 15.732f, 6.353f)
                curveTo(15.554f, 5.924f, 15.462f, 5.464f, 15.462f, 5f)
                curveTo(15.462f, 4.536f, 15.554f, 4.076f, 15.732f, 3.647f)
                curveTo(15.91f, 3.218f, 16.171f, 2.828f, 16.5f, 2.5f)
                lineTo(17f, 2f)
                close()
            }
        }.build()

        return _Shovel!!
    }

@Suppress("ObjectPropertyName")
private var _Shovel: ImageVector? = null
