import org.jetbrains.kotlin.compiler.plugin.template.config

plugins {
    kotlin("compiler.plugin.devkit.compiler-plugin")
}

pluginDevKit { config() }