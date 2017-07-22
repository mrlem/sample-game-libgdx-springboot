package org.mrlem.singularity

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.g2d.transaction
import ktx.app.KotlinApplication

// TODO - set correct view so that desktop version is not ridiculous

class SingularityGame : KotlinApplication() {
    lateinit var batch: SpriteBatch
    lateinit var img: Texture

    override fun create() {
        Gdx.app.log("sgn", "create")
        batch = SpriteBatch()
        img = Texture("badlogic.jpg")
    }

    override fun render(delta: Float) {
        Gdx.gl.glClearColor(1f, 1f, 0f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
        batch.transaction {
            it.draw(img, 0f, 0f)
        }
    }
}
