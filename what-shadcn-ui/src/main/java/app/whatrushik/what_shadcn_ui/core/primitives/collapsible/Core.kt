package app.whatrushik.what_shadcn_ui.core.primitives.collapsible

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import app.whatrushik.what_shadcn_ui.core.icons.ChevronsDownUp
import app.whatrushik.what_shadcn_ui.core.icons.ChevronsUpDown
import app.whatrushik.what_shadcn_ui.core.primitives.button.Button
import app.whatrushik.what_shadcn_ui.core.primitives.button.ButtonMode
import app.whatrushik.what_shadcn_ui.core.primitives.spacer.Space
import app.whatrushik.what_shadcn_ui.core.react.useState
import app.whatrushik.what_shadcn_ui.core.theme.SHUITheme.icons
import app.whatrushik.what_shadcn_ui.core.theme.SHUITheme.spacing

@Composable
fun Collapsible(
    modifier: Modifier = Modifier,
    header: @Composable () -> Unit,
    preview: @Composable () -> Unit,
    content: @Composable () -> Unit
) = Column(modifier) {
    val (collapsed, setCollapsed) = useState(false)
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        header()
        Button(
            icon = if (collapsed) icons.ChevronsDownUp else icons.ChevronsUpDown,
            mode = ButtonMode.Icon
        ) { setCollapsed(!collapsed) }
    }

    Space(spacing.sm)

    preview()
    AnimatedVisibility(visible = collapsed) {
        content()
    }
}
