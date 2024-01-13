
@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose)
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(compose.ui)
            api(project(":cupertino-core"))
            implementation(project(":cupertino"))
        }
    }
}
