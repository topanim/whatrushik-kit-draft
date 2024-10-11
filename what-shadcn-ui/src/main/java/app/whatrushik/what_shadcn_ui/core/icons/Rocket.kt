package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Rocket: ImageVector
    get() {
        if (_Rocket != null) {
            return _Rocket!!
        }
        _Rocket = ImageVector.Builder(
            name = "Rocket",
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
                moveTo(4.5f, 16.5f)
                curveTo(3f, 17.76f, 2.5f, 21.5f, 2.5f, 21.5f)
                curveTo(2.5f, 21.5f, 6.24f, 21f, 7.5f, 19.5f)
                curveTo(8.21f, 18.66f, 8.2f, 17.37f, 7.41f, 16.59f)
                curveTo(7.021f, 16.219f, 6.509f, 16.005f, 5.972f, 15.988f)
                curveTo(5.435f, 15.972f, 4.911f, 16.154f, 4.5f, 16.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 15f)
                lineTo(9f, 12f)
                curveTo(9.532f, 10.619f, 10.202f, 9.296f, 11f, 8.05f)
                curveTo(12.165f, 6.187f, 13.788f, 4.653f, 15.713f, 3.594f)
                curveTo(17.638f, 2.535f, 19.803f, 1.986f, 22f, 2f)
                curveTo(22f, 4.72f, 21.22f, 9.5f, 16f, 13f)
                curveTo(14.737f, 13.799f, 13.397f, 14.469f, 12f, 15f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 12f)
                horizontalLineTo(4f)
                curveTo(4f, 12f, 4.55f, 8.97f, 6f, 8f)
                curveTo(7.62f, 6.92f, 11f, 8f, 11f, 8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 15f)
                verticalLineTo(20f)
                curveTo(12f, 20f, 15.03f, 19.45f, 16f, 18f)
                curveTo(17.08f, 16.38f, 16f, 13f, 16f, 13f)
            }
        }.build()

        return _Rocket!!
    }

@Suppress("ObjectPropertyName")
private var _Rocket: ImageVector? = null
