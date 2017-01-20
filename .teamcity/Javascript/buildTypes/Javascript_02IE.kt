package Javascript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Javascript_02IE : BuildType({
    template(Javascript.buildTypes.Javascript_Template)
    uuid = "javascript_02ie"
    extId = "Javascript_02IE"
    name = "02. Internet Explorer"

    params {
        param("Browser", "IE")
    }

    dependencies {
        dependency(Javascript.buildTypes.Javascript_01FastTests) {
            snapshot {
            }
        }
    }
})
