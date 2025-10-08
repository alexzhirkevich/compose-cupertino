plugins {
    `library-module`
    alias(libs.plugins.composeJB)
    alias(libs.plugins.composeCompiler)
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            api(projects.cupertinoCore)
            implementation(compose.runtime)
            implementation(compose.ui)
            implementation(compose.animation)
            implementation(libs.decompose.compose)
            implementation(libs.decompose.core)
        }
    }
}

mavenPublishing {
    pom {
        description = "Cupertino extensions for Decompose library"
    }
}