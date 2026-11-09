package org.jetbrains.kotlin.compiler.plugin.template

import org.jetbrains.kotlin.compiler.plugin.devkit.services.configurePlugin
import org.jetbrains.kotlin.compiler.plugin.template.services.SimpleTestConfigurator
import org.jetbrains.kotlin.test.builders.TestConfigurationBuilder

fun TestConfigurationBuilder.configureTests() {
    configurePlugin(SimplePluginComponentRegistrar())
    useMetaTestConfigurators(::SimpleTestConfigurator)
}