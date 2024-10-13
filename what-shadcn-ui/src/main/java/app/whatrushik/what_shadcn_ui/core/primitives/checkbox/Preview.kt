package app.whatrushik.what_shadcn_ui.core.primitives.checkbox

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import app.whatrushik.what_shadcn_ui.core.primitives.preview.PreviewBox
import app.whatrushik.what_shadcn_ui.core.react.useState

@Composable
fun CheckboxPreview() = PreviewBox(
    title = "Checkbox",
    description = "A control that allows the user to toggle between checked and not checked."
) {
    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier.fillMaxWidth()
    ) {
        val (state1, setState1) = useState(true)
        Checkbox(checked = state1, onChange = setState1)

        val (state2, setState2) = useState(true)
        Checkbox(checked = state2, onChange = setState2, enabled = false)

        val (state3, setState3) = useState(false)
        Checkbox(checked = state3, onChange = setState3, enabled = false)
    }

    val (state3, setState3) = useState(true)
    CheckboxWithText(
        title = "Accept terms and conditions",
        description = "You agree to our Terms of Service and Privacy Policy.",
        checked = state3,
        onChange = setState3
    )

    val (state4, setState4) = useState(true)
    CheckboxWithText(
        title = "Accept terms and conditions",
        description = "You agree to our Terms of Service and Privacy Policy.",
        checked = state4,
        onChange = setState4,
        enabled = false
    )

    val (state5, setState5) = useState(false)
    CheckboxWithText(
        title = "Accept terms and conditions",
        description = "You agree to our Terms of Service and Privacy Policy.",
        checked = state5,
        onChange = setState5,
        enabled = false
    )
}