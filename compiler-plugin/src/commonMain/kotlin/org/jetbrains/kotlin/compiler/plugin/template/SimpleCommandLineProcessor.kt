package org.jetbrains.kotlin.compiler.plugin.template

import org.jetbrains.kotlin.compiler.plugin.AbstractCliOption
import org.jetbrains.kotlin.compiler.plugin.CliOption
import org.jetbrains.kotlin.compiler.plugin.devkit.DevKitCLP
import org.jetbrains.kotlin.compiler.plugin.devkit.DevKitCommandLineProcessor
import org.jetbrains.kotlin.config.CompilerConfiguration

@Suppress("unused") // Used via reflection.
class SimpleCommandLineProcessor : DevKitCommandLineProcessor(SimpleCLP::class) {
    override val pluginId: String
        get() = PluginInfo.PLUGIN_ID

    override val pluginOptions: Collection<CliOption>
        get() = emptyList()
}

class SimpleCLP : DevKitCLP {
    override fun processOption(
        option: AbstractCliOption,
        value: String,
        configuration: CompilerConfiguration,
    ) {
        error("Unexpected config option: '${option.optionName}'")
    }
}
