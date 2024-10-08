package com.example.creatingwhatrushkakit.foundation.base

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

fun <T : Any?> published(initValue: T) = Published(initValue)

class Published<T : Any?>(initValue: T) : ReadWriteProperty<Any?, T> {
    private val state: MutableState<T> = mutableStateOf(initValue)

    override fun getValue(thisRef: Any?, property: KProperty<*>): T {
        return state.value
    }

    override operator fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
        state.value = value
    }
}