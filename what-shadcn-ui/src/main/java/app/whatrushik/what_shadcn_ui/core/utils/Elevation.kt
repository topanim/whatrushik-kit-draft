package app.whatrushik.what_shadcn_ui.core.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.Dp
import app.whatrushik.what_shadcn_ui.core.theme.SHUITheme.shapes

@Composable
fun Modifier.elevation(value: Dp) = shadow(elevation = value, shape = shapes)