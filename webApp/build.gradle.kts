/*
 * Copyright (c) 2023. Compose Cupertino project and open source contributors.
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

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose)
}

kotlin {
    js(IR){
        browser()
        binaries.executable()
    }

    @Suppress("OPT_IN_USAGE")
    wasmJs() {
            binaries.executable()

            moduleName = "webApp"
            browser {
                commonWebpackConfig {
                    outputFileName = "webApp.js"
                }
            }
        }

    sourceSets {
        commonMain.dependencies {
            implementation(compose.runtime)
            implementation(compose.material)
            implementation(compose.foundation)
//            implementation(libs.decompose.core)
//            implementation(libs.decompose.compose)
            implementation(project(":shared"))
        }
    }
}

compose.experimental.web.application{}