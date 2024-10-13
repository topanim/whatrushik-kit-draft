package app.whatrushik.what_shadcn_ui.core.primitives.accordion

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import app.whatrushik.what_shadcn_ui.core.primitives.separator.Separator
import app.whatrushik.what_shadcn_ui.core.theme.SHUITheme.spacing
import app.whatrushik.what_shadcn_ui.core.utils.toggle


val accordionState
    @Composable
    get() = LocalAccordionState.current

private val LocalAccordionState =
    compositionLocalOf<List<Int>> { error("LocalAccordionState not provided") }

val setAccordionState
    @Composable
    get() = LocalSetAccordionState.current

private val LocalSetAccordionState =
    staticCompositionLocalOf<(Int) -> Unit> { error("LocalAccordionStateListener not provided") }

enum class AccordionMode {
    Single,
    Multiple
}

@Composable
fun Accordion(
    modifier: Modifier = Modifier,
    mode: AccordionMode = AccordionMode.Single,
    content: @Composable ColumnScope.(Modifier) -> Unit
) = Column(modifier) {
    val expandedItemsIndexes = remember { mutableStateListOf<Int>() }
    val stateListener: (Int) -> Unit = remember {
        { index: Int ->
            when (mode) {
                AccordionMode.Multiple -> expandedItemsIndexes.toggle(index)
                AccordionMode.Single -> expandedItemsIndexes.apply {
                    val itemWasInList = contains(index)
                    clear(); !itemWasInList && add(index)
                }
            }
        }
    }

    CompositionLocalProvider(
        LocalAccordionState provides expandedItemsIndexes,
        LocalSetAccordionState provides stateListener
    ) { content(Modifier) }
}

@Composable
fun AccordionItem(
    modifier: Modifier = Modifier,
    index: Int,
    trigger: @Composable ColumnScope.(modifier: Modifier, expanded: Boolean) -> Unit,
    content: @Composable ColumnScope.(Modifier) -> Unit
) = Column(modifier) {
    val state = accordionState
    val setState = setAccordionState
    val expanded = state.contains(index)

    trigger(Modifier.clickable { setState(index) }, expanded)
    AnimatedVisibility(visible = expanded) { content(Modifier) }
    Separator(Modifier.padding(horizontal = spacing.md.dp))
}