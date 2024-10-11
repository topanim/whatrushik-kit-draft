package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Puzzle: ImageVector
    get() {
        if (_Puzzle != null) {
            return _Puzzle!!
        }
        _Puzzle = ImageVector.Builder(
            name = "Puzzle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(19.439f, 7.85f)
                    curveTo(19.39f, 8.172f, 19.498f, 8.498f, 19.728f, 8.728f)
                    lineTo(21.296f, 10.296f)
                    curveTo(21.766f, 10.766f, 22.002f, 11.383f, 22.002f, 12f)
                    curveTo(22.002f, 12.617f, 21.767f, 13.233f, 21.296f, 13.704f)
                    lineTo(19.685f, 15.315f)
                    curveTo(19.577f, 15.423f, 19.445f, 15.505f, 19.299f, 15.552f)
                    curveTo(19.154f, 15.6f, 18.999f, 15.614f, 18.848f, 15.591f)
                    curveTo(18.378f, 15.521f, 18.046f, 15.111f, 17.88f, 14.666f)
                    curveTo(17.734f, 14.273f, 17.492f, 13.923f, 17.176f, 13.647f)
                    curveTo(16.859f, 13.372f, 16.479f, 13.181f, 16.069f, 13.092f)
                    curveTo(15.66f, 13.002f, 15.234f, 13.017f, 14.832f, 13.135f)
                    curveTo(14.429f, 13.253f, 14.063f, 13.47f, 13.766f, 13.766f)
                    curveTo(13.47f, 14.063f, 13.253f, 14.429f, 13.135f, 14.832f)
                    curveTo(13.017f, 15.234f, 13.002f, 15.66f, 13.092f, 16.069f)
                    curveTo(13.181f, 16.479f, 13.372f, 16.859f, 13.647f, 17.176f)
                    curveTo(13.923f, 17.492f, 14.273f, 17.734f, 14.666f, 17.88f)
                    curveTo(15.112f, 18.046f, 15.521f, 18.377f, 15.591f, 18.848f)
                    curveTo(15.614f, 18.999f, 15.601f, 19.154f, 15.553f, 19.299f)
                    curveTo(15.505f, 19.445f, 15.423f, 19.577f, 15.315f, 19.685f)
                    lineTo(13.705f, 21.295f)
                    curveTo(13.481f, 21.519f, 13.216f, 21.697f, 12.923f, 21.819f)
                    curveTo(12.63f, 21.94f, 12.317f, 22.002f, 12f, 22.002f)
                    curveTo(11.684f, 22.003f, 11.37f, 21.94f, 11.078f, 21.819f)
                    curveTo(10.785f, 21.698f, 10.519f, 21.52f, 10.296f, 21.296f)
                    lineTo(8.728f, 19.728f)
                    curveTo(8.615f, 19.615f, 8.476f, 19.529f, 8.324f, 19.479f)
                    curveTo(8.172f, 19.428f, 8.01f, 19.414f, 7.851f, 19.438f)
                    curveTo(7.358f, 19.512f, 7.011f, 19.942f, 6.831f, 20.406f)
                    curveTo(6.68f, 20.793f, 6.435f, 21.137f, 6.118f, 21.406f)
                    curveTo(5.801f, 21.674f, 5.422f, 21.86f, 5.015f, 21.945f)
                    curveTo(4.609f, 22.031f, 4.187f, 22.013f, 3.789f, 21.895f)
                    curveTo(3.39f, 21.776f, 3.028f, 21.56f, 2.734f, 21.266f)
                    curveTo(2.44f, 20.972f, 2.224f, 20.61f, 2.105f, 20.212f)
                    curveTo(1.987f, 19.813f, 1.97f, 19.392f, 2.055f, 18.985f)
                    curveTo(2.14f, 18.578f, 2.326f, 18.199f, 2.595f, 17.882f)
                    curveTo(2.863f, 17.565f, 3.207f, 17.32f, 3.594f, 17.169f)
                    curveTo(4.058f, 16.989f, 4.488f, 16.642f, 4.561f, 16.149f)
                    curveTo(4.585f, 15.991f, 4.571f, 15.828f, 4.521f, 15.676f)
                    curveTo(4.471f, 15.524f, 4.385f, 15.385f, 4.272f, 15.272f)
                    lineTo(2.704f, 13.704f)
                    curveTo(2.48f, 13.481f, 2.302f, 13.215f, 2.181f, 12.922f)
                    curveTo(2.06f, 12.63f, 1.998f, 12.317f, 1.998f, 12f)
                    curveTo(1.998f, 11.383f, 2.234f, 10.766f, 2.704f, 10.296f)
                    lineTo(4.23f, 8.77f)
                    curveTo(4.47f, 8.53f, 4.811f, 8.417f, 5.147f, 8.467f)
                    curveTo(5.662f, 8.544f, 6.024f, 8.995f, 6.22f, 9.477f)
                    curveTo(6.376f, 9.859f, 6.623f, 10.196f, 6.941f, 10.459f)
                    curveTo(7.259f, 10.722f, 7.636f, 10.902f, 8.041f, 10.983f)
                    curveTo(8.445f, 11.065f, 8.863f, 11.045f, 9.257f, 10.926f)
                    curveTo(9.652f, 10.807f, 10.011f, 10.592f, 10.303f, 10.301f)
                    curveTo(10.594f, 10.009f, 10.809f, 9.65f, 10.928f, 9.255f)
                    curveTo(11.047f, 8.861f, 11.067f, 8.443f, 10.986f, 8.039f)
                    curveTo(10.904f, 7.634f, 10.724f, 7.257f, 10.461f, 6.939f)
                    curveTo(10.198f, 6.621f, 9.861f, 6.374f, 9.479f, 6.218f)
                    curveTo(8.997f, 6.022f, 8.546f, 5.66f, 8.469f, 5.145f)
                    curveTo(8.419f, 4.809f, 8.531f, 4.469f, 8.772f, 4.228f)
                    lineTo(10.297f, 2.703f)
                    curveTo(10.521f, 2.479f, 10.786f, 2.302f, 11.078f, 2.181f)
                    curveTo(11.37f, 2.06f, 11.684f, 1.998f, 12f, 1.998f)
                    curveTo(12.617f, 1.998f, 13.234f, 2.234f, 13.704f, 2.704f)
                    lineTo(15.272f, 4.272f)
                    curveTo(15.502f, 4.502f, 15.828f, 4.61f, 16.149f, 4.562f)
                    curveTo(16.642f, 4.488f, 16.989f, 4.058f, 17.169f, 3.594f)
                    curveTo(17.32f, 3.207f, 17.565f, 2.863f, 17.882f, 2.595f)
                    curveTo(18.199f, 2.326f, 18.578f, 2.14f, 18.985f, 2.055f)
                    curveTo(19.392f, 1.97f, 19.813f, 1.987f, 20.212f, 2.105f)
                    curveTo(20.61f, 2.224f, 20.972f, 2.44f, 21.266f, 2.734f)
                    curveTo(21.56f, 3.028f, 21.776f, 3.39f, 21.895f, 3.789f)
                    curveTo(22.013f, 4.187f, 22.031f, 4.609f, 21.945f, 5.015f)
                    curveTo(21.86f, 5.422f, 21.674f, 5.801f, 21.406f, 6.118f)
                    curveTo(21.137f, 6.435f, 20.793f, 6.68f, 20.406f, 6.831f)
                    curveTo(19.942f, 7.011f, 19.512f, 7.357f, 19.439f, 7.85f)
                    close()
                }
            }
        }.build()

        return _Puzzle!!
    }

@Suppress("ObjectPropertyName")
private var _Puzzle: ImageVector? = null
