import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi

plugins {
    id("com.gradleup.shadow") version "9.6.0"
    pluginDevKit("compiler-plugin")
    alias(libs.plugins.gradle.maven.publish)
}

@OptIn(ExperimentalKotlinGradlePluginApi::class)
pluginDevKit {
    kotlin {
        applyPluginDevKitHierarchyTemplate {
            groupVersions("nonJvm", { true })
        }
    }
}
