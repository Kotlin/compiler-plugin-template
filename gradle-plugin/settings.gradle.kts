pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        maven("https://packages.jetbrains.team/maven/p/compiler-plugin-dev-kit/eap")
        mavenLocal()
    }
}

plugins {
    kotlin("compiler.plugin.devkit") version "0.0.3-dev-3be1ae3"
}

pluginDevKit { createVersionCatalogFrom("..") }

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        maven("https://packages.jetbrains.team/maven/p/compiler-plugin-dev-kit/eap")
        mavenLocal()
    }
}

rootProject.name = "gradle-plugin"
