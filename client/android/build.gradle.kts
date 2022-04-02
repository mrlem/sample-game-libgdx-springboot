plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    sourceSets {
        getByName("main") {
            manifest.srcFile("AndroidManifest.xml")
            aidl.srcDirs("src")
            renderscript.srcDirs("src")
            res.srcDirs("res")
            assets.srcDirs("assets")
            jniLibs.srcDirs("libs")
        }
    }
    packagingOptions {
        resources.excludes += "META-INF/robovm/ios/robovm.xml"
    }
    defaultConfig {
        applicationId = App.id
        buildToolsVersion = "31.0.0"
        compileSdk = Versions.Sdk.compile
        minSdk = Versions.Sdk.min
        targetSdk = Versions.Sdk.target
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android.txt"),
                "proguard-rules.pro",
            )
        }
    }
}

val natives: Configuration by configurations.creating

// Called every time gradle gets executed, takes the native dependencies of
// the natives configuration, and extracts them to the proper libs/ folders
// so they get packed with the APK.
tasks.register("copyAndroidNatives") {
    doFirst {
        natives.files.forEach { jar ->
            val outputDir = file("libs/" + jar.nameWithoutExtension.substringAfterLast("natives-"))
            outputDir.mkdirs()
            copy {
                from(zipTree(jar))
                into(outputDir)
                include("*.so")
            }
        }
    }
}

tasks.whenTaskAdded {
    if ("package" in name) {
        dependsOn("copyAndroidNatives")
    }
}

dependencies {
    implementation(project(":core"))
    api("com.badlogicgames.gdx:gdx-backend-android:${Versions.Gdx.gdx}")
    natives("com.badlogicgames.gdx:gdx-platform:${Versions.Gdx.gdx}:natives-armeabi-v7a")
    natives("com.badlogicgames.gdx:gdx-platform:${Versions.Gdx.gdx}:natives-arm64-v8a")
    natives("com.badlogicgames.gdx:gdx-platform:${Versions.Gdx.gdx}:natives-x86")
    natives("com.badlogicgames.gdx:gdx-platform:${Versions.Gdx.gdx}:natives-x86_64")
}