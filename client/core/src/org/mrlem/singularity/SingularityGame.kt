package org.mrlem.singularity

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.scenes.scene2d.Actor
import com.badlogic.gdx.scenes.scene2d.Stage
import ktx.app.KotlinApplication
import com.badlogic.gdx.utils.viewport.ScreenViewport

class SingularityGame : KotlinApplication() {

    lateinit var stage: Stage
    lateinit var actor: Actor

    override fun create() {
        Gdx.app.log("app", "launching client...")

        actor = SampleActor()

        stage = Stage(ScreenViewport())
        stage.addActor(actor)
        Gdx.input.inputProcessor = stage

        actor.setPosition(60f, 60f)
    }

    override fun resize(width: Int, height: Int) {
        stage.viewport.update(width, height, true)
    }

    override fun render(delta: Float) {
        Gdx.gl.glClearColor(0f, 0f, 0.2f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
        stage.act(delta)
        stage.draw()
    }

    override fun dispose() {
        stage.dispose()
    }
}
