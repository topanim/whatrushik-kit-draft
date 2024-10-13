package app.whatrushik.what_shadcn_ui.core.primitives.accordion

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import app.whatrushik.what_shadcn_ui.core.primitives.preview.PreviewBox


@Preview(showBackground = true)
@Composable
fun AccordionPreview() = PreviewBox(
    title = "Accordion",
    description = "A vertically stacked set of interactive headings that each reveal a section of content."
) {
    val accordionItemsList = remember {
        listOf(
            AccordionItem(
                title = "Is it accessible?",
                description = "Yes. It adheres to the WAI-ARIA design pattern."
            ),
            AccordionItem(
                title = "is it styled?",
                description = "Yes. It comes with default styles that matches the other components' aesthetic."
            ),
            AccordionItem(
                title = "is it animated?",
                description = "Yes. It's animated by default, but you can disable it if you prefer."
            )
        )
    }

    Accordion(items = accordionItemsList)
//    Accordion(mode = AccordionMode.Multiple, items = accordionItemsList)
}