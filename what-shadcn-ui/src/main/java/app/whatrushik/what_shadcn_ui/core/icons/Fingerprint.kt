package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Fingerprint: ImageVector
    get() {
        if (_Fingerprint != null) {
            return _Fingerprint!!
        }
        _Fingerprint = ImageVector.Builder(
            name = "Fingerprint",
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
                moveTo(2f, 12f)
                curveTo(2f, 6.5f, 6.5f, 2f, 12f, 2f)
                curveTo(13.552f, 2f, 15.084f, 2.361f, 16.472f, 3.056f)
                curveTo(17.861f, 3.75f, 19.069f, 4.758f, 20f, 6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 19.5f)
                curveTo(5.5f, 18f, 6f, 15f, 6f, 12f)
                curveTo(6f, 11.3f, 6.12f, 10.63f, 6.34f, 10f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.29f, 21.02f)
                curveTo(17.41f, 20.42f, 17.72f, 18.72f, 17.79f, 18f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 10f)
                curveTo(11.47f, 10f, 10.961f, 10.211f, 10.586f, 10.586f)
                curveTo(10.211f, 10.961f, 10f, 11.47f, 10f, 12f)
                curveTo(10f, 13.02f, 9.9f, 14.51f, 9.74f, 16f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.65f, 22f)
                curveTo(8.86f, 21.34f, 9.1f, 20.68f, 9.22f, 20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 13.12f)
                curveTo(14f, 15.5f, 14f, 19.5f, 13f, 22f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 16f)
                horizontalLineTo(2.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.8f, 16f)
                curveTo(22f, 14f, 21.931f, 10.646f, 21.8f, 10f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 6.8f)
                curveTo(9.912f, 6.273f, 10.947f, 5.996f, 12.001f, 5.996f)
                curveTo(13.054f, 5.996f, 14.089f, 6.274f, 15.002f, 6.801f)
                curveTo(15.914f, 7.328f, 16.671f, 8.086f, 17.198f, 8.999f)
                curveTo(17.724f, 9.911f, 18.001f, 10.946f, 18f, 12f)
                curveTo(18f, 12.47f, 18f, 13.17f, 17.98f, 14f)
            }
        }.build()

        return _Fingerprint!!
    }

@Suppress("ObjectPropertyName")
private var _Fingerprint: ImageVector? = null
