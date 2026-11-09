plugins {
    id("devkit.compiler")
    alias(libs.plugins.gradle.maven.publish)
}

pluginDevKit {
    versionHierarchy {
        splitDev(2, 5)
        splitDev(2, 3, 20)
    }
    componentRegistrar =
        "org.jetbrains.kotlin.compiler.plugin.template.SimplePluginComponentRegistrar"
    commandLineProcessor =
        "org.jetbrains.kotlin.compiler.plugin.template.SimpleCommandLineProcessor"
}
