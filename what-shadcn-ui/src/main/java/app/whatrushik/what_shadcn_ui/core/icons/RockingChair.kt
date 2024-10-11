package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.RockingChair: ImageVector
    get() {
        if (_RockingChair != null) {
            return _RockingChair!!
        }
        _RockingChair = ImageVector.Builder(
            name = "RockingChair",
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
                moveTo(3.5f, 2f)
                lineTo(6.5f, 12.5f)
                horizontalLineTo(18f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.5f, 12.5f)
                lineTo(5.5f, 20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 12.5f)
                lineTo(18.5f, 20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.75f, 18f)
                curveTo(3.959f, 19.225f, 5.4f, 20.197f, 6.987f, 20.86f)
                curveTo(8.575f, 21.524f, 10.279f, 21.866f, 12f, 21.866f)
                curveTo(13.721f, 21.866f, 15.425f, 21.524f, 17.013f, 20.86f)
                curveTo(18.601f, 20.197f, 20.041f, 19.225f, 21.25f, 18f)
            }
        }.build()

        return _RockingChair!!
    }

@Suppress("ObjectPropertyName")
private var _RockingChair: ImageVector? = null
