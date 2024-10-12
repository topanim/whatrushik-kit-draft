package app.whatrushik.what_shadcn_ui.core.primetives.spacer

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ColumnScope.Spacer(size: Int, modifier: Modifier = Modifier) =
    VerticalSpacer(size = size, modifier = modifier)

@Composable
fun RowScope.Spacer(size: Int, modifier: Modifier = Modifier) =
    HorizontalSpacer(size = size, modifier = modifier)

@Composable
fun HorizontalSpacer(size: Int, modifier: Modifier = Modifier) =
    androidx.compose.foundation.layout.Spacer(
        modifier = Modifier
            .width(size.dp)
            .then(modifier)
    )

@Composable
fun VerticalSpacer(size: Int, modifier: Modifier = Modifier) =
    androidx.compose.foundation.layout.Spacer(
        modifier = Modifier
            .height(size.dp)
            .then(modifier)
    )

