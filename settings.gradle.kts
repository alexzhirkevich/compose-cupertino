rootProject.name = "compose-look-and-feel"

include(
    ":androidApp",
    ":desktopApp",
    ":adaptive",
    ":common",
    ":cupertino",
    ":cupertino-native",
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

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}