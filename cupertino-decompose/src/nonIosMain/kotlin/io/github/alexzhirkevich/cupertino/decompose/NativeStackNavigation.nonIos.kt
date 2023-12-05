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
//import com.arkivanov.decompose.router.stack.StackNavigation
//import com.arkivanov.decompose.router.stack.StackNavigationSource
//
//actual sealed interface NativeStackNavigation<C : Any> : StackNavigation<C>, NativeStackNavigationSource<C>
//
//actual sealed interface NativeStackNavigationSource<C : Any> : StackNavigationSource<C>
//
//actual fun <C : Any> NativeStackNavigation() : NativeStackNavigation<C> {
//    return NativeStackNavigationImpl(StackNavigation())
//}
//
//private class NativeStackNavigationImpl<C : Any>(stackNavigation: StackNavigation<C>)
//    : NativeStackNavigation<C>, StackNavigation<C> by stackNavigation