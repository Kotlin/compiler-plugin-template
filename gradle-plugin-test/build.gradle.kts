import org.jetbrains.kotlin.compiler.plugin.devkit.ProjectOrGav

plugins {
    id("devkit.gradle")
}

gradleTestKitSupport {
    withIncludedBuildProjects(":gradle-plugin:")
}

pluginDevKit {
    companionLibrary("plugin-annotations")
    compilerPlugin = ProjectOrGav.LocalProject(project(":compiler-plugin").isolated)
}
