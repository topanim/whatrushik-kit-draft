package app.whatrushik.what_shadcn_ui.core.primitives.button

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import app.whatrushik.what_shadcn_ui.core.icons.Voicemail
import app.whatrushik.what_shadcn_ui.core.primitives.preview.PreviewBox
import app.whatrushik.what_shadcn_ui.core.theme.SHUITheme.icons

@Composable
fun ButtonPreview() = PreviewBox(
    title = "Button",
    description = "Displays a button or a component that looks like a button."
) {
    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier.fillMaxWidth()
    ) {
        Button(
            onClick = {},
            mode = ButtonMode.Default,
            label = "Button"
        )
        Button(
            onClick = {},
            mode = ButtonMode.Secondary,
            label = "Secondary"
        )
        Button(
            onClick = {},
            mode = ButtonMode.Outline,
            label = "Outline"
        )
    }

    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier.fillMaxWidth()
    ) {
        Button(
            onClick = {},
            mode = ButtonMode.Ghost,
            label = "Ghost"
        )
        Button(
            onClick = {},
            mode = ButtonMode.Destructive,
            label = "Destructive"
        )
        Button(
            onClick = {},
            mode = ButtonMode.Loading,
            label = "Loading"
        )
    }

    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier.fillMaxWidth()
    ) {
        Button(
            onClick = {},
            mode = ButtonMode.Default,
            icon = icons.Voicemail,
            label = "Button with icon"
        )
    }
}