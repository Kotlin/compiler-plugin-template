package org.jetbrains.kotlin.compiler.plugin.template.runners

import org.jetbrains.kotlin.compiler.plugin.devkit.runners.DevKitJsDiagnosticTest
import org.jetbrains.kotlin.compiler.plugin.devkit.services.configurePlugin
import org.jetbrains.kotlin.compiler.plugin.template.SimpleCompilerPluginRegistrar

open class AbstractJsDiagnosticTest :
    DevKitJsDiagnosticTest({ configurePlugin(SimpleCompilerPluginRegistrar()) })
