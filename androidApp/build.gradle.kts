@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.android.application)
    alias(libs.plugins.compose)
}

val _jvmTarget = findProperty("jvmTarget") as String

android {
    namespace = "com.myapplication"
    compileSdk = (findProperty("android.compileSdk") as String).toInt()

    defaultConfig {
        minSdk = (findProperty("android.minSdk") as String).toInt()
        targetSdk = (findProperty("android.targetSdk") as String).toInt()

        applicationId = "com.myapplication.MyApplication"
        versionCode = 1
        versionName = "1.0"
    }

    kotlinOptions {
        jvmTarget = _jvmTarget
    }
    compileOptions {
        sourceCompatibility = JavaVersion.toVersion(_jvmTarget)
        targetCompatibility = JavaVersion.toVersion(_jvmTarget)
    }
    dependencies {
        implementation(project(":shared"))

        implementation(libs.androidx.appcompat)
        implementation(libs.activity.compose)
    }
}
