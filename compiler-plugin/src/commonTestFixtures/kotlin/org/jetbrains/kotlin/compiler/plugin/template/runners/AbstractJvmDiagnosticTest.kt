package org.jetbrains.kotlin.compiler.plugin.template.runners

import org.jetbrains.kotlin.compiler.plugin.devkit.runners.DevKitJvmDiagnosticTest
import org.jetbrains.kotlin.compiler.plugin.devkit.services.configurePlugin
import org.jetbrains.kotlin.compiler.plugin.template.SimpleCompilerPluginRegistrar

open class AbstractJvmDiagnosticTest :
    DevKitJvmDiagnosticTest({ configurePlugin(SimpleCompilerPluginRegistrar()) })
