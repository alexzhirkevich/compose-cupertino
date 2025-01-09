/*
 * Copyright (c) 2023-2024. Compose Cupertino project and open source contributors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package io.myapplication

import App
import DefaultRootComponent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.arkivanov.decompose.defaultComponentContext
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.myapplication.ui.components.CupertinoSegmentedControl
import io.myapplication.ui.components.CupertinoDatePicker
import io.myapplication.ui.components.CupertinoActionSheet
import io.myapplication.ui.theme.CupertinoTheme
import kotlinx.datetime.LocalDate
import kotlinx.datetime.toLocalDate

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        val context = defaultComponentContext()
        val component = DefaultRootComponent(context)
        setContent {
            CupertinoTheme {
                App(component)
            }
        }
    }
}

@Composable
fun App(rootComponent: DefaultRootComponent) {
    var selectedSegment by remember { mutableStateOf("Option 1") }
    var selectedDate by remember { mutableStateOf(LocalDate.parse("2023-01-01")) }
    var showActionSheet by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Cupertino Segmented Control
        CupertinoSegmentedControl(
            options = listOf("Option 1", "Option 2", "Option 3"),
            selectedOption = selectedSegment,
            onOptionSelected = { selectedSegment = it }
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Cupertino Date Picker
        CupertinoDatePicker(
            initialDate = selectedDate,
            onDateChange = { selectedDate = it }
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text("Selected Date: $selectedDate")

        Spacer(modifier = Modifier.height(16.dp))

        // Cupertino Action Sheet
        Button(onClick = { showActionSheet = true }) {
            Text("Show Action Sheet")
        }
        if (showActionSheet) {
            CupertinoActionSheet(
                title = "Choose an Option",
                message = "Select one of the actions below:",
                options = listOf("Action 1", "Action 2", "Action 3"),
                cancelButtonText = "Cancel",
                onOptionSelected = {
                    println("Selected: $it")
                    showActionSheet = false
                },
                onDismiss = { showActionSheet = false }
            )
        }
    }
}
