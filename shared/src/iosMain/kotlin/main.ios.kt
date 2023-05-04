@file:OptIn(InternalComposeApi::class, ExperimentalMaterial3Api::class)

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.ClipOp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.ContentDrawScope
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.clipPath
import androidx.compose.ui.interop.UIKitView
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.ComposeUIViewController
import kotlinx.cinterop.ObjCAction
import platform.CoreGraphics.CGRectMake
import platform.Foundation.NSSelectorFromString
import platform.UIKit.UIControlEventEditingChanged
import platform.UIKit.UIControlEventValueChanged
import platform.UIKit.UISwitch
import platform.UIKit.UITextField
import platform.darwin.dispatch_get_main_queue
import platform.darwin.dispatch_sync

actual fun getPlatformName(): String = "iOS"

class SomeObject {

    private var counter  = 0
    fun mutate(){
        counter++
    }

    fun doSomethingImmutable(){

    }
}

val someGlobalObject = SomeObject()

fun MainViewController() = ComposeUIViewController {

    App()

//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(50.dp),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//
//        val scrollState = rememberScrollState()
//
//        var enable by remember {
//            mutableStateOf(true)
//        }
//        var checked by remember {
//            mutableStateOf(false)
//        }
//        Box {
//            ComposeUIKitSwitch(
//                modifier = Modifier,
//                enabled = false,
//                checked = enable,
//                onCheckedChange = { enable = it }
//            )
//        }
//
//        ComposeUIKitSwitch(
//            modifier = Modifier,
//            enabled = enable,
//            checked = checked,
//            onCheckedChange = { checked = it }
//        )
//    }
}

@Composable
fun <T> Glassmorphism(
   state : T,
   glassPath : ContentDrawScope.() -> Path,
   content : @Composable (T) -> Unit
) {
    Box(modifier = Modifier
        .drawWithContent {
            clipPath(glassPath(), ClipOp.Difference) {
                (this as ContentDrawScope).drawContent()
            }
        }
        .blur(30.dp)
        .drawWithContent {
            clipPath(glassPath()) {
                (this as ContentDrawScope).drawContent()
                drawRect(Color.White.copy(alpha = .75f))
            }
        }
//        .blur(0.dp)
//        .drawWithContent {
//            clipPath(glassPath(), ClipOp.Difference) {
//                (this as ContentDrawScope).drawContent()
//            }
//        }
    ) {
        content(state)
    }
}
@Composable
fun ComposeUIKitSwitch(
    modifier : Modifier,
    enabled: Boolean,
    checked : Boolean,
    onCheckedChange : (Boolean) -> Unit
){
    UIKitView(
        modifier = modifier,
        factory = {
            object : UISwitch(CGRectMake(0.0, 0.0, 0.0, 0.0)) {
                @ObjCAction
                fun onChanged() {
                    onCheckedChange(on)
                }
            }.apply {
                addTarget(
                    target = this,
                    action = NSSelectorFromString(this::onChanged.name),
                    forControlEvents = UIControlEventValueChanged
                )
            }
        },
        update = {
            it.enabled = enabled
            it.setOn(checked, true)
        },
        onRelease = {
            it.removeTarget(
                target = it, action = NSSelectorFromString(it::onChanged.name),
                forControlEvents = UIControlEventValueChanged
            )
        }
    )
}
@Composable
fun ComposeUITextField2(value: String, onValueChange: (String) -> Unit, modifier: Modifier) {
    UIKitView(
        factory = {

            val textField = object : UITextField(CGRectMake(0.0, 0.0, 0.0, 0.0)) {
                @ObjCAction
                fun editingChanged() {
                    dispatch_sync(dispatch_get_main_queue()) {
                        onValueChange(text ?: "")
                    }
                }
            }
            textField.addTarget(
                target = textField,
                action = NSSelectorFromString(textField::editingChanged.name),
                forControlEvents = UIControlEventEditingChanged
            )
            textField
        },
        modifier = modifier,
        update = { textField ->
            textField.text = value
        },
        onRelease = { textField ->
            textField.removeTarget(
                target = textField,
                action = NSSelectorFromString(textField::editingChanged.name),
                forControlEvents = UIControlEventEditingChanged
            )
        },
    )
}
