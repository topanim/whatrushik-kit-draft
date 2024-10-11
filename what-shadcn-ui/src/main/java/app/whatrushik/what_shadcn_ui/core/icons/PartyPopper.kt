package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.PartyPopper: ImageVector
    get() {
        if (_PartyPopper != null) {
            return _PartyPopper!!
        }
        _PartyPopper = ImageVector.Builder(
            name = "PartyPopper",
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
                moveTo(5.8f, 11.3f)
                lineTo(2f, 22f)
                lineTo(12.7f, 18.21f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 3f)
                horizontalLineTo(4.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 8f)
                horizontalLineTo(22.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 2f)
                horizontalLineTo(15.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 20f)
                horizontalLineTo(22.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 2f)
                lineTo(19.76f, 2.75f)
                curveTo(19.122f, 2.962f, 18.578f, 3.39f, 18.221f, 3.959f)
                curveTo(17.863f, 4.528f, 17.715f, 5.203f, 17.8f, 5.87f)
                curveTo(17.9f, 6.73f, 17.23f, 7.5f, 16.35f, 7.5f)
                horizontalLineTo(15.97f)
                curveTo(15.11f, 7.5f, 14.37f, 8.1f, 14.21f, 8.94f)
                lineTo(14f, 10f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 13f)
                lineTo(21.18f, 12.67f)
                curveTo(20.32f, 12.33f, 19.36f, 12.87f, 19.2f, 13.78f)
                curveTo(19.09f, 14.48f, 18.48f, 15f, 17.77f, 15f)
                horizontalLineTo(17f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 2f)
                lineTo(11.33f, 2.82f)
                curveTo(11.67f, 3.68f, 11.13f, 4.64f, 10.22f, 4.8f)
                curveTo(9.52f, 4.9f, 9f, 5.52f, 9f, 6.23f)
                verticalLineTo(7f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 13f)
                curveTo(12.93f, 14.93f, 13.83f, 17.17f, 13f, 18f)
                curveTo(12.17f, 18.83f, 9.93f, 17.93f, 8f, 16f)
                curveTo(6.07f, 14.07f, 5.17f, 11.83f, 6f, 11f)
                curveTo(6.83f, 10.17f, 9.07f, 11.07f, 11f, 13f)
                close()
            }
        }.build()

        return _PartyPopper!!
    }

@Suppress("ObjectPropertyName")
private var _PartyPopper: ImageVector? = null
