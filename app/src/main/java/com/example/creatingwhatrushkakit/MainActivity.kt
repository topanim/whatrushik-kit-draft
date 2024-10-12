package com.example.creatingwhatrushkakit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import app.whatrushik.what_shadcn_ui.core.primetives.accordion.AccordionPreview
import com.example.creatingwhatrushkakit.foundation.navigation.Main
import com.example.creatingwhatrushkakit.ui.theme.CreatingWhatrushkaKitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CreatingWhatrushkaKitTheme {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.fillMaxSize()
                ) {
                    AccordionPreview()
                }

            }
        }
    }
}