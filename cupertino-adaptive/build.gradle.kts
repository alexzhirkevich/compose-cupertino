import org.jetbrains.compose.compose

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

plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("org.jetbrains.compose")
}

val jvmTarget = findProperty("jvmTarget") as String

kotlin {

    applyDefaultHierarchyTemplate()

    androidTarget {
        compilations.all {
            kotlinOptions.jvmTarget = jvmTarget
        }
    }

    iosArm64()
    iosX64()
    iosSimulatorArm64()

    jvm("desktop")

    js(IR){
        browser()
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                api(project(":cupertino"))
                api(project(":cupertino-native"))
                implementation(project(":cupertino-core"))
                implementation(compose.runtime)
                implementation(compose.foundation)
                api(compose.material3)
                implementation(libs.material.kolor)
                implementation(compose("org.jetbrains.compose.ui:ui-util"))

            }
        }


        val iosMain by getting
        
        val iosSimulatorArm64Main by getting {
            dependsOn(iosMain)
        }

        val jsMain by getting

        val desktopMain by getting

        val androidMain by getting

        val nonIosMain by creating {
            dependsOn(commonMain)
            jsMain.dependsOn(this)
            desktopMain.dependsOn(this)
            androidMain.dependsOn(this)
        }

        val nonAndroidMain by creating {
            dependsOn(commonMain)
            jsMain.dependsOn(this)
            desktopMain.dependsOn(this)
            iosMain.dependsOn(this)
        }
    }
}

android {
    namespace = "io.github.alexzhirkevich.cupertino.adaptive"
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