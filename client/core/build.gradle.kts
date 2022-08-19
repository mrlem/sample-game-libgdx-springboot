plugins {
    id("kotlin")
}

sourceSets {
    getByName("main") {
        resources.srcDirs("../android/assets")
    }
}

dependencies {
    implementation(project(":protocol"))
    implementation("com.badlogicgames.gdx:gdx:${Versions.Gdx.gdx}")
    api("io.github.libktx:ktx-app:${Versions.Gdx.ktx}")
}