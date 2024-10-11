package app.whatrsuhik.what_ui.utils

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp

enum class Size(val value: Int?) {
    NONE(null),
    EXTRA_SMALL(2),
    SMALL(4),
    NORMAL(8),
    MEDIUM(12),
    LARGE(18),
    EXTRA_LARGE(32),
    ABSOLUTE(null)
}

fun shape(size: Size) = when (size) {
    Size.NONE -> RectangleShape
    Size.ABSOLUTE -> CircleShape
    else -> RoundedCornerShape(size.value!!.dp)
}

@Composable
fun RowScope.Gap(size: Size) = when (size) {
    Size.NONE -> Spacer(Modifier)
    Size.ABSOLUTE -> Spacer(Modifier.fillMaxWidth())
    else -> Gap(size.value!!)
}

@Composable
fun ColumnScope.Gap(size: Size) = when (size) {
    Size.NONE -> Spacer(Modifier)
    Size.ABSOLUTE -> Spacer(Modifier.fillMaxHeight())
    else -> Gap(size.value!!)
}


@Composable
fun LazyItemScope.Gap(size: Size, orientation: Orientation = Orientation.Vertical) =
    when (size) {
        Size.NONE -> Spacer(Modifier)
        Size.ABSOLUTE -> Spacer(Modifier.fillMaxSize())
        else -> when (orientation) {
            Orientation.Vertical -> VerticalGap(size.value!!)
            Orientation.Horizontal -> HorizontalGap(size.value!!)
        }
    }