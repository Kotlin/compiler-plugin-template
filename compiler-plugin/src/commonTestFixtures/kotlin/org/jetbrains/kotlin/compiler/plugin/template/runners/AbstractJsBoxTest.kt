package org.jetbrains.kotlin.compiler.plugin.template.runners

import org.jetbrains.kotlin.compiler.plugin.devkit.firIdenticalCompat
import org.jetbrains.kotlin.compiler.plugin.devkit.runners.DevKitJsBoxTest
import org.jetbrains.kotlin.compiler.plugin.devkit.services.configurePlugin
import org.jetbrains.kotlin.compiler.plugin.template.SimpleCompilerPluginRegistrar
import org.jetbrains.kotlin.compiler.plugin.template.services.TestConfigurator

open class AbstractJsBoxTest :
    DevKitJsBoxTest({
        configurePlugin(SimpleCompilerPluginRegistrar())
        useMetaTestConfigurators(::TestConfigurator)
        defaultDirectives { firIdenticalCompat() }
    })
