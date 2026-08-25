package org.jetbrains.kotlin.compiler.plugin.template.runners

import org.jetbrains.kotlin.compiler.plugin.devkit.runners.DevKitJsBoxTest
import org.jetbrains.kotlin.compiler.plugin.devkit.services.configurePlugin
import org.jetbrains.kotlin.compiler.plugin.template.SimplePluginComponentRegistrar

open class AbstractJsBoxTest :
    DevKitJsBoxTest({ configurePlugin(SimplePluginComponentRegistrar()) })
