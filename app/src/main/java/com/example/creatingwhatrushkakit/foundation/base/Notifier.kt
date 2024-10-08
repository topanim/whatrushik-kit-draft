package com.example.creatingwhatrushkakit.foundation.base

import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.ui.Modifier
import com.example.creatingwhatrushkakit.foundation.navigation.UIComponent

typealias EventView<Event> = @Composable (Modifier, Event) -> Unit


interface Event {
    fun onRemove()

    @Composable
    fun view(modifier: Modifier): Any
}

class Notifier<E : Event>(
    private val config: Config,
    private val key: ((E) -> Any)? = null,
) : UIComponent {

    data class Config(
        val removeFor: Long = 700L,
        val deleteAfter: Long? = 3000L,
        val reverseLayout: Boolean = true,
        val enableGestures: Boolean = true,
        val focusOnNew: Boolean = true
    )

    companion object Mode {
        val NORMAL = Config()
        val STRONG = Config(enableGestures = false)
    }

    private var _events = mutableStateListOf<E>()

    fun notify(event: E) {
        _events.add(0, event)

        if (config.deleteAfter != null)
            doAfter(config.deleteAfter) {
//                event.onRemove()
//                delay(config.removeFor)
                _events.remove(event)
            }
    }

    @Composable
    override fun content(modifier: Modifier) = Column(modifier) {
        val state = rememberLazyListState()

        LaunchedEffect(_events) {
            if (config.focusOnNew && state.canScrollForward)
                state.scrollToItem(
                    _events.size.takeIf { it > 0 }?.minus(1) ?: 0
                )
        }

        LazyColumn(
            modifier = modifier,
            state = state,
            reverseLayout = config.reverseLayout
        ) {
            items(_events, key) {
                it.view(
                    Modifier.animateItem(
                        fadeInSpec = tween(500),
                        placementSpec = tween(500),
                        fadeOutSpec = tween(500)
                    )
                )
            }
        }
    }
}

