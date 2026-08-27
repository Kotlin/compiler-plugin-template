pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        maven("https://packages.jetbrains.team/maven/p/compiler-plugin-dev-kit/eap")
        mavenLocal()
    }
}

plugins {
    kotlin("compiler.plugin.devkit") version "0.0.3-dev-281e88f"
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        maven("https://packages.jetbrains.team/maven/p/compiler-plugin-dev-kit/eap")
        mavenLocal()
    }
}

rootProject.name = "compiler-plugin-template"

include("compiler-plugin")

include("gradle-plugin")

include("plugin-annotations")
