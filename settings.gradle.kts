rootProject.name = "compose-cupertino"

include(
    ":cupertino",
    ":cupertino-core",
    ":cupertino-native",
    ":cupertino-adaptive",
    ":cupertino-decompose",
    ":cupertino-icons-extended",
    ":androidApp",
    ":desktopApp",
    ":webApp",
    ":shared",
)

pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}
buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("io.codearte.gradle.nexus:gradle-nexus-staging-plugin:0.30.0")
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}