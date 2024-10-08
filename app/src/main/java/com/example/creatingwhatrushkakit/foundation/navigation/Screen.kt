package com.example.creatingwhatrushkakit.foundation.navigation

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.creatingwhatrushkakit.foundation.base.BaseViewModel

abstract class View<Event : Any, ViewModel : BaseViewModel<*, *, Event>> : UIComponent {
    protected abstract val viewModel: ViewModel
    protected val onEvent: (Event) -> Unit = { viewModel.obtainEvent(it) }
}

data class TabOptions(
    val title: String,
    @DrawableRes val icon: Int,
)

abstract class Tab : Screen<Unit>(Unit) {
    abstract val options: TabOptions
        @Composable get
}

abstract class Screen<T : Any>(val data: T) : UIComponent

interface UIComponent {
    @Composable
    fun content(modifier: Modifier): Any
}