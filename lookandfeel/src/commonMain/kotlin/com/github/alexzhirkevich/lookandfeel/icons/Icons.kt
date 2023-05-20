package com.github.alexzhirkevich.lookandfeel.icons

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ContentCopy
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.DeleteOutline
import androidx.compose.material.icons.filled.Download
import androidx.compose.material.icons.filled.IosShare
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.rounded.ArrowBackIosNew
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import com.github.alexzhirkevich.lookandfeel.icons.cupertino.DocOnDoc
import com.github.alexzhirkevich.lookandfeel.icons.cupertino.Gear
import com.github.alexzhirkevich.lookandfeel.icons.cupertino.Magnifyingglass
import com.github.alexzhirkevich.lookandfeel.icons.cupertino.SFSymbols
import com.github.alexzhirkevich.lookandfeel.icons.cupertino.SquareAndArrowDown
import com.github.alexzhirkevich.lookandfeel.icons.cupertino.Trash
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

val Icons.Filled.AdaptiveShare : ImageVector
    @Composable
    get() = when (currentLookAndFeel){
        LookAndFeel.Cupertino -> IosShare
        else -> Share
    }

val Icons.Filled.AdaptiveDownload : ImageVector
    @Composable
    get() = when (currentLookAndFeel){
        LookAndFeel.Cupertino -> SFSymbols.SquareAndArrowDown
        else -> Download
    }
val Icons.Filled.AdaptiveDelete : ImageVector
    @Composable
    get() = when (currentLookAndFeel){
        LookAndFeel.Cupertino -> SFSymbols.Trash
        else -> DeleteOutline
    }

val Icons.Filled.AdaptiveCopy : ImageVector
    @Composable
    get() = when (currentLookAndFeel){
        LookAndFeel.Cupertino -> SFSymbols.DocOnDoc
        else -> ContentCopy
    }