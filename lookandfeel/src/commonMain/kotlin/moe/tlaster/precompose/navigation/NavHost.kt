package moe.tlaster.precompose.navigation

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.ContentTransform
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.with
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.material.DismissState
import androidx.compose.material.DismissValue
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ResistanceConfig
import androidx.compose.material.SwipeableDefaults
import androidx.compose.material.ThresholdConfig
import androidx.compose.material.rememberDismissState
import androidx.compose.material.swipeable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.ReusableContent
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.LocalSaveableStateRegistry
import androidx.compose.runtime.saveable.SaveableStateHolder
import androidx.compose.runtime.saveable.SaveableStateRegistry
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.saveable.rememberSaveableStateHolder
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.round
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import moe.tlaster.precompose.lifecycle.LocalLifecycleOwner
import moe.tlaster.precompose.navigation.route.ComposeRoute
import moe.tlaster.precompose.navigation.transition.NavTransition
import moe.tlaster.precompose.stateholder.LocalStateHolder
import kotlin.math.absoluteValue
import kotlin.math.roundToInt

internal class SceneConfiguration(
    val isCurrent : Boolean,
    val navigator : Navigator
)

internal val LocalSceneConfiguration = compositionLocalOf<SceneConfiguration?> { null }
/**
 * Provides in place in the Compose hierarchy for self contained navigation to occur.
 *
 * Once this is called, any Composable within the given [RouteBuilder] can be navigated to from
 * the provided [RouteBuilder].
 *
 * The builder passed into this method is [remember]ed. This means that for this NavHost, the
 * contents of the builder cannot be changed.
 *
 * @param navigator the Navigator for this host
 * @param initialRoute the route for the start destination
 * @param navTransition navigation transition for the scenes in this [NavHost]
 * @param swipeProperties properties of swipe back navigation
 * @param builder the builder used to construct the graph
 */
@OptIn(ExperimentalAnimationApi::class, ExperimentalMaterialApi::class)
@Composable
fun NavHost(
    navigator: Navigator,
    initialRoute: String,
    modifier: Modifier = Modifier,
    navTransition: NavTransition = NavHostDefaults.defaultNavTransition(),
    swipeProperties: SwipeProperties? = NavHostDefaults.defaultSwipeProperties(),
    builder: RouteBuilder.() -> Unit,
) {
    val lifecycleOwner = requireNotNull(LocalLifecycleOwner.current)
    val stateHolder = requireNotNull(LocalStateHolder.current)
    val composeStateHolder = rememberSaveableStateHolder()
    // true for assuming that lifecycleOwner, stateHolder and composeStateHolder are not changing during the lifetime of the NavHost
    LaunchedEffect(true) {
        navigator.init(
            routeGraph = RouteBuilder(initialRoute).apply(builder).build(),
            stateHolder = stateHolder,
            lifecycleOwner = lifecycleOwner,
        )
    }

    val transitionSpec: AnimatedContentScope<BackStackEntry>.() -> ContentTransform = {
        val actualTransaction = run {
            if (navigator.stackManager.contains(initialState)) targetState else initialState
        }.navTransition ?: navTransition
        if (!navigator.stackManager.contains(initialState)) {
            actualTransaction.resumeTransition.with(actualTransaction.destroyTransition).apply {
//                targetContentZIndex = actualTransaction.enterTargetContentZIndex
                targetContentZIndex = navigator.stackManager.backStacks.value.size.toFloat()
            }
        } else {
            actualTransaction.createTransition.with(actualTransaction.pauseTransition).apply {
//                targetContentZIndex = actualTransaction.exitTargetContentZIndex
                targetContentZIndex = navigator.stackManager.backStacks.value.size.toFloat()
            }
        }
    }

    val canGoBack by navigator.stackManager.canGoBack.collectAsState(false)

    BackHandler(canGoBack) {
        navigator.goBack()
    }

    val currentEntry by navigator.stackManager.currentBackStackEntry.collectAsState(null)

    LaunchedEffect(currentEntry, composeStateHolder) {
        val entry = currentEntry
        if (entry != null && entry.route is ComposeRoute) {
            val closable = entry.uiClosable
            if (closable == null || closable !is ComposeUiClosable || closable.composeSaveableStateHolder != composeStateHolder) {
                entry.uiClosable = ComposeUiClosable(composeStateHolder)
            }
        }
    }

    Box(modifier) {
        val currentSceneEntry by navigator.stackManager
            .currentSceneBackStackEntry.collectAsState(null)
        val prevSceneEntry by navigator.stackManager
            .prevSceneBackStackEntry.collectAsState(null)

        val actualSwipeProperties = currentSceneEntry?.swipeProperties ?: swipeProperties

        if (actualSwipeProperties == null) {
            currentSceneEntry?.let {
                AnimatedContent(it, transitionSpec = transitionSpec) { entry ->
                    NavHostContent(
                        composeStateHolder,
                        entry,
                        remember(navigator, entry, currentSceneEntry) {
                            SceneConfiguration(
                                isCurrent = entry === currentSceneEntry,
                                navigator = navigator
                            )
                        })
                }
            }
        } else {
            val scope = rememberCoroutineScope()

            var prevWasSwiped by remember {
                mutableStateOf<String?>(null)
            }


            LaunchedEffect(currentSceneEntry) {
                prevWasSwiped = null
            }

            currentSceneEntry?.let {
                AnimatedContent(
                    modifier = Modifier.fillMaxSize(),
                    targetState = it,
                    transitionSpec = {
                        if (prevWasSwiped != null)
                            EnterTransition.None with ExitTransition.None
                        else transitionSpec()
                    }
                ) { entry ->
                    val dismissState = key(currentSceneEntry) {
                        rememberDismissState {
                            if (it == DismissValue.DismissedToEnd) {
                                scope.launch {
                                    delay(250)
                                    prevWasSwiped = currentSceneEntry?.stateId
                                    navigator.goBack()
                                }
                            }
                            true
                        }
                    }
                    val showPrev by remember(dismissState) {
                        derivedStateOf {
                            dismissState.progress.fraction < 1
                        }
                    }

                    if (showPrev) {
                        prevSceneEntry?.let { prev ->
                            Box(
                                modifier = Modifier
                                    .graphicsLayer {
                                        translationX =
                                            actualSwipeProperties.slideInHorizontally(size.width.toInt())
                                                .toFloat() -
                                                    actualSwipeProperties.slideInHorizontally(
                                                        dismissState.offset.value.absoluteValue.toInt()
                                                    )
                                    }.drawWithContent {
                                        drawContent()
                                        drawRect(
                                            actualSwipeProperties.shadowColor,
                                            alpha = (1f - dismissState.progress.fraction)
                                        )
                                    }.pointerInput(0) {
                                        // prev entry should not be interactive until fully appeared
                                    }
                            ) {
                                NavHostContent(
                                    stateHolder = composeStateHolder,
                                    entry = prev,
                                    sceneConfiguration = remember(navigator) {
                                        SceneConfiguration(isCurrent = false, navigator = navigator)
                                    }
                                )
                            }
                        }
                    }

                    LaunchedEffect(dismissState.progress, prevWasSwiped) {
                        if (prevWasSwiped == null) {
                            navigator.internalSwipeProgress =
                                if (dismissState.offset.value < Float.MIN_VALUE)
                                    0f else dismissState.progress.fraction
                            navigator.internalSwipeOffset = dismissState.offset.value
                        }
                    }
                    CustomSwipeToDismiss(
                        state = dismissState,
                        spaceToSwipe = actualSwipeProperties.spaceToSwipe,
                        enabled = transition.isRunning.not() && prevSceneEntry != null,
                        dismissThreshold = actualSwipeProperties.swipeThreshold,
                    ) {
                        if (prevWasSwiped != entry.stateId) {
                            NavHostContent(
                                stateHolder = composeStateHolder,
                                entry = entry,
                                sceneConfiguration = remember(navigator) {
                                    SceneConfiguration(isCurrent = true, navigator = navigator)
                                }
                            )
                        }
                    }
                }
            }
        }
        val currentFloatingEntry by navigator.stackManager.currentFloatingBackStackEntry.collectAsState(
            null
        )
        currentFloatingEntry?.let {
            AnimatedContent(it, transitionSpec = transitionSpec) { entry ->
                NavHostContent(composeStateHolder, entry, sceneConfiguration = null)
            }
        }
    }
}

@Composable
private fun NavHostContent(
    stateHolder: SaveableStateHolder,
    entry: BackStackEntry,
    sceneConfiguration: SceneConfiguration?
) {

    DisposableEffect(entry) {
        entry.active()
        onDispose {
            entry.inActive()
        }
    }


    stateHolder.SaveableStateProvider(entry.stateId) {
        CompositionLocalProvider(
            LocalStateHolder provides entry.stateHolder,
            LocalLifecycleOwner provides entry,
            LocalSceneConfiguration provides sceneConfiguration
        ) {
            (entry.route as? ComposeRoute)?.content?.invoke(entry)
        }
    }
}

@Composable
@ExperimentalMaterialApi
private fun CustomSwipeToDismiss(
    state: DismissState,
    enabled: Boolean = true,
    spaceToSwipe: Dp = 10.dp,
    modifier: Modifier = Modifier,
    dismissThreshold: ThresholdConfig,
    dismissContent: @Composable () -> Unit
) = BoxWithConstraints(modifier) {

    val width = constraints.maxWidth.toFloat()
    val isRtl = LocalLayoutDirection.current == LayoutDirection.Rtl

    val anchors = mutableMapOf(
        0f to DismissValue.Default,
        width to DismissValue.DismissedToEnd
    )

    val shift = with(LocalDensity.current) {
        remember(this, width, spaceToSwipe) {
            (-width + spaceToSwipe.toPx().coerceIn(0f, width)).roundToInt()
        }
    }

    Box(
        modifier = Modifier.let {
            if (!enabled)
                it
            else
                it
                    .offset { IntOffset(x = shift, 0) }
                    .swipeable(
                        state = state,
                        anchors = anchors,
                        thresholds = { _, _ -> dismissThreshold },
                        orientation = Orientation.Horizontal,
                        enabled = state.currentValue == DismissValue.Default,
                        reverseDirection = isRtl,
                        resistance = ResistanceConfig(
                            basis = width,
                            factorAtMin = SwipeableDefaults.StiffResistanceFactor,
                            factorAtMax = SwipeableDefaults.StandardResistanceFactor
                        )
                    )
                    .offset { IntOffset(x = -shift, 0) }
                    .graphicsLayer { translationX = state.offset.value }
        }
    ) {
        dismissContent()
    }
}
