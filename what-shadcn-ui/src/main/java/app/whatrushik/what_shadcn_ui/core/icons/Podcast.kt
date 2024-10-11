package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Podcast: ImageVector
    get() {
        if (_Podcast != null) {
            return _Podcast!!
        }
        _Podcast = ImageVector.Builder(
            name = "Podcast",
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
                moveTo(12f, 12f)
                curveTo(12.552f, 12f, 13f, 11.552f, 13f, 11f)
                curveTo(13f, 10.448f, 12.552f, 10f, 12f, 10f)
                curveTo(11.448f, 10f, 11f, 10.448f, 11f, 11f)
                curveTo(11f, 11.552f, 11.448f, 12f, 12f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 17f)
                curveTo(11f, 16.735f, 11.105f, 16.48f, 11.293f, 16.293f)
                curveTo(11.48f, 16.105f, 11.735f, 16f, 12f, 16f)
                curveTo(12.265f, 16f, 12.52f, 16.105f, 12.707f, 16.293f)
                curveTo(12.895f, 16.48f, 13f, 16.735f, 13f, 17f)
                curveTo(13f, 17.5f, 12.66f, 20f, 12.5f, 21.5f)
                curveTo(12.5f, 21.633f, 12.447f, 21.76f, 12.354f, 21.854f)
                curveTo(12.26f, 21.947f, 12.133f, 22f, 12f, 22f)
                curveTo(11.867f, 22f, 11.74f, 21.947f, 11.646f, 21.854f)
                curveTo(11.553f, 21.76f, 11.5f, 21.633f, 11.5f, 21.5f)
                curveTo(11.34f, 20f, 11f, 17.5f, 11f, 17f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 14f)
                curveTo(7.443f, 13.257f, 7.104f, 12.374f, 7.02f, 11.449f)
                curveTo(6.937f, 10.524f, 7.113f, 9.594f, 7.528f, 8.764f)
                curveTo(7.943f, 7.933f, 8.581f, 7.235f, 9.371f, 6.747f)
                curveTo(10.161f, 6.259f, 11.071f, 6f, 12f, 6f)
                curveTo(12.929f, 6f, 13.839f, 6.259f, 14.629f, 6.747f)
                curveTo(15.418f, 7.235f, 16.057f, 7.933f, 16.472f, 8.764f)
                curveTo(16.887f, 9.594f, 17.063f, 10.524f, 16.98f, 11.449f)
                curveTo(16.896f, 12.374f, 16.557f, 13.257f, 16f, 14f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 18.5f)
                curveTo(18.605f, 17.427f, 19.823f, 15.867f, 20.474f, 14.049f)
                curveTo(21.124f, 12.231f, 21.173f, 10.252f, 20.612f, 8.404f)
                curveTo(20.052f, 6.556f, 18.912f, 4.938f, 17.361f, 3.788f)
                curveTo(15.811f, 2.638f, 13.931f, 2.017f, 12f, 2.017f)
                curveTo(10.069f, 2.017f, 8.19f, 2.638f, 6.639f, 3.788f)
                curveTo(5.088f, 4.938f, 3.948f, 6.556f, 3.388f, 8.404f)
                curveTo(2.827f, 10.252f, 2.876f, 12.231f, 3.526f, 14.049f)
                curveTo(4.177f, 15.867f, 5.395f, 17.427f, 7f, 18.5f)
            }
        }.build()

        return _Podcast!!
    }

@Suppress("ObjectPropertyName")
private var _Podcast: ImageVector? = null
