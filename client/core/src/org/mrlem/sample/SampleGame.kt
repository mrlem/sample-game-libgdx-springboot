package org.mrlem.sample

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Screen
import ktx.app.KtxGame

class SampleGame : KtxGame<Screen>() {

    override fun create() {
        Gdx.app.log("app", "launching client...")

        addScreen(SampleScreen())
        setScreen<SampleScreen>()
    }

}
