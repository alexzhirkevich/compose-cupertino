plugins {
    org.jetbrains.kotlin.multiplatform
    alias(libs.plugins.composeJB)
    alias(libs.plugins.composeCompiler)
}

kotlin {
    jvm("desktop")
    sourceSets {
        named("desktopMain") {
            dependencies {
                implementation(compose.desktop.currentOs)
                implementation(projects.example.shared)
            }
        }
    }
}

compose.desktop {
    application {
        mainClass = "MainKt"
    }
}
