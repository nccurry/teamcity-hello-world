import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script

version = "2022.04"

project {
    buildType {
        id("HelloWorld")
        name = "Hello World"
        steps {
            script {
                scriptContent = "echo 'Hello World 1'"
            }
            script {
                scriptContent = "echo 'Hello World 2'"
            }
        }
    }
}