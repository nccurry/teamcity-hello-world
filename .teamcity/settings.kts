import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServere.configs.kotlin.buildSteps.script

version = "2022.04"

project {
    buildType {
        id("HelloWorld")
        name = "Hello World"
        steps {
            script {
                scriptContent = "echo 'Hello World'"
            }
        }
    }
}