plugins {
    kotlin("compiler.plugin.devkit")
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
