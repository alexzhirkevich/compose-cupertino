import org.jetbrains.compose.compose

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.composeJB)
    alias(libs.plugins.composeCompiler)
}

kotlin {

    sourceSets {
        commonMain.dependencies {
            api(project(":cupertino"))
            api(project(":cupertino-native"))
            api(compose.material3)
            implementation(project(":cupertino-core"))
            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose("org.jetbrains.compose.ui:ui-util"))
        }
    }
}
