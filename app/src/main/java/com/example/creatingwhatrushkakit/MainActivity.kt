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
import app.whatrushik.what_shadcn_ui.core.primetives.accordion.AccordionPreview
import app.whatrushik.what_shadcn_ui.core.primetives.alert.AlertPreview
import app.whatrushik.what_shadcn_ui.core.primetives.avatar.AvatarPreview
import app.whatrushik.what_shadcn_ui.core.theme.LocalSHUIPalette
import app.whatrushik.what_shadcn_ui.core.theme.SHUIPalette
import app.whatrushik.what_shadcn_ui.core.theme.SHUITheme.palettes
import com.example.creatingwhatrushkakit.ui.theme.CreatingWhatrushkaKitTheme
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CreatingWhatrushkaKitTheme {
                var darkTheme by remember { mutableStateOf(false) }

                LaunchedEffect(Unit) {
                    while (true) {
                        delay(5000)
                        darkTheme = !darkTheme
                    }
                }

                CompositionLocalProvider(
                    LocalSHUIPalette provides SHUIPalette.red(darkTheme)
                ) {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .fillMaxSize()
                            .background(palettes.background)
                            .verticalScroll(rememberScrollState())
                    ) {
                        AccordionPreview()
                        AlertPreview()
                        AvatarPreview()
                    }
                }
            }
        }
    }
}