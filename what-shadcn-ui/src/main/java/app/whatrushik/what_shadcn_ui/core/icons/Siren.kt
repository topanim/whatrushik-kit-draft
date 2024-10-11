package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Siren: ImageVector
    get() {
        if (_Siren != null) {
            return _Siren!!
        }
        _Siren = ImageVector.Builder(
            name = "Siren",
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
                moveTo(7f, 12f)
                curveTo(7f, 10.674f, 7.527f, 9.402f, 8.464f, 8.464f)
                curveTo(9.402f, 7.527f, 10.674f, 7f, 12f, 7f)
                curveTo(13.326f, 7f, 14.598f, 7.527f, 15.535f, 8.464f)
                curveTo(16.473f, 9.402f, 17f, 10.674f, 17f, 12f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                verticalLineTo(12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 20f)
                curveTo(5f, 19.47f, 5.211f, 18.961f, 5.586f, 18.586f)
                curveTo(5.961f, 18.211f, 6.47f, 18f, 7f, 18f)
                horizontalLineTo(17f)
                curveTo(17.53f, 18f, 18.039f, 18.211f, 18.414f, 18.586f)
                curveTo(18.789f, 18.961f, 19f, 19.47f, 19f, 20f)
                verticalLineTo(22f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 12f)
                horizontalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.5f, 4.5f)
                lineTo(18f, 5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 12f)
                horizontalLineTo(3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 2f)
                verticalLineTo(3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.929f, 4.929f)
                lineTo(5.636f, 5.636f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                verticalLineTo(18f)
            }
        }.build()

        return _Siren!!
    }

@Suppress("ObjectPropertyName")
private var _Siren: ImageVector? = null
