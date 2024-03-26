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

package io.github.alexzhirkevich.cupertino.adaptive

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue


/**
 * Scope for customizing [material] and [cupertino] specs of the widget.
 *
 * Custom adaptive widgets can be created using [AdaptiveWidget] composable with implemented [Adaptation]
 *
 * @see AdaptiveWidget
 * @see Adaptation
 * */
@Stable
@ExperimentalAdaptiveApi
sealed interface AdaptationScope<C,M> {

    /**
     * Customize properties that are exclusive for Cupertino widget or have different default value
     *
     * @param block customization block
     * */
    fun cupertino(block: @Composable C.() -> Unit)

    /**
     * Customize properties that are exclusive for Material widget or have different default value
     *
     * @param block customization block
     * */
    fun material(block: @Composable M.() -> Unit)
}



@Stable
@ExperimentalAdaptiveApi
abstract class Adaptation<C, M> : AdaptationScope<C,M> {

    private var cupertino: @Composable C.() -> Unit by mutableStateOf({})

    private var material: @Composable M.() -> Unit by mutableStateOf({})

    override fun cupertino(block: @Composable C.() -> Unit) {
        cupertino = block
    }

    override fun material(block: @Composable M.() -> Unit) {
        material = block
    }

    /**
     * Create and remember initial cupertino adaptation state
     * */
    @Composable
    protected abstract fun rememberCupertinoAdaptation(): C

    /**
     * Create and remember initial material adaptation state
     * */
    @Composable
    protected abstract fun rememberMaterialAdaptation(): M

    @Composable
    internal fun rememberUpdatedCupertinoAdaptation(): C {
        return key(cupertino) {
            rememberCupertinoAdaptation().apply { cupertino() }
        }
    }

    @Composable
    internal fun rememberUpdatedMaterialAdaptation(): M {
        return key(material) {
            rememberMaterialAdaptation().apply { material() }
        }
    }
}