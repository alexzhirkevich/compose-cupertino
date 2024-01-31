@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose)
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            api(project(":cupertino-core"))
            implementation(compose.foundation)
            implementation(libs.decompose.compose)
            implementation(libs.decompose.core)
        }
    }
}