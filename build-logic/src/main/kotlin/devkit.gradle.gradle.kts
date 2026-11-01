import org.gradle.kotlin.dsl.kotlin
import org.jetbrains.kotlin.compiler.plugin.template.config

plugins {
    kotlin("compiler.plugin.devkit.gradle-plugin")
}

pluginDevKit { config() }