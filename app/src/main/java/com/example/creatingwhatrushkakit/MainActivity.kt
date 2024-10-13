package com.example.creatingwhatrushkakit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import app.whatrushik.what_shadcn_ui.core.primitives.accordion.AccordionPreview
import app.whatrushik.what_shadcn_ui.core.primitives.alert.AlertPreview
import app.whatrushik.what_shadcn_ui.core.primitives.alert_dialog.AlertDialogPreview
import app.whatrushik.what_shadcn_ui.core.primitives.avatar.AvatarPreview
import app.whatrushik.what_shadcn_ui.core.primitives.badge.BadgePreview
import app.whatrushik.what_shadcn_ui.core.primitives.button.ButtonPreview
import app.whatrushik.what_shadcn_ui.core.primitives.checkbox.CheckboxPreview
import app.whatrushik.what_shadcn_ui.core.primitives.collapsible.CollapsiblePreview
import app.whatrushik.what_shadcn_ui.core.primitives.spacer.Space
import app.whatrushik.what_shadcn_ui.core.theme.LocalSHUIPalette
import app.whatrushik.what_shadcn_ui.core.theme.SHUIPalette
import app.whatrushik.what_shadcn_ui.core.theme.SHUITheme.palettes
import app.whatrushik.what_shadcn_ui.core.theme.SHUITheme.spacing
import com.example.creatingwhatrushkakit.ui.theme.CreatingWhatrushkaKitTheme
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CreatingWhatrushkaKitTheme {
                var theme by remember { mutableStateOf(SHUIPalette.zincLightPalette) }

                LaunchedEffect(Unit) {
                    val lightThemes = SHUIPalette.all(false)
                    val darkThemes = SHUIPalette.all(true)
                    (lightThemes.drop(1) + darkThemes).forEach { palette ->
                        delay(2000)
                        theme = palette
                    }
                }

                CompositionLocalProvider(
                    LocalSHUIPalette provides theme
                ) {
                    Column(
                        verticalArrangement = Arrangement.spacedBy(spacing.md.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .fillMaxSize()
                            .background(palettes.background)
                            .verticalScroll(rememberScrollState())
                    ) {
                        Space(spacing.xl)
                        AccordionPreview()
                        AlertPreview()
                        AlertDialogPreview()
                        AvatarPreview()
                        BadgePreview()
                        ButtonPreview()
                        CheckboxPreview()
                        CollapsiblePreview()
                        Space(spacing.xl)
                    }
                }
            }
        }
    }
}