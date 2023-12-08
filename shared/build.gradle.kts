/*
 * Copyright (c) 2023 Compose Cupertino project and open source contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
@file:Suppress("DSL_SCOPE_VIOLATION")
plugins {
    kotlin("native.cocoapods")
    id("com.android.library")
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose)
    alias(libs.plugins.serialization)
}

val _jvmTarget = findProperty("jvmTarget") as String

kotlin {

    applyDefaultHierarchyTemplate()

    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = _jvmTarget
            }
        }
    }

    jvm("desktop")
    js(IR) {
        browser()
    }
    iosX64()
    iosArm64()
    iosSimulatorArm64()


    cocoapods {
        version = "1.0.0"
        summary = "Some description for the Shared Module"
        homepage = "Link to the Shared Module homepage"
        ios.deploymentTarget = "14.1"
        podfile = project.file("../iosApp/Podfile")
        framework {
            baseName = "shared"
            export(libs.decompose.core)
            export(libs.essenty)
            export("com.arkivanov.essenty:lifecycle:${libs.versions.essenty}")
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(project(":cupertino"))
                implementation(project(":cupertino-native"))
                implementation(project(":cupertino-adaptive"))
                implementation(project(":cupertino-decompose"))
                implementation(project(":cupertino-icons-extended"))

//                val version = "0.1.0-alpha01"
//                implementation("io.github.alexzhirkevich:cupertino:$version")
//                implementation("io.github.alexzhirkevich:cupertino-native:$version")
//                implementation("io.github.alexzhirkevich:cupertino-adaptive:$version")
//                implementation("io.github.alexzhirkevich:cupertino-decompose:$version")
//                implementation("io.github.alexzhirkevich:cupertino-icons-extended:$version")

                api(libs.decompose.core)
                implementation(libs.decompose.compose)
                api(libs.essenty)
                implementation(compose.runtime)
                implementation(compose.ui)
                implementation(compose.foundation)
                implementation(compose.material)
                implementation(compose.material3)
                implementation(libs.datetime)
                implementation(libs.serialization)
            }
        }
        androidMain.dependencies {
            implementation(libs.activity.compose)
        }

        val desktopMain by getting

        val skikoMain by creating {
            dependsOn(commonMain)
            jsMain.get().dependsOn(this)
            desktopMain.dependsOn(this)
            iosMain.get().dependsOn(this)
        }

        val nonIosMain by creating {
            dependsOn(commonMain)
            jsMain.get().dependsOn(this)
            desktopMain.dependsOn(this)
            androidMain.get().dependsOn(this)
        }
    }
}

android {
    namespace = "com.example.shared"
    compileSdk = (findProperty("android.compileSdk") as String).toInt()

    defaultConfig {
        minSdk = (findProperty("android.minSdk") as String).toInt()
    }
    compileOptions {
        sourceCompatibility = JavaVersion.toVersion(_jvmTarget)
        targetCompatibility = JavaVersion.toVersion(_jvmTarget)
    }
}
