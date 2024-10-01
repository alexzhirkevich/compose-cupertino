/*
 * Copyright (c) 2023. Compose Cupertino project and open source contributors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

@file:Suppress("DSL_SCOPE_VIOLATION")

import java.util.Properties

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.composeJB).apply(false)
    alias(libs.plugins.composeCompiler).apply(false)
    alias(libs.plugins.cocoapods).apply(false)
    alias(libs.plugins.android.application).apply(false)
    alias(libs.plugins.serialization).apply(false)
    id("maven-publish")
    id("signing")
    id("io.codearte.nexus-staging")
}

extra.apply {
    val publishPropFile = rootProject.file("local.properties")
    if (publishPropFile.exists()) {
        Properties().apply {
            load(publishPropFile.inputStream())
        }.forEach { name, value ->
            if (name == "signing.secretKeyRingFile") {
                set(name.toString(), rootProject.file(value.toString()).absolutePath)
            } else {
                set(name.toString(), value)
            }
        }
    } else {
        ext["signing.keyId"] = System.getenv("SIGNING_KEY_ID")
        ext["signing.password"] = System.getenv("SIGNING_PASSWORD")
        ext["signing.secretKeyRingFile"] = System.getenv("SIGNING_SECRET_KEY_RING_FILE")
        ext["ossrhUsername"] = System.getenv("OSSRH_USERNAME")
        ext["ossrhPassword"]= System.getenv("OSSRH_PASSWORD")
    }
}

val jvmTarget = findProperty("jvmTarget") as String

val _group = findProperty("group") as String

nexusStaging {
    serverUrl = "https://s01.oss.sonatype.org/service/local/" //required only for projects registered in Sonatype after 2021-02-24
    packageGroup = _group //optional if packageGroup == project.getGroup()
}

subprojects {
    if (name.contains("example")) {
        tasks.configureEach {
            this.enabled = false
        }
        return@subprojects
    }

    if (!name.contains("cupertino")) {
        tasks.configureEach {
            this.enabled = false
        }
        return@subprojects
    }

    plugins.apply("maven-publish")
    plugins.apply("signing")
    plugins.apply("org.jetbrains.kotlin.multiplatform")
    plugins.apply("com.android.library")

    group = _group
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

        js(IR) {
            browser()
        }

        @Suppress("OPT_IN_USAGE")
        wasmJs() {
            browser()
        }

        sourceSets {

            val desktopMain by getting

            val wasmJsMain by getting

            val skikoMain by creating {
                dependsOn(commonMain.get())
                appleMain.get().dependsOn(this)
                desktopMain.dependsOn(this)
                jsMain.get().dependsOn(this)
                wasmJsMain.dependsOn(this)
            }
            val nonIosMain by creating {
                dependsOn(commonMain.get())
                macosMain.get().dependsOn(this)
                androidMain.get().dependsOn(this)
                desktopMain.dependsOn(this)
                jsMain.get().dependsOn(this)
                wasmJsMain.dependsOn(this)
            }

            val darwinMain by creating {
                dependsOn(commonMain.get())
                iosMain.get().dependsOn(this)
                macosMain.get().dependsOn(this)
            }

            val jvmMain by creating {
                dependsOn(commonMain.get())
                desktopMain.dependsOn(this)
                androidMain.get().dependsOn(this)
            }
        }
    }

    android {
        namespace = "io.github.alexzhirkevich.${name.filter { it.isLetter() }}"
        compileSdk = (findProperty("android.compileSdk") as String).toInt()

        defaultConfig {
            minSdk = (findProperty("android.minSdk") as String).toInt()
        }
        compileOptions {
            sourceCompatibility = JavaVersion.toVersion(jvmTarget)
            targetCompatibility = JavaVersion.toVersion(jvmTarget)
        }
    }

    val javadocJar by tasks.registering(Jar::class) {
        archiveClassifier.set("javadoc")
    }

    val signingTasks = tasks.withType<Sign>()

    if (rootProject.ext.has("signing.password")) {
        tasks.withType<AbstractPublishToMaven>().configureEach {
            dependsOn(signingTasks)
        }
    }


    publishing {
        if (rootProject.ext.has("ossrhPassword")) {
            repositories.maven {
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

        val publishProperties = Properties().apply {
            load(file("publish.properties").inputStream())
        }

        publications.withType<MavenPublication> {
            artifact(javadocJar)
            pom {
                name.set(this@subprojects.name)
                description.set(publishProperties.getProperty("description"))
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
    if (rootProject.ext.has("signing.password")) {
        signing {
            sign(publishing.publications)
        }
    }
}

android {
    namespace = "io.github.alexzhirkevich.cupertino"
    compileSdk = (findProperty("android.compileSdk") as String).toInt()

}