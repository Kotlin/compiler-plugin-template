import org.jetbrains.kotlin.compiler.plugin.devkit.ProjectOrGav

plugins {
    id("devkit.gradle")
}

pluginDevKit {
    includedBuildProjects.add("gradle-plugin")
    companionLibrary("./plugin-annotations")
    compilerPlugin = ProjectOrGav.LocalProject(project(":compiler-plugin").isolated)
}
