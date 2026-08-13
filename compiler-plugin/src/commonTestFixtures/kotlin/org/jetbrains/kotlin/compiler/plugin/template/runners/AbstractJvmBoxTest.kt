package org.jetbrains.kotlin.compiler.plugin.template.runners

import org.jetbrains.kotlin.compiler.plugin.devkit.firIdenticalCompat
import org.jetbrains.kotlin.compiler.plugin.devkit.runners.DevKitJvmBoxTest
import org.jetbrains.kotlin.compiler.plugin.devkit.services.configurePlugin
import org.jetbrains.kotlin.compiler.plugin.template.SimplePluginComponentRegistrar
import org.jetbrains.kotlin.compiler.plugin.template.services.TestConfigurator

open class AbstractJvmBoxTest :
    DevKitJvmBoxTest({
        configurePlugin(SimplePluginComponentRegistrar())
        useMetaTestConfigurators(::TestConfigurator)
        defaultDirectives { firIdenticalCompat() }
    })
