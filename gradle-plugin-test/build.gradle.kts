import org.jetbrains.kotlin.compiler.plugin.devkit.ProjectOrGav

plugins {
    pluginDevKit("gradle-plugin")
}

pluginDevKit {
    includedBuildProjects.add("gradle-plugin")
    compilerPlugin = ProjectOrGav.LocalProject(project(":compiler-plugin").isolated)
}
