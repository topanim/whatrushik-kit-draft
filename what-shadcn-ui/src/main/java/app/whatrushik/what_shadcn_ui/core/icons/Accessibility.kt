package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Accessibility: ImageVector
    get() {
        if (_Accessibility != null) {
            return _Accessibility!!
        }
        _Accessibility = ImageVector.Builder(
            name = "Accessibility",
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
                moveTo(16f, 5f)
                curveTo(16.552f, 5f, 17f, 4.552f, 17f, 4f)
                curveTo(17f, 3.448f, 16.552f, 3f, 16f, 3f)
                curveTo(15.448f, 3f, 15f, 3.448f, 15f, 4f)
                curveTo(15f, 4.552f, 15.448f, 5f, 16f, 5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 19f)
                lineTo(19f, 12f)
                lineTo(13.13f, 12.94f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 8f)
                lineTo(8f, 5f)
                lineTo(13.5f, 8f)
                lineTo(11.29f, 11.1f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.24f, 14.48f)
                curveTo(4.05f, 15.06f, 3.97f, 15.68f, 4.01f, 16.32f)
                curveTo(4.052f, 16.975f, 4.223f, 17.616f, 4.512f, 18.205f)
                curveTo(4.802f, 18.795f, 5.205f, 19.321f, 5.698f, 19.755f)
                curveTo(6.191f, 20.188f, 6.765f, 20.521f, 7.386f, 20.733f)
                curveTo(8.008f, 20.945f, 8.665f, 21.032f, 9.32f, 20.99f)
                curveTo(9.97f, 20.95f, 10.57f, 20.79f, 11.12f, 20.53f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.76f, 17.52f)
                curveTo(13.95f, 16.94f, 14.03f, 16.32f, 13.99f, 15.68f)
                curveTo(13.948f, 15.025f, 13.777f, 14.384f, 13.488f, 13.795f)
                curveTo(13.198f, 13.205f, 12.795f, 12.679f, 12.302f, 12.245f)
                curveTo(11.809f, 11.811f, 11.236f, 11.479f, 10.614f, 11.267f)
                curveTo(9.992f, 11.055f, 9.335f, 10.968f, 8.68f, 11.01f)
                curveTo(8.03f, 11.05f, 7.43f, 11.21f, 6.88f, 11.47f)
            }
        }.build()

        return _Accessibility!!
    }

@Suppress("ObjectPropertyName")
private var _Accessibility: ImageVector? = null
