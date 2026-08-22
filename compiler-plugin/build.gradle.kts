plugins {
    pluginDevKit("compiler-plugin")
    alias(libs.plugins.gradle.maven.publish)
}

pluginDevKit {
    versionHierarchy {
        splitDev(2, 5)
    }
    componentRegistrar =
        "org.jetbrains.kotlin.compiler.plugin.template.SimplePluginComponentRegistrar"
    commandLineProcessor =
        "org.jetbrains.kotlin.compiler.plugin.template.SimpleCommandLineProcessor"
}
