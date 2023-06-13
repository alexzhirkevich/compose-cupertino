package com.github.alexzhirkevich.lookandfeel.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.interop.LocalUIViewController
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import platform.CoreGraphics.CGPointMake
import platform.CoreGraphics.CGRectMake
import platform.CoreGraphics.CGSizeMake
import platform.UIKit.UIApplication
import platform.UIKit.UIScrollView
import platform.UIKit.UIScrollViewDelegateProtocol
import platform.UIKit.UIViewController
import platform.UIKit.statusBarManager
import platform.darwin.NSObject


actual object PlatformEvents {

    private val statusBarManager by lazy {
        UIApplication.sharedApplication.keyWindow?.windowScene?.statusBarManager
    }

    internal val statusBarTaps = MutableSharedFlow<Int>()

    private val scrollView = UIScrollView().apply {
        delegate = object : NSObject(), UIScrollViewDelegateProtocol {
            override fun scrollViewShouldScrollToTop(scrollView: UIScrollView): Boolean {
                return false
            }
        }
    }

    private val mutex = Mutex()

    @Composable
    actual fun OnStatusBarClicked(block: () -> Unit) {
        val controller = LocalUIViewController.current
        LaunchedEffect(block) {

            mutex.withLock {
                if (scrollView.superview != controller.view) {
                    initializeStatusBarClickedEvent(controller)
                }
            }

            statusBarTaps.collect {
                block()
            }
        }
    }

    private fun initializeStatusBarClickedEvent(controller: UIViewController){
        scrollView.setBounds(CGRectMake(0.0,0.0, 10.0, 300.0))
        scrollView.setContentSize(CGSizeMake(0.0,3000.0))
        scrollView.setContentOffset(CGPointMake(0.0,50.0))
        controller.view.insertSubview(scrollView,0)
    }
}
