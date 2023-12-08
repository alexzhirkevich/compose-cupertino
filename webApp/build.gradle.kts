@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose)
}

kotlin {
    js(IR){
        browser()
        binaries.executable()
    }

    @Suppress("OPT_IN_USAGE")
    wasmJs() {
            binaries.executable()

            moduleName = "webApp"
            browser {
                commonWebpackConfig {
                    outputFileName = "webApp.js"
                }
            }
        }

    sourceSets {
        commonMain.dependencies {
            implementation(compose.runtime)
            implementation(compose.material)
            implementation(compose.foundation)
//            implementation(libs.decompose.core)
//            implementation(libs.decompose.compose)
//            implementation(project(":shared"))
        }
    }
}

compose.experimental.web.application{}