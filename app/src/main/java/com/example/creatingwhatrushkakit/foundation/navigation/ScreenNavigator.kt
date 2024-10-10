package com.example.creatingwhatrushkakit.foundation.navigation

import androidx.compose.runtime.Composable
import app.whatrsuhik.what_navigation.core.NavigationHost
import app.whatrsuhik.what_navigation.core.Registry
import app.whatrsuhik.what_navigation.core.register


val globalRegistry: Registry = {
    register(ScreenMainDemo::class)
    register(ScreenDemo3::class)
}

@Composable
fun Main() {
    NavigationHost(
        start = ScreenMainDemo.Provider,
        registry = globalRegistry
    )
}
