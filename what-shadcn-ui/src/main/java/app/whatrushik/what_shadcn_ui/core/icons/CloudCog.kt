package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.CloudCog: ImageVector
    get() {
        if (_CloudCog != null) {
            return _CloudCog!!
        }
        _CloudCog = ImageVector.Builder(
            name = "CloudCog",
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
                moveTo(20f, 16.2f)
                curveTo(20.784f, 15.657f, 21.376f, 14.879f, 21.69f, 13.978f)
                curveTo(22.003f, 13.077f, 22.022f, 12.1f, 21.744f, 11.187f)
                curveTo(21.465f, 10.275f, 20.904f, 9.474f, 20.142f, 8.901f)
                curveTo(19.379f, 8.329f, 18.454f, 8.013f, 17.5f, 8f)
                horizontalLineTo(15.7f)
                curveTo(15.398f, 6.98f, 14.867f, 6.043f, 14.148f, 5.259f)
                curveTo(13.429f, 4.475f, 12.542f, 3.865f, 11.552f, 3.476f)
                curveTo(10.562f, 3.086f, 9.497f, 2.927f, 8.436f, 3.011f)
                curveTo(7.376f, 3.095f, 6.349f, 3.42f, 5.433f, 3.96f)
                curveTo(4.517f, 4.5f, 3.736f, 5.242f, 3.149f, 6.129f)
                curveTo(2.563f, 7.017f, 2.186f, 8.026f, 2.048f, 9.081f)
                curveTo(1.91f, 10.135f, 2.014f, 11.207f, 2.352f, 12.216f)
                curveTo(2.69f, 13.224f, 3.254f, 14.142f, 4f, 14.9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 20f)
                curveTo(13.657f, 20f, 15f, 18.657f, 15f, 17f)
                curveTo(15f, 15.343f, 13.657f, 14f, 12f, 14f)
                curveTo(10.343f, 14f, 9f, 15.343f, 9f, 17f)
                curveTo(9f, 18.657f, 10.343f, 20f, 12f, 20f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 13f)
                verticalLineTo(14f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 20f)
                verticalLineTo(21f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 17f)
                horizontalLineTo(15f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 17f)
                horizontalLineTo(8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 14f)
                lineTo(14.12f, 14.88f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.88f, 19.12f)
                lineTo(9f, 20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 20f)
                lineTo(14.12f, 19.12f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.88f, 14.88f)
                lineTo(9f, 14f)
            }
        }.build()

        return _CloudCog!!
    }

@Suppress("ObjectPropertyName")
private var _CloudCog: ImageVector? = null
