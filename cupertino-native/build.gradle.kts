@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.composeJB)
    alias(libs.plugins.composeCompiler)
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
