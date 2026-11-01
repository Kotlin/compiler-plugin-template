pluginManagement {
    includeBuild("./build-logic-settings")
    includeBuild("./build-logic")
    repositories {
        gradlePluginPortal()
        mavenCentral()
        maven("https://packages.jetbrains.team/maven/p/compiler-plugin-dev-kit/eap")
    }
}

plugins { id("devkit") }

pluginDevKit {
    includeBuildWithChecks("gradle-plugin")
    includeBuildWithChecks("plugin-annotations")
}

rootProject.name = "compiler-plugin-template"

include("compiler-plugin")

include("gradle-plugin-test")

includeBuild(".")
