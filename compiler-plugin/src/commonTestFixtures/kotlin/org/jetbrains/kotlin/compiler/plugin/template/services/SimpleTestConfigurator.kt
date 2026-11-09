package org.jetbrains.kotlin.compiler.plugin.template.services

import org.jetbrains.kotlin.compiler.plugin.template.isTopLevelGenerationSupportedInKlib
import org.jetbrains.kotlin.test.TargetBackend
import org.jetbrains.kotlin.test.directives.model.DirectivesContainer
import org.jetbrains.kotlin.test.directives.model.SimpleDirectivesContainer
import org.jetbrains.kotlin.test.services.MetaTestConfigurator
import org.jetbrains.kotlin.test.services.TestServices
import org.jetbrains.kotlin.test.services.defaultsProvider

object SimpleTestDirectives : SimpleDirectivesContainer() {
    val REQUIRES_TOP_LEVEL_GENERATION by
        directive("Indicates that the test requires top level generation to pass")
}

class SimpleTestConfigurator(testServices: TestServices) : MetaTestConfigurator(testServices) {
    override val directiveContainers: List<DirectivesContainer>
        get() = listOf(SimpleTestDirectives)

    override fun shouldSkipTest(): Boolean {
        val targetBackend = testServices.defaultsProvider.targetBackend ?: return false
        if (
            !targetBackend.isCompatibleWith(TargetBackend.JVM) &&
                !isTopLevelGenerationSupportedInKlib
        )
            return true
        return false
    }
}

fun TargetBackend.isCompatibleWith(other: TargetBackend): Boolean =
    other in generateSequence(this) { it.compatibleWith.takeIf { _ -> it != TargetBackend.ANY } }
