import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.0"
}

group = "org.reactivekata"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.2")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.6.2")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor:1.6.2")
    testImplementation(kotlin("test"))
    testImplementation("io.projectreactor:reactor-test:3.4.18")

}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}