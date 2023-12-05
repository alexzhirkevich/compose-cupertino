
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

import org.jetbrains.compose.compose

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.serialization)
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
    iosArm64()
    iosX64()
    iosSimulatorArm64()
    macosX64()
    macosArm64()

    jvm("desktop") {
        compilations.all {
            kotlinOptions.jvmTarget = jvmTarget
        }
    }

    js(IR){
        browser()
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                api(project(":cupertino-core"))
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose("org.jetbrains.compose.ui:ui-util"))
                implementation(libs.datetime)
                implementation(libs.atomicfu)
                implementation(libs.serialization)
            }
        }

        val desktopMain by getting

        val jvmMain by creating {
            dependsOn(commonMain)
            desktopMain.dependsOn(this)
            androidMain.get().dependsOn(this)
        }


        val skikoMain by creating {
            dependsOn(commonMain)
            desktopMain.dependsOn(this)
            iosMain.get().dependsOn(this)
            jsMain.get().dependsOn(this)
        }

        val darwinMain by creating {
            dependsOn(skikoMain)
            iosMain.get().dependsOn(this)
            macosMain.get().dependsOn(this)
        }

        val nonIosMain by creating {
            dependsOn(commonMain)
            androidMain.get().dependsOn(this)
            desktopMain.dependsOn(this)
            jsMain.get().dependsOn(this)
            macosMain.get().dependsOn(this)
        }
    }
}

android {
    namespace = "io.github.alexzhirkevich.cupertino"
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
    if (rootProject.file("local.properties").exists()) {

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
            name.set("cupertino")
            description.set("Compose Multiplatform Cupertino theme and widgets based on Compose foundation")
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