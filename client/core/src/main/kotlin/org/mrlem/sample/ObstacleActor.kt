package org.mrlem.sample

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Batch
import com.badlogic.gdx.scenes.scene2d.Actor
import kotlin.random.Random

class ObstacleActor: Actor() {

    companion object {
        val random = Random(System.currentTimeMillis())
        val obstacles = arrayOf(
            "kotlin.png",
            "rxjava.png"
        )
            .map { Texture(Gdx.files.internal(it)) }

        fun disposeAll() {
            obstacles.forEach { it.dispose() }
        }
    }

    private val texture = obstacles[random.nextInt(obstacles.size)]

    init {
        width = texture.width.toFloat()
        height = texture.height.toFloat()

        x = Gdx.graphics.width.toFloat()
    }

    override fun act(delta: Float) {
        super.act(delta)
        x -= delta * 500f
    }

    override fun draw(batch: Batch, parentAlpha: Float) {
        batch.setColor(color.r, color.g, color.b, color.a * parentAlpha)
        batch.draw(texture, x, y)
    }

}