import org.jetbrains.compose.compose

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.serialization)
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose)
}

kotlin {

    applyDefaultHierarchyTemplate()
    sourceSets {
        commonMain.dependencies {
            api(project(":cupertino-core"))
            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose("org.jetbrains.compose.ui:ui-util"))
            implementation(libs.datetime)
            implementation(libs.atomicfu)
            implementation(libs.serialization)
        }


    }
}
