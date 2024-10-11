package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.Quote: ImageVector
    get() {
        if (_Quote != null) {
            return _Quote!!
        }
        _Quote = ImageVector.Builder(
            name = "Quote",
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
                moveTo(3f, 21f)
                curveTo(6f, 21f, 10f, 20f, 10f, 13f)
                verticalLineTo(5f)
                curveTo(10f, 3.75f, 9.244f, 2.983f, 8f, 3f)
                horizontalLineTo(4f)
                curveTo(2.75f, 3f, 2f, 3.75f, 2f, 4.972f)
                verticalLineTo(11f)
                curveTo(2f, 12.25f, 2.75f, 13f, 4f, 13f)
                curveTo(5f, 13f, 5f, 13f, 5f, 14f)
                verticalLineTo(15f)
                curveTo(5f, 16f, 4f, 17f, 3f, 17f)
                curveTo(2f, 17f, 2f, 17.008f, 2f, 18.031f)
                verticalLineTo(20f)
                curveTo(2f, 21f, 2f, 21f, 3f, 21f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 21f)
                curveTo(18f, 21f, 22f, 20f, 22f, 13f)
                verticalLineTo(5f)
                curveTo(22f, 3.75f, 21.243f, 2.983f, 20f, 3f)
                horizontalLineTo(16f)
                curveTo(14.75f, 3f, 14f, 3.75f, 14f, 4.972f)
                verticalLineTo(11f)
                curveTo(14f, 12.25f, 14.75f, 13f, 16f, 13f)
                horizontalLineTo(16.75f)
                curveTo(16.75f, 15.25f, 17f, 17f, 14f, 17f)
                verticalLineTo(20f)
                curveTo(14f, 21f, 14f, 21f, 15f, 21f)
                close()
            }
        }.build()

        return _Quote!!
    }

@Suppress("ObjectPropertyName")
private var _Quote: ImageVector? = null
