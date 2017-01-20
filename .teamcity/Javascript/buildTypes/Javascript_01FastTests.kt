package Javascript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Javascript_01FastTests : BuildType({
    template(Javascript.buildTypes.Javascript_Template)
    uuid = "9d8926bf-584c-42ee-934b-f41b64b2a6b2"
    extId = "Javascript_01FastTests"
    name = "01. Fast Tests"

    params {
        param("Browser", "PhantomJS")
    }
})
