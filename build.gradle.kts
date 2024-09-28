import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl

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

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.composeJB).apply(false)
    alias(libs.plugins.composeCompiler).apply(false)
    alias(libs.plugins.cocoapods).apply(false)
    alias(libs.plugins.android.application).apply(false)
    alias(libs.plugins.serialization).apply(false)

    id("maven-publish")
}

val jvmTarget = findProperty("jvmTarget") as String

val _group = findProperty("group") as String

subprojects {
    if (name.contains("example")) {
        tasks.configureEach {
            this.enabled = false
        }
        return@subprojects
    }

    if (!name.contains("cupertino")) {
        tasks.configureEach {
            this.enabled = false
        }
        return@subprojects
    }

    plugins.apply("maven-publish")
    plugins.apply("org.jetbrains.kotlin.multiplatform")
    plugins.apply("com.android.library")

    group = _group
    version = findProperty("version") as String

    kotlin {
        applyDefaultHierarchyTemplate()

        androidTarget {
            compilations.all {
                kotlinOptions.jvmTarget = jvmTarget
            }
            publishLibraryVariants("release")
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

        js(IR) {
            browser()
        }

        @OptIn(ExperimentalWasmDsl::class)
        wasmJs {
            browser()
        }

        sourceSets {

            val desktopMain by getting

            val wasmJsMain by getting

            val skikoMain by creating {
                dependsOn(commonMain.get())
                appleMain.get().dependsOn(this)
                desktopMain.dependsOn(this)
                jsMain.get().dependsOn(this)
                wasmJsMain.dependsOn(this)
            }
            val nonIosMain by creating {
                dependsOn(commonMain.get())
                macosMain.get().dependsOn(this)
                androidMain.get().dependsOn(this)
                desktopMain.dependsOn(this)
                jsMain.get().dependsOn(this)
                wasmJsMain.dependsOn(this)
            }

            val darwinMain by creating {
                dependsOn(commonMain.get())
                iosMain.get().dependsOn(this)
                macosMain.get().dependsOn(this)
            }

            val jvmMain by creating {
                dependsOn(commonMain.get())
                desktopMain.dependsOn(this)
                androidMain.get().dependsOn(this)
            }
        }
    }

    android {
        namespace = "io.github.alexzhirkevich.${name.filter { it.isLetter() }}"
        compileSdk = (findProperty("android.compileSdk") as String).toInt()

        defaultConfig {
            minSdk = (findProperty("android.minSdk") as String).toInt()
        }
        compileOptions {
            sourceCompatibility = JavaVersion.toVersion(jvmTarget)
            targetCompatibility = JavaVersion.toVersion(jvmTarget)
        }
    }

    val javadocJar by tasks.registering(Jar::class) {
        archiveClassifier.set("javadoc")
    }
}

android {
    namespace = "io.github.alexzhirkevich.cupertino"
    compileSdk = (findProperty("android.compileSdk") as String).toInt()
}