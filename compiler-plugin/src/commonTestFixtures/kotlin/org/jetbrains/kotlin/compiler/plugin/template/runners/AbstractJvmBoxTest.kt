package org.jetbrains.kotlin.compiler.plugin.template.runners

import org.jetbrains.kotlin.compiler.plugin.devkit.runners.DevKitJvmBoxTest
import org.jetbrains.kotlin.compiler.plugin.devkit.services.configurePlugin
import org.jetbrains.kotlin.compiler.plugin.template.SimpleCompilerPluginRegistrar

open class AbstractJvmBoxTest :
    DevKitJvmBoxTest({ configurePlugin(SimpleCompilerPluginRegistrar()) })
