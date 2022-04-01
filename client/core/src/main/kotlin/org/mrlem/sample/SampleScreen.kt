package org.mrlem.sample

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.utils.viewport.ScreenViewport
import ktx.app.KtxScreen

class SampleScreen : KtxScreen {

    // actors
    private var obstacle = ObstacleActor()
    private val florian = FlorianActor().apply {
        obstacleInSight = obstacle
    }

    // stage
    private val stage = Stage(ScreenViewport()).apply {
        addActor(florian)
        addActor(obstacle)

        Gdx.input.inputProcessor = this
    }

    override fun resize(width: Int, height: Int) {
        stage.viewport.update(width, height, true)
    }

    override fun render(delta: Float) {
        update()

        Gdx.gl.glClearColor(1.0f, 1.0f, 1.0f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
        stage.act(delta)
        stage.draw()
    }

    override fun dispose() {
        stage.dispose()
        florian.dispose() // oh!
        ObstacleActor.disposeAll()
    }

    private fun update() {
        // obstacle exits screen?
        if (obstacle.right <= 0) {
            obstacle.remove()

            // spawn a new one
            obstacle = ObstacleActor()
                .also {
                    stage.addActor(it)
                    florian.obstacleInSight = it
                }
        }
    }

}