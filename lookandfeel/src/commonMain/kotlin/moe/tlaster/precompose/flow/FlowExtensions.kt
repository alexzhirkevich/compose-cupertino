package moe.tlaster.precompose.flow

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.collect
import moe.tlaster.precompose.lifecycle.Lifecycle
import moe.tlaster.precompose.lifecycle.LocalLifecycleOwner
import moe.tlaster.precompose.lifecycle.repeatOnLifecycle
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext

@Composable
fun <T : R, R> Flow<T>.collectAsStateWithLifecycle(
    initial: R,
    context: CoroutineContext = EmptyCoroutineContext
): State<R> {
    val lifecycleOwner = checkNotNull(LocalLifecycleOwner.current)
    val flow = remember(this, lifecycleOwner) {
        flowWithLifecycle(lifecycleOwner.lifecycle)
    }
    return flow.collectAsState(initial = initial, context = context)
}

fun <T> Flow<T>.flowWithLifecycle(
    lifecycle: Lifecycle,
): Flow<T> = callbackFlow {
    lifecycle.repeatOnLifecycle {
        this@flowWithLifecycle.collect {
            send(it)
        }
    }
    close()
}
