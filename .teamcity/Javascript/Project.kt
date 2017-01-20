package Javascript

import Javascript.buildTypes.*
import Javascript.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.versionedSettings

object Project : Project({
    uuid = "f51774b1-b97e-4191-9f78-dfe4a672053f"
    extId = "Javascript"
    parentId = "_Root"
    name = "Javascript"
	description = "My JS Project"

    vcsRoot(Javascript_HttpsGithubComG0t4teamcityCourseCards)

    buildType(Javascript_02Firefox)
    buildType(Javascript_01FastTests)
    buildType(Javascript_02Chrome)
    buildType(Javascript_03DeployToStaging)

    template(Javascript_Template)

    features {
        versionedSettings {
            id = "PROJECT_EXT_1"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = "HttpsGithubComSubas4uTcJsSettings"
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
        }
    }
})
