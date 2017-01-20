package Javascript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Javascript_02Firefox : BuildType({
    template(Javascript.buildTypes.Javascript_Template)
    uuid = "ec25dba6-ed98-422c-a977-1a77fbed1f94"
    extId = "Javascript_02Firefox"
    name = "02. Firefox"

    params {
        param("Browser", "Firefox")
    }

    dependencies {
        dependency(Javascript.buildTypes.Javascript_01FastTests) {
            snapshot {
            }
        }
    }
})
