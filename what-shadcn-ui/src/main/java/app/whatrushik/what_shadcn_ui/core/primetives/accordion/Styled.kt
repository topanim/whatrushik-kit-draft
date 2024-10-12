package app.whatrushik.what_shadcn_ui.core.primetives.accordion

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import app.whatrsuhik.what_shadcn_ui.core.theme.LocalSHUIColor
import app.whatrsuhik.what_shadcn_ui.core.theme.LocalSHUITypography
import app.whatrushik.what_shadcn_ui.core.primetives.spacer.Spacer
import app.whatrushik.what_shadcn_ui.core.theme.LocalSHUISpacing

@Composable
fun Accordion(
    modifier: Modifier = Modifier,
    mode: AccordionMode = AccordionMode.Single,
    items: List<AccordionItem>
) = Accordion(
    modifier = modifier,
    mode = mode,
) {
    items.forEachIndexed { index, item ->
        AccordionItem(
            modifier = it,
            index = index,
            trigger = { modifier, expanded -> item.Trigger(modifier, expanded) },
            content = { item.Content(Modifier) }
        )
    }
}

data class AccordionItem(
    val title: String,
    val description: String
) {
    @Composable
    fun Trigger(modifier: Modifier, expanded: Boolean) = Box(
        modifier
            .fillMaxWidth()
            .padding(vertical = LocalSHUISpacing.current.md.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = LocalSHUISpacing.current.md.dp)
        ) {
            Text(
                text = title,
                style = LocalSHUITypography.current.pUiMedium,
                color = LocalSHUIColor.current.i900,
                textDecoration = if (expanded) TextDecoration.Underline else TextDecoration.None
            )

            val iconRotationState by animateFloatAsState(
                if (expanded) 180f else 0f, label = "AccordionItemExpandIconRotationState"
            )

            Icon(
                imageVector = Icons.Default.KeyboardArrowDown,
                contentDescription = "Expand $title",
                tint = LocalSHUIColor.current.i900,
                modifier = Modifier.rotate(iconRotationState)
            )
        }
    }


    @Composable
    fun Content(modifier: Modifier) = Column(
        modifier = modifier.fillMaxWidth()
    ) {
        Text(
            description,
            style = LocalSHUITypography.current.subtle,
            color = LocalSHUIColor.current.i900,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = LocalSHUISpacing.current.md.dp)
        )

        Spacer(LocalSHUISpacing.current.sm)
    }
}
