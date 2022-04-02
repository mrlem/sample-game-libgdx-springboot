group = "org.mrlem.sample"
version = "1.0-SNAPSHOT"

buildscript {
    val kotlinVersion = "1.6.10"

    repositories {
        mavenCentral()
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
    }
}

allprojects {
    repositories {
        mavenCentral()
    }
}
