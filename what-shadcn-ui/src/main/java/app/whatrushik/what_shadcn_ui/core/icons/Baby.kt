package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Baby: ImageVector
    get() {
        if (_Baby != null) {
            return _Baby!!
        }
        _Baby = ImageVector.Builder(
            name = "Baby",
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
                moveTo(9f, 12f)
                horizontalLineTo(9.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 12f)
                horizontalLineTo(15.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 16f)
                curveTo(10.5f, 16.3f, 11.2f, 16.5f, 12f, 16.5f)
                curveTo(12.8f, 16.5f, 13.5f, 16.3f, 14f, 16f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 6.3f)
                curveTo(19.906f, 7.436f, 20.524f, 8.774f, 20.8f, 10.2f)
                curveTo(21.138f, 10.364f, 21.423f, 10.62f, 21.623f, 10.938f)
                curveTo(21.822f, 11.256f, 21.928f, 11.624f, 21.928f, 12f)
                curveTo(21.928f, 12.376f, 21.822f, 12.744f, 21.623f, 13.062f)
                curveTo(21.423f, 13.38f, 21.138f, 13.636f, 20.8f, 13.8f)
                curveTo(20.368f, 15.814f, 19.259f, 17.618f, 17.658f, 18.913f)
                curveTo(16.056f, 20.207f, 14.059f, 20.913f, 12f, 20.913f)
                curveTo(9.941f, 20.913f, 7.944f, 20.207f, 6.342f, 18.913f)
                curveTo(4.741f, 17.618f, 3.632f, 15.814f, 3.2f, 13.8f)
                curveTo(2.862f, 13.636f, 2.577f, 13.38f, 2.377f, 13.062f)
                curveTo(2.178f, 12.744f, 2.072f, 12.376f, 2.072f, 12f)
                curveTo(2.072f, 11.624f, 2.178f, 11.256f, 2.377f, 10.938f)
                curveTo(2.577f, 10.62f, 2.862f, 10.364f, 3.2f, 10.2f)
                curveTo(3.614f, 8.17f, 4.716f, 6.346f, 6.319f, 5.034f)
                curveTo(7.922f, 3.723f, 9.929f, 3.004f, 12f, 3f)
                curveTo(14f, 3f, 15.5f, 4.1f, 15.5f, 5.5f)
                curveTo(15.5f, 6.9f, 14.6f, 8f, 13.5f, 8f)
                curveTo(12.7f, 8f, 12f, 7.6f, 12f, 7f)
            }
        }.build()

        return _Baby!!
    }

@Suppress("ObjectPropertyName")
private var _Baby: ImageVector? = null
