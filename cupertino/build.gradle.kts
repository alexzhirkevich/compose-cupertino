plugins {
    `library-module`
    alias(libs.plugins.serialization)
    alias(libs.plugins.composeJB)
    alias(libs.plugins.composeCompiler)
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            api(projects.cupertinoCore)
            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.uiUtil)
            implementation(libs.datetime)
            implementation(libs.atomicfu)
            implementation(libs.serialization)
        }
        skikoMain.dependencies {

        }
    }
}

mavenPublishing {
    pom {
        description =
            "Compose Multiplatform Cupertino theme and widgets based on Compose foundation"
    }
}
