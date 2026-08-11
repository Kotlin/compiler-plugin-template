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
            groupVersions("nonJvm", { true }) {
                postDev(2, 5, "post25Dev")
                preDev(2, 5, "pre25Dev")
            }
        }
    }
}
