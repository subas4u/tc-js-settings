package Javascript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Javascript_02Chrome : BuildType({
    template(Javascript.buildTypes.Javascript_Template)
    uuid = "c84751f8-2c96-4988-8eff-0f5ee03fbadc"
    extId = "Javascript_02Chrome"
    name = "02. Chrome"

    params {
        param("Browser", "Chrome")
    }

    dependencies {
        dependency(Javascript.buildTypes.Javascript_01FastTests) {
            snapshot {
            }
        }
    }
})
