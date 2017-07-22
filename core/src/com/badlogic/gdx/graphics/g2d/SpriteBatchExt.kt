package com.badlogic.gdx.graphics.g2d

inline fun <B: SpriteBatch> B.transaction(block: (batch: B) -> Unit) {
    this.begin()
    block(this)
    this.end()
}