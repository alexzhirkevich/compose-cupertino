package com.github.alexzhirkevich.lookandfeel.app

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ProvidedValue
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalHapticFeedback
import com.github.alexzhirkevich.lookandfeel.components.cupertino.ContextMenuContainer
import com.github.alexzhirkevich.lookandfeel.theme.ApplicationTheme
import com.github.alexzhirkevich.lookandfeel.theme.LocalPlatformConfiguration
import com.github.alexzhirkevich.lookandfeel.theme.LookAndFeel
import com.github.alexzhirkevich.lookandfeel.theme.PlatformConfiguration
import com.github.alexzhirkevich.lookandfeel.theme.cupertino
import com.github.alexzhirkevich.lookandfeel.util.rememberHapticFeedback
import moe.tlaster.precompose.lifecycle.LifecycleOwner
import moe.tlaster.precompose.lifecycle.LifecycleRegistry
import moe.tlaster.precompose.lifecycle.LocalLifecycleOwner
import moe.tlaster.precompose.stateholder.LocalStateHolder
import moe.tlaster.precompose.stateholder.StateHolder
import moe.tlaster.precompose.ui.BackDispatcher
import moe.tlaster.precompose.ui.BackDispatcherOwner
import moe.tlaster.precompose.ui.LocalBackDispatcherOwner

internal expect val platformLookAndFeel : LookAndFeel


/**
 * Native look application
 * */
@Composable
fun AdaptiveApplication(
    darkMode : Boolean = isSystemInDarkTheme(),
    materialTheme : ApplicationTheme = ApplicationTheme(
        MaterialTheme.colorScheme,
        MaterialTheme.shapes,
        MaterialTheme.typography
    ),
    cupertinoTheme : ApplicationTheme = remember(materialTheme, darkMode) {
        materialTheme.copy(
            colorScheme = materialTheme.colorScheme.cupertino(darkMode),
            typography = materialTheme.typography.cupertino()
        )
    },
    platformHaptics : Boolean = true,
    content : @Composable () -> Unit
){
    CompositionLocalProvider(
        LocalPlatformConfiguration provides remember(darkMode, materialTheme, cupertinoTheme, platformHaptics){
            PlatformConfiguration(
                platformHaptics = platformHaptics,
                darkMode = darkMode,
                lookAndFeel = platformLookAndFeel,
                materialTheme = materialTheme,
                cupertinoTheme = cupertinoTheme
            )
        },
        LocalHapticFeedback provides rememberHapticFeedback(),
        *ApplicationCompositionLocals
    ) {
        ProvideLookAndFeel(platformLookAndFeel){
            ContextMenuContainer(content)
        }
    }
}

@Composable
internal fun ApplicationFromConfig(
    configuration: PlatformConfiguration,
    content: @Composable () -> Unit
){
    AdaptiveApplication(
        darkMode = configuration.darkMode,
        materialTheme = configuration.materialTheme,
        cupertinoTheme = configuration.cupertinoTheme,
        platformHaptics = configuration.platformHaptics,
        content = content
    )
}


internal val ApplicationCompositionLocals :  Array<ProvidedValue<*>>
    @Composable get() {
        val holder = remember { WindowHolder() }
        return arrayOf(
            LocalLifecycleOwner provides holder,
            LocalStateHolder provides holder.stateHolder,
            LocalBackDispatcherOwner provides holder,
            LocalHapticFeedback provides rememberHapticFeedback()
        )
    }

@Composable
fun ProvideLookAndFeel(lookAndFeel: LookAndFeel, content: @Composable () -> Unit) {
    when(lookAndFeel){
        LookAndFeel.Cupertino -> ProvideCupertinoLookAndFeel(content)
        else -> ProvideMaterial3LookAndFeel(content)
    }
}

private class WindowHolder : LifecycleOwner, BackDispatcherOwner {
    override val lifecycle by lazy {
        LifecycleRegistry()
    }
    val stateHolder by lazy {
        StateHolder()
    }
    override val backDispatcher by lazy {
        BackDispatcher()
    }
}
