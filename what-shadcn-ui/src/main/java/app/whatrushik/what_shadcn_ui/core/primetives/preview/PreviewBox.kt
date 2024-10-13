package app.whatrushik.what_shadcn_ui.core.primetives.preview

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import app.whatrushik.what_shadcn_ui.core.primetives.spacer.Space
import app.whatrushik.what_shadcn_ui.core.theme.SHUITheme.palettes
import app.whatrushik.what_shadcn_ui.core.theme.SHUITheme.spacing
import app.whatrushik.what_shadcn_ui.core.theme.SHUITheme.typography

@Composable
fun PreviewBox(
    title: String,
    description: String,
    content: @Composable ColumnScope.() -> Unit
) = Column(
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally,
    modifier = Modifier.padding(20.dp)
) {
    Text(
        text = title,
        style = typography.h4,
        color = palettes.foreground,
        modifier = Modifier.fillMaxWidth()
    )
    Space(spacing.xs)
    Text(
        text = description,
        style = typography.pUi,
        color = palettes.foreground,
        modifier = Modifier.fillMaxWidth()
    )
    Space(spacing.md)
    content()
    Space(spacing.md)
}