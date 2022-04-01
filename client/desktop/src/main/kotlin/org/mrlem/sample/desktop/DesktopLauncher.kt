package org.mrlem.sample.desktop

import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration
import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import org.mrlem.sample.SampleGame

object DesktopLauncher {

    @JvmStatic
    fun main(arg: Array<String>) {
        val mode = LwjglApplicationConfiguration.getDesktopDisplayMode()
        val config = LwjglApplicationConfiguration().apply {
            width = mode.width
            height = mode.height
            fullscreen = true
        }
        LwjglApplication(SampleGame(), config)
    }

}