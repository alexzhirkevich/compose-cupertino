/*
 * Copyright (c) 2023 Compose Cupertino project and open source contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.alexzhirkevich.cupertino

import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.interop.LocalUIViewController
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import platform.UIKit.UIAdaptivePresentationControllerDelegateProtocol
import platform.UIKit.UIAlertController
import platform.UIKit.UIPresentationController
import platform.UIKit.UIViewController
import platform.UIKit.UIViewControllerAnimatedTransitioningProtocol
import platform.UIKit.UIViewControllerTransitioningDelegateProtocol
import platform.UIKit.presentationController
import platform.UIKit.transitioningDelegate
import platform.darwin.NSObject

private val EmptyTransitioningDelegate = object
    : NSObject(), UIViewControllerTransitioningDelegateProtocol {}
private val  EmptyPresentationDelegate = object
    : NSObject(), UIAdaptivePresentationControllerDelegateProtocol {}


@Composable
internal fun <T : UIViewController> PresentationController(
    factory : () -> T,
    update : T.() -> Unit,
    onDismissRequest: () -> Unit,
    vararg updateKeys : Any?
) {
    val dark = CupertinoTheme.colorScheme.isDark

    val presentController = remember {
        factory().apply {

            val currentTransitionDelegate = transitioningDelegate ?: EmptyTransitioningDelegate

            transitioningDelegate =
                object : NSObject(), UIViewControllerTransitioningDelegateProtocol by currentTransitionDelegate {

                    override fun animationControllerForDismissedController(
                        dismissed: UIViewController
                    ): UIViewControllerAnimatedTransitioningProtocol? {
                        onDismissRequest()
                        return currentTransitionDelegate.animationControllerForDismissedController(dismissed)
                    }
                }

            if (this !is UIAlertController){

                val currentPresentationDelegate = presentationController?.delegate ?: EmptyPresentationDelegate

                presentationController?.delegate =
                    object : NSObject(), UIAdaptivePresentationControllerDelegateProtocol by currentPresentationDelegate{
                        override fun presentationControllerShouldDismiss(presentationController: UIPresentationController): Boolean {
                            return true
                        }

                        override fun presentationControllerDidDismiss(presentationController: UIPresentationController) {
                            onDismissRequest()
                        }
                    }
            }
        }
    }

    val controller = LocalUIViewController.current

    LaunchedEffect(dark, *updateKeys) {
        presentController.applyTheme(dark)
        update(presentController)
    }

    DisposableEffect(controller) {
        controller.presentViewController(presentController, true) {
        }
        onDispose {
            if (controller.presentedViewController == presentController) {
                controller.dismissViewControllerAnimated(true, null)
            }
        }
    }
}