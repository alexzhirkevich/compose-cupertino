package com.github.alexzhirkevich.lookandfeel.components.cupertino

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.awaitFirstDown
import androidx.compose.foundation.gestures.drag
import androidx.compose.foundation.gestures.forEachGesture
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.BottomSheetValue
import androidx.compose.material.ModalBottomSheetLayout
import androidx.compose.material.ModalBottomSheetValue
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Palette
import androidx.compose.material.rememberBottomSheetState
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.clipRect
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.input.pointer.positionChange
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import com.github.alexzhirkevich.lookandfeel.components.CupertinoSectionDefaults
import com.github.alexzhirkevich.lookandfeel.components.DialogSheet
import com.github.alexzhirkevich.lookandfeel.theme.AdaptiveTheme
import com.github.alexzhirkevich.lookandfeel.util.LocalizedStrings
import com.github.alexzhirkevich.lookandfeel.util.imePadding
import com.github.alexzhirkevich.lookandfeel.util.isDark
import com.github.alexzhirkevich.lookandfeel.util.localized
import com.github.alexzhirkevich.lookandfeel.util.navigationBarsPadding
import kotlin.math.roundToInt



@Composable
fun CupertinoColorPickerButton(
    color: Color,
    onClick: () -> Unit
) {
    TODO("Not implemented")

}

/**
 * Compose color picker dialog in iOS style.
 *
 * To use UIKit color picker on iOS (14+) use [CupertinoColorPickerDialogNative].
 * This picker will be used for other platforms and iOS < 14
 * */
@ExperimentalAnimationApi
@Composable
fun CupertinoColorPickerDialog(
    color: Color,
    title: @Composable () -> Unit,
    onColorChanged : (Color) -> Unit,
    onDismissRequest : () -> Unit,
    supportOpacity : Boolean = true
) {

    LaunchedEffect(color) {
        onColorChanged(color)
    }

    DialogSheet(
        onDismissRequest = onDismissRequest,
    ) {
        Card {
            CupertinoColorPicker(
                title = title,
                modifier = Modifier
                    .fillMaxWidth()
                    .imePadding()
                    .navigationBarsPadding(),
                color = color,
                supportOpacity = supportOpacity,
                onColorChanged = {
                    onColorChanged(it)
                },
                onCloseClicked = onDismissRequest
            )
        }
    }
}

/**
 * Native iOS color picker sheet. Available for iOS 14+
 *
 * On other platforms and iOS < 14 [CupertinoColorPickerDialog] will be used
 * */
@Composable
expect fun CupertinoColorPickerDialogNative(
    color: Color,
    onColorChanged : (Color) -> Unit,
    onDismissRequest : () -> Unit,
    supportOpacity : Boolean = true
)



