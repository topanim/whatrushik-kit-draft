package app.whatrushik.what_shadcn_ui.core.primitives.collapsible

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import app.whatrushik.what_shadcn_ui.core.primitives.preview.PreviewBox
import app.whatrushik.what_shadcn_ui.core.primitives.spacer.Space
import app.whatrushik.what_shadcn_ui.core.primitives.styled_box.StyledBox
import app.whatrushik.what_shadcn_ui.core.react.useState
import app.whatrushik.what_shadcn_ui.core.theme.SHUITheme.palettes
import app.whatrushik.what_shadcn_ui.core.theme.SHUITheme.spacing
import app.whatrushik.what_shadcn_ui.core.theme.SHUITheme.typography

@Composable
fun CollapsiblePreview() = PreviewBox(
    title = "Collapsible",
    description = "An interactive component which expands/collapses a panel."
) {
    val (state, setState) = useState(false)

    val items = remember {
        listOf("@radix-ui/primitives", "@radix-ui/colors", "@stitches/react")
    }

    val repoView: @Composable (String) -> Unit = remember {
        { name ->
            Column {
                StyledBox(
                    Modifier.fillMaxWidth()
                ) {
                    Row {
                        Space(spacing.sm)
                        Text(
                            text = name,
                            style = typography.inlineCode,
                            color = palettes.foreground,
                            textAlign = TextAlign.Left,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(spacing.md.dp, spacing.md.dp)
                        )
                    }
                }

                Space(spacing.sm)
            }
        }
    }



    Collapsible(
        header = {
            Text(
                text = "@peduarte starred 3 repositories",
                style = typography.pUiMedium,
                color = palettes.foreground
            )
        },
        preview = { repoView(items.first()) },
        content = {
            Column {
                items.drop(1).forEach { repoView(it) }
            }
        }
    )
}