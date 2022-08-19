buildscript {
    val springBootVersion = "2.7.2"

    repositories {
        mavenCentral()
    }

    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:${springBootVersion}")
    }
}

plugins {
    val springBootVersion = "2.7.2"

    id("kotlin")
    id("org.springframework.boot") version springBootVersion
    id("io.spring.dependency-management") version "1.0.13.RELEASE"
}

repositories { mavenCentral() }

dependencies {
    implementation(project(":protocol"))
    implementation("org.springframework.boot:spring-boot-starter-web")
}
