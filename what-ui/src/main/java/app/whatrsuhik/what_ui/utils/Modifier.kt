package app.whatrsuhik.what_ui.utils

import androidx.compose.ui.Modifier


fun Modifier.applyIf(
    condition: Boolean,
    elseBlock: Modifier.() -> Modifier = { this },
    block: Modifier.() -> Modifier
): Modifier = if (condition) this.block() else this.elseBlock()

