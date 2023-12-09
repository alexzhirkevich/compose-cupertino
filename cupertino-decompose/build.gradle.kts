import org.jetbrains.compose.compose

/*
 * Copyright (c) 2023 Compose Cupertino project and open source contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
    alias(libs.plugins.compose)
    id("maven-publish")
    id("signing")
}


val jvmTarget = findProperty("jvmTarget") as String

group = findProperty("group") as String
version = findProperty("version") as String


kotlin {

    applyDefaultHierarchyTemplate()

    androidTarget {
        compilations.all {
            kotlinOptions.jvmTarget = jvmTarget
        }
        publishLibraryVariants("release")
    }

    iosX64()
    iosArm64()
    iosSimulatorArm64()
    macosX64()
    macosArm64()

    jvm("desktop") {
        compilations.all {
            kotlinOptions.jvmTarget = jvmTarget
        }
    }

    js(IR) {
        browser()
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                api(project(":cupertino-core"))
                implementation(compose.runtime)
                implementation(compose.ui)
                implementation(compose.animation)
                implementation(libs.decompose.compose)
                implementation(libs.decompose.core)
            }
        }

        val desktopMain by getting

        val nonIosMain by creating {
            dependsOn(commonMain)
            jsMain.get().dependsOn(this)
            desktopMain.dependsOn(this)
            androidMain.get().dependsOn(this)
            macosMain.get().dependsOn(this)
        }
    }
}

android {
    namespace = "io.github.alexzhirkevich.cupertino.decompose"
    compileSdk = (findProperty("android.compileSdk") as String).toInt()

    defaultConfig {
        minSdk = (findProperty("android.minSdk") as String).toInt()
        targetSdk = (findProperty("android.targetSdk") as String).toInt()
    }
    compileOptions {
        sourceCompatibility = JavaVersion.toVersion(jvmTarget)
        targetCompatibility = JavaVersion.toVersion(jvmTarget)
    }
}

val javadocJar by tasks.registering(Jar::class) {
    archiveClassifier.set("javadoc")
}
// https://github.com/gradle/gradle/issues/26091
val signingTasks = tasks.withType<Sign>()
tasks.withType<AbstractPublishToMaven>().configureEach {
    dependsOn(signingTasks)
}

publishing {
    if (rootProject.ext.has("ossrhPassword")) {

        repositories {
            maven {
                val releasesRepoUrl =
                    "https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/"
                val snapshotsRepoUrl =
                    "https://s01.oss.sonatype.org/content/repositories/snapshots/"
                url = if (version.toString().endsWith("SNAPSHOT")) {
                    uri(snapshotsRepoUrl)
                } else {
                    uri(releasesRepoUrl)
                }
                credentials {
                    username = rootProject.ext.get("ossrhUsername").toString()
                    password = rootProject.ext.get("ossrhPassword").toString()
                }
            }
        }
    }

    publications.withType<MavenPublication> {
        artifact(javadocJar)
        pom {
            name.set("cupertino-decompose")
            description.set("Cupertino extensions for Decompose library")
            url.set("https://github.com/alexzhirkevich/compose-cupertino")

            licenses {
                license {
                    name.set("Apache-2.0")
                    url.set("http://www.apache.org/licenses/LICENSE-2.0")
                }
            }
            developers {
                developer {
                    id.set("alexzhirkevich")
                    name.set("Alexander Zhirkevich")
                    email.set("sasha.zhirkevich@gmail.com")
                }
            }
            scm {
                url.set("https://github.com/alexzhirkevich/compose-cupertino")
                connection.set("scm:git:git://github.com/alexzhirkevich/compose-cupertino.git")
                developerConnection.set("scm:git:git://github.com/alexzhirkevich/compose-cupertino.git")
            }
        }
    }
}

signing {
    sign(publishing.publications)
}