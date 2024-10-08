package com.example.creatingwhatrushkakit.foundation.base

import androidx.compose.ui.Modifier
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun suspendCall(dispatcher: CoroutineDispatcher = IO, block: suspend CoroutineScope.() -> Unit) =
    CoroutineScope(dispatcher).launch(block = block)

fun suspendCall(scope: CoroutineScope, block: suspend CoroutineScope.() -> Unit) =
    scope.launch(block = block)

fun doAfter(millis: Long = 3000L, block: suspend CoroutineScope.() -> Unit) =
    suspendCall { delay(millis); block() }


fun Modifier.applyIf(
    condition: Boolean,
    elseBlock: Modifier.() -> Modifier = { this },
    block: Modifier.() -> Modifier
): Modifier = if (condition) this.block() else this.elseBlock()

