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

import org.jetbrains.compose.compose

plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("org.jetbrains.compose")
    alias(libs.plugins.serialization)
}

val jvmTarget = findProperty("jvmTarget") as String


kotlin {

    applyDefaultHierarchyTemplate() /* <- optional; is applied by default, when compatible */

    androidTarget {
        compilations.all {
            kotlinOptions.jvmTarget = jvmTarget
        }
    }
    iosArm64()
    iosX64()
    iosSimulatorArm64()
    macosX64()
    macosArm64()

    jvm("desktop") {
        compilations.all {
            kotlinOptions.jvmTarget = jvmTarget
        }
    }

    js(IR){
        browser()
    }
//
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(project(":cupertino-core"))
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose("org.jetbrains.compose.ui:ui-util"))
                implementation(libs.datetime)
                implementation(libs.atomicfu)
                implementation(libs.serialization)
            }
        }

        val iosMain by getting
        val iosSimulatorArm64Main by getting {
            dependsOn(iosMain)
        }
        val jsMain by getting

        val desktopMain by getting
        val androidMain by getting

        val jvmMain by creating {
            dependsOn(commonMain)
            desktopMain.dependsOn(this)
            androidMain.dependsOn(this)
        }

        val macosX64Main by getting
        val macosArm64Main by getting


        val skikoMain by creating {
            dependsOn(commonMain)
            desktopMain.dependsOn(this)
            iosMain.dependsOn(this)
            iosSimulatorArm64Main.dependsOn(this)
            jsMain.dependsOn(this)
        }

        val darwinMain by creating {
            dependsOn(skikoMain)
            iosMain.dependsOn(this)
            iosSimulatorArm64Main.dependsOn(this)
            macosX64Main.dependsOn(this)
            macosArm64Main.dependsOn(this)
        }

        val nonIosMain by creating {
            dependsOn(commonMain)
            androidMain.dependsOn(this)
            desktopMain.dependsOn(this)
            jsMain.dependsOn(this)
            macosArm64Main.dependsOn(this)
            macosX64Main.dependsOn(this)
        }
    }
}

android {
    namespace = "io.github.alexzhirkevich.cupertino"
    compileSdk = (findProperty("android.compileSdk") as String).toInt()

    defaultConfig {
        minSdk = (findProperty("android.minSdk") as String).toInt()
        targetSdk = (findProperty("android.targetSdk") as String).toInt()
    }
    compileOptions {
        sourceCompatibility = JavaVersion.toVersion(jvmTarget)
        targetCompatibility = JavaVersion.toVersion(jvmTarget)
    }
}