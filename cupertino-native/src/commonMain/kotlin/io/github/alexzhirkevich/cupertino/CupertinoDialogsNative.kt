package io.github.alexzhirkevich.cupertino

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.window.DialogProperties
import io.github.alexzhirkevich.cupertino.theme.CupertinoColors
import io.github.alexzhirkevich.cupertino.theme.CupertinoTheme
import io.github.alexzhirkevich.cupertino.theme.systemGray7

/**
 * Native analog for the compose [CupertinoAlertDialog].
 *
 * @param onDismissRequest called when dialog is already dismissed. Must not be ignored
 * @param title alert dialog title
 * @param message alert dialog message
 * @param containerColor not used in native dialog
 * @param properties not used. To enable dismissOnClickOutside behavior
 * add an action with [AlertActionStyle.Cancel] that would receive a cancel callback.
 * @param buttonsOrientation not used. iOS automatically picks most suitable layout
 * based on buttons width and count
 * @param buttons actions builder block
 * */
@Composable
expect fun CupertinoAlertDialogNative(
    onDismissRequest : () -> Unit,
    title: String?,
    message: String? = null,
    containerColor : Color = CupertinoColors.systemGray7,
    properties: DialogProperties = DialogProperties(),
    buttonsOrientation: Orientation = Orientation.Horizontal,
    buttons : CupertinoNativeAlertDialogButtonsScope.() -> Unit
)


/**
 * Native analog for the compose [CupertinoActionSheet].
 *
 * @param onDismissRequest called when dialog is already dismissed. Must not be ignored
 * @param title alert dialog title
 * @param message alert dialog message
 * @param containerColor not used in native dialog
 * @param secondaryContainerColor not used in native dialog
 * @param properties not used. To enable dismissOnClickOutside behavior
 * add an action with [AlertActionStyle.Cancel] that would receive a cancel callback.
 * @param buttons actions builder block
 * */
@Composable
expect fun CupertinoActionSheetNative(
    onDismissRequest : () -> Unit,
    title : String? = null,
    message : String? = null,
    containerColor : Color = CupertinoTheme.colorScheme.secondarySystemGroupedBackground,
    secondaryContainerColor : Color = CupertinoTheme.colorScheme.tertiarySystemBackground,
    properties: DialogProperties = DialogProperties(),
    buttons : CupertinoNativeAlertDialogButtonsScope.() -> Unit
)


interface CupertinoNativeAlertDialogButtonsScope {

    /**
     * Alert controller button
     * */
    fun button(
        onClick : () -> Unit,
        style : AlertActionStyle = AlertActionStyle.Default,
        enabled : Boolean = true,
        title : String
    )
}




internal class CupertinoAlertDialogButtonNative(
    val onClick: () -> Unit,
    val style: AlertActionStyle,
    val enabled : Boolean,
    val title: String
)


internal fun CupertinoAlertDialogButtonsScope.fromNative(
    native : CupertinoNativeAlertDialogButtonsScope.() -> Unit
) {

    val buttons = mutableListOf<CupertinoAlertDialogButtonNative>()

    object : CupertinoNativeAlertDialogButtonsScope {
        override fun button(
            onClick: () -> Unit,
            style: AlertActionStyle,
            enabled : Boolean,
            title: String
        ) {
            buttons.add(
                CupertinoAlertDialogButtonNative(
                    onClick = onClick,
                    style = style,
                    title = title,
                    enabled = enabled
                )
            )
        }
    }.apply(native)

    buttons.forEach {
        button(
            onClick = it.onClick,
            style = it.style,
            enabled = it.enabled
        ) {
            CupertinoText(it.title)
        }
    }
}
