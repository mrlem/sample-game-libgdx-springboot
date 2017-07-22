package org.mrlem.singularity

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import ktx.app.KotlinApplication
import ktx.app.use

class SingularityGame : KotlinApplication() {
    lateinit var batch: SpriteBatch
    lateinit var img: Texture

    override fun create() {
        Gdx.app.log("sgn", "launching client...")

        // TODO
        batch = SpriteBatch()
        img = Texture("badlogic.jpg")
    }

    override fun render(delta: Float) {
        // TODO
        Gdx.gl.glClearColor(1f, 1f, 0f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
        batch.use {
            it.draw(img, 0f, 0f)
        }
    }
}
