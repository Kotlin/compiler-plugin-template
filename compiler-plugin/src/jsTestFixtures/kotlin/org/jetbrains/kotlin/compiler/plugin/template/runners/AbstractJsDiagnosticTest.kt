package org.jetbrains.kotlin.compiler.plugin.template.runners

import org.jetbrains.kotlin.compiler.plugin.devkit.runners.DevKitJsDiagnosticTest
import org.jetbrains.kotlin.compiler.plugin.template.configureTests

open class AbstractJsDiagnosticTest : DevKitJsDiagnosticTest({ configureTests() })
