package org.jetbrains.kotlin.compiler.plugin.template.services

import org.jetbrains.kotlin.test.TargetBackend
import org.jetbrains.kotlin.test.services.MetaTestConfigurator
import org.jetbrains.kotlin.test.services.TestServices
import org.jetbrains.kotlin.test.services.defaultsProvider
import org.jetbrains.kotlin.test.services.testInfo

class TestConfigurator(testServices: TestServices) : MetaTestConfigurator(testServices) {
    override fun shouldSkipTest(): Boolean {
        // TODO make more robust
        val ignoreOnVersionsContaining = setOf("k23", "k240_dev")
        // JS box tests compile against plugin-annotations KLIB. KLIB compatibility depends on the
        // producing compiler, so 2.3 JS tests will always fail
        return testServices.isJsBackend() &&
            ignoreOnVersionsContaining.any { testServices.testInfo.className.contains(it) }
    }
}

private fun TestServices.isJsBackend(): Boolean {
    val targetBackend = defaultsProvider.targetBackend
    return targetBackend == TargetBackend.JS_IR || targetBackend == TargetBackend.JS_IR_ES6
}
