import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi

plugins {
    pluginDevKit("compiler-plugin")
    alias(libs.plugins.gradle.maven.publish)
}

@OptIn(ExperimentalKotlinGradlePluginApi::class)
pluginDevKit {
    kotlin {
        applyPluginDevKitHierarchyTemplate {
            postDev(2, 5, "post25Dev")
            preDev(2, 5, "pre25Dev")
        }
    }
    componentRegistrar = "org.jetbrains.kotlin.compiler.plugin.template.SimplePluginComponentRegistrar"
    commandLineProcessor = "org.jetbrains.kotlin.compiler.plugin.template.SimpleCommandLineProcessor"
}
