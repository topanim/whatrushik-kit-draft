package com.example.creatingwhatrushkakit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.creatingwhatrushkakit.foundation.navigation.Main
import com.example.creatingwhatrushkakit.ui.theme.CreatingWhatrushkaKitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CreatingWhatrushkaKitTheme {
                Main()
            }
        }
    }
}