import org.jetbrains.compose.compose

plugins {
    `library-module`
    alias(libs.plugins.composeJB)
    alias(libs.plugins.composeCompiler)
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            api(projects.cupertino)
            api(projects.cupertinoNative)
            implementation(projects.cupertinoCore)
            api(compose.material3)
            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose("org.jetbrains.compose.ui:ui-util"))
        }
    }

    compilerOptions {
        optIn.addAll(
            "io.github.alexzhirkevich.cupertino.ExperimentalCupertinoApi",
            "io.github.alexzhirkevich.cupertino.adaptive.ExperimentalAdaptiveApi"
        )
    }
}

mavenPublishing {
    pom {
        description = "Compose Multiplatform adaptive theme and wrappers for Cupertino and Material 3 widgets"
    }
}
