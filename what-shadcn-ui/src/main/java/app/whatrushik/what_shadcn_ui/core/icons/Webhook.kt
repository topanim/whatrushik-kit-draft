package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Webhook: ImageVector
    get() {
        if (_Webhook != null) {
            return _Webhook!!
        }
        _Webhook = ImageVector.Builder(
            name = "Webhook",
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
                moveTo(18f, 16.98f)
                horizontalLineTo(12.01f)
                curveTo(10.91f, 16.98f, 10.06f, 17.92f, 9.53f, 18.88f)
                curveTo(9.11f, 19.667f, 8.44f, 20.292f, 7.625f, 20.654f)
                curveTo(6.809f, 21.016f, 5.897f, 21.096f, 5.031f, 20.88f)
                curveTo(4.166f, 20.663f, 3.397f, 20.164f, 2.848f, 19.461f)
                curveTo(2.299f, 18.758f, 2f, 17.892f, 2f, 17f)
                curveTo(2.01f, 16.3f, 2.2f, 15.6f, 2.57f, 15f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 17f)
                lineTo(9.13f, 11.22f)
                curveTo(9.66f, 10.25f, 9.23f, 9.04f, 8.63f, 8.12f)
                curveTo(8.347f, 7.667f, 8.157f, 7.162f, 8.072f, 6.635f)
                curveTo(7.988f, 6.107f, 8.009f, 5.568f, 8.136f, 5.049f)
                curveTo(8.263f, 4.531f, 8.492f, 4.042f, 8.811f, 3.614f)
                curveTo(9.129f, 3.185f, 9.531f, 2.824f, 9.991f, 2.553f)
                curveTo(10.451f, 2.282f, 10.961f, 2.106f, 11.49f, 2.035f)
                curveTo(12.02f, 1.964f, 12.558f, 2f, 13.073f, 2.14f)
                curveTo(13.589f, 2.28f, 14.071f, 2.523f, 14.491f, 2.852f)
                curveTo(14.911f, 3.182f, 15.261f, 3.593f, 15.52f, 4.06f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 6f)
                lineTo(15.13f, 11.73f)
                curveTo(15.66f, 12.7f, 16.9f, 13f, 18f, 13f)
                curveTo(19.061f, 13f, 20.078f, 13.421f, 20.828f, 14.172f)
                curveTo(21.579f, 14.922f, 22f, 15.939f, 22f, 17f)
                curveTo(22f, 18.061f, 21.579f, 19.078f, 20.828f, 19.828f)
                curveTo(20.078f, 20.579f, 19.061f, 21f, 18f, 21f)
            }
        }.build()

        return _Webhook!!
    }

@Suppress("ObjectPropertyName")
private var _Webhook: ImageVector? = null
