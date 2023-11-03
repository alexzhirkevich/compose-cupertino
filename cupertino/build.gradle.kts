import org.jetbrains.compose.compose

plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("org.jetbrains.compose")
}

kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "11"
            }
        }
    }
    applyDefaultHierarchyTemplate() /* <- optional; is applied by default, when compatible */
    iosX64()
    iosArm64()
    iosSimulatorArm64()
    macosX64()
    macosArm64()

    jvm("desktop")

    js(IR){
        browser()
    }
//
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(project(":common"))
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose("org.jetbrains.compose.ui:ui-util"))
                implementation(libs.datetime)
            }
        }

        val iosMain by getting
        val iosSimulatorArm64Main by getting
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

        val nonIosMain by creating {
            dependsOn(commonMain)
            jsMain.dependsOn(this)
            desktopMain.dependsOn(this)
            androidMain.dependsOn(this)
        }

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
            macosX64Main.dependsOn(this)
            macosArm64Main.dependsOn(this)
        }
    }
}

android {
    namespace = "com.github.alexzhirkevich.cupertino"
    compileSdk = (findProperty("android.compileSdk") as String).toInt()

    defaultConfig {
        minSdk = (findProperty("android.minSdk") as String).toInt()
        targetSdk = (findProperty("android.targetSdk") as String).toInt()
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}