package org.jetbrains.kotlin.compiler.plugin.template

import org.jetbrains.kotlin.compiler.plugin.devkit.DevKitTestGenerator
import org.jetbrains.kotlin.compiler.plugin.devkit.sourceSetTestClass
import org.jetbrains.kotlin.compiler.plugin.template.runners.AbstractJsBoxTest
import org.jetbrains.kotlin.compiler.plugin.template.runners.AbstractJsDiagnosticTest
import org.jetbrains.kotlin.compiler.plugin.template.runners.AbstractJvmBoxTest
import org.jetbrains.kotlin.compiler.plugin.template.runners.AbstractJvmDiagnosticTest

fun main(args: Array<String>) =
    DevKitTestGenerator.generate(args) {
        sourceSetTestClass<AbstractJvmDiagnosticTest> {
            model("diagnostics")
        }
        sourceSetTestClass<AbstractJsDiagnosticTest> {
            model("diagnostics")
        }

        sourceSetTestClass<AbstractJvmBoxTest> {
            model("box")
        }

        sourceSetTestClass<AbstractJsBoxTest> {
            model("box")
        }
    }
