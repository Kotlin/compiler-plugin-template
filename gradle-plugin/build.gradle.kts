import org.jetbrains.kotlin.compiler.plugin.devkit.ProjectOrGav

plugins {
    alias(libs.plugins.kotlin.multiplatform) apply false
    pluginDevKit("gradle-plugin")
}

pluginDevKit {
    companionLibrary("plugin-annotations")
    compilerPlugin = ProjectOrGav.Sibling("compiler-plugin")
}

gradlePlugin {
    plugins {
        create("SimplePlugin") {
            id = group.toString()
            displayName = "SimplePlugin"
            description = "SimplePlugin"
            implementationClass =
                "org.jetbrains.kotlin.compiler.plugin.template.SimpleSupportPlugin"
        }
    }
}
