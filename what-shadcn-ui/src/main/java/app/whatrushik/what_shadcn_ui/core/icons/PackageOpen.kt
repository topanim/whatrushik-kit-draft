package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.PackageOpen: ImageVector
    get() {
        if (_PackageOpen != null) {
            return _PackageOpen!!
        }
        _PackageOpen = ImageVector.Builder(
            name = "PackageOpen",
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
                moveTo(20.91f, 8.84f)
                lineTo(8.56f, 2.23f)
                curveTo(8.281f, 2.082f, 7.971f, 2.005f, 7.655f, 2.005f)
                curveTo(7.339f, 2.005f, 7.029f, 2.082f, 6.75f, 2.23f)
                lineTo(3.1f, 4.13f)
                curveTo(2.771f, 4.31f, 2.496f, 4.575f, 2.302f, 4.896f)
                curveTo(2.109f, 5.218f, 2.004f, 5.585f, 1.999f, 5.96f)
                curveTo(1.994f, 6.336f, 2.089f, 6.706f, 2.273f, 7.032f)
                curveTo(2.458f, 7.359f, 2.726f, 7.631f, 3.05f, 7.82f)
                lineTo(15.27f, 14.75f)
                curveTo(15.567f, 14.915f, 15.901f, 15.001f, 16.24f, 15.001f)
                curveTo(16.579f, 15.001f, 16.913f, 14.915f, 17.21f, 14.75f)
                lineTo(21f, 12.51f)
                curveTo(21.317f, 12.316f, 21.578f, 12.042f, 21.756f, 11.715f)
                curveTo(21.934f, 11.389f, 22.023f, 11.021f, 22.014f, 10.649f)
                curveTo(22.005f, 10.277f, 21.898f, 9.914f, 21.704f, 9.597f)
                curveTo(21.51f, 9.279f, 21.236f, 9.018f, 20.91f, 8.84f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.09f, 8.84f)
                lineTo(15.44f, 2.23f)
                curveTo(15.719f, 2.082f, 16.029f, 2.005f, 16.345f, 2.005f)
                curveTo(16.66f, 2.005f, 16.971f, 2.082f, 17.25f, 2.23f)
                lineTo(20.9f, 4.13f)
                curveTo(21.232f, 4.306f, 21.511f, 4.567f, 21.709f, 4.886f)
                curveTo(21.907f, 5.205f, 22.016f, 5.57f, 22.027f, 5.946f)
                curveTo(22.037f, 6.321f, 21.947f, 6.692f, 21.767f, 7.022f)
                curveTo(21.586f, 7.351f, 21.322f, 7.626f, 21f, 7.82f)
                lineTo(8.73f, 14.75f)
                curveTo(8.433f, 14.915f, 8.099f, 15.001f, 7.76f, 15.001f)
                curveTo(7.421f, 15.001f, 7.087f, 14.915f, 6.79f, 14.75f)
                lineTo(3f, 12.51f)
                curveTo(2.683f, 12.316f, 2.422f, 12.042f, 2.244f, 11.715f)
                curveTo(2.066f, 11.389f, 1.977f, 11.021f, 1.986f, 10.649f)
                curveTo(1.995f, 10.277f, 2.102f, 9.914f, 2.296f, 9.597f)
                curveTo(2.489f, 9.279f, 2.763f, 9.018f, 3.09f, 8.84f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 22f)
                verticalLineTo(13f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 13.5f)
                verticalLineTo(16.87f)
                curveTo(20f, 17.247f, 19.897f, 17.618f, 19.701f, 17.941f)
                curveTo(19.506f, 18.263f, 19.225f, 18.526f, 18.89f, 18.7f)
                lineTo(12.89f, 21.78f)
                curveTo(12.615f, 21.923f, 12.31f, 21.997f, 12f, 21.997f)
                curveTo(11.69f, 21.997f, 11.385f, 21.923f, 11.11f, 21.78f)
                lineTo(5.11f, 18.7f)
                curveTo(4.775f, 18.526f, 4.494f, 18.263f, 4.299f, 17.941f)
                curveTo(4.103f, 17.618f, 4f, 17.247f, 4f, 16.87f)
                verticalLineTo(13.5f)
            }
        }.build()

        return _PackageOpen!!
    }

@Suppress("ObjectPropertyName")
private var _PackageOpen: ImageVector? = null
