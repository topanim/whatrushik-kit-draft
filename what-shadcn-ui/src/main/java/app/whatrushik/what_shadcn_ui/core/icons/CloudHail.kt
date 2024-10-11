package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.CloudHail: ImageVector
    get() {
        if (_CloudHail != null) {
            return _CloudHail!!
        }
        _CloudHail = ImageVector.Builder(
            name = "CloudHail",
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
                moveTo(4f, 14.899f)
                curveTo(3.257f, 14.14f, 2.697f, 13.222f, 2.361f, 12.214f)
                curveTo(2.025f, 11.206f, 1.924f, 10.135f, 2.063f, 9.082f)
                curveTo(2.203f, 8.029f, 2.58f, 7.022f, 3.167f, 6.137f)
                curveTo(3.754f, 5.251f, 4.534f, 4.511f, 5.449f, 3.972f)
                curveTo(6.364f, 3.432f, 7.39f, 3.109f, 8.449f, 3.025f)
                curveTo(9.508f, 2.941f, 10.572f, 3.099f, 11.561f, 3.487f)
                curveTo(12.549f, 3.875f, 13.437f, 4.483f, 14.156f, 5.265f)
                curveTo(14.875f, 6.047f, 15.406f, 6.982f, 15.71f, 8f)
                horizontalLineTo(17.5f)
                curveTo(18.465f, 8f, 19.405f, 8.31f, 20.181f, 8.885f)
                curveTo(20.956f, 9.461f, 21.527f, 10.27f, 21.807f, 11.194f)
                curveTo(22.087f, 12.118f, 22.063f, 13.107f, 21.737f, 14.016f)
                curveTo(21.412f, 14.925f, 20.803f, 15.706f, 20f, 16.242f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 14f)
                verticalLineTo(16f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 14f)
                verticalLineTo(16f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 20f)
                horizontalLineTo(16.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 20f)
                horizontalLineTo(8.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 16f)
                verticalLineTo(18f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 22f)
                horizontalLineTo(12.01f)
            }
        }.build()

        return _CloudHail!!
    }

@Suppress("ObjectPropertyName")
private var _CloudHail: ImageVector? = null
