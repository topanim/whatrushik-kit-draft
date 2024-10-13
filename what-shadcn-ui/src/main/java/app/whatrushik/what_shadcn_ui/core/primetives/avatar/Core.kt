package app.whatrushik.what_shadcn_ui.core.primetives.avatar

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import app.whatrushik.what_shadcn_ui.core.theme.SHUIShapes

@Composable
fun Avatar(
    modifier: Modifier = Modifier,
    content: @Composable BoxScope.(Modifier) -> Unit
) = Box(
    modifier = modifier.size(64.dp)
) {
    content(
        Modifier
            .align(Alignment.Center)
            .clip(SHUIShapes.Circle)
    )
}