@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose)
}

kotlin {

    sourceSets {
        commonMain.dependencies {
            api(project(":cupertino-core"))
            implementation(project(":cupertino"))
            implementation(compose.runtime)
            implementation(compose.foundation)
        }
    }
}
