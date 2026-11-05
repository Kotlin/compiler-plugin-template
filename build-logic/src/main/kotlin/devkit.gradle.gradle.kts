import org.jetbrains.kotlin.compiler.plugin.template.config

plugins {
    kotlin("compiler.plugin.devkit.gradle-plugin")
}

pluginDevKit {
    config()
    compilerPlugin("compiler-plugin")
}
