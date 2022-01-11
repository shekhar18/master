plugins {
    kotlin("jvm") version "1.6.10"
}

group = "org.corecotechnologies"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.google.code.gson:gson:2.8.9")
    implementation("org.json:json:20211205")
}