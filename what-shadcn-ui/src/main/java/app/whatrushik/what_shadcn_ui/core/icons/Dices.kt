package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Dices: ImageVector
    get() {
        if (_Dices != null) {
            return _Dices!!
        }
        _Dices = ImageVector.Builder(
            name = "Dices",
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
                moveTo(12f, 10f)
                horizontalLineTo(4f)
                curveTo(2.895f, 10f, 2f, 10.895f, 2f, 12f)
                verticalLineTo(20f)
                curveTo(2f, 21.105f, 2.895f, 22f, 4f, 22f)
                horizontalLineTo(12f)
                curveTo(13.105f, 22f, 14f, 21.105f, 14f, 20f)
                verticalLineTo(12f)
                curveTo(14f, 10.895f, 13.105f, 10f, 12f, 10f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.92f, 14f)
                lineTo(21.42f, 10.5f)
                curveTo(21.791f, 10.089f, 21.996f, 9.554f, 21.996f, 9f)
                curveTo(21.996f, 8.446f, 21.791f, 7.912f, 21.42f, 7.5f)
                lineTo(16.42f, 2.58f)
                curveTo(16.008f, 2.209f, 15.474f, 2.004f, 14.92f, 2.004f)
                curveTo(14.366f, 2.004f, 13.832f, 2.209f, 13.42f, 2.58f)
                lineTo(10f, 6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 18f)
                horizontalLineTo(6.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 14f)
                horizontalLineTo(10.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 6f)
                horizontalLineTo(15.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 9f)
                horizontalLineTo(18.01f)
            }
        }.build()

        return _Dices!!
    }

@Suppress("ObjectPropertyName")
private var _Dices: ImageVector? = null
