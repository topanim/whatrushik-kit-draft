package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Wallet: ImageVector
    get() {
        if (_Wallet != null) {
            return _Wallet!!
        }
        _Wallet = ImageVector.Builder(
            name = "Wallet",
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
                moveTo(20f, 12f)
                verticalLineTo(8f)
                horizontalLineTo(6f)
                curveTo(5.47f, 8f, 4.961f, 7.789f, 4.586f, 7.414f)
                curveTo(4.211f, 7.039f, 4f, 6.53f, 4f, 6f)
                curveTo(4f, 4.9f, 4.9f, 4f, 6f, 4f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 6f)
                verticalLineTo(18f)
                curveTo(4f, 19.1f, 4.9f, 20f, 6f, 20f)
                horizontalLineTo(20f)
                verticalLineTo(16f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 12f)
                curveTo(17.47f, 12f, 16.961f, 12.211f, 16.586f, 12.586f)
                curveTo(16.211f, 12.961f, 16f, 13.47f, 16f, 14f)
                curveTo(16f, 15.1f, 16.9f, 16f, 18f, 16f)
                horizontalLineTo(22f)
                verticalLineTo(12f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _Wallet!!
    }

@Suppress("ObjectPropertyName")
private var _Wallet: ImageVector? = null
