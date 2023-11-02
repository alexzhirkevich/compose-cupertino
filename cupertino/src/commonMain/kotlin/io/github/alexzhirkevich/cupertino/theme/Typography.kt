package io.github.alexzhirkevich.cupertino.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

//class Typography(
//    val largeTitle : TextStyle = TextStyle(
//        fontSize = 31.sp,
//        lineHeight = 38.sp
//    ),
//    val title1 : TextStyle= TextStyle(
//        fontSize = 25.sp,
//        lineHeight = 31.sp
//    ),
//    val title2 : TextStyle = TextStyle(
//        fontSize = 19.sp,
//        lineHeight = 24.sp
//    ),
//    val title3 : TextStyle = TextStyle(
//        fontSize = 17.sp,
//        lineHeight = 22.sp
//    ),
//    val headline : TextStyle = TextStyle(
//        fontSize = 14.sp,
//        lineHeight = 19.sp,
//        fontWeight = FontWeight.SemiBold
//    ),
//    val body : TextStyle = TextStyle(
//        fontSize = 14.sp,
//        lineHeight = 19.sp
//    ),
//    val callout : TextStyle = TextStyle(
//        fontSize = 13.sp,
//        lineHeight = 18.sp
//    ),
//    val subhead : TextStyle = TextStyle(
//        fontSize = 12.sp,
//        lineHeight = 16.sp
//    ),
//    val footnote : TextStyle = TextStyle(
//        fontSize = 12.sp,
//        lineHeight = 16.sp
//    ),
//    val caption1 : TextStyle = TextStyle(
//        fontSize = 11.sp,
//        lineHeight = 13.sp
//    ),
//    val caption2 : TextStyle = TextStyle(
//        fontSize = 11.sp,
//        lineHeight = 13.sp
//    ),
//)


class Typography(
    val largeTitle : TextStyle = TextStyle(
        fontSize = 34.sp,
        lineHeight = 41.sp
    ),
    val title1 : TextStyle= TextStyle(
        fontSize = 28.sp,
        lineHeight = 34.sp
    ),
    val title2 : TextStyle = TextStyle(
        fontSize = 22.sp,
        lineHeight = 28.sp
    ),
    val title3 : TextStyle = TextStyle(
        fontSize = 20.sp,
        lineHeight = 25.sp
    ),
    val headline : TextStyle = TextStyle(
        fontSize = 17.sp,
        lineHeight = 22.sp,
        fontWeight = FontWeight.SemiBold
    ),
    val body : TextStyle = TextStyle(
        fontSize = 17.sp,
        lineHeight = 22.sp
    ),
    val callout : TextStyle = TextStyle(
        fontSize = 16.sp,
        lineHeight = 21.sp
    ),
    val subhead : TextStyle = TextStyle(
        fontSize = 15.sp,
        lineHeight = 20.sp
    ),
    val footnote : TextStyle = TextStyle(
        fontSize = 13.sp,
        lineHeight = 18.sp
    ),
    val caption1 : TextStyle = TextStyle(
        fontSize = 12.sp,
        lineHeight = 16.sp
    ),
    val caption2 : TextStyle = TextStyle(
        fontSize = 11.sp,
        lineHeight = 13.sp
    ),
)

internal val LocalTypography = staticCompositionLocalOf { Typography() }