private val colorGrid = listOf(
    listOf(0xffffffff, 0xffebebeb, 0xffd6d6d6, 0xffc2c2c2, 0xffadadad, 0xff999999, 0xff858585, 0xff707070, 0xff5c5c5c, 0xff474747, 0xff333333, 0xff000000),
    listOf(0xff143648, 0xff081c54, 0xff0f0538, 0xff2a093b, 0xff370c1b, 0xff541107, 0xff532009, 0xff53350d, 0xff523e0f, 0xff65611b, 0xff505518, 0xff2b3d16),
    listOf(0xff1e4c63, 0xff102e76, 0xff180b4f, 0xff3f1256, 0xff4e1629, 0xff781e0e, 0xff722f10, 0xff734c16, 0xff73591a, 0xff8c8629, 0xff707625, 0xff3f5623),
    listOf(0xff2f6c8c, 0xff1941a3, 0xff280b72, 0xff591e78, 0xff6f223d, 0xffa62c17, 0xffa0461a, 0xffa06b23, 0xff9f7d28, 0xffc3bc3c, 0xff9da536, 0xff587934),
    listOf(0xff3d8ab0, 0xff2355ce, 0xff331b8e, 0xff702898, 0xff8d2e4f, 0xffd03a20, 0xffca5a24, 0xffc8872e, 0xffc99f35, 0xfff3ec4e, 0xffc6d147, 0xff729c44),
    listOf(0xff479fd3, 0xff285ff5, 0xff4724ab, 0xff8c33b6, 0xffaa395d, 0xffeb512e, 0xffed732e, 0xfff3af3d, 0xfff5c944, 0xfffefb67, 0xffddeb5c, 0xff86b953),
    listOf(0xff5ac4f7, 0xff4f85f6, 0xff5832e2, 0xffaf42eb, 0xffd44a7a, 0xffed6c59, 0xffef8c56, 0xfff3b757, 0xfff6cd5b, 0xfffef781, 0xffe6ef7a, 0xffa3d16e),
    listOf(0xff78d3f8, 0xff7fa6f8, 0xff7e52f5, 0xffc45ff6, 0xffde789d, 0xfff09286, 0xfff2a984, 0xfff6c983, 0xfff9da85, 0xfffef9a1, 0xffebf29b, 0xffbadc94),
    listOf(0xffa5e1fa, 0xffadc5fa, 0xffab8df7, 0xffd595f6, 0xffe7a7bf, 0xfff4b8b1, 0xfff6c7af, 0xfff9daae, 0xfffae5af, 0xfffefbc0, 0xfff3f7be, 0xffd2e7ba),
    listOf(0xffd2effd, 0xffd6e1fc, 0xffd6c9fa, 0xffe9cbfb, 0xfff3d4df, 0xfff9dcd9, 0xfffae3d8, 0xfffcedd7, 0xfffdf3d8, 0xfffefce0, 0xfff8fade, 0xffe2edd6)
).map {
    it.map(::Color)
}

@Composable
internal fun ColorPickerTitle(
    modifier: Modifier = Modifier,
    title : @Composable () -> Unit,
    icon : ImageVector,
    onCloseClicked : () -> Unit
) {
    Row(
        modifier = modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Icon(
            modifier = Modifier.weight(.1f),
            imageVector = icon,
            contentDescription = null
        )

        Box(Modifier.weight(.8f)) {
            ProvideTextStyle(
                AdaptiveTheme.typography.bodyLarge.copy(
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Normal
                )
            ) {
                title()
            }
        }

        IconButton(
            onClick = onCloseClicked,
            modifier = Modifier.weight(.1f),
        ) {
            Icon(
                imageVector = Icons.Default.Close,
                contentDescription = LocalizedStrings.Cancel.localized()
            )
        }
    }
}


/**
 * Color picker similar to native. Does not have Specter picker. Only grid and sliders.
 * */
