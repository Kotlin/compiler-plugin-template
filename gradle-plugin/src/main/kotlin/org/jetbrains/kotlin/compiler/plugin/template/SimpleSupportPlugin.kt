package org.jetbrains.kotlin.compiler.plugin.template

import org.gradle.api.Project
import org.gradle.api.provider.Provider
import org.jetbrains.kotlin.compiler.plugin.devkit.DevKitSupportPlugin
import org.jetbrains.kotlin.gradle.plugin.KotlinCompilation
import org.jetbrains.kotlin.gradle.plugin.SubpluginOption

@Suppress("unused") // Used via reflection.
class SimpleSupportPlugin : DevKitSupportPlugin(PluginInfo.PLUGIN_INFO) {
    override fun apply(target: Project) {
        target.extensions.create("simplePlugin", SimpleGradleExtension::class.java)
    }

    override fun Project.applyToCompilation(
        kotlinCompilation: KotlinCompilation<*>
    ): Provider<List<SubpluginOption>> {
        // TODO change to devkit-provided toggle
        val extension = extensions.getByType(SimpleGradleExtension::class.java)
        if (!extension.shouldAddRuntimeDependency.get()) {
            configurations.named(
                kotlinCompilation.defaultSourceSet.implementationConfigurationName
            ) {
                it.exclude(
                    mapOf("group" to info.artifact.groupId, "module" to "plugin-annotations")
                )
            }
        }
        kotlinCompilation.compileTaskProvider.configure {
            // Run this compiler plugin before Compose plugin.
            it.compilerOptions.freeCompilerArgs.add(
                "-Xcompiler-plugin-order=${PluginInfo.PLUGIN_ID}>androidx.compose.compiler.plugins.kotlin"
            )
        }
        return providers.provider { emptyList() }
    }
}
