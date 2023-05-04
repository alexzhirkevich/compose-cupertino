package com.github.alexzhirkevich.lookandfeel.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.layout.SubcomposeLayout
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.fastForEach
import androidx.compose.ui.util.fastSumBy
import com.github.alexzhirkevich.lookandfeel.theme.AdaptiveTheme

private val SectionVerticalPadding = 8.dp

@Composable
actual fun Section(
    modifier: Modifier,
    title: String?,
    caption: String?,
    content: @Composable ColumnScope.() -> Unit
) {
    val textColor = MaterialTheme.colorScheme.onBackground
        .copy(alpha = .5f)

    Column(
        modifier.padding(
            horizontal = 14.dp,
            vertical = 12.dp
        )
    ) {
        if (title != null) {
            Text(
                modifier = Modifier
                    .padding(start = 20.dp, bottom = 6.dp),
                text = title.uppercase(),
                style = MaterialTheme.typography.labelLarge,
                color = textColor
            )
        }
        Card {

            var starts by remember {
                mutableStateOf(emptyList<Int>())
            }

            val dividerColor = AdaptiveTheme.colorScheme.outlineVariant

            SubcomposeLayout(Modifier
                .padding(vertical = 8.dp)
                .padding(start = 20.dp)
                .drawWithContent {
                    drawContent()
                    starts.forEach {
                        drawLine(
                            color = dividerColor,
                            start = Offset(0f, it.toFloat()),
                            end = Offset(size.width, it.toFloat()),
                            strokeWidth = .5.dp.toPx()
                        )
                    }
                }
                .padding(end = 20.dp)
            ) {

                val constraints = it.copy(minWidth = 0, minHeight = 0)

                val bodyPlaceables = subcompose(null) {
                    content()
                }.map { it.measure(constraints) }

                val totalHeight = bodyPlaceables
                    .fastSumBy { it.height } +
                        (bodyPlaceables.size - 1) * 2 * SectionVerticalPadding.roundToPx()

                layout(constraints.maxWidth, totalHeight){
                    var top = 0
                    starts = buildList {
                        bodyPlaceables.fastForEach {
                            it.place(0, top)
                            top += (it.height + (SectionVerticalPadding * 2).roundToPx())
                            add(top - SectionVerticalPadding.roundToPx())
                        }
                        removeLastOrNull()
                    }
                }
            }
//            Column(modifier = Modifier
//                .padding(vertical = 8.dp)
//                .padding(start = 20.dp)
//            ) {
//                content()
//            }
        }
        if (caption != null) {
            Text(
                modifier = Modifier
                    .padding(start = 20.dp, top = 6.dp),
                text = caption,
                style = MaterialTheme.typography.labelLarge,
                color = textColor
            )
        }
    }
}