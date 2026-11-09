package org.jetbrains.kotlin.compiler.plugin.template.runners

import org.jetbrains.kotlin.compiler.plugin.devkit.runners.DevKitJvmDiagnosticTest
import org.jetbrains.kotlin.compiler.plugin.template.configureTests

open class AbstractJvmDiagnosticTest : DevKitJvmDiagnosticTest({ configureTests() })
