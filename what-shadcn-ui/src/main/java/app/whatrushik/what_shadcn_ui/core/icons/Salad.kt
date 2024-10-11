package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Salad: ImageVector
    get() {
        if (_Salad != null) {
            return _Salad!!
        }
        _Salad = ImageVector.Builder(
            name = "Salad",
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
                moveTo(7f, 21f)
                horizontalLineTo(17f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 21f)
                curveTo(14.387f, 21f, 16.676f, 20.052f, 18.364f, 18.364f)
                curveTo(20.052f, 16.676f, 21f, 14.387f, 21f, 12f)
                horizontalLineTo(3f)
                curveTo(3f, 14.387f, 3.948f, 16.676f, 5.636f, 18.364f)
                curveTo(7.324f, 20.052f, 9.613f, 21f, 12f, 21f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.38f, 12f)
                curveTo(10.774f, 12.006f, 10.189f, 11.782f, 9.741f, 11.374f)
                curveTo(9.294f, 10.966f, 9.017f, 10.404f, 8.966f, 9.801f)
                curveTo(8.915f, 9.197f, 9.095f, 8.597f, 9.468f, 8.12f)
                curveTo(9.842f, 7.643f, 10.382f, 7.325f, 10.98f, 7.23f)
                curveTo(10.884f, 6.806f, 10.905f, 6.364f, 11.041f, 5.952f)
                curveTo(11.177f, 5.539f, 11.422f, 5.171f, 11.75f, 4.886f)
                curveTo(12.079f, 4.602f, 12.478f, 4.412f, 12.906f, 4.337f)
                curveTo(13.334f, 4.262f, 13.774f, 4.304f, 14.18f, 4.46f)
                curveTo(14.358f, 4.18f, 14.591f, 3.941f, 14.866f, 3.756f)
                curveTo(15.141f, 3.571f, 15.451f, 3.445f, 15.777f, 3.385f)
                curveTo(16.103f, 3.326f, 16.438f, 3.335f, 16.76f, 3.412f)
                curveTo(17.082f, 3.488f, 17.385f, 3.631f, 17.65f, 3.83f)
                curveTo(18.112f, 3.467f, 18.69f, 3.286f, 19.276f, 3.321f)
                curveTo(19.862f, 3.356f, 20.415f, 3.605f, 20.83f, 4.02f)
                curveTo(21.245f, 4.435f, 21.494f, 4.988f, 21.529f, 5.574f)
                curveTo(21.564f, 6.16f, 21.383f, 6.738f, 21.02f, 7.2f)
                curveTo(21.246f, 7.5f, 21.398f, 7.849f, 21.465f, 8.218f)
                curveTo(21.531f, 8.588f, 21.51f, 8.968f, 21.403f, 9.327f)
                curveTo(21.296f, 9.687f, 21.106f, 10.017f, 20.849f, 10.29f)
                curveTo(20.591f, 10.563f, 20.273f, 10.772f, 19.92f, 10.9f)
                curveTo(20.011f, 11.26f, 20.021f, 11.636f, 19.95f, 12f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 12f)
                lineTo(17f, 8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.9f, 7.25f)
                curveTo(10.351f, 6.665f, 9.64f, 6.259f, 8.857f, 6.085f)
                curveTo(8.074f, 5.911f, 7.258f, 5.976f, 6.513f, 6.273f)
                curveTo(5.768f, 6.57f, 5.13f, 7.084f, 4.682f, 7.749f)
                curveTo(4.234f, 8.414f, 3.996f, 9.198f, 4f, 10f)
                curveTo(4f, 10.73f, 4.2f, 11.41f, 4.54f, 12f)
            }
        }.build()

        return _Salad!!
    }

@Suppress("ObjectPropertyName")
private var _Salad: ImageVector? = null
