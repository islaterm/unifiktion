@file:Suppress("PropertyName", "SpellCheckingInspection")
val ktor_version: String by project
val kotlin_version: String by project
val logback_version: String by project

plugins {
  application
  kotlin("jvm") version "1.4.10"
}

group = "cl.ravenhill"
version = "0.0.1"

application {
  mainClassName = "io.ktor.server.netty.EngineMain"
}

repositories {
  mavenCentral()
  jcenter()
}

dependencies {
  implementation(kotlin("stdlib"))
  // Ktor
  implementation("io.ktor:ktor-server-netty:$ktor_version")
  implementation("io.ktor:ktor-html-builder:$ktor_version")
  implementation("io.ktor:ktor-gson:$ktor_version")
  implementation("ch.qos.logback:logback-classic:$logback_version")
  testImplementation("io.ktor:ktor-server-tests:$ktor_version")
}
