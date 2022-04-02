plugins {
    id("kotlin")
}

dependencies {
    implementation("com.badlogicgames.gdx:gdx:${Versions.Gdx.gdx}")
    api("io.github.libktx:ktx-app:${Versions.Gdx.ktx}")
}