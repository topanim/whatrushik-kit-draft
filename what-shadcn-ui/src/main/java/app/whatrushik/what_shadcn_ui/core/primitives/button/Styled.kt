package app.whatrushik.what_shadcn_ui.core.primitives.button

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import app.whatrushik.what_shadcn_ui.core.icons.Loader2
import app.whatrushik.what_shadcn_ui.core.icons.SHUIIcons
import app.whatrushik.what_shadcn_ui.core.primitives.spacer.Space
import app.whatrushik.what_shadcn_ui.core.theme.SHUITheme.spacing
import app.whatrushik.what_shadcn_ui.core.theme.SHUITheme.typography
import app.whatrushik.what_shadcn_ui.core.utils.applyComposableIf
import app.whatrushik.what_shadcn_ui.core.utils.applyIf


@Composable
fun Button(
    modifier: Modifier = Modifier,
    mode: ButtonMode = ButtonMode.Default,
    icon: ImageVector? = null,
    label: String? = null,
    enabled: Boolean = true,
    onClick: () -> Unit,
) = Button(
    mode = mode,
    enabled = enabled,
    onClick = onClick,
    modifier = modifier
        .height(42.dp)
        .applyIf(mode != ButtonMode.Icon) {
            defaultMinSize(minWidth = 64.dp)
        }
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier.applyComposableIf(
            mode == ButtonMode.Icon,
            block = { padding(spacing.sm.dp) },
            elseBlock = { padding(spacing.sm.dp, spacing.xs.dp) }
        )

    ) {
        val finalIcon: ImageVector? = remember(icon, mode) {
            if (mode != ButtonMode.Loading) icon
            else SHUIIcons.Loader2
        }

        if (finalIcon != null) {
            Icon(
                imageVector = finalIcon,
                contentDescription = "Button icon",
                tint = mode.foreground,
                modifier = Modifier.applyComposableIf(mode == ButtonMode.Loading) {
                    val infiniteTransition =
                        rememberInfiniteTransition(label = "ButtonIconRotationAnimation")
                    val angle by infiniteTransition.animateFloat(
                        initialValue = 0F,
                        targetValue = 360F,
                        animationSpec = infiniteRepeatable(
                            animation = tween(2000, easing = LinearEasing)
                        ), label = "ButtonIconRotationAnimationTransition"
                    )

                    return@applyComposableIf rotate(angle)
                }
            )
        }

        if (label != null && icon != null) Space(spacing.md)

        if (label != null) Text(
            text = label,
            style = typography.pUi,
            color = mode.foreground
        )
    }
}