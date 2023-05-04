import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
internal fun Section(
    title : String? = null,
    caption : String ? = null,
    content : @Composable ColumnScope.() -> Unit
) {

    val textColor = MaterialTheme.colorScheme.onBackground
        .copy(alpha = .5f)
    Column(modifier = Modifier.padding(
        horizontal = 24.dp,
        vertical = 12.dp
    )) {
        if (title != null){
            Text(
                modifier = Modifier.padding(start = 8.dp, bottom = 4.dp),
                text = title.uppercase(),
                style = MaterialTheme.typography.labelMedium,
                color = textColor
            )
        }
        androidx.compose.material3.Card {
            Column(modifier = Modifier.padding(8.dp)) {
                content()
            }
        }
        if (caption != null){
            Text(
                modifier = Modifier.padding(start = 8.dp, top = 4.dp),
                text = caption,
                style = MaterialTheme.typography.labelMedium,
                color = textColor
            )
        }
    }
}
