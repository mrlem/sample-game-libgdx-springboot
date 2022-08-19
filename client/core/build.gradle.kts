plugins {
    id("kotlin")
}

dependencies {
    implementation(project(":protocol"))
    implementation("com.badlogicgames.gdx:gdx:${Versions.Gdx.gdx}")
    api("io.github.libktx:ktx-app:${Versions.Gdx.ktx}")
}