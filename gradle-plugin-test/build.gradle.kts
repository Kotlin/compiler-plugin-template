import org.jetbrains.kotlin.compiler.plugin.devkit.ProjectOrGav

plugins {
    id("devkit.gradle")
}

dependencies {
    functionalTestRuntimeOnly("$group:gradle-plugin:$version")
}

pluginDevKit {
    companionLibrary("plugin-annotations")
    compilerPlugin = ProjectOrGav.LocalProject(project(":compiler-plugin").isolated)
}
