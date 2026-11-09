package org.jetbrains.kotlin.compiler.plugin.template.runners

import org.jetbrains.kotlin.compiler.plugin.devkit.runners.DevKitJsBoxTest
import org.jetbrains.kotlin.compiler.plugin.template.configureTests

open class AbstractJsBoxTest : DevKitJsBoxTest({ configureTests() })
