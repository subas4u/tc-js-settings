package Javascript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script

object Javascript_Template : Template({
    uuid = "55543148-e5a5-4a84-9a11-a75d62b1fcd5"
    extId = "Javascript_Template"
    name = "Template"

    vcs {
        root(Javascript.vcsRoots.HttpsGithubComSubas4uTeamcityCourseCards)

    }

    steps {
        script {
            name = "Restore NPM Packages"
            id = "RUNNER_6"
            scriptContent = "npm install"
        }
        script {
            name = "Browser Tests"
            id = "RUNNER_7"
            scriptContent = "npm test -- --single-run --browsers %Browser% --colors false --reporters teamcity"
        }
    }
})
