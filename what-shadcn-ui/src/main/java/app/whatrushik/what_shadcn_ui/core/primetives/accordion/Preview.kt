package app.whatrushik.what_shadcn_ui.core.primetives.accordion

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(showBackground = true)
@Composable
fun AccordionPreview() = Column(
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally,
    modifier = Modifier.padding(20.dp)
) {
    val titlesList = remember {
        listOf(
            "Is it accessible?",
            "is it styled?",
            "is it animated?"
        )
    }

    val accordionItemsList = remember {
        Array(3) {
            AccordionItem(
                title = titlesList[it],
                description = "Yes. It's animated by default, but you can disable it if you prefer."
            )
        }.toList()
    }

//    Accordion(items = accordionItemsList)
    Accordion(mode = AccordionMode.Multiple, items = accordionItemsList)
}
