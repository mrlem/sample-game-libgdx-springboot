package org.mrlem.sample

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.utils.viewport.ScreenViewport
import ktx.app.KtxScreen

class SampleScreen : KtxScreen {

    val actor = SampleActor()
    val stage = Stage(ScreenViewport())

    init {
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