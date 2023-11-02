//@file:OptIn(ExperimentalMaterialApi::class, ExperimentalMaterial3Api::class)
//
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.material.BackdropScaffoldDefaults
//import androidx.compose.material.BackdropValue
//import androidx.compose.material.Button
//import androidx.compose.material.ExperimentalMaterialApi
//import androidx.compose.material.rememberBackdropScaffoldState
//import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.rememberCoroutineScope
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import com.github.alexzhirkevich.lookandfeel.components.AdaptiveBackdropScaffold
//import com.github.alexzhirkevich.lookandfeel.components.AdaptiveTopAppBar
//import com.github.alexzhirkevich.lookandfeel.components.NavigateBackIcon
//import com.github.alexzhirkevich.lookandfeel.components.adaptiveAnimationSpec
//import com.github.alexzhirkevich.lookandfeel.theme.AdaptiveTheme
//import kotlinx.coroutines.launch
//
//@Composable
//fun BackdropScreen() {
//
//    val state = rememberBackdropScaffoldState(
//        BackdropValue.Revealed,
//        animationSpec = BackdropScaffoldDefaults.adaptiveAnimationSpec()
//    )
//    val scope = rememberCoroutineScope()
//
//    AdaptiveBackdropScaffold(
//        scaffoldState = state,
//        appBar = {
//            AdaptiveTopAppBar(
//                modifier = Modifier,
//                navigationIcon = {
//                    NavigateBackIcon{}
//                },
//                title = { Text("Backdrop Demo") },
//            )
//        },
//        backLayerContent = {
//            Column(
//                Modifier.fillMaxSize(),
//                horizontalAlignment = Alignment.CenterHorizontally,
//                verticalArrangement = Arrangement.Center,
//            ) {
//                Button(onClick = {
//                    scope.launch {
//                        state.conceal()
//                    }
//                }) {
//                    Text("Show front layer")
//                }
//            }
//        },
//        frontLayerContent = {
//            Box(Modifier.fillMaxSize()) {
//                Button(
//                    modifier = Modifier.align(Alignment.Center),
//                    onClick = {
//                        scope.launch {
//                            state.reveal()
//                        }
//                    },
//                ) {
//                    Text("Hide front layer")
//                }
//            }
//        },
//    )
//}
//
