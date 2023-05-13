package moe.tlaster.precompose.lifecycle

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext
import kotlin.coroutines.resume

/**
 * Runs the given [block] in a new coroutine when `this` [Lifecycle] is at least at [state] and
 * suspends the execution until `this` [Lifecycle] is [Lifecycle.State.Destroyed].
 *
 * The [block] will cancel and re-launch as the lifecycle moves in and out of the target state.
 *
 * ```
 * class MyActivity : AppCompatActivity() {
 *     override fun onCreate(savedInstanceState: Bundle?) {
 *         /* ... */
 *         // Runs the block of code in a coroutine when the lifecycle is at least STARTED.
 *         // The coroutine will be cancelled when the ON_STOP event happens and will
 *         // restart executing if the lifecycle receives the ON_START event again.
 *         lifecycleScope.launch {
 *             lifecycle.repeatOnLifecycle(Lifecycle.State.STARTED) {
 *                 uiStateFlow.collect { uiState ->
 *                     updateUi(uiState)
 *                 }
 *             }
 *         }
 *     }
 * }
 * ```
 *
 * The best practice is to call this function when the lifecycle is initialized. For
 * example, `onCreate` in an Activity, or `onViewCreated` in a Fragment. Otherwise, multiple
 * repeating coroutines doing the same could be created and be executed at the same time.
 *
 * Repeated invocations of `block` will run serially, that is they will always wait for the
 * previous invocation to fully finish before re-starting execution as the state moves in and out
 * of the required state.
 *
 * Warning: [Lifecycle.State.Initialized] is not allowed in this API. Passing it as a
 * parameter will throw an [IllegalArgumentException].
 *
 * @param state [Lifecycle.State] in which `block` runs in a new coroutine. That coroutine
 * will cancel if the lifecycle falls below that state, and will restart if it's in that state
 * again.
 */
suspend fun Lifecycle.repeatOnLifecycle(
    block: suspend CoroutineScope.() -> Unit
) {
    if (currentState === Lifecycle.State.Destroyed) {
        return
    }

    // This scope is required to preserve context before we move to Dispatchers.Main
    coroutineScope {
        withContext(Dispatchers.Main.immediate) {
            // Check the current state of the lifecycle as the previous check is not guaranteed
            // to be done on the main thread.
            if (currentState === Lifecycle.State.Destroyed) return@withContext

            // Instance of the running repeating coroutine
            var launchedJob: Job? = null

            // Registered observer
            var observer: LifecycleObserver? = null
            try {
                // Suspend the coroutine until the lifecycle is destroyed or
                // the coroutine is cancelled
                suspendCancellableCoroutine<Unit> { cont ->
                    // Lifecycle observers that executes `block` when the lifecycle reaches certain state, and
                    // cancels when it falls below that state.
                    val mutex = Mutex()
                    observer = object : LifecycleObserver {
                        override fun onStateChanged(state: Lifecycle.State) {
                            when (state) {
                                Lifecycle.State.Initialized -> Unit
                                Lifecycle.State.Active -> {
                                    launchedJob = this@coroutineScope.launch {
                                        // Mutex makes invocations run serially,
                                        // coroutineScope ensures all child coroutines finish
                                        mutex.withLock {
                                            coroutineScope {
                                                block()
                                            }
                                        }
                                    }
                                }
                                Lifecycle.State.InActive -> {
                                    launchedJob?.cancel()
                                    launchedJob = null
                                }
                                Lifecycle.State.Destroyed -> {
                                    cont.resume(Unit)
                                }
                            }
                        }
                    }
                    this@repeatOnLifecycle.addObserver(observer as LifecycleObserver)
                }
            } finally {
                launchedJob?.cancel()
                observer?.let {
                    this@repeatOnLifecycle.removeObserver(it)
                }
            }
        }
    }
}

/**
 * [LifecycleOwner]'s extension function for [Lifecycle.repeatOnLifecycle] to allow an easier
 * call to the API from LifecycleOwners such as Activities and Fragments.
 *
 * ```
 * class MyActivity : AppCompatActivity() {
 *     override fun onCreate(savedInstanceState: Bundle?) {
 *         /* ... */
 *         // Runs the block of code in a coroutine when the lifecycle is at least STARTED.
 *         // The coroutine will be cancelled when the ON_STOP event happens and will
 *         // restart executing if the lifecycle receives the ON_START event again.
 *         lifecycleScope.launch {
 *             repeatOnLifecycle(Lifecycle.State.STARTED) {
 *                 uiStateFlow.collect { uiState ->
 *                     updateUi(uiState)
 *                 }
 *             }
 *         }
 *     }
 * }
 * ```
 *
 * @see Lifecycle.repeatOnLifecycle
 */
suspend fun LifecycleOwner.repeatOnLifecycle(
    block: suspend CoroutineScope.() -> Unit
): Unit = lifecycle.repeatOnLifecycle(block)
