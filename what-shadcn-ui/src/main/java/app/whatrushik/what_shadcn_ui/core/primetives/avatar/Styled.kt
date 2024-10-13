package app.whatrushik.what_shadcn_ui.core.primetives.avatar

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import app.whatrushik.what_shadcn_ui.core.primetives.styled_box.StyledBox
import app.whatrushik.what_shadcn_ui.core.theme.SHUIShapes
import app.whatrushik.what_shadcn_ui.core.theme.SHUITheme.palettes
import app.whatrushik.what_shadcn_ui.core.theme.SHUITheme.typography
import coil3.compose.SubcomposeAsyncImage

@Composable
fun Avatar(
    icon: String,
    fallback: String
) = Avatar {
    val placeholder: @Composable () -> Unit = remember {
        {
            StyledBox(
                modifier = Modifier.fillMaxSize(),
                shape = SHUIShapes.Circle
            ) { boxModifier ->
                Text(
                    modifier = boxModifier,
                    text = fallback.uppercase(),
                    style = typography.lead,
                    color = palettes.foreground
                )
            }
        }
    }

    SubcomposeAsyncImage(
        modifier = it,
        model = icon,
        contentDescription = "$fallback's avatar",
        loading = { placeholder() },
        error = { placeholder() },
    )
}