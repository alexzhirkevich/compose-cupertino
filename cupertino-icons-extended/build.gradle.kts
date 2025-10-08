plugins {
    `library-module`
    alias(libs.plugins.composeJB)
    alias(libs.plugins.composeCompiler)
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(compose.ui)
            api(projects.cupertinoCore)
            implementation(projects.cupertino)
        }
    }
}

mavenPublishing {
    pom {
        description = "Collection of most used Apple SF Symbols as Compose Multiplatform ImageVectors"
    }
}
