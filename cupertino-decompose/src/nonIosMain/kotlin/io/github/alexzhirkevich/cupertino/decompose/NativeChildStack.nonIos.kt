///*
// * Copyright (c) 2023 Compose Cupertino project and open source contributors.
// *
// * Licensed under the Apache License, Version 2.0 (the "License");
// * you may not use this file except in compliance with the License.
// * You may obtain a copy of the License at
// *
// *     http://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS,
// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// * See the License for the specific language governing permissions and
// * limitations under the License.
// */
//
//package io.github.alexzhirkevich.cupertino.decompose
//
//import com.arkivanov.decompose.ComponentContext
//import com.arkivanov.decompose.router.stack.ChildStack
//import com.arkivanov.decompose.router.stack.childStack
//import com.arkivanov.decompose.value.Value
//import kotlinx.serialization.KSerializer
//
//@Suppress("ACTUAL_TYPE_ALIAS_TO_CLASS_WITH_DECLARATION_SITE_VARIANCE")
//actual typealias NativeChildStack<C, T> = ChildStack<C,T>
//
//actual fun <C : Any, T : Any> ComponentContext.nativeChildStack(
//    source: NativeStackNavigationSource<C>,
//    serializer: KSerializer<C>?,
//    initialStack: () -> List<C>,
//    key: String,
//    handleBackButton: Boolean,
//    childFactory: (configuration: C, ComponentContext) -> T,
//): Value<ChildStack<C, T>> =
//    childStack(
//        source = source,
//        serializer = serializer,
//        initialStack = initialStack,
//        key = key,
//        handleBackButton = handleBackButton,
//        childFactory = childFactory
//    )
