package com.github.alexzhirkevich.lookandfeel.icons

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.rounded.ArrowBackIosNew
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import com.github.alexzhirkevich.lookandfeel.icons.cupertino.Gear
import com.github.alexzhirkevich.lookandfeel.icons.cupertino.Magnifyingglass
import com.github.alexzhirkevich.lookandfeel.icons.cupertino.SFSymbols
import com.github.alexzhirkevich.lookandfeel.theme.LookAndFeel
import com.github.alexzhirkevich.lookandfeel.theme.currentLookAndFeel

val Icons.Filled.AdaptiveArrowBack : ImageVector
    @Composable
    get() = when (currentLookAndFeel){
        LookAndFeel.Cupertino -> Icons.Rounded.ArrowBackIosNew
        else -> ArrowBack
    }

val Icons.Filled.AdaptiveSettings : ImageVector
    @Composable
    get() = when (currentLookAndFeel){
        LookAndFeel.Cupertino -> SFSymbols.Gear
        else -> Settings
    }

val Icons.Filled.AdaptiveSearch : ImageVector
    @Composable
    get() = when (currentLookAndFeel){
        LookAndFeel.Cupertino -> SFSymbols.Magnifyingglass
        else -> Search
    }