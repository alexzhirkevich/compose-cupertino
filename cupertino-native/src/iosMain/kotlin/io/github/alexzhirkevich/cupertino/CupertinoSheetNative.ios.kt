///*
// * Copyright (c) 2023-2024 Compose Cupertino project and open source contributors.
// *
// * Licensed under the Apache License, Version 2.0 (the "License");
// * you may not use this file except in compliance with the License.
// * You may obtain a copy of the License at
// *
// *     http://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS,
// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// * See the License for the specific language governing permissions and
// * limitations under the License.
// */
//
//package io.github.alexzhirkevich.cupertino
//
//import androidx.compose.foundation.layout.Box
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.CompositionLocalProvider
//import androidx.compose.runtime.LaunchedEffect
//import androidx.compose.runtime.Stable
//import androidx.compose.runtime.currentCompositionLocalContext
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.key
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.rememberCoroutineScope
//import androidx.compose.runtime.rememberUpdatedState
//import androidx.compose.runtime.saveable.Saver
//import androidx.compose.runtime.saveable.rememberSaveable
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.interop.LocalUIViewController
//import androidx.compose.ui.platform.LocalDensity
//import androidx.compose.ui.semantics.SemanticsPropertyReceiver
//import androidx.compose.ui.semantics.collapse
//import androidx.compose.ui.semantics.expand
//import androidx.compose.ui.semantics.semantics
//import androidx.compose.ui.unit.Density
//import androidx.compose.ui.unit.Dp
//import androidx.compose.ui.window.ComposeUIViewController
//import kotlinx.cinterop.ExperimentalForeignApi
//import kotlinx.cinterop.useContents
//import kotlinx.coroutines.CoroutineScope
//import kotlinx.coroutines.launch
//import kotlinx.serialization.encodeToString
//import kotlinx.serialization.json.Json
//import platform.CoreGraphics.CGFloat
//import platform.UIKit.UIModalPresentationOverFullScreen
//import platform.UIKit.UIModalPresentationPageSheet
//import platform.UIKit.UIPresentationController
//import platform.UIKit.UISheetPresentationController
//import platform.UIKit.UISheetPresentationControllerDelegateProtocol
//import platform.UIKit.UISheetPresentationControllerDetent
//import platform.UIKit.UISheetPresentationControllerDetentIdentifier
//import platform.UIKit.UISheetPresentationControllerDetentIdentifierLarge
//import platform.UIKit.UISheetPresentationControllerDetentIdentifierMedium
//import platform.UIKit.UISheetPresentationControllerDetentResolutionContextProtocol
//import platform.UIKit.UITraitCollection
//import platform.UIKit.UIViewController
//import platform.UIKit.sheetPresentationController
//import platform.darwin.NSObject
//
//@Composable
//fun rememberCupertinoSheetNativeState(
//    initialValue: CupertinoSheetValue = CupertinoSheetValue.Hidden,
//    presentationStyle: PresentationStyle = PresentationStyle.Modal()
//) : NativeCupertinoSheetState {
//    return rememberSaveable(
////        presentationStyle,
//        saver = NativeCupertinoSheetState.Saver(presentationStyle)
//    ) {
//        NativeCupertinoSheetState(initialValue, presentationStyle)
//    }
//}
//
//@Composable
//@ExperimentalCupertinoApi
//fun CupertinoSheetNative(
//    state : NativeCupertinoSheetState = rememberCupertinoSheetNativeState(),
//    swipeEnabled : Boolean = true,
//    dragHandlerVisible : Boolean? = null,
//    cornerRadius: Dp? = null,
//    content : @Composable () -> Unit
//) {
//
//    val compositionLocalContext by rememberUpdatedState(currentCompositionLocalContext)
//    val updatedContent by rememberUpdatedState(content)
//
//    val contentController = LocalUIViewController.current
//
//    val height = contentController.sheetPresentationController.height(contentController)
//    val density = LocalDensity.current
//
//    val scope = rememberCoroutineScope()
//
//    val updatedSwipeEnabled by rememberUpdatedState(swipeEnabled)
//
//    LaunchedEffect(state, height) {
//        state.sortedDetents = (state.presentationStyle as? PresentationStyle.Modal)
//            ?.detents?.sortedBy { it.calculate(density, height) }?.toSet()
//    }
//
//
//    key(state) {
//        if (state.currentValue != CupertinoSheetValue.Hidden) {
//            PresentationController(
//                factory = {
//                    ComposeUIViewController {
//                        CompositionLocalProvider(
//                            context = compositionLocalContext,
//                            content = {
//                                Box(
//                                    modifier = Modifier
//                                        .semantics {
//                                            sheetSemantics(state, swipeEnabled, scope)
//                                        }
//                                ) {
//                                    updatedContent()
//                                }
//                            }
//                        )
//                    }.apply {
//
//                        sheetPresentationController?.delegate = SheetDelegate(
//                            state = state,
//                            contentController = contentController,
//                            sheetController = this,
//                            swipeEnabled = { updatedSwipeEnabled },
//                            onDismiss = {
//                                scope.launch {
//                                    state.hide()
//                                }
//                            }
//                        )
//
//                        setup(
//                            initial = true,
//                            grabberVisible = dragHandlerVisible,
//                            cornerRadius = cornerRadius,
//                            state = state,
//                        )
//                    }
//                },
//                update = {
//                    val block = {
//                        setup(
//                            initial = false,
//                            grabberVisible = dragHandlerVisible,
//                            cornerRadius = cornerRadius,
//                            state = state,
//                        )
//                    }
//                    sheetPresentationController?.animateChanges {
//                        block()
//                    } ?: block()
//                },
//                onDismissRequest = {
//                    scope.launch {
//                        state.hide()
//                    }
//                },
//                dragHandlerVisible, cornerRadius, state.currentValue, state.presentationStyle,
//            )
//        }
//    }
//}
//
//private class SheetDelegate(
//    private val state: NativeCupertinoSheetState,
//    private val contentController: UIViewController,
//    private val sheetController: UIViewController,
//    private val swipeEnabled: () -> Boolean,
//    private val onDismiss : () -> Unit
//) : NSObject(),
//    UISheetPresentationControllerDelegateProtocol,
//    UISheetPresentationControllerDetentResolutionContextProtocol {
//
//    override fun maximumDetentValue(): CGFloat {
//        return sheetController.sheetPresentationController
//            ?.height(contentController)?.toDouble() ?: 0.0
//    }
//
//    override fun containerTraitCollection(): UITraitCollection {
//        return sheetController.sheetPresentationController?.traitCollection
//            ?: contentController.traitCollection
//    }
//
//    override fun presentationControllerShouldDismiss(presentationController: UIPresentationController): Boolean {
//        return swipeEnabled()
//    }
//
//    override fun presentationControllerDidDismiss(presentationController: UIPresentationController) {
//        onDismiss()
//    }
//
//    override fun sheetPresentationControllerDidChangeSelectedDetentIdentifier(
//        sheetPresentationController: UISheetPresentationController
//    ) {
//
//        val delegate = this
//
//        sheetPresentationController.run {
//
//            val detentId = selectedDetentIdentifier
//
//            state.setValue(when {
//                detentId == null ->
//                    CupertinoSheetValue.Hidden
//
//                detents.size < 2 || (detents as List<UISheetPresentationControllerDetent>)
//                    .maxByOrNull { it.resolvedValueInContext(delegate) }?.identifier ==
//                        selectedDetentIdentifier
//                -> CupertinoSheetValue.Expanded
//
//                else -> CupertinoSheetValue.PartiallyExpanded(
//                    when (detentId) {
//                        UISheetPresentationControllerDetentIdentifierMedium -> PresentationDetent.Medium
//                        UISheetPresentationControllerDetentIdentifierLarge -> PresentationDetent.Large
//                        else -> Json.decodeFromString(detentId)
//                    }
//                )
//            })
//        }
//    }
//}
//
//@Stable
//class NativeCupertinoSheetState(
//    initialValue: CupertinoSheetValue = CupertinoSheetValue.Hidden,
//    internal val presentationStyle: PresentationStyle = PresentationStyle.Modal()
//) {
//
//    init {
//        require(
//            initialValue !is CupertinoSheetValue.PartiallyExpanded ||
//                   isValidDetent(initialValue.detent)
//        ) {
//            "initialValue must be presented in modal detents"
//        }
//    }
//
//    var currentValue by mutableStateOf(initialValue)
//        private set
//
//    internal fun setValue(value: CupertinoSheetValue){
//        currentValue = value
//    }
//
//    internal var sortedDetents by mutableStateOf(
//        (presentationStyle as? PresentationStyle.Modal)?.detents
//    )
//
//    suspend fun show() {
//
//        val minDetent = sortedDetents?.firstOrNull()
//
//        if (presentationStyle !is PresentationStyle.Modal ||
//            presentationStyle.detents.size == 1 ||
//            minDetent == null
//        ) {
//            expand()
//        } else {
//            currentValue = CupertinoSheetValue.PartiallyExpanded(minDetent)
//        }
//    }
//
//    suspend fun hide() {
//        currentValue = CupertinoSheetValue.Hidden
//    }
//
//    suspend fun partialExpand(detent: PresentationDetent) {
//        require(isValidDetent(detent)){
//            "Sheet can be partially expanded only in Modal presentation style with detents containing required detent"
//        }
//
//        if (sortedDetents?.lastOrNull() == detent)
//            expand()
//        else
//            currentValue = CupertinoSheetValue.PartiallyExpanded(detent)
//    }
//
//    suspend fun expand() {
//        currentValue = CupertinoSheetValue.Expanded
//    }
//
//    private fun isValidDetent(
//        detent: PresentationDetent
//    ) = (presentationStyle is PresentationStyle.Modal &&
//            presentationStyle.detents.any { it == detent })
//
//    companion object {
//        fun Saver(presentationStyle: PresentationStyle): Saver<NativeCupertinoSheetState, *> =
//            Saver(
//                save = {
//                    Json.encodeToString(it.currentValue)
//                },
//                restore = {
//                    NativeCupertinoSheetState(
//                        initialValue = Json.decodeFromString(it),
//                        presentationStyle = presentationStyle
//                    )
//                }
//            )
//    }
//
//}
//
//private fun SemanticsPropertyReceiver.sheetSemantics(
//    state: NativeCupertinoSheetState,
//    sheetSwipeEnabled: Boolean,
//    coroutineScope: CoroutineScope
//)  = with(state) {
//    if (presentationStyle is PresentationStyle.Modal && sheetSwipeEnabled) {
//
//        val cur = currentValue
//
//        if (cur !is CupertinoSheetValue.Expanded) {
//
//            val states = sortedDetents.orEmpty().toList()
//
//            val currentIdx = if (cur is CupertinoSheetValue.PartiallyExpanded)
//                states.indexOf(cur.detent)
//            else -1
//
//            val next = if (currentIdx == states.lastIndex || currentIdx + 1 !in states.indices)
//                CupertinoSheetValue.Expanded
//            else
//                CupertinoSheetValue.PartiallyExpanded(states[currentIdx + 1])
//
//            expand("Expand") {
//                coroutineScope.launch {
//                    if (next is CupertinoSheetValue.Expanded)
//                        expand()
//                    if (next is CupertinoSheetValue.PartiallyExpanded)
//                        partialExpand(next.detent)
//                }
//                true
//            }
//        }
//        if (cur !is CupertinoSheetValue.Hidden) {
//
//            val states = sortedDetents.orEmpty().toList()
//
//            val currentIdx = if (cur is CupertinoSheetValue.PartiallyExpanded)
//                states.indexOf(cur.detent)
//            else -1
//
//            val next = if (currentIdx <= 0 || currentIdx - 1 !in states.indices)
//                CupertinoSheetValue.Hidden
//            else CupertinoSheetValue.PartiallyExpanded(states[currentIdx - 1])
//
//            collapse("Collapse") {
//                coroutineScope.launch {
//                    if (next is CupertinoSheetValue.Hidden)
//                        hide()
//                    if (next is CupertinoSheetValue.PartiallyExpanded)
//                        partialExpand(next.detent)
//                }
//                true
//            }
//        }
//    }
//}
//
//@OptIn(ExperimentalForeignApi::class)
//private fun UISheetPresentationController?.height(parentController: UIViewController)=
//    (this?.containerView ?: parentController.view).frame.useContents { size.height.toFloat() }
//
//private fun UIViewController.setup(
//    initial: Boolean,
//    grabberVisible: Boolean?,
//    cornerRadius: Dp?,
//    state: NativeCupertinoSheetState,
//) {
//    if (initial) {
//        modalPresentationStyle = when (state.presentationStyle) {
//            is PresentationStyle.Modal -> UIModalPresentationPageSheet.also {
//                sheetPresentationController?.apply {
//                    detents = state.presentationStyle.detents
//                        .mapNotNull(PresentationDetent::toUIDetent)
//                }
//            }
//            is PresentationStyle.Fullscreen -> UIModalPresentationOverFullScreen
//        }
//    }
//
//    when (val pStyle = state.presentationStyle) {
//        is PresentationStyle.Modal -> {
//            sheetPresentationController?.apply {
//
//                if (grabberVisible != null) {
//                    prefersGrabberVisible = grabberVisible
//                }
//                if (cornerRadius != null) {
//                    preferredCornerRadius = cornerRadius.value.toDouble()
//                }
//
//                val sortedDetents = state.sortedDetents.orEmpty().toList()
//
//                selectedDetentIdentifier = when (val d = state.currentValue) {
//                    CupertinoSheetValue.Expanded -> {
//                        sortedDetents.lastOrNull()?.identifier
//                    }
//
//                    CupertinoSheetValue.Hidden -> null
//
//
//                    is CupertinoSheetValue.PartiallyExpanded -> d.detent.identifier
//                }
//
//                prefersScrollingExpandsWhenScrolledToEdge =
//                    pStyle.contentInteraction == PresentationContentInteraction.Scroll
//
//                sortedDetents.indexOfFirst {
//                    pStyle.isBackgroundInteractive(it)
//                }.takeIf { it >= 1 }.let {
//                    largestUndimmedDetentIdentifier = if (it != null)
//                        sortedDetents[it - 1].identifier
//                    else null
//                }
//            }
//        }
//        else -> {
//
//        }
//    }
//}
//
//private val PresentationDetent.identifier : UISheetPresentationControllerDetentIdentifier
//    get() = when (this) {
//        PresentationDetent.Large -> UISheetPresentationControllerDetentIdentifierLarge
//        PresentationDetent.Medium -> UISheetPresentationControllerDetentIdentifierMedium
//        else -> toString()
//    }
//
//
//private fun PresentationDetent.toUIDetent() : UISheetPresentationControllerDetent? {
//    return kotlin.runCatching {
//        when (this) {
//            PresentationDetent.Large -> UISheetPresentationControllerDetent.largeDetent()
//            PresentationDetent.Medium -> UISheetPresentationControllerDetent.mediumDetent()
//            else -> {
//                UISheetPresentationControllerDetent.customDetentWithIdentifier(identifier) {
//                    val max = requireNotNull(it?.maximumDetentValue)
//                    calculate(Density(1f, 1f), max.toFloat()).toDouble()
//                }
//            }
//        }
//    }.getOrNull()
//}