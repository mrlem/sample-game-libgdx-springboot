package org.mrlem.sample

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Batch
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.scenes.scene2d.Actor
import com.badlogic.gdx.utils.Disposable
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.roundToInt

class FlorianActor: Actor(), Disposable {

    companion object {
        private const val SPEED = 30f
        private const val POSITION = 50f

        // spritesheet
        private const val WIDTH = 452
        private const val HEIGHT = 500
        private const val SPACING = 10
        private const val ROWS = 2
        private const val COLS = 10
    }

    private val spritesheet = Texture(Gdx.files.internal("spritesheet.jpg"))
    private val regions = mutableListOf<TextureRegion>()
    private var frame = 0.0

    var obstacleInSight: ObstacleActor? = null

    init {
        for (row in 0 until ROWS) {
            for (col in 0 until COLS) {
                regions.add(
                    TextureRegion(
                        spritesheet,
                        WIDTH * col, (HEIGHT + SPACING) * row,    // offset
                        WIDTH, HEIGHT                                   // dimensions
                    )
                )
            }
        }
        width = WIDTH.toFloat()
        height = HEIGHT.toFloat()
        x = POSITION
    }

    override fun act(delta: Float) {
        super.act(delta)

        // make jump if required
        val distanceToObstacle = obstacleInSight
            ?.let { abs((x + width / 2) - (it.x + it.width / 2)) }
            ?: Float.MAX_VALUE
        y = max(0f, 300 - distanceToObstacle)

        if (y == 0f || frame < 17) {
            frame += SPEED * delta
            frame %= regions.size
        }
    }

    override fun draw(batch: Batch, parentAlpha: Float) {
        batch.setColor(color.r, color.g, color.b, color.a * parentAlpha)
        batch.draw(regions[frame.toInt()], x, y)
    }

    override fun dispose() {
        spritesheet.dispose()
    }

}