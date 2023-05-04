package com.github.alexzhirkevich.lookandfeel.icons

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import com.github.alexzhirkevich.lookandfeel.icons.cupertino.SFSymbols
import com.github.alexzhirkevich.lookandfeel.icons.cupertino.myiconpack.Gear
import com.github.alexzhirkevich.lookandfeel.theme.LocalPlatformConfiguration
import com.github.alexzhirkevich.lookandfeel.theme.PlatformTheme

val Icons.Filled.AdaptiveArrowBack : ImageVector
    @Composable
    get() = when (LocalPlatformConfiguration.current?.theme){
        PlatformTheme.Cupertino -> ArrowBackIosNew
        else -> ArrowBack
    }

val Icons.Filled.AdaptiveSettings : ImageVector
    @Composable
    get() = when (LocalPlatformConfiguration.current?.theme){
        PlatformTheme.Cupertino -> SFSymbols.Gear
        else -> Settings
    }