@Composable
fun CupertinoColorPicker(
    color: Color,
    onColorChanged: (Color) -> Unit,
    onCloseClicked: () -> Unit,
    modifier: Modifier = Modifier,
    title: @Composable () -> Unit = {
        ColorPickerTitle(
            title = {
                Text("Colors")
            },
            icon = Icons.Default.Palette,
            onCloseClicked = onCloseClicked
        )
    },
    supportOpacity : Boolean = true,
    opacity : String = "Opacity",
    grid : String = "Grid",
    sliders : String = "Sliders",
) {

    val updatedColor by rememberUpdatedState(color)

    Column(
        modifier = modifier
            .padding(CupertinoSectionDefaults.paddingValues)
    ) {

        title()

        var typeIndex by rememberSaveable() {
            mutableStateOf(0)
        }

        CupertinoSlidingSegmentedControl(
            selectedTabIndex = typeIndex,
            modifier = Modifier
                .padding(
                    top = CupertinoSectionDefaults.paddingValues.calculateTopPadding(),
                    bottom = CupertinoSectionDefaults.paddingValues.calculateBottomPadding()
                )
        ) {
            CupertinoSlidingSegmentedControlTab(
                isSelected = typeIndex == 0,
                onClick = {
                    typeIndex = 0
                },
                modifier = it,
                title = {
                    Text(sliders)
                }
            )
            CupertinoSlidingSegmentedControlTab(
                isSelected = typeIndex == 1,
                onClick = {
                    typeIndex = 1
                },
                modifier = it,
                title = {
                    Text(grid)
                }
            )
        }

        BoxWithConstraints(
            modifier.fillMaxWidth()
        ) {
            val height = LocalDensity.current.run {
                (constraints.maxWidth / colorGrid.first().size * colorGrid.size).toDp()
            }

            when (typeIndex) {
                0 -> ColorGrid(
                    modifier = Modifier
                        .height(height)
                        .fillMaxWidth()
                        .clip(MaterialTheme.shapes.medium),
                    onColorSelected = onColorChanged,
                    selectedColor = color,
                    colors = colorGrid,
                )

                1 -> ColorSliders(
                    modifier = Modifier
                        .height(height),
                    color = color,
                    onColorChanged = onColorChanged
                )
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
//
        if (supportOpacity) {
            NamedColorSlider(
                title = opacity,
                value = color.alpha,
                sliderColor = color.copy(alpha = 1f),
                sliderModifier = Modifier
                    .clip(CircleShape)
//                    .alphaSliderBackground(color.copy(alpha = 1f)),
            ) {
                onColorChanged(updatedColor.copy(alpha = it))
            }
            Spacer(modifier = Modifier.height(16.dp))
        }
        CupertinoDivider()

        Spacer(modifier = Modifier.height(16.dp))

        Box(
            modifier = Modifier
                .clip(MaterialTheme.shapes.medium)
                .drawBehind {
                    clipRect {
                        rotate(-45f) {
                            translate(-size.width / 2, -size.height / 2) {
                                drawRect(Color.Black, size = size.copy(width = size.width * 2))
                            }
                            translate(size.width / 2, size.height / 2) {
                                drawRect(Color.White, size = size.copy(width = size.width * 2))
                            }
                        }
                    }
                }
        ) {
            Box(
                Modifier.size(75.dp)
                    .background(color)

            )
        }
    }
}



@Composable
internal fun ColorSliders(
    modifier: Modifier = Modifier,
    red : String = "Red",
    green : String = "Green",
    blue : String = "Blue",
    color : Color,
    onColorChanged : (Color) -> Unit,
) {

    val updatedColor by rememberUpdatedState(color)

    Column(modifier) {
        NamedColorSlider(
            title = red,
            value = color.red,
            sliderColor = color.copy(alpha = 1f),
            sliderModifier = Modifier
                .clip(CircleShape)
                .background(
                    Brush.horizontalGradient(
                        0f to color.copy(red = 0f, alpha = 1f),
                        1f to color.copy(red = 1f, alpha = 1f),
                    )
                )
        ) {
            onColorChanged(updatedColor.copy(red = it))
        }


        Spacer(modifier = Modifier.height(16.dp))

        NamedColorSlider(
            title = green,
            value = color.green,
            sliderColor = color.copy(alpha = 1f),
            sliderModifier = Modifier
                .clip(CircleShape)
                .background(
                    Brush.horizontalGradient(
                        0f to color.copy(green = 0f, alpha = 1f),
                        1f to color.copy(green = 1f, alpha = 1f),
                    )
                )
        ) {
//            println(color)
            onColorChanged(updatedColor.copy(green = it))
        }

        Spacer(modifier = Modifier.height(16.dp))

        NamedColorSlider(
            title = blue,
            value = color.blue,
            sliderColor = color.copy(alpha = 1f),
            sliderModifier = Modifier
                .clip(CircleShape)
                .background(
                    Brush.horizontalGradient(
                        0f to color.copy(blue = 0f, alpha = 1f),
                        1f to color.copy(blue = 1f, alpha = 1f),
                    )
                )
        ) {
//            println(color)
            onColorChanged(updatedColor.copy(blue = it))
        }
    }
}

@Composable
internal fun NamedColorSlider(
    title : String,
    modifier: Modifier = Modifier,
    sliderModifier: Modifier = Modifier,
    sliderColor : Color,
    value : Float,
    onChange : (Float) -> Unit,
) {
    Column(modifier) {

        Text(
            text = title,
            color = Color.Gray
        )

        Spacer(modifier = Modifier.height(6.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            ColorSlider(
                modifier = sliderModifier
                    .weight(1f),
                sliderColor = sliderColor,
                value = value,
                onChange = onChange
            )
            Spacer(modifier = Modifier.width(16.dp))
            Box {
                if ((255 * value).roundToInt() == 0){
                    Text(
                        text = "0",
                        modifier = Modifier
                            .align(Alignment.CenterStart)
                            .padding(start = 8.dp)
                    )
                }
                BasicTextField(
                    modifier = Modifier
                        .width(50.dp)
                        .border(1.dp, Color.Gray, MaterialTheme.shapes.small)
                        .padding(vertical = 4.dp, horizontal = 8.dp),
                    textStyle = LocalTextStyle.current.copy(
                        color = MaterialTheme.colorScheme.onBackground
                    ),
                    value = (255 * value)
                        .roundToInt()
                        .takeIf { it != 0 }
                        ?.toString()
                        .orEmpty(),
                    singleLine = true,
                    maxLines = 1,
                    onValueChange = {
                        onChange(
                            (it.filter(Char::isDigit).toIntOrNull()?.coerceIn(0, 255) ?: 0) / 255f
                        )
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    )
                )
            }
        }
    }
}

@Composable
internal fun ColorSlider(
    modifier: Modifier = Modifier,
    sliderColor : Color,
    value : Float,
    onChange : (Float) -> Unit,
) {
    var width by remember {
        mutableStateOf(0)
    }


    Box(
        modifier = modifier
            .fillMaxWidth()
            .onGloballyPositioned {
                width = it.size.width
            }
            .pointerInput(null) {
                forEachGesture {
                    awaitPointerEventScope {
                        val down = awaitFirstDown()

                        onChange(
                            (down.position.x / size.width.toFloat())
                                .coerceIn(0f, 1f)
                        )

                        drag(down.id) { change ->

                            if (change.positionChange() != Offset.Zero)
                                change.consume()

                            onChange(
                                (change.position.x / size.width.toFloat())
                                    .coerceIn(0f, 1f)
                            )
                        }
                    }
                }
            }
            .height(36.dp)

    ) {
        Card(
            shape = CircleShape,
            colors = CardDefaults.cardColors(containerColor = sliderColor),
            border = BorderStroke(
                width = 3.dp,
                color = Color.White
            ),
            modifier = Modifier
                .size(34.dp)
                .offset {
                    IntOffset(
                        x = (value * (width - 32.dp.roundToPx())).roundToInt(),
                        y = 1.dp.roundToPx()
                    )
                }
        ) {
        }
    }
}


@Composable
internal fun ColorGrid(
    modifier: Modifier = Modifier,
    selectedColor : Color,
    onColorSelected : (Color) -> Unit,
    colors : List<List<Color>>
) {

    val updatedColor by rememberUpdatedState(selectedColor)

    with(LocalDensity.current) {
        BoxWithConstraints {
            val cellSize = (constraints.maxWidth / colors.first().size).toDp()

            Column(
                modifier = modifier
            ){
                colors.forEach { row ->
                    Row {
                        row.forEach { color ->
                            Spacer(
                                modifier = Modifier
                                    .size(cellSize)
                                    .background(color)
                                    .clickable {
                                        onColorSelected(
                                            color.copy(alpha = updatedColor.alpha)
                                        )
                                    }
                                    .let {
                                        if (updatedColor.red == color.red &&
                                            updatedColor.green == color.green &&
                                            updatedColor.blue == color.blue
                                        ) {
                                            it.border(
                                                width = 3.dp,
                                                color = Color.White,
                                            )
                                        } else it
                                    }
                            )
                        }
                    }
                }
            }
        }
    }
}

internal fun Modifier.alphaSliderBackground(
    color : Color,
    rows : Int = 3,
) = composed {
    val isLightTheme = isDark.not()
    drawBehind {
        clipRect {
            val color1 = if (isLightTheme) Color.LightGray else Color.DarkGray
            val color2 = if (isLightTheme) Color.White else Color.Black

            val cellsize = this.size.height / rows
            for (i in 0 until rows) {
                for (j in 0..(size.width / cellsize).toInt() + 1) {
                    drawRect(
                        color = if (i % 2 == j % 2) color1 else color2,
                        topLeft = Offset(j * cellsize, i * cellsize)
                    )
                }
            }
            drawRect(Brush.horizontalGradient(
                0f to Color.Transparent,
                1f to color
            ))
        }
    }
}

