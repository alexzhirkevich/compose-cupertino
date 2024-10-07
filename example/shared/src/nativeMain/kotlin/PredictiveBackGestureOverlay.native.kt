import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.decompose.extensions.compose.stack.animation.predictiveback.PredictiveBackGestureOverlay
import com.arkivanov.essenty.backhandler.BackDispatcher

@ExperimentalDecomposeApi
@Composable
actual fun ActualPredictiveBackGestureOverlay(
    backDispatcher: BackDispatcher,
    modifier: Modifier,
    content: @Composable () -> Unit,
) {
    PredictiveBackGestureOverlay(
        backDispatcher = backDispatcher,
        backIcon = null,
        modifier = modifier,
        endEdgeEnabled = false,
        content = content,
        activationOffsetThreshold = 4.dp,
    )
}