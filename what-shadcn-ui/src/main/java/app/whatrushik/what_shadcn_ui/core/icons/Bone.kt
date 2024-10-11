package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Bone: ImageVector
    get() {
        if (_Bone != null) {
            return _Bone!!
        }
        _Bone = ImageVector.Builder(
            name = "Bone",
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
                moveTo(18.6f, 9.82f)
                curveTo(18.08f, 9.61f, 17.45f, 9.57f, 17.06f, 9.97f)
                lineTo(9.99f, 17.03f)
                curveTo(9.6f, 17.42f, 9.63f, 18.06f, 9.84f, 18.57f)
                curveTo(9.96f, 18.87f, 10f, 19.17f, 10f, 19.5f)
                curveTo(10f, 20.163f, 9.737f, 20.799f, 9.268f, 21.268f)
                curveTo(8.799f, 21.737f, 8.163f, 22f, 7.5f, 22f)
                curveTo(6.837f, 22f, 6.201f, 21.737f, 5.732f, 21.268f)
                curveTo(5.263f, 20.799f, 5f, 20.163f, 5f, 19.5f)
                curveTo(5f, 19.24f, 4.76f, 19f, 4.5f, 19f)
                curveTo(4.133f, 18.996f, 3.771f, 18.911f, 3.44f, 18.751f)
                curveTo(3.11f, 18.591f, 2.818f, 18.36f, 2.587f, 18.075f)
                curveTo(2.356f, 17.789f, 2.19f, 17.457f, 2.102f, 17.1f)
                curveTo(2.014f, 16.744f, 2.005f, 16.372f, 2.077f, 16.012f)
                curveTo(2.149f, 15.652f, 2.299f, 15.312f, 2.517f, 15.016f)
                curveTo(2.735f, 14.721f, 3.016f, 14.477f, 3.339f, 14.302f)
                curveTo(3.661f, 14.127f, 4.019f, 14.025f, 4.386f, 14.004f)
                curveTo(4.752f, 13.983f, 5.119f, 14.043f, 5.46f, 14.18f)
                curveTo(5.96f, 14.39f, 6.6f, 14.43f, 6.99f, 14.03f)
                lineTo(14.06f, 6.97f)
                curveTo(14.45f, 6.58f, 14.42f, 5.94f, 14.21f, 5.43f)
                curveTo(14.09f, 5.13f, 14f, 4.83f, 14f, 4.5f)
                curveTo(14f, 3.837f, 14.263f, 3.201f, 14.732f, 2.732f)
                curveTo(15.201f, 2.263f, 15.837f, 2f, 16.5f, 2f)
                curveTo(17.163f, 2f, 17.799f, 2.263f, 18.268f, 2.732f)
                curveTo(18.737f, 3.201f, 19f, 3.837f, 19f, 4.5f)
                curveTo(19.01f, 4.76f, 19.24f, 4.99f, 19.5f, 5f)
                curveTo(19.87f, 4.995f, 20.236f, 5.073f, 20.572f, 5.227f)
                curveTo(20.908f, 5.381f, 21.206f, 5.608f, 21.444f, 5.891f)
                curveTo(21.682f, 6.174f, 21.854f, 6.506f, 21.949f, 6.864f)
                curveTo(22.043f, 7.221f, 22.056f, 7.595f, 21.989f, 7.959f)
                curveTo(21.921f, 8.322f, 21.773f, 8.666f, 21.556f, 8.966f)
                curveTo(21.339f, 9.265f, 21.059f, 9.513f, 20.735f, 9.691f)
                curveTo(20.41f, 9.869f, 20.051f, 9.973f, 19.682f, 9.995f)
                curveTo(19.313f, 10.018f, 18.943f, 9.958f, 18.6f, 9.82f)
                close()
            }
        }.build()

        return _Bone!!
    }

@Suppress("ObjectPropertyName")
private var _Bone: ImageVector? = null
