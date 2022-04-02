rootProject.name = "sample"

include("desktop", "android", "core")
include("protocol")
project(":protocol").projectDir = File(settingsDir, "../engine/protocol")
