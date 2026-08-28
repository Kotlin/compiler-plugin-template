package org.jetbrains.kotlin.compiler.plugin.template

import org.jetbrains.kotlin.compiler.plugin.devkit.SourceSetName
import org.jetbrains.kotlin.compiler.plugin.devkit.sourceSetTestClass
import org.jetbrains.kotlin.compiler.plugin.template.runners.AbstractJsBoxTest
import org.jetbrains.kotlin.compiler.plugin.template.runners.AbstractJsDiagnosticTest
import org.jetbrains.kotlin.generators.dsl.TestGroup

context(_: SourceSetName)
actual fun TestGroup.addExtraTests() {
    sourceSetTestClass<AbstractJsDiagnosticTest> {
        model("diagnostics")
    }

    sourceSetTestClass<AbstractJsBoxTest> {
        model("box")
    }
}
