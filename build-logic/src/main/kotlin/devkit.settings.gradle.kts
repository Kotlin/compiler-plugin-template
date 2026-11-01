import org.jetbrains.kotlin.compiler.plugin.devkit.BetaAndRc

plugins {
    kotlin("compiler.plugin.devkit")
}

pluginDevKit {
    cliVersions("2.3.20", betaAndRc = BetaAndRc.LATEST)
    ideaVersions("261", includeRc = true, includeEap = true)
    useLatestBootstrap()
}

gradle.lifecycle.beforeProject {
    group = "org.jetbrains.kotlin.compiler.plugin.template"
    version = "0.1.0-SNAPSHOT"
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        maven("https://packages.jetbrains.team/maven/p/compiler-plugin-dev-kit/eap")
    }
}
