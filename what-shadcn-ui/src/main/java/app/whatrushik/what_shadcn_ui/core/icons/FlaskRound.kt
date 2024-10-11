package app.whatrushik.what_shadcn_ui.core.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SHUIIcons.FlaskRound: ImageVector
    get() {
        if (_FlaskRound != null) {
            return _FlaskRound!!
        }
        _FlaskRound = ImageVector.Builder(
            name = "FlaskRound",
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
                moveTo(10f, 2f)
                verticalLineTo(9.31f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 9.3f)
                verticalLineTo(1.99f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.5f, 2f)
                horizontalLineTo(15.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 9.3f)
                curveTo(15.473f, 9.776f, 16.728f, 10.763f, 17.539f, 12.083f)
                curveTo(18.349f, 13.402f, 18.662f, 14.967f, 18.421f, 16.497f)
                curveTo(18.18f, 18.027f, 17.4f, 19.42f, 16.223f, 20.426f)
                curveTo(15.046f, 21.432f, 13.549f, 21.985f, 12f, 21.985f)
                curveTo(10.452f, 21.985f, 8.954f, 21.432f, 7.777f, 20.426f)
                curveTo(6.6f, 19.42f, 5.82f, 18.027f, 5.579f, 16.497f)
                curveTo(5.338f, 14.967f, 5.651f, 13.402f, 6.461f, 12.083f)
                curveTo(7.272f, 10.763f, 8.527f, 9.776f, 10f, 9.3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.58f, 16.5f)
                horizontalLineTo(18.43f)
            }
        }.build()

        return _FlaskRound!!
    }

@Suppress("ObjectPropertyName")
private var _FlaskRound: ImageVector? = null
