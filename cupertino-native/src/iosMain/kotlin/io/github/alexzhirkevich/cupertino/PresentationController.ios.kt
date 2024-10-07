/*
 * Copyright (c) 2023-2024. Compose Cupertino project and open source contributors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package io.github.alexzhirkevich.cupertino

import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.interop.LocalUIViewController
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import platform.UIKit.UIPresentationController
import platform.UIKit.UIViewController
import platform.UIKit.UIViewControllerAnimatedTransitioningProtocol
import platform.UIKit.UIViewControllerInteractiveTransitioningProtocol
import platform.UIKit.UIViewControllerTransitioningDelegateProtocol
import platform.UIKit.transitioningDelegate
import platform.darwin.NSObject
import platform.darwin.NSUInteger

private val EmptyTransitioningDelegate = object
    : NSObject(), UIViewControllerTransitioningDelegateProtocol {

    override fun hash(): NSUInteger {
        return 123u
    }
}

@Suppress("UNUSED")
private class ControllerHolder<T : UIViewController>(
    val controller : T,
    val transitioningDelegateProtocol: UIViewControllerTransitioningDelegateProtocol
)


@Composable
internal fun <T : UIViewController> PresentationController(
    factory : () -> T,
    update : T.() -> Unit,
    onDismissRequest: () -> Unit,
    vararg updateKeys : Any?
) {
    val dark = CupertinoTheme.colorScheme.isDark

    val updatedOnDismissRequest by rememberUpdatedState(onDismissRequest)

    val tController = remember { factory() }

    val currentDelegate = tController.transitioningDelegate
        ?: EmptyTransitioningDelegate

    val delegate = remember(currentDelegate) {
        object : NSObject(), UIViewControllerTransitioningDelegateProtocol {

            override fun animationControllerForPresentedController(
                presented: UIViewController,
                presentingController: UIViewController,
                sourceController: UIViewController
            ): UIViewControllerAnimatedTransitioningProtocol? {
                return currentDelegate
                    .animationControllerForPresentedController(presented, presentingController, sourceController)
            }

            override fun interactionControllerForPresentation(animator: UIViewControllerAnimatedTransitioningProtocol): UIViewControllerInteractiveTransitioningProtocol? {
                return currentDelegate.interactionControllerForPresentation(animator)
            }

            override fun presentationControllerForPresentedViewController(
                presented: UIViewController,
                presentingViewController: UIViewController?,
                sourceViewController: UIViewController
            ): UIPresentationController? {
                return currentDelegate.presentationControllerForPresentedViewController(
                    presented,
                    presentingViewController,
                    sourceViewController
                )
            }
            override fun animationControllerForDismissedController(
                dismissed: UIViewController
            ): UIViewControllerAnimatedTransitioningProtocol? {
                updatedOnDismissRequest()
                return currentDelegate.animationControllerForDismissedController(dismissed)
            }

            override fun hash(): NSUInteger {
                return 1u
            }
        }
    }

    val controllerHolder = remember {

        tController.transitioningDelegate = delegate

        ControllerHolder(tController, delegate)
    }

    val controller = LocalUIViewController.current

    LaunchedEffect(controllerHolder.controller, dark, *updateKeys) {
        controllerHolder.controller.applyTheme(dark)
        update(controllerHolder.controller)
    }

    DisposableEffect(controller) {
        controller.presentViewController(controllerHolder.controller, true) {
        }
        onDispose {
            if (controller.presentedViewController == controllerHolder.controller) {
                controller.dismissViewControllerAnimated(true, null)
            }
        }
    }
}
