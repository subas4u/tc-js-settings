package Javascript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object Javascript_03DeployToStaging : BuildType({
    uuid = "51ccd149-fed2-4b7b-9338-ff630d5e6b09"
    extId = "Javascript_03DeployToStaging"
    name = "03. Deploy To Staging"

    vcs {
        root(Javascript.vcsRoots.Javascript_HttpsGithubComG0t4teamcityCourseCards)

    }
	
	steps {
		script {
			name = "IIS Deploy"
			id = "RUNNER_6"
			scriptContent = """
rmdir /S /Q \inetpub\wwwroot\cardgame
xcopy /S /I /Y app \inetpub\wwwroot\cardgame\
			"""
		}
	}

    dependencies {
        dependency(Javascript.buildTypes.Javascript_02Chrome) {
            snapshot {
            }
        }
        dependency(Javascript.buildTypes.Javascript_02Firefox) {
            snapshot {
            }
        }
    }
	
	triggers {
		vcs {
			id = "vcsTrigger"
		}
	}
})
