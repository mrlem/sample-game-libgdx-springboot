package org.mrlem.sample

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Batch
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.scenes.scene2d.Actor

class SampleActor: Actor() {

    val region: TextureRegion

    init {
        region = TextureRegion(Texture(Gdx.files.internal("badlogic.jpg")))
        width = region.regionWidth.toFloat()
        height = region.regionHeight.toFloat()
    }

    override fun draw(batch: Batch?, parentAlpha: Float) {
        batch?.setColor(color.r, color.g, color.b, color.a * parentAlpha)
        batch?.draw(region, x, y, originX, originY, width, height, scaleX, scaleY, rotation)
    }

}