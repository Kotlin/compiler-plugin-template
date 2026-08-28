package org.jetbrains.kotlin.compiler.plugin.template

import org.jetbrains.kotlin.compiler.plugin.devkit.DevKitTestGenerator
import org.jetbrains.kotlin.compiler.plugin.devkit.SourceSetName
import org.jetbrains.kotlin.compiler.plugin.devkit.sourceSetTestClass
import org.jetbrains.kotlin.compiler.plugin.template.runners.AbstractJvmBoxTest
import org.jetbrains.kotlin.compiler.plugin.template.runners.AbstractJvmDiagnosticTest
import org.jetbrains.kotlin.generators.dsl.TestGroup

fun main(args: Array<String>) =
    DevKitTestGenerator.generate(args) {
        sourceSetTestClass<AbstractJvmDiagnosticTest> {
            model("diagnostics")
        }

        sourceSetTestClass<AbstractJvmBoxTest> {
            model("box")
        }
        addExtraTests()
    }

context(_: SourceSetName)
expect fun TestGroup.addExtraTests()
