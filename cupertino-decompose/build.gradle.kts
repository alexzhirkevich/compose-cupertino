@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose)
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            api(project(":cupertino-core"))
            implementation(compose.runtime)
            implementation(compose.ui)
            implementation(compose.animation)
            implementation(libs.decompose.compose)
            implementation(libs.decompose.core)
        }
    }
}