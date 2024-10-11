package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.BluetoothSearching: ImageVector
    get() {
        if (_BluetoothSearching != null) {
            return _BluetoothSearching!!
        }
        _BluetoothSearching = ImageVector.Builder(
            name = "BluetoothSearching",
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
                moveTo(7f, 7f)
                lineTo(17f, 17f)
                lineTo(12f, 22f)
                verticalLineTo(2f)
                lineTo(17f, 7f)
                lineTo(7f, 17f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.83f, 14.83f)
                curveTo(21.202f, 14.458f, 21.497f, 14.017f, 21.698f, 13.532f)
                curveTo(21.899f, 13.046f, 22.003f, 12.526f, 22.003f, 12f)
                curveTo(22.003f, 11.474f, 21.899f, 10.954f, 21.698f, 10.468f)
                curveTo(21.497f, 9.983f, 21.202f, 9.541f, 20.83f, 9.17f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 12f)
                horizontalLineTo(18.01f)
            }
        }.build()

        return _BluetoothSearching!!
    }

@Suppress("ObjectPropertyName")
private var _BluetoothSearching: ImageVector? = null